package homeWork1;

public class UserManager {
	public void logIn(User user){
        System.out.println(user.getId() +" "+ user.geteMail() + " isimli kullan?c? giri? yapt?.");
    }
    public void signUp(User user){
        System.out.println(user.getId() +" "+ user.geteMail() + " isimli kullan?c? kay?t oldu.");
    }

}
