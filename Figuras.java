
import javax.swing.JOptionPane;


public class Figuras{

    public void Circulo(){

        String dato = JOptionPane.showInputDialog("ingrese el radio");
                      
        double radio = Double.parseDouble(dato);
                        
        double area = 3.1416*(radio*radio);
    
        double perimetro = (2*radio)*4.1416;
                        
                    
        JOptionPane.showMessageDialog(null, "el area es: " + area);
    
        JOptionPane.showMessageDialog(null, "el perimetro es: " + perimetro);
    
    }

    public void Rectangulo(){


        String dato = JOptionPane.showInputDialog("ingrese la base");

        String dato2 = JOptionPane.showInputDialog("Ingrese la altura");

        double base = Double.parseDouble(dato);
        double altura = Double.parseDouble(dato2);

        double area = base*altura;
        double perimetro = (2*base)+(2*altura);

        JOptionPane.showMessageDialog(null, "El area es: " + area);
        JOptionPane.showMessageDialog(null, "El perimetro es: " + perimetro);

    }
    
    public void Cuadrado(){

        String dato = JOptionPane.showInputDialog("ingrese el lado");
                      
        double lado = Double.parseDouble(dato);
                        
        double area = lado*lado;
    
        double perimetro = 4*lado;

        JOptionPane.showMessageDialog(null, "El area es: " + area);
        JOptionPane.showMessageDialog(null, "El perimetro es: " + perimetro);


    }


    public void Triangulo(){

        String dato = JOptionPane.showInputDialog("ingrese la base");

        String dato1 = JOptionPane.showInputDialog("Ingrese el segundo lado");

        String dato2 = JOptionPane.showInputDialog("Ingrese el tercer lado lado");

        String dato3 = JOptionPane.showInputDialog("Ingrese la altura");

        double base = Double.parseDouble(dato);
        double lado1 = Double.parseDouble(dato1);
        double lado2 = Double.parseDouble(dato2);
        double altura = Double.parseDouble(dato3);

        double area = base*altura;
        double perimetro = base+lado1+lado2;

        JOptionPane.showMessageDialog(null, "El area es: " + area);
        JOptionPane.showMessageDialog(null, "El perimetro es: " + perimetro);

    }

}

