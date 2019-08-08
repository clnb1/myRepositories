package com.bawei.pojo;

public class ZhiWu {
	private int zid;
	private String zname;
	private String introduction;
	private int tid;
	private String tname;
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public ZhiWu(int zid, String zname, String introduction, int tid,
			String tname) {
		super();
		this.zid = zid;
		this.zname = zname;
		this.introduction = introduction;
		this.tid = tid;
		this.tname = tname;
	}
	public ZhiWu() {
		super();
	}
	@Override
	public String toString() {
		return "ZhiWu [zid=" + zid + ", zname=" + zname + ", introduction="
				+ introduction + ", tid=" + tid + ", tname=" + tname + "]";
	}
	
}
