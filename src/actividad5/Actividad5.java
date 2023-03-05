package actividad5;
import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
       double radio, diametro, perimetro, area;
       Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
      
       radio = valor.nextDouble();
       diametro = 2*radio;
       area = Math.PI * Math.pow(radio,2);
       perimetro = diametro*Math.PI;
       
       System.out.println("El area del circulo es: " + area);
       System.out.println("La longitud de la circunferencia del circulo de radio es :" + perimetro);                          
    }
}
