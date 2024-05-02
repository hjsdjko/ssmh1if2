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
 * 健康登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
@TableName("jiankangdengji")
public class JiankangdengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangdengjiEntity() {
		
	}
	
	public JiankangdengjiEntity(T t) {
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
	 * 所在监区
	 */
					
	private String suozaijianqu;
	
	/**
	 * 体温登记
	 */
					
	private String tiwendengji;
	
	/**
	 * 既往病史
	 */
					
	private String jiwangbingshi;
	
	/**
	 * 近期状况
	 */
					
	private String jinqizhuangkuang;
	
	/**
	 * 保外就医
	 */
					
	private String baowaijiuyi;
	
	/**
	 * 是否请假
	 */
					
	private String shifouqingjia;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
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
	 * 设置：体温登记
	 */
	public void setTiwendengji(String tiwendengji) {
		this.tiwendengji = tiwendengji;
	}
	/**
	 * 获取：体温登记
	 */
	public String getTiwendengji() {
		return tiwendengji;
	}
	/**
	 * 设置：既往病史
	 */
	public void setJiwangbingshi(String jiwangbingshi) {
		this.jiwangbingshi = jiwangbingshi;
	}
	/**
	 * 获取：既往病史
	 */
	public String getJiwangbingshi() {
		return jiwangbingshi;
	}
	/**
	 * 设置：近期状况
	 */
	public void setJinqizhuangkuang(String jinqizhuangkuang) {
		this.jinqizhuangkuang = jinqizhuangkuang;
	}
	/**
	 * 获取：近期状况
	 */
	public String getJinqizhuangkuang() {
		return jinqizhuangkuang;
	}
	/**
	 * 设置：保外就医
	 */
	public void setBaowaijiuyi(String baowaijiuyi) {
		this.baowaijiuyi = baowaijiuyi;
	}
	/**
	 * 获取：保外就医
	 */
	public String getBaowaijiuyi() {
		return baowaijiuyi;
	}
	/**
	 * 设置：是否请假
	 */
	public void setShifouqingjia(String shifouqingjia) {
		this.shifouqingjia = shifouqingjia;
	}
	/**
	 * 获取：是否请假
	 */
	public String getShifouqingjia() {
		return shifouqingjia;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
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
