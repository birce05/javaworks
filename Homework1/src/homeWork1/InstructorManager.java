package homeWork1;

public class InstructorManager extends UserManager {
	public void updateToCourse(Instructor instructor){
        System.out.println(instructor.getId() + " isimli kulanýcý kurs içeriðini yeniledi");
    }
    public void removeToCourse(User user){
        System.out.println(user.geteMail() + " isimli kulanýcý kursu kapattý.");
    }
	

}
