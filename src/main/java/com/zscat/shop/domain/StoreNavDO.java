package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class StoreNavDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//content
	private String content;
	//display
	private Boolean display;
	//sequence
	private String sequence;
	//title
	private String title;
	//url
	private String url;
	//win_type
	private String winType;
	//store_id
	private Long storeId;

	/**
	 * 设置：id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：addTime
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：addTime
	 */
	public Date getAddtime() {
		return addtime;
	}
	/**
	 * 设置：deleteStatus
	 */
	public void setDeletestatus(Boolean deletestatus) {
		this.deletestatus = deletestatus;
	}
	/**
	 * 获取：deleteStatus
	 */
	public Boolean getDeletestatus() {
		return deletestatus;
	}
	/**
	 * 设置：content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：display
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}
	/**
	 * 获取：display
	 */
	public Boolean getDisplay() {
		return display;
	}
	/**
	 * 设置：sequence
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	/**
	 * 获取：sequence
	 */
	public String getSequence() {
		return sequence;
	}
	/**
	 * 设置：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：win_type
	 */
	public void setWinType(String winType) {
		this.winType = winType;
	}
	/**
	 * 获取：win_type
	 */
	public String getWinType() {
		return winType;
	}
	/**
	 * 设置：store_id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	/**
	 * 获取：store_id
	 */
	public Long getStoreId() {
		return storeId;
	}
}
