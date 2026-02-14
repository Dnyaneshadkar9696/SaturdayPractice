package practiseDay14_2_2026;

public class Calling {
	
	public static void main(String[] args) {
		
		// Interface Multiple inheritance Practice
		
		Grandfather grand;
		grand = new Son();
		grand.grandFatherInfo();
		grand.age(1);
	
		
		
		System.out.println();
		Father fh;
		fh = new Son();
		fh.fatherInfo();
		fh.age();
		
		System.out.println();
		Son s = new Son();
		s.sonInfo();
		
		System.out.println();
		Payment py = new Payment();
		py.paymentInfo();
		
		
		GooglePay gp;
		gp = new Payment();
		gp.googlePay();
		
		
		PhonePay pp;
		pp = new Payment();
		pp.phonePay();
		
		System.out.println();
		// dynamic dispatch
		
		Meta m;
		m = new Instagram();
		m.metaInfo();
		System.out.println();
		m = new Whatsupp();
		m.metaInfo();
		
		System.out.println();
		
		Notification n;
		n = new EmailNotification();
		n.sendMessage("You got paid by wise 50000 Rupees");
		
		n = new SMSNotification();
		n.sendMessage("SmS from Sbi , Welcome to Pradhan Mantri Surya Ghar Yojana");
		
		n = new WhatsAppNotification();
		n.sendMessage("You got messate from Jack, Message : Hi..");
		
		
	}

}
