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
 * 消费信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-23 15:32:08
 */
@TableName("xiaofeixinxi")
public class XiaofeixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaofeixinxiEntity() {
		
	}
	
	public XiaofeixinxiEntity(T t) {
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
	 * 消费编号
	 */
					
	private String xiaofeibianhao;
	
	/**
	 * 会员账号
	 */
					
	private String huiyuanzhanghao;
	
	/**
	 * 会员姓名
	 */
					
	private String huiyuanxingming;
	
	/**
	 * 金额
	 */
					
	private Integer jine;
	
	/**
	 * 消费名称
	 */
					
	private String xiaofeimingcheng;
	
	/**
	 * 消费日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiaofeiriqi;
	
	
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
	 * 设置：消费编号
	 */
	public void setXiaofeibianhao(String xiaofeibianhao) {
		this.xiaofeibianhao = xiaofeibianhao;
	}
	/**
	 * 获取：消费编号
	 */
	public String getXiaofeibianhao() {
		return xiaofeibianhao;
	}
	/**
	 * 设置：会员账号
	 */
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
	/**
	 * 设置：会员姓名
	 */
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
	/**
	 * 设置：消费名称
	 */
	public void setXiaofeimingcheng(String xiaofeimingcheng) {
		this.xiaofeimingcheng = xiaofeimingcheng;
	}
	/**
	 * 获取：消费名称
	 */
	public String getXiaofeimingcheng() {
		return xiaofeimingcheng;
	}
	/**
	 * 设置：消费日期
	 */
	public void setXiaofeiriqi(Date xiaofeiriqi) {
		this.xiaofeiriqi = xiaofeiriqi;
	}
	/**
	 * 获取：消费日期
	 */
	public Date getXiaofeiriqi() {
		return xiaofeiriqi;
	}

}
