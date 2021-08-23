package Users;

public class MainClass {


    public static void main(String[] args) {
        int valor = 10;
        String nombre = "Luis";
        double salario = 200.32;


        User misDatos;
        misDatos = new User();

        misDatos.setNombre("Danny Jiménez");
        misDatos.setLogin("dJimenez");
        misDatos.setPassword("djimenez02");
        misDatos.setEdad(19);
        misDatos.setEstado(States.UNACTIVE);

        User user2 = new User("Ericka", "eSolano", "esolano");
        User.setMaximoIntentos(5);

        System.out.println(user2 + "\n" + misDatos);
    }
}
