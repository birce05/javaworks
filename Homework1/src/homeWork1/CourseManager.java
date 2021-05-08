package homeWork1;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println(course.courseName+"kayıt oldunuz");
	}
	public void updateCourse(Course course) {
		System.out.println(course.courseName+"kayıt güncelleme");
	}
	public void deleteCourse(Course course) {
		System.out.println(course.courseName+"kayıt silindi");
	}

}
