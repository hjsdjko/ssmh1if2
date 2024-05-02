package com.entity.view;

import com.entity.RuyudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入狱登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
@TableName("ruyudengji")
public class RuyudengjiView  extends RuyudengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuyudengjiView(){
	}
 
 	public RuyudengjiView(RuyudengjiEntity ruyudengjiEntity){
 	try {
			BeanUtils.copyProperties(this, ruyudengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
