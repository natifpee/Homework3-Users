package Users;

import java.util.Calendar;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

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

    public void setAge(Calendar bornDate){
        Calendar actualDate = Calendar.getInstance();

        //We added one to the month because in Calendar Class start on 0
        int actualMonth = actualDate.get(Calendar.MONTH) + 1;
        int actualDay = actualDate.get(Calendar.DATE);
        int actualYear = actualDate.get(Calendar.YEAR);


        int bornDay = bornDate.get(Calendar.DATE);
        int bornYear = bornDate.get(Calendar.YEAR);
        //We added one to the month because in Date Class start on 0
        int bornMonth = bornDate.get(Calendar.MONTH) + 1;


        int age = actualYear - bornYear;


        if (bornMonth > actualMonth){
            age--;
        }else if(bornMonth == actualMonth){
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
//___________________________________________________________________________________________
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern Email = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mailAddress = Email.matcher(email);
        if(mailAddress.find()){
            this.email = email;
        }else{
            this.email = "N/A";
        }
    }
//___________________________________________________________________________________________

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
