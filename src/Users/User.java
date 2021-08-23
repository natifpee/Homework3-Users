package Users;

public class User {

    //Sintaxis de un atributo
    //Visibilidad tipoDate identificador;

    private String name;
    private String login;
    private String password;
    private States state = States.ACTIVE;
    private int age;
    private static int maximumAttempts = 3;

    public User(){

    }

    public User(String name, String login){
        this.name = name;
        this.login = login;
    }

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public User(String name, String login, String password, int age){
        this.name = name;
        this.login = login;
        this.age = age;
        this.password = password;
    }
    public User(int age, String name, String login){
        this.name = name;
        this.login = login;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setState(States state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User \n"
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
