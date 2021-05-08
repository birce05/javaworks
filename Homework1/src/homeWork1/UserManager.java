package homeWork1;

public class UserManager {
	public void logIn(User user){
        System.out.println(user.getId() +" "+ user.geteMail() + " isimli kullanýcý giriþ yaptý.");
    }
    public void signUp(User user){
        System.out.println(user.getId() +" "+ user.geteMail() + " isimli kullanýcý kayýt oldu.");
    }

}
