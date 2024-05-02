package com.entity.view;

import com.entity.ShaixuanleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 筛选类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
@TableName("shaixuanleixing")
public class ShaixuanleixingView  extends ShaixuanleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShaixuanleixingView(){
	}
 
 	public ShaixuanleixingView(ShaixuanleixingEntity shaixuanleixingEntity){
 	try {
			BeanUtils.copyProperties(this, shaixuanleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
