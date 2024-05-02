package com.entity.vo;

import com.entity.ChuyudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 出狱登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public class ChuyudengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 入狱时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruyushijian;
		
	/**
	 * 刑期
	 */
	
	private String xingqi;
		
	/**
	 * 增减刑情况
	 */
	
	private String zengjianxingqingkuang;
		
	/**
	 * 出狱日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuyuriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
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
	 * 设置：入狱时间
	 */
	 
	public void setRuyushijian(Date ruyushijian) {
		this.ruyushijian = ruyushijian;
	}
	
	/**
	 * 获取：入狱时间
	 */
	public Date getRuyushijian() {
		return ruyushijian;
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
	 * 设置：增减刑情况
	 */
	 
	public void setZengjianxingqingkuang(String zengjianxingqingkuang) {
		this.zengjianxingqingkuang = zengjianxingqingkuang;
	}
	
	/**
	 * 获取：增减刑情况
	 */
	public String getZengjianxingqingkuang() {
		return zengjianxingqingkuang;
	}
				
	
	/**
	 * 设置：出狱日期
	 */
	 
	public void setChuyuriqi(Date chuyuriqi) {
		this.chuyuriqi = chuyuriqi;
	}
	
	/**
	 * 获取：出狱日期
	 */
	public Date getChuyuriqi() {
		return chuyuriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
