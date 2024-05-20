
package global;

public class Student extends Person{
    String carrer;
    int semester;
    float average;

    public Student(String carrer, int semester, String name, int age, String DNI,float average) {
        super(name, age, DNI);
        this.carrer = carrer;
        this.semester = semester;
        this.average = average;
    }
    public void seeGrades(){
        System.out.println("Aqui estan sus materias");
    }
    public void registerSubjects(){
        System.out.println("Aqui pueden registrar materias");
    }
    public void cancelSubjects(){
        System.out.println("Aqui pueden cancelar materias");
    }
    @Override
    public void fingerPrintReg(){
       System.out.println("Usted no puede hacer esto");
   }
}
