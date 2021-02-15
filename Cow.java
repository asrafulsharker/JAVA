public class Cow
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
 
    // Constructor Declaration of Class
    public Cow(String name, String breed, int age, String color)


    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public String getColor()
    {
        return color;
    }

    public String toString()
    {
        return("my name is  =  "+ this.getName()+
               ".\n\nMy breed,age and colors are =  " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
   public static void main(String args[])
   { 
    // Cow Lallu= new Cow("Lallu","Deshi","3","Red");

    Cow Lallu = new Cow("Lallu","Deshi", 3, "Red");
      System.out.println(Lallu.toString());


   }
 }















 