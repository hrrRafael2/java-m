import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner entradaInt = new Scanner(System.in);
    Scanner entradaStr = new Scanner(System.in);

    
    Persona objPersona = new Persona("",0);
    Empleado objEmpleado = new Empleado("",0,0);
    Cliente objCliente = new Cliente("",0,"");

    System.out.println("DATOS DE LA PERSONA");

    System.out.println("Ingresa su nombre :");
    objPersona.setNombre(entradaStr.nextLine());

    System.out.println("Ingresa su edad :");
    objPersona.setEdad(entradaInt.nextInt());

   // objPersona.mostrar();

    
    System.out.println("DATOS DEL EMPLEADO");
    
    System.out.println("Ingresa su nombre :");
    objEmpleado.setNombre(entradaStr.nextLine());
    
    System.out.println("Ingresa su edad :");
    objEmpleado.setEdad(entradaInt.nextInt());

    System.out.println("Ingresa su sueldo bruto :");
    objEmpleado.setSueldoBruto(entradaInt.nextFloat());

   //

    System.out.println("DATOS DEL CLIENTE");

    System.out.println("Ingresa su nombre :");
    objCliente.setNombre(entradaStr.nextLine());

    System.out.println("Ingresa su edad :");
    objCliente.setEdad(entradaInt.nextInt());

    System.out.println("Ingresa su telefono :");
    objCliente.setTelefono(entradaStr.nextLine());


    System.out.println("----- DATOS FINALES ------");
    System.out.println("");
    System.out.println("----- DATOS PERSONA------");
    objPersona.mostrar();
    System.out.println("Su edad es :" + objPersona.calcularEdad());
    System.out.println("----- DATOS DEL EMPLEADO ------");
    objEmpleado.mostrar();
    System.out.println("Su sueldo neto es :" + objEmpleado.calcularSueldoNeto());
    System.out.println("----- DATOS DEL CLIENTE ------");
    objCliente.mostrar();
    System.out.println("Su edad es :" + objCliente.calcularEdad());    


    }
    
}















