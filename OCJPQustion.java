class OCJPQustion
{
	public static void main(String[] args) 
	{
	Beta x=new Beta();
	Alpha a=x;
	//Fool  f=(Delta)x;
	Fool f2=(Alpha)x;
	Beta b=(Beta)(Alpha)x;
System.out.println(4*2+8/2-3*3+6/3);//5



	}
}//end of the class
interface Fool {}
class Alpha implements Fool {}
class Beta extends Alpha{}
class Delta extends Beta {}
