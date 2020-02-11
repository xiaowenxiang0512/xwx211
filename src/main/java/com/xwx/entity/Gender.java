package com.xwx.entity;

public enum Gender {
	MAN("男"),WOMAN("女");
	private String dispaly;

	public String getDispaly() {
		return dispaly;
	}

	public void setDispaly(String dispaly) {
		this.dispaly = dispaly;
	}

	private Gender(String dispaly) {
		this.dispaly = dispaly;
	}
	
}
