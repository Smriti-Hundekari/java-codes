class Computer{
    public void playMusic() //Method1 Creation
    {
        System.out.println("Playing Music...");
    }

    public String GetMeAPen(int cost) //Method2 Creation
    {
        if(cost>=10)
         return "Pen";
        else
         return "Nothing";
    }
}

public class Methods {
    public static void main(String a[]){
    Computer obj = new Computer(); //Object Creation
    obj.playMusic(); // calling method1
    String str = obj.GetMeAPen(2); // calling method2
    System.out.println(str);
}
}

//Method in Java
//A method in Java or Java Method is a collection of statements that perform some specific task and return the result to the caller.
//Methods in Java allow us to reuse the code without retyping code.
//In Java, we create the components with the help of classes.
//Every class has a behavior and it is defined through the method.
//Behaviour or method is defined with the round brackets ().
//For every method, we also have to specify the type of access to it.
//Method does some tasks and it also returns something.
//We can call methods by creating an object.
//We can pass also pass values in a method.
//We can also put conditions inside the method like with the help of if..else.
//return keyword stops the execution of a method as it does not execute the further statements after it.

//- void is used when we do not want a method to return something.
//- String is used to return a string value.
//- int is used to return an integer value.

// * Main method is the start of execution from where the program begins.

//The syntax for method:-
//       class Computer
//        {
//          public void playMusic()
//           {
//             System.out.println("Music Playing..");
//           }
//          }