package com.example.demo.bean;

public class Message {
	private Integer id;
	private String  deviceId;
	private String DustData;
	private String eventTime;
	
	public Message(String deviceId, String dustData, String eventTime) {
		super();
		this.deviceId = deviceId;
		DustData = dustData;
		this.eventTime = eventTime;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Message(Integer id, String deviceId, String dustData, String eventTime) {
		this.id = id;
		this.deviceId = deviceId;
		DustData = dustData;
		this.eventTime = eventTime;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDustData() {
		return DustData;
	}
	public void setDustData(String dustData) {
		DustData = dustData;
	}
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	@Override
	public String toString() {
		return "message [deviceId=" + deviceId + ", DustData=" + DustData + ", eventTime=" + eventTime + "]";
	}

}
