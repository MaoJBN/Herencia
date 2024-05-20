
package global;


public class Teacher extends Person{
    String[] subject;

    public Teacher(String[] subject, String name, int age, String DNI) {
        super(name, age, DNI);
        this.subject = subject;
    }

    
   public void seeStudentData(){
       System.out.println("Juanito alimaña");
   }
   public void setStudentGrades(){
       System.out.println("Juanito alimaña perdio :/");

   }
   @Override
    public void fingerPrintReg(){
       System.out.println("ya se registro la huella docente");
   }
}
