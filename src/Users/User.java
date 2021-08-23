package Users;

public class User {

    //Sintaxis de un atributo
    //Visibilidad tipoDate identificador;

    private String nombre;
    private String login;
    private String password;
    private States estado = States.ACTIVE;
    private int edad;
    private static int maximoIntentos = 3;

    public User(){

    }

    public User(String nombre, String login){
        this.nombre = nombre;
        this.login = login;
    }

    public User(String nombre, String login, String password){
        this.nombre = nombre;
        this.login = login;
        this.password = password;
    }

    public User(String nombre, String login, String password, int edad){
        this.nombre = nombre;
        this.login = login;
        this.edad = edad;
        this.password = password;
    }
    public User(int edad, String nombre, String login){
        this.nombre = nombre;
        this.login = login;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getMaximoIntentos() {
        return maximoIntentos;
    }

    public static void setMaximoIntentos(int maximoIntentos) {
        User.maximoIntentos = maximoIntentos;
    }

    public States getEstado() {
        return estado;
    }

    public void setEstado(States estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "User \n"
                + "-----------------------------------"+ "\n" +
                "Nombre: " + nombre + "\n" +
                "Login: " + login + "\n" +
                "Password: " + password + "\n" +
                "Estado: " + estado + "\n" +
                "Edad: " + edad + "\n" +
                "Maximo de intentos: " + maximoIntentos + "\n" +
                "-------------------------------------" + "\n";
    }
}
