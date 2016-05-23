/**
 * Created by Kyler on 4/23/2016.
 */
public class Employee {
    private String mFirstName;
    private String mLastName;
    private String mEmail;
    private String mPhoneNum;
    public Employee next; // references next employee in the LinkedList
    public int key;

//TODO this may need to get used as a constructor but probably not;
    public Employee(String firstName, String lastName,String email, String phoneNum){
        mFirstName = firstName;
        mLastName = lastName;
        mEmail = email;
        mPhoneNum = phoneNum;
        key = nameToHash();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Full name " + fullName() +
                "mEmail='" + mEmail + '\'' +
                ", mPhoneNum='" + mPhoneNum + '\'' +
                ", key=" + key +
                '}';
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public Employee getNext() {
        return next;
    }

    public void setNext(Employee next) {
        this.next = next;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPhoneNum() {
        return mPhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        mPhoneNum = phoneNum;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (mFirstName != null ? !mFirstName.equals(employee.mFirstName) : employee.mFirstName != null) return false;
        return mLastName != null ? mLastName.equals(employee.mLastName) : employee.mLastName == null;

    }*/

  /*  @Override
    public int hashCode() {
        int result = mFirstName != null ? mFirstName.hashCode() : 0;
        result = 31 * result + (mLastName != null ? mLastName.hashCode() : 0);

        return result;
    }*/
    public String fullName(){

        return mFirstName.toUpperCase().concat(mLastName.toUpperCase());
    }
    public int nameToHash(){
        return fullName().hashCode();
    }
}
