
package Members;
//Trainer Model
public class TrainerModel {
    String firstName, lastName, phoneNumber, age, email, id;
    boolean isMale;
    int experiance, workTime;
    
    public TrainerModel(String firstName, String lastName, boolean isMale, String phoneNumber, int experiance, String age, int workTime, String email, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMale = isMale;
        this.phoneNumber = phoneNumber;
        this.experiance = experiance;
        this.age = age;
        this.workTime = workTime;
        this.email = email;
        this.id = id;
    }
}