package Users;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class User {

    private String name;
    private String login;
    private String password;
    private States state = States.ACTIVE;
    private int age;
    private int phone;
    private String email;
    private static int maximumAttempts = 3;

    public User(){

    }

    public User(String aName, String aLogin){
        this.name = aName;
        this.login = aLogin;
    }

    public User(String aName, String aLogin, String aPassword){
        this.name = aName;
        this.login = aLogin;
        this.password = aPassword;
    }

    public User(String aName, String aLogin, String aPassword, int anAge){
        this.name = aName;
        this.login = aLogin;
        this.age = anAge;
        this.password = aPassword;
    }

    public User(int anAge, String aName, String aLogin){
        this.name = aName;
        this.login = aLogin;
        this.age = anAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String aLogin) {
        this.login = aLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String aPassword) {
        this.password = aPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Date bornDate){
        Calendar actualDate = Calendar.getInstance();

        //We added one to the month because in Calendar Class start on 0
        int actualMonth = actualDate.get(Calendar.MONTH) + 1;
        int actualDay = actualDate.get(Calendar.DATE);
        int actualYear = actualDate.get(Calendar.YEAR);


        int bornDay = bornDate.getDate();
        //We added 1900 to the year because in Date Class start by 1900 and not from 0
        int bornYear = bornDate.getYear() + 1900;
        //We added one to the month because in Date Class start on 0
        int bornmMonth = bornDate.getMonth() + 1;


        int age = actualYear - bornYear;


        if (bornmMonth > actualMonth){
            age--;
        }else if(bornmMonth == actualMonth){
            if(bornDay > actualDay){
                age--;
            }
        }

        System.out.println("-------------------------------- \n"+
                "Age with setAge(Date): " + age + "\n"
                +"------------------------------------------ \n");
        this.age = age;
    }

    public void setAge(int bornDay, int bornMonth, int bornYear){
        Calendar actualDate = Calendar.getInstance();

        //We add one to the month because in Calendar Class start on 0
        int actualMonth = actualDate.get(Calendar.MONTH) + 1;
        int actualDay = actualDate.get(Calendar.DATE);
        int actualYear = actualDate.get(Calendar.YEAR);


        int age = actualYear - bornYear;

        if (bornMonth > actualMonth){
            age--;
        }else if(bornMonth == actualMonth){
            if(bornDay > actualDay){
                age--;
            }
        }

        System.out.println("---------------------------------------- \n"+
                "Age with setAge(int, int, int): " + age + "\n"
        +"------------------------------------------------\n");
        this.age = age;

    }

    public void setAge(int anAge) {
        this.age = anAge;
    }

    public static int getMaximumAttempts() {
        return maximumAttempts;
    }

    public static void setMaximumAttempts(int maximumAttempts) {
        User.maximumAttempts = maximumAttempts;
    }

    public States getState() {
        return state;
    }

    public void setState(States aState) {
        this.state = aState;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n User \n"
                + "-----------------------------------"+ "\n" +
                "Nombre: " + name + "\n" +
                "Login: " + login + "\n" +
                "Password: " + password + "\n" +
                "Estado: " + state + "\n" +
                "Edad: " + age + "\n" +
                "Maximo de intentos: " + maximumAttempts + "\n" +
                "-------------------------------------" + "\n";
    }
}
