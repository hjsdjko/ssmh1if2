package com.entity.view;

import com.entity.GaizaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 改造信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
@TableName("gaizaoxinxi")
public class GaizaoxinxiView  extends GaizaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GaizaoxinxiView(){
	}
 
 	public GaizaoxinxiView(GaizaoxinxiEntity gaizaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gaizaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
