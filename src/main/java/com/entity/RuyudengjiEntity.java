package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 入狱登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
@TableName("ruyudengji")
public class RuyudengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RuyudengjiEntity() {
		
	}
	
	public RuyudengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 罪犯编号
	 */
					
	private String zuifanbianhao;
	
	/**
	 * 罪犯姓名
	 */
					
	private String zuifanxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 籍贯
	 */
					
	private String jiguan;
	
	/**
	 * 犯罪类型
	 */
					
	private String fanzuileixing;
	
	/**
	 * 所在监区
	 */
					
	private String suozaijianqu;
	
	/**
	 * 刑期
	 */
					
	private String xingqi;
	
	/**
	 * 入狱日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruyuriqi;
	
	/**
	 * 民警账号
	 */
					
	private String minjingzhanghao;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：罪犯编号
	 */
	public void setZuifanbianhao(String zuifanbianhao) {
		this.zuifanbianhao = zuifanbianhao;
	}
	/**
	 * 获取：罪犯编号
	 */
	public String getZuifanbianhao() {
		return zuifanbianhao;
	}
	/**
	 * 设置：罪犯姓名
	 */
	public void setZuifanxingming(String zuifanxingming) {
		this.zuifanxingming = zuifanxingming;
	}
	/**
	 * 获取：罪犯姓名
	 */
	public String getZuifanxingming() {
		return zuifanxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：籍贯
	 */
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	/**
	 * 获取：籍贯
	 */
	public String getJiguan() {
		return jiguan;
	}
	/**
	 * 设置：犯罪类型
	 */
	public void setFanzuileixing(String fanzuileixing) {
		this.fanzuileixing = fanzuileixing;
	}
	/**
	 * 获取：犯罪类型
	 */
	public String getFanzuileixing() {
		return fanzuileixing;
	}
	/**
	 * 设置：所在监区
	 */
	public void setSuozaijianqu(String suozaijianqu) {
		this.suozaijianqu = suozaijianqu;
	}
	/**
	 * 获取：所在监区
	 */
	public String getSuozaijianqu() {
		return suozaijianqu;
	}
	/**
	 * 设置：刑期
	 */
	public void setXingqi(String xingqi) {
		this.xingqi = xingqi;
	}
	/**
	 * 获取：刑期
	 */
	public String getXingqi() {
		return xingqi;
	}
	/**
	 * 设置：入狱日期
	 */
	public void setRuyuriqi(Date ruyuriqi) {
		this.ruyuriqi = ruyuriqi;
	}
	/**
	 * 获取：入狱日期
	 */
	public Date getRuyuriqi() {
		return ruyuriqi;
	}
	/**
	 * 设置：民警账号
	 */
	public void setMinjingzhanghao(String minjingzhanghao) {
		this.minjingzhanghao = minjingzhanghao;
	}
	/**
	 * 获取：民警账号
	 */
	public String getMinjingzhanghao() {
		return minjingzhanghao;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
