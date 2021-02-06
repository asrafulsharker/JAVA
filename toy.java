public class toy
{


    String name;
    String breed;
    int weight;
    String color;
 

    public toy(String name, String breed, int weight, String color)
    {

        this.name = name;
        this.breed = breed;
        this.weight = weight;
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

    public int getWeight()
    {

        return weight;

    }

    public String getColor()
    {

        return color;

    }

    public String toString()
    {

        return("It's name is  =  "+ this.getName()+
               ".\n\nMy breed,weight and colors are =  " +
               this.getBreed()+"," + this.getWeight()+
               " ,"+ this.getColor());


    }
 
    public static void main(String[] args)


    {
        toy Car = new toy("Car","rechargeable", 2, "yellow");
        System.out.println(Car.toString());
    }

}