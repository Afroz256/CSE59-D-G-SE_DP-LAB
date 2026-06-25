

package com.mycompany.lab3;
class User{
    private String username;
    private String email;
    User(String username,String email){
        this.username = username;
        this.email = email;
    }
    String getUsername(){
        return username;
    }
    String getEmail(){
        return email ;
    }
}
class EmailValidator{
    boolean isValid(String email){
        return email != null && email.contains("@");
        
    }
}
class UserRepository{
    void save(User user){
        System.out.println("Connecting to database...");
        System.out.println("Svaing user" + user.getUsername()+ "to the user tables.");
    }
}
class UserService{
    private EmailValidator validator;
    private UserRepository repository;
    
    UserService(EmailValidator validator , UserRepository repository){
        this.validator = validator;
        this.repository = repository;
        
    }
    void registerUser(User user){
        if(!validator.isValid(user.getEmail())){
            System.out.println("Invalid email format.");
            return;
        }
        repository.save(user);
    }
}

public class Lab3 {

    public static void main(String[] args) {
        User user = new User("John","john@example.com");
        EmailValidator validator = new  EmailValidator();
        UserRepository repository = new UserRepository();
        UserService service = new UserService(validator,repository);
        service.registerUser(user);
    }

        
}

