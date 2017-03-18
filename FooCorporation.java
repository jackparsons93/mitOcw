public class FooCorporation{
	//double basepay;
	//int hoursWorked;
	//public FooCorporation(double amountPerHour, int howManyHoursWorked){
		//basepay=amountPerHour;
		//hoursWorked=howManyHoursWorked;
	//}
	public void totalPay(double basepay , int hoursWorked){
		int overtime;
		overtime=hoursWorked-40;
		if (basepay<8){
			System.out.println("Error basepay is below the minimum wage please and thank you!");

		}
		else if (overtime==0){
			System.out.println(basepay*hoursWorked);
		}
		else if (overtime>30) {
			System.out.println("You worked over 70 hours This is an Error saying you worked too much.");
		}
		else{
			System.out.println(40*basepay+overtime*basepay*1.5);
		}
		
	}

	public static void main(String[] args){
		FooCorporation employee1 = new FooCorporation();
		FooCorporation employee2 = new FooCorporation();
		FooCorporation employee3 = new FooCorporation();
		//System.out.println(employee1.hoursWorked);
		employee1.totalPay(7.50, 35);
		employee2.totalPay(8.20, 47);
		employee3.totalPay(10, 73);
	}
}