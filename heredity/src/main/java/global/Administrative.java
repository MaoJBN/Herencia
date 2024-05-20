
package global;

public class Administrative extends Person{
    protected String dependency;

    public Administrative(String name, int age, String DNI, String dependency) {
        super(name, age, DNI);
        this.dependency=dependency;
    }
    public void seeData(){
        System.out.println("Mostrar datos del administrativo");
    }
    @Override
    public void fingerPrintReg(){
       System.out.println("Registro Huella Administrativo");
   }
}
