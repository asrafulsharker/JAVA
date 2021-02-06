public class Business 
{
    String name;

    String type;

    String location;

 
    public Business (String name, String type,

                    String location)

    {

        this.name = name;

        this.type = type;

        this.location= location;

    }
 

    public String getName()

    {

        return name;

    }


    public String getType()

    {

        return type;

    }


    public String getLocation()

    {

        return location;

    }
 

    public String toString()

    {

        return("Hi this business name is "+ this.getName()+

               ".\nMy business type and location are " +

               this.getType()+"," + this.getLocation());

    }
 

    public static void main(String[] args)

    {

        Business Exchange = new Business("Exchange","dollar", "dhaka");

        System.out.println(Exchange .toString());

    }
}