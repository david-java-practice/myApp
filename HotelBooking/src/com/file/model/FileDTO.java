package com.file.model;

public class FileDTO {
	private String uploadFile;
	private String hotel_name;
	private String hotel_addr;
	private String hotel_repu;
	private String hotel_price;
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getHotel_name() {
		return hotel_name == null ? "" : hotel_name.trim();
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getHotel_addr() {
		return hotel_addr == null ? "" : hotel_addr.trim();
	}

	public void setHotel_addr(String hotel_addr) {
		this.hotel_addr = hotel_addr;
	}

	public String getHotel_repu() {
		return hotel_repu == null ? "" : hotel_repu.trim();
	}

	public void setHotel_repu(String hotel_repu) {
		this.hotel_repu = hotel_repu;
	}

	public String getHotel_price() {
		return hotel_price == null ? "" : hotel_price.trim();
	}

	public void setHotel_price(String hotel_price) {
		this.hotel_price = hotel_price;
	}

	public String getUploadFile() {
		return uploadFile == null ? "" : uploadFile.trim();
	}

	public void setUploadFile(String uploadFile) {
		this.uploadFile = uploadFile;
	}
	
}
