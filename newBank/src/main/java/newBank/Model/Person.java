package newBank.Model;
import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class Person {
    private String name;
    private String address;
    private String idNumber;
    private String email;
    private String password;

    public Person(String name, String address, String idNumber, String email, String password) {
        this.name = name;
        this.address = address;
        this.idNumber = idNumber;
        this.email = email;
        this.password = password;
    }

    public Person(String name, String address, String email, String password) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public void update (Person person){
        this.name = person.getName();
        this.address = person.getAddress();
        this.email = person.getEmail();
        this.password = person.getPassword();
    }


    //  C-R-U-D
//    Create
//    public boolean  addNewUser(String idNumber, Person person){
//        for (Person p : Bank.clientList){
//            if(p.getIdNumber().equals(person.getIdNumber())){
//                return false;
//            }
//        }
//        Bank.clientList.add(person);
//            return true;
//        }
////Read
//    public boolean readUser(String idNumber){
//        if (Bank.clientList != null)
//            for (Person p: Bank.clientList){
//            System.out.println("person = " + p);
//            return true;
//        }
//        return false;
//    }
////Update
//    public  boolean updateUser(String idNumber, Person updateData) {
//        for (Person person : Bank.clientList) {
//            if (person.getIdNumber().equals(person.getIdNumber())) {
//                person.setName(updateData.getName());
//                person.setAddress(updateData.getAddress());
//                person.setEmail(updateData.getEmail());
//                person.setPassword(updateData.getPassword());
//                return true;
//            }
//        }
//        return false;
//    }
////Delete
//    public boolean deleteUser(String idNumber){
//        for (Person person : Bank.clientList) {
//            if (person.getIdNumber().equals(person.getIdNumber())) {
//                Bank.clientList.remove(person);
//                return true;
//            }
//        }
//        return false;
//    }
}

