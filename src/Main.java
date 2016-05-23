import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException{
        // write your code here
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
        HashTable table = new HashTable();
        //TODO just creating all objects to eb safe
        Employee emp = new Employee("Kyler","Callaway","kyler.callaway", "k");
        MyLinkedList theLinkedList = new MyLinkedList(emp);

        String choice;
        // creating the user interface
        System.out.println("To add an Employee to the Address Book please input add or done into the console");
        choice = mReader.readLine();
        do {
//            if (!choice.equals("add") || !choice.equals("done")) {

                switch (choice) {
                    case "add":

                        System.out.println("Please Enter Employees first Name");
                        emp.setFirstName(mReader.readLine());
                        System.out.println("Please Enter Employees Last Name");
                        emp.setLastName(mReader.readLine());
                        String fullName = emp.fullName();
                        System.out.println("Please Enter employees email address");
                        emp.setEmail(mReader.readLine());
                        System.out.println("Please Enter employees phone number");
                        emp.setPhoneNum(mReader.readLine());
                        System.out.printf("%s %n The hashcode is: %s %n %s %n %s%n", emp.fullName(), emp.fullName().hashCode(), emp.getEmail(), emp.getPhoneNum());
                        table.addInformation(emp);
                       // table.displayTheEmployees();

                        System.out.println(emp);
                        System.out.println(table);

                        System.out.println("  Please input either 1 or 2  to add another employee or done to exit the program");
                        choice = mReader.readLine();
                        if(choice.equals("1")) {
                           choice ="add";
                        }
                        else if (choice.equals("2")) {
                            System.out.println("Please enter the name of the person you would like to searcxh for ");
                         String fn = emp.fullName(); fn = mReader.readLine();
                            table.find(fn);


                        }
                         else {
                            choice.equals("3");
                        }
                        break;


                    case "done":
                        System.out.println("Thanks for entering the employees information");
                        break;
                    default:
                        System.out.println("you got to enter something here ");
                        System.out.println("Please enter add or done into the system to exit program");
                        choice = mReader.readLine();
                        break;

                }

        } while (!choice.equals("done"));

    }
}

