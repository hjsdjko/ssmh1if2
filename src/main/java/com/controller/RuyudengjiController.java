package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RuyudengjiEntity;
import com.entity.view.RuyudengjiView;

import com.service.RuyudengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 入狱登记
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
@RestController
@RequestMapping("/ruyudengji")
public class RuyudengjiController {
    @Autowired
    private RuyudengjiService ruyudengjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RuyudengjiEntity ruyudengji, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			ruyudengji.setMinjingzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RuyudengjiEntity> ew = new EntityWrapper<RuyudengjiEntity>();
		PageUtils page = ruyudengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruyudengji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RuyudengjiEntity ruyudengji, 
		HttpServletRequest request){
        EntityWrapper<RuyudengjiEntity> ew = new EntityWrapper<RuyudengjiEntity>();
		PageUtils page = ruyudengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruyudengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RuyudengjiEntity ruyudengji){
       	EntityWrapper<RuyudengjiEntity> ew = new EntityWrapper<RuyudengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ruyudengji, "ruyudengji")); 
        return R.ok().put("data", ruyudengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RuyudengjiEntity ruyudengji){
        EntityWrapper< RuyudengjiEntity> ew = new EntityWrapper< RuyudengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ruyudengji, "ruyudengji")); 
		RuyudengjiView ruyudengjiView =  ruyudengjiService.selectView(ew);
		return R.ok("查询入狱登记成功").put("data", ruyudengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RuyudengjiEntity ruyudengji = ruyudengjiService.selectById(id);
        return R.ok().put("data", ruyudengji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RuyudengjiEntity ruyudengji = ruyudengjiService.selectById(id);
        return R.ok().put("data", ruyudengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RuyudengjiEntity ruyudengji, HttpServletRequest request){
    	ruyudengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruyudengji);

        ruyudengjiService.insert(ruyudengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RuyudengjiEntity ruyudengji, HttpServletRequest request){
    	ruyudengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruyudengji);

        ruyudengjiService.insert(ruyudengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RuyudengjiEntity ruyudengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ruyudengji);
        ruyudengjiService.updateById(ruyudengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ruyudengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<RuyudengjiEntity> wrapper = new EntityWrapper<RuyudengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("minjingzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = ruyudengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
