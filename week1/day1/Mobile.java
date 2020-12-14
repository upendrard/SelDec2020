package week1.day1;
public class Mobile {
	String phoneBrand="SAMSUNG";
	String phoneSize="5 inch";
boolean isSmartPhone=true;
long phNo=9876543210l;
String modelNumber="SM-5935FD";
int phonePrice=6000;
String simType="DUAL";
	//public void sendSms() {
	//	System.out.println("Message Sent");
//}
	//public void makeCall() {
	//	System.out.println("Call Connected");
//}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		//obj.sendSms();
		//obj.makeCall();
		System.out.println(obj.phoneBrand);
		System.out.println(obj.phoneSize);
		System.out.println(obj.isSmartPhone);
		System.out.println(obj.phNo);
		System.out.println(obj.modelNumber);
		System.out.println(obj.phonePrice);
		String st=obj.simType;
		System.out.println(st);
		
	}
}
