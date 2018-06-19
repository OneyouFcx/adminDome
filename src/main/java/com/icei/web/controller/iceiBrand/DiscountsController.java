package com.icei.web.controller.iceiBrand;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icei.service.adminService.DiscountsService;
import com.icei.utils.ResultUtil;
/**
 * 店铺优惠券
 * @author YU生俱来
 *
 */
@Controller
@RequestMapping("/discounts")
public class DiscountsController {
	@Autowired
	private DiscountsService discountsService;
	
	/**
	 * 进入优惠券界面
	 * @return
	 */
	@GetMapping("/discounts.html")
	public String toDiscount() {
		return "iceiBrand/discounts/discounts";
	}
	/**
	 * 条件查询店铺优惠券
	 * @return
	 */
	@ResponseBody
	@GetMapping("/ByIDgetBrandDiscount.json")
	public Object ByIDgetBrandTemplate(HttpServletRequest req,@Param("page")int page,@Param("limit")int limit) {
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("page", (page*limit-limit));
		map.put("pageSize", limit);
		map.put("brandId",1);
		//ID非空判断
		if(req.getParameter("discountsId")!=null && !req.getParameter("discountsId").equals("")) {
			int num=Integer.parseInt(req.getParameter("discountsId"));
			map.put("discountsId", num);
		}else {
			map.put("discountsId", null);
		}
		//开始日期非空判断
		if(!req.getParameter("discountsStartTime").equals("")&&req.getParameter("discountsStartTime")!=null) {
			map.put("discountsStartTime", req.getParameter("discountsStartTime"));
		}else {
			map.put("discountsStartTime",null);
		}
		//结束日期非空判断
		if(!req.getParameter("discountsEndTime").equals("")&&req.getParameter("discountsEndTime")!=null) {
			map.put("discountsEndTime", req.getParameter("discountsEndTime"));
		}else {
			map.put("discountsEndTime",null);
		}
		return ResultUtil.success(discountsService.byBrandIdGetAll(map),discountsService.byBrandIdGetAllCounnt(map));
	}
	
}
