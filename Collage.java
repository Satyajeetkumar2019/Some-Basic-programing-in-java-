/*
Devolop a project to empliment student detail from collage 

*/
class Collage {
	public static void main(String[] args) {
	//first instance create
	Student s=new Student();
	s.Roll="17cs60";
	s.Reg="17105126050";
	s.Names="SATYAJEET KUMAR";
   s.EmailId="satyajetkumar2017@gmail.com";
  s.CollageName="Bakhtiyarpur Collage of Engineering , patna";
  s.Branch="Computer sciencs engineering ";
 s.PassingYear="2021";
 s.CourseDuraction="4 year";
//second instance create
Student s2=new Student();
    s2.Roll="17cs86";
	s2.Reg="17105126087";
	s2.Names="Manoj kumar chutiya";
    s2.EmailId="satyajetkumar2017@gmail.com";
   s2.CollageName="Bakhtiyarpur Collage of Engineering , patna";
   s2.Branch="Computer sciencs engineering ";
   s2.PassingYear="2021";
   s2.CourseDuraction="4 year";
   //Display the student etail in given
   System.out.println(" student Roll number :"+s.Roll);
   System.out.println(" Student Registation numbr:"+s.Reg);
   System.out.println(" Student Name :"+s.Names);
   System.out.println(" Student email id :"+s.EmailId);
   System.out.println("Student Collage Name"+s.CollageName);
   System.out.println("Branch "+s.Branch);
   System.out.println("Student passing year :"+s.PassingYear);
   System.out.println("Stunt duraction :"+s.CourseDuraction);
   System.out.println();
//second  student detail display 
 System.out.println(" Student Roll number :"+s2.Roll);
   System.out.println(" Student Registation numbr:"+s2.Reg);
   System.out.println(" Student Name :"+s2.Names);
   System.out.println(" Student email id :"+s2.EmailId);
   System.out.println("Student Collage Name : "+s2.CollageName);
   System.out.println("Branch "+s2.Branch);
   System.out.println("Student passing year :"+s2.PassingYear);
   System.out.println("Stunt duraction :"+s22.CourseDuraction);
   System.out.println();

		
	}//end of the main mthod
}//end of the class collage
class Student{
	//create detail of student 
String  Roll;
String Reg;
String  Names;
String CollageName;
String Branch;
String EmailId;
String Course;
String PassingYear;
String CourseDuraction;
}//endd of the student class