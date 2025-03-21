class Person {
    // Member variables
    String fullName;
    String nickname;
    int age;
    

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Nickname: " + nickname);
        System.out.println("Age: " + age); 
    }
}

public class MemberVariablesExample {
    public static void main(String[] args) {

        Person person_1 = new Person();
        person_1.fullName = "Rana Smarty";
        person_1.nickname = "MaHiR";
        person_1.age = 21;
        person_1.displayInfo();

        Person person_2 = new Person();
        person_2.nickname = "Maha";
        person_2.fullName = "Mareeum Tabassum Maha";
        person_2.age = 21;
        person_2.displayInfo();
    }
}