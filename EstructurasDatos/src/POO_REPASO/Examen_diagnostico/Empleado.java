public class Empleado extends Persona{

    private float sueldoBruto;

    
    public Empleado(String nombre, int edad, float sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }


    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    // metoodos
    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo bruto: " + getSueldoBruto());
    }

    public float calcularSueldoNeto(){
        float sueldoNeto = getSueldoBruto() - (getSueldoBruto() * 0.25f);
        return sueldoNeto;
    }
    public int calcularEdad(){
        int anio = 2022;
        int resuladoEdad = anio - getEdad();
        return resuladoEdad;
    }

}
