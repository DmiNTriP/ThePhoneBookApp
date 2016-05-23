



/**
 * Created by Kyler on 4/20/2016.
 */
public class MyLinkedList {

    private Employee firstEmployee = null;
    private Employee nextEmployeeInList = null;

    public MyLinkedList(Employee firstEmployee) {
        this.firstEmployee = firstEmployee;
        Employee Bob = new Employee("Bob","Smith","bSmith@somewhere.com","555-555-5555");

    }

    public Employee getFirstEmployee() {
        return firstEmployee;
    }

    public void setFirstEmployee(Employee firstEmployee) {
        this.firstEmployee = firstEmployee;
    }

    public MyLinkedList insert(Employee newEmployee) {
        Employee previousEmployee = firstEmployee;
        Employee currentEmployee = firstEmployee;

        if (newEmployee == null) {
            System.out.println("Failure to insert new Employee into Linked List.");
            return this;
        }

        if( firstEmployee == null) //we're at the start of the list
        {
            firstEmployee = newEmployee; //adds to the front of the list.
            firstEmployee.setNext(newEmployee);
        }
        else {

            while(currentEmployee != null){ //Go through Linked List to find the end of the list
                previousEmployee = currentEmployee;
                currentEmployee = currentEmployee.getNext();
            }

            //prevoius Employee contains the last valid Employee in the list.
            //Do the insert
            previousEmployee.setNext(newEmployee); //append to the end of the list
            newEmployee.setNext(null); //newEmployee is the end of the list.
        }
        //ADDS THE EMPLOYEE OBJECT TO
        return this;
    }



/*
    // Insert Employee Object into Linked List
    public void insert(Employee newEmployee) {
        Employee previousEmployee = null;
        Employee currentEmployee = firstEmployee;
        newEmployee.key = hashKey;
//TODO I switched the Employee variable to newEmployee since CurrentEmployee = null

        while (currentEmployee != null && newEmployee.key > currentEmployee.key) {
            previousEmployee = currentEmployee;
            currentEmployee = currentEmployee.getNext();

            //if there is no previsous Employee
            if (previousEmployee == null) {
                firstEmployee = newEmployee;
            } else {// A new Employee will be added while there are employees to add
                previousEmployee.next = newEmployee;
                newEmployee.next = currentEmployee;
                currentEmployee = currentEmployee.next

            }

        }
    }
*/

    public void displayLinkedList() {
        Employee current = firstEmployee;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    // Search for the employee object that is being called
    public Employee Search(int hashKey, String nameToFind) throws NullPointerException {
        Employee current = firstEmployee;
        while (current != null && current.getKey() <= hashKey) {
            if (current.fullName().equals(nameToFind)) {
                return current;

            }
            current = current.getNext();
        }
        return null;
    }


}

