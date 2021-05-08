package homeWork1;

public class StudentManager {
	
	public void signinCourse(Student student){
	       System.out.println("kursa başarıyla kayıt olundu." );
	    }
	    public void ShowStudendInfo(Student student){

	           System.out.println("Isim soyisim: " + student.getName()+" "+student.getLastName());
	           System.out.println("Mail adresi: "+student.getEmail() );
	           System.out.println("Ogrenci id: "+student.getId());


	    }

}
