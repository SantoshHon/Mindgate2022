package com.mindgate.main;



import java.util.Scanner;


import com.mindgate.factory.NotificationFactory;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.service.Notification;

public class NotificationApplicationMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		String to;
		String message;
		System.out.println("Menu\n 1.SMS Notification\n 2.Email   Notification \n3. whatsappnotification");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		NotificationFactory.getNotification(choice);

		
		System.out.println("Enter contact :: ");
		to = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Message");
		message = scanner.nextLine();

	Notification notification=NotificationFactory.getNotification(choice);
	notification.sendNotification(to, message);
	}

}
