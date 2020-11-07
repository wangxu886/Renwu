package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.example.demo.bean.BeaconMessage;
import com.example.demo.bean.Message;

@Mapper
public interface getNBMapper {
	@Options(useGeneratedKeys = true,keyProperty = "id")
	@Insert("insert into nb(id,deviceId,DustData,eventTime) values(#{id},#{deviceId},#{DustData},#{eventTime})")
	public int Insert(Message message);
	 
	@Options(useGeneratedKeys = true,keyProperty = "id")
	@Insert("insert into beacon_data(id,deviceId,beaconData,eventTime) values(#{id},#{deviceId},#{beaconData},#{eventTime})")
	public int InsertBeacon(BeaconMessage message);
	
	@Options(useGeneratedKeys = true,keyProperty = "id")
	@Insert("insert into alarm(id,deviceId,alarmData,eventTime) values(#{id},#{deviceId},#{alarmData},#{eventTime})")
	public int InsertAlarm(Message message);
	
	@Options(useGeneratedKeys = true,keyProperty = "id")
	@Insert("insert into sensor(id,deviceId,sensorData,eventTime) values(#{id},#{deviceId},#{sensorData},#{eventTime})")
	public int InsertSensor(Message message);
}
