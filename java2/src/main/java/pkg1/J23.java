package pkg1;

class Bird{
    String color;
    int noOfFeet=2;
    boolean canFly = true;
}

public class J23 {
    public static void main(String[] args){
        Bird parrot1=new Bird();
        Bird crow1=new Bird();

        parrot1.color = "Green";
        parrot1.canFly = true;

        crow1.color = "Black";
        crow1.canFly = false;

        System.out.println("Parrot");
        System.out.println("Color: "+parrot1.color);
        System.out.println("No.of Feet: "+parrot1.noOfFeet);
        System.out.println("Can Fly: "+parrot1.canFly);

        System.out.println("Crow");
        System.out.println("Color: "+crow1.color);
        System.out.println("No.of Feet: "+crow1.noOfFeet);
        System.out.println("Can Fly: "+crow1.canFly);
    }
}
