package homeWork1;

public class Student {
	private  int id;
	private String name;
	private String lastName;
	private String email;
	private int sno;
	
 public Student() {
		
	};
	
	
	public Student(int id,String name,String lastName,String email,int sno) {
		
		
		this.id=id;
		this.name=name;
		this.lastName=lastName;
		this.email=email;
		this.sno=sno;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	};
	
	

}
