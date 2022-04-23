class Typeconversion2 
{
	public static void main(String[] args) 
	{
		byte b=10;
		int i=b;

		//byte b1=i;//ce
		byte b3=(byte)i;//no ce
		//int i2=true;//ec
		//int b4=(int)true;//ec
		int b5=254;
		//byte b5=(byte)b5;//out of the range

		char ch ='a';//no ce  no re
		int i6=ch;
		System.out.println(i6);
		int i7=97;
		//char ch2=i7;//ce
		char ch2=(char)i7;
		System.out.println(ch2);
		long l=10;
		float f2=112.f;
		//long  l1=f;//ec
		//long l3=f;
//auto boxing and auto unboxing 
Integer io1=20;
Integer io2=30;
	Integer io3=io1+io2;
System.out.println(io3);



		//System.out.println("Hello World!");
	}
}
