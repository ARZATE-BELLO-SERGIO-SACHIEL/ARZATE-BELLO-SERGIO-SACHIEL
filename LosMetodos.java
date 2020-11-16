import java.util.Scanner;
import javax.swing.JOptionPane;



public class LosMetodos{


    Scanner entrada = new Scanner(System.in);

    Figuras obj = new Figuras();

    public void menu(){

        char op;

        System.out.println("seleccione una opcion");
        System.out.println("A-calcule su edad");
        System.out.println("B-calcular area y perimetro");
        System.out.println("C-llamadas");

        op = entrada.next().charAt(0);

        switch (op) {
            case 'A':
                Edad();
                break;
            
            case 'B':
                AreaPerimetro();
                break;

            case 'C':
                Telefono();
                break;
        
            default:
                break;
        }

        
    }

    
    public void Edad(){

        

        String nombre = JOptionPane.showInputDialog("Escriba su nombre");
        String edad1 = JOptionPane.showInputDialog(nombre + "Ingrese su ano de nacimiento");
        int ano1 = Integer.parseInt(edad1);
        int ano2 = 2020 - ano1;
        JOptionPane.showMessageDialog(null, "su edad es de: " + ano2);

        

        
        
    }
    
    

    public void AreaPerimetro(){


        char op;

        System.out.println("seleccione una figura");
        System.out.println("a-circulo");
        System.out.println("b-rectangulo");
        System.out.println("c-cuadrado");
        System.out.println("d-triangulo");

        op = entrada.next().charAt(0);
       
        switch (op) {
            case 'a':
                obj.Circulo();
                break;

            case 'b':
                obj.Rectangulo();
                break;

            case 'c':
                obj.Cuadrado();
                break;

            case 'd':
                obj.Triangulo();
                break;
        
            default:
                break;
        }




    }

    public void Telefono(){
        
       
        String dato1 = JOptionPane.showInputDialog("Ingrese su numero telefonico solo 10 digitos");
        long numero1 = Long.parseLong(dato1, 10);

        String dato2 = JOptionPane.showInputDialog("Ingrese su credito");
        Double credito = Double.parseDouble(dato2);

        int credito1 = (int)Math.round(credito);

        String dato3 = JOptionPane.showInputDialog("Ingrese sus llamadas locales");
        int locales = Integer.parseInt(dato3);

        
        String dato4 = JOptionPane.showInputDialog("Ingrese sus llamadas internacionales");
        int internacionales = Integer.parseInt(dato4);

        
        String dato5 = JOptionPane.showInputDialog("Ingrese sus llamadas a celulares");
        int celulares = Integer.parseInt(dato5);

        RestaTotal(numero1,credito1,locales,internacionales,celulares);
        
        
    }


    
    public void RestaTotal(long numero1, int credito1, int locales, int internacionales, int celulares){
       
        Double creditoA = (locales*0.5)+(internacionales*0.6)+(celulares*0.2);

        int creditoB = (int)Math.round(creditoA);

        double creditoC = credito1-creditoB;

        

        JOptionPane.showMessageDialog(null, "Hola: " + numero1 + " tu saldo es de: " + creditoC);

        String condicion = JOptionPane.showInputDialog("Desea conocer su credito actual escriba (1) de lo contrario escriba (2)");
        int seleccion = Integer.parseInt(condicion);
   

        if(seleccion == 1 ){

        JOptionPane.showMessageDialog(null, "Hola: " + numero1 + " tu saldo inicial era de: " + credito1 + " tu saldo actual es de: " + creditoC);

        }else{

            JOptionPane.showMessageDialog(null, "QUE TENGA BUEN DIA");

        }





    }

    

   
}