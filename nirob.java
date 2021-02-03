public class nirob {
    
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.age = 20;
        p1.Name = "Nirob";

        Person p2 = new Person();
        p2.age = 33;
        p2.Name = "bal";

        // System.out.println(p1.age + " "+ p1.Name);

        // System.out.println(p2.age + " "+ p2.Name);
        System.out.println(Person.count);
        // p1.eat();
        // p2.walk();
        p1.eat(2);
    }
}

class Person{
    String Name;
    int age;
    static int count;
    public Person(){
        count++;
        System.out.println(" Creating a New Object !");
    }
    // void walk(){
    //     System.out.println(Name + " is walking!");
    // }
    // void eat(){
    //     System.out.println(Name + " is eating ");
    // // }
    void eat(int steps){
        System.out.println(Name +  " Walked " + steps);
    }
}