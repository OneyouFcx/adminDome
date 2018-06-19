package com.icei.shiro;


import com.icei.domain.Admin;
import com.icei.domain.PowerRole;
import com.icei.service.adminService.AdminService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;


import javax.annotation.Resource;

public class MyShiroRealm extends AuthorizingRealm {
    @Resource
    private AdminService adminService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    	 SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
       
        Admin userInfo  = (Admin)principals.getPrimaryPrincipal();
        /*将角色对应的表示添加Shiro  进行角色限制*/
            for(PowerRole role:userInfo.getRole()){
            authorizationInfo.addRole(role.getRoleTag());
        }
        return authorizationInfo;
    }

    /*主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        String username = (String)token.getPrincipal();
        System.out.println(token.getCredentials());
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        Admin userInfo = adminService.selectByName(username);
        System.out.println("----->>userInfo="+userInfo);
        if(userInfo == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo, //用户名
                userInfo.getAdminPwd(), //密码
                ByteSource.Util.bytes(userInfo.getCredentialsSalt()),//salt=username+salt
                getName() //realm name
        );
        return authenticationInfo;
    }
}