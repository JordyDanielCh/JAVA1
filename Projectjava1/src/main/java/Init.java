/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fing.labcom
 */
public class Init {
    public static void main(String[] args ){
             Person personObject = new Person();
             Person personObject2 = new Person("Juanpa",2);
             
             Person personObject3 = new Person("Carlos");
             Init InitObject = new Init();
             InitObject.exampleMethod();
             
             exampleStaticMethod();
    }  
    
    public  static String exampleStaticMethod(){
        return"hi";
    }
     public  void exampleMethod(){
        
    }
}
