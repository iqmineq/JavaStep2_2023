package chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {
		
		
		Queue<Message> messagesQueue=new LinkedList<Message>();
		//offer: 입력
		messagesQueue.offer(new Message("sendMail", "홍길동"));
		messagesQueue.offer(new Message("sendSMS", "김유신"));
		messagesQueue.offer(new Message("sendKaotalk", "이순신"));
		
		//poll : 출력
		while(!messagesQueue.isEmpty()) {
			Message message=messagesQueue.poll();
			
			switch (message.command) {
			case "sendMail":
				 System.out.println(message.to+"님에게 메일을 보냅니다");
				break;
			case "sendSMS":
				 System.out.println(message.to+"님에게 SMS을 보냅니다");
				break;
			case "sendKaotalk":
				 System.out.println(message.to+"님에게 Kaotalk을 보냅니다");
				break;
			default:
				break;
			}
			
		}

	}

}
