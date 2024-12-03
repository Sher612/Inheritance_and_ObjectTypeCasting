/**
 * In this lab we will demonstrate how to use Object type-casting and inheritance using Java
 * By the end of the lab, I will be able to:
 * describe inheritance
 * identify Object type-casting
 * utilize Inheritance and Object Type-casting
 */
public class Person {
    String name;
    static int lifeSpan = 60;
    static double ageFactor= 1.0;

    public Person(){
        name = " ";
    }
    public Person(String aName){
        name= aName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return ("Hello, my name is "+ name);
    }
    public String talk(){
        return ("I have nothing to say.");
    }
    public String walk(){
        return("I have nowhere to go.");
    }
    public static double lifeSpan(){
       return (lifeSpan*ageFactor);
    }
}
