package homeWork1;

public class InstructorManager extends UserManager {
	public void updateToCourse(Instructor instructor){
        System.out.println(instructor.getId() + " isimli kulan?c? kurs i?eri?ini yeniledi");
    }
    public void removeToCourse(User user){
        System.out.println(user.geteMail() + " isimli kulan?c? kursu kapatt?.");
    }
	

}
