package com.icei.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.icei.domain.BrandAdmin;

public interface BrandAdminMapper {
	
	/**
	 * 分页+查询，查询全部
	 * @return
	 */
	List<BrandAdmin> getAllBrandAdmin(Map<String,Object> map);
	/**
	 * 查询全部（条件查询的全部条数）
	 * @return
	 */
	int getCount(Map<String,Object> map);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_admin
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int deleteByPrimaryKey(Integer brandAdmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_admin
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int insert(BrandAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_admin
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int insertSelective(BrandAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_admin
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    BrandAdmin selectByPrimaryKey(Integer brandAdmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_admin
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int updateByPrimaryKeySelective(BrandAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_admin
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int updateByPrimaryKey(BrandAdmin record);
    /**
     * 检查账号是否存在
     * @param adminCode
     * @return
     */
    int getBrandAdminIs(@Param("adminCode")String adminCode);
}