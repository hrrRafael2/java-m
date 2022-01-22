import java.util.Scanner;

public class index{

    public static void main(String[] args) {
        index objeto = new index();
        /* 
            objeto.sumarDosNumeros();
            objeto.ValidarNumero(12);
            objeto.convertirTipos();
            objeto.convertirPrimitivosString();
            
            objeto.conversionPrimitivos();
        */

     

    }


    public void sumarDosNumeros(){
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;

        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();

        resultado = numero1 + numero2;

        System.out.println("El resultado de la suma es: " + resultado);
    }


    public boolean ValidarNumero(int numero){
        boolean valido = false;
        if(numero > 0){
            valido = true;
        }
        return valido;
    }

    // 
    public void validarCadena(){
        String cadenaFacebook = "facebook";

        if(cadenaFacebook.equals("facebook")){
            System.out.println("La cadena es igual a facebook");
        }
        
    }
    

    // conversionDeTipos
    public void convertirTipos(){
        Scanner  convertirTipo = new Scanner(System.in);

        String numeroStr = "12";
        // Convertir de String a int
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("El numero convertido a int es: " + numeroInt);

        String realString = "12222.33";
        // Convertir de String a double
        double realDouble = Double.parseDouble(realString);
        System.out.println("El numero convertido a double es: " + realDouble);


        String logString = "true";
        // Convertir de String a boolean
        boolean logBoolean = Boolean.parseBoolean(logString);
        System.out.println("El numero convertido a boolean es: " + logBoolean);



    }


    public void convertirPrimitivosString(){
        int otroNumero = 12;
        // convertir de int a String
        String otroNumeroStr = Integer.toString(otroNumero);
        System.out.println("El numero convertido a String es: " + otroNumeroStr);
        int otroNumero2 = 11;
        // convertir de int a String
        String otroNumeroStr2 = String.valueOf(otroNumero2);
        System.out.println("El numero convertido a String es: " + otroNumeroStr2);
        // estas son las dos formas de convertir de int a String

        System.out.println("------------------------");
        double otroNumeroDouble = 12.12;
        // convertir de double a String
        String otroNumeroDoubleStr = Double.toString(otroNumeroDouble);
        otroNumeroDoubleStr = String.valueOf(otroNumeroDouble);
        System.out.println("El numero convertido a String es: " + otroNumeroDoubleStr);
    }


    public void conversionPrimitivos(){
        int i = 10000;
        short s = (short)i;
        // casteo de int a short
        System.out.println("El numero convertido a short es: " + s);
        long l = 10000;
        short s2 = (short)l;
        // casteo de long a short
        System.out.println("El numero convertido a short es: " + s2);
        int x = 12;
        char b = (char)x;
        // casteo de long a char
        System.out.println("El numero convertido a char es: " + b);
    }


}


