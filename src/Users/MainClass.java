package Users;
import javax.swing.plaf.nimbus.State;
import java.util.*;
public class MainClass {


    public static void main(String[] args) {
        String name = "Danny Jiménez";
        Date bornDate = new Date(101, 6, 2);

        User myData;
        myData = new User();

        myData.setName(name);
        myData.setLogin("dJimenez");
        myData.setPassword("djimenez02");
        myData.setState(States.UNACTIVE);
        myData.setAge(2, 7,2002);
        System.out.print(myData);


        myData.setState(States.SUSPENDED);
        myData.setAge(bornDate);
        System.out.println(myData);


    }
}
