package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class WhatsAppNotification implements Notification {
	public void sendNotification(String to,String message)
	{
		System.out.println("Sending WhatsApp notification");
		System.out.println("To :: "+to);
		System.out.println("Message :: "+message);
	}

}
