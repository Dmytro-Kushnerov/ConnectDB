public class Person {
   private int personId;
   private String firstName, lastName;
   private int age;
 
   
   public Person(int personId, String firstName, String lastName, int age){
       this.personId = personId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
   }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

 
   
   
}
