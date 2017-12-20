package com.yh.blog.Model;

import java.util.Date;

public class TfNoticeManager {
    private Long noticeId;
    private String noticeStatusNo;
    private String noticeTitle;
    private String noticeMeno;
    private Date validTime;
    private Date invalidTime;
    private String meno;
    
	public Long getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(Long noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeStatusNo() {
		return noticeStatusNo;
	}
	public void setNoticeStatusNo(String noticeStatusNo) {
		this.noticeStatusNo = noticeStatusNo;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeMeno() {
		return noticeMeno;
	}
	public void setNoticeMeno(String noticeMeno) {
		this.noticeMeno = noticeMeno;
	}
	public Date getValidTime() {
		return validTime;
	}
	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}
	public Date getInvalidTime() {
		return invalidTime;
	}
	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
    
    
}