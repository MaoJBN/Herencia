
package global;

public class Person {
   protected String name;
   protected int age;
   protected String DNI;

    public Person(String name, int age, String DNI) {
        this.name = name;
        this.age = age;
        this.DNI = DNI;
    }
   public void fingerPrintReg(){
       System.out.println("Registro Huella");
   }
}
