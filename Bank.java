class Bank {
	public static void main(String[] args) {
	//first instance create 
	Account acc=new Account();
	acc.AccNumbr="445810110005651";
	acc.AccHolderName="Satyajeet kumar";
	acc.Balance=676657.97;
	acc.AccType="Saving";
	acc.BranhcName="jagdeopath";
	acc.Aadhaar="565212321287";
	acc.PanCard="19cp298";
acc.Addressh=" patna ";
//display the instance deatile of account 
//System.out.println();
System.out.println(acc.AccNumbr);
System.out.println(acc.AccHolderName);
System.out.println(acc.Balance);
System.out.println(acc.AccType);
System.out.println(acc.BranhcName);
System.out.println(acc.Aadhaar);
System.out.println(acc.PanCard);
System.out.println(acc.Addressh);
		//System.out.println("Hello World!");
	}//end of the main method
}//end of the class Bank
class Account{
String AccNumbr;
String AccHolderName;
double Balance;
String  AccType;
String BranhcName;
String Aadhaar;
String PanCard;
String Addressh;
}//end of the account  class