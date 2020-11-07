package com.example.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.getNB;
import com.example.demo.bean.BeaconMessage;
import com.example.demo.bean.Message;
import com.example.demo.bean.SmartBeaconData;
import com.example.demo.mapper.getNBMapper;


@RestController
public class MessageController {
	@Autowired
	getNBMapper mapper;
	
	
	@RequestMapping("/dept")
	public String insert(@RequestBody getNB getnb ) {		
		//System.out.println( jsonParam.toString());
		/*System.out.println(getnb.get("notifyType"));
		String deviceId = getnb.get("deviceId").toString();
		String service = getnb.get("service").toString();
		System.out.println(service);*/
		System.out.println(getnb);
		//System.out.println(getnb.getService().getData().getDustData());
		//System.out.println(getnb.getService().getData().getEventTime());
		String deviceId = getnb.getDeviceId();
		String dustData = getnb.getService().getData().getDustData();
		String eventTime = getnb.getService().getEventTime();
		Message me=new Message(null,deviceId,dustData,eventTime);
		mapper.Insert(me);
		return me.toString();
	}
	
	@RequestMapping("/beacon")
	public String InBeaconData(@RequestBody SmartBeaconData sbd) {
		System.out.println(sbd);
		String deviceId = sbd.getDeviceId();
		String dustData = sbd.getService().getData().getBeaconData();
		String eventTime = sbd.getService().getEventTime();
		BeaconMessage me=new BeaconMessage(null,deviceId,dustData,eventTime);
		mapper.InsertBeacon(me);
		return me.toString();
	}
	
	@RequestMapping("/s")
	public String InBeaconData1(@RequestBody SmartBeaconData sbd) {
		System.out.println(sbd.toString());
		return sbd.toString();
	}
}
