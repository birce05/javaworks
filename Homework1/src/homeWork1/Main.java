package homeWork1;

public class Main {


	public static void main(String[] args) {
		
		Student student1=new Student(1,"Berra","Tok","btok@gmail.com",014);
		Student student2=new Student(2,"Aya","Tok","atok@gmail.com",115);
		Student student3=new Student(3,"Birol","Tok","tbok@gmail.com",1250);
		Student[]students={
				student1,
				student2,
				student3};
			
		
			
		Course course1=new Course(1,"C#+Angular","EnginD","22,30");
		Course course2=new Course(2,"Java+React","EnginD","20,30");
		Course course3=new Course(3,"Flutter","EnginD","20,30");
		
		Course []courses ={
			course1,
			course2,
			course3
		};
		System.out.println("-------KURSLAR------");
		for (Course course:courses) {
			System.out.println(course.courseName);
		}
		
		System.out.println("-------OGRENCILER-----");
		for (Student student:students) {
			System.out.println(student.getName()+" "+student.getLastName());
			
		}
		
		
		
				
	}

}
