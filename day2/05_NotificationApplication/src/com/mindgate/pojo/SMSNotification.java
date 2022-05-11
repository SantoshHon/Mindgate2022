package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class SMSNotification implements Notification {
	public void sendNotification(String to,String message)
	{
		System.out.println("Sending SMS notification");
		System.out.println("To :: "+to);
		System.out.println("Message :: "+message);
	}

}
