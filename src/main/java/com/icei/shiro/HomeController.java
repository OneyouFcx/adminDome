package com.icei.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.shiro.authc.DisabledAccountException;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

@RequestMapping("/admin/login")
@Controller
public class HomeController {
    @RequestMapping({"/","login.html"})
    public String home(){
        return "/iceiAdmin/login";
    }
/*    @RequestMapping("/logins")
    public String login(HttpServletRequest request, Map<String, Object> map) throws Exception{
        System.out.println("HomeController.login()");
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.
        String exception = (String) request.getAttribute("shiroLoginFailure");
        System.out.println("exception=" + exception);
        String msg = "";
        if(exception != null) {
            if(UnknownAccountException.class.getName().equals(exception)) {
                System.out.println("UnknownAccountException -- > 账号不存在");
                msg = " 账号不存在";
            }else if (IncorrectCredentialsException.class.getName().equals(exception)) {
                System.out.println("IncorrectCredentialsException -- > 密码不正确");
                msg = " 密码不正确";
            }else if ("kaptchaValidateFailed".equals(exception)) {
                System.out.println("kaptchaValidateFailed -- > 验证码错误");
                msg = "未知错误";
            }else {
                *//*msg = "else >> "+exception;*//*
                msg = "请重试 ";
                System.out.println("else -- >" + exception);
            }
        }
        map.put("msg", msg);
        // 此方法不处理登录成功,由shiro进行处理
        return "icei/login";
    }*/

    /**
     * ajax登录请求
     * @param username
     * @param password
     * @return
     */
    @GetMapping("ajaxLogin")
    @ResponseBody
    public Object ajaxLogin(String username, String password){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        String msg="";
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            SecurityUtils.getSubject().login(token);
            resultMap.put("status", 200);
            msg=  "登陆成功";
        }catch(UnknownAccountException   u){
            resultMap.put("status", 404);
            System.out.println("UnknownAccountException -- > 账号不存在");
            msg = "账号不存在";
        }catch(IncorrectCredentialsException pwd){
            System.out.println("IncorrectCredentialsException-->密码错误");
            resultMap.put("status", 403);
            msg=  "密码错误";
        }catch(AccountException  u){
            resultMap.put("status", 405);
            System.out.println("UnknownAccountException -- > 账号不存在");
            msg = "账号异常";
        } catch (Exception e) {
            resultMap.put("status", 500);
            //resultMap.put("message", e.getMessage());
            msg=  "网络异常";
        }
        resultMap.put("msg",msg);
        return resultMap;
    }
    /**
     * 退出
     * @return
     */
    @RequestMapping(value="logout",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> logout(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        try {
            //退出
            SecurityUtils.getSubject().logout();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return resultMap;
    }
    @RequestMapping("/403")
    public String unauthorizedRole(){
        System.out.println("------没有权限-------");
        return "403";
    }
}