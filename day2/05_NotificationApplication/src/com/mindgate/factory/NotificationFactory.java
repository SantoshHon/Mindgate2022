package com.mindgate.factory;

import com.mindgate.main.NotificationApplicationMain;
import com.mindgate.pojo.EmailBNotification;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.pojo.WhatsAppNotification;
import com.mindgate.service.Notification;

public class NotificationFactory {
public static Notification getNotification(int choice)
{
	Notification notification=null;
	
	switch(choice)
	{
	case 1:
		notification= new SMSNotification();
	break;
	case 2 :
		notification= new EmailBNotification();
	break;
	case 3 :
		notification= new  WhatsAppNotification();
	break;
	}
	return notification;
}
}
