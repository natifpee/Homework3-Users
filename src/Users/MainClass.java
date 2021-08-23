package Users;

public class MainClass {


    public static void main(String[] args) {
        int age = 19;
        String name = "Danny Jiménez";
        double salary = 200.32;


        User myData;
        myData = new User();

        myData.setName(name);
        myData.setLogin("dJimenez");
        myData.setPassword("djimenez02");
        myData.setAge(age);
        myData.setState(States.UNACTIVE);

        User user2 = new User("Ericka", "eSolano", "esolano");
        User.setMaximumAttempts(5);

        System.out.println(user2 + "\n" + myData);
    }
}
