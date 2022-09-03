import java.io.Console;

public class Ejercicio_tema3{
    public static void main(String[] args) {
        
        // primera parte 
        System.out.println("La suma es: "+suma(1,2,3));
        // segunda parte 
        coche coche_1= new coche();
        coche_1.mostrar();
        coche_1.masPuertas();
        coche_1.masPuertas();
        coche_1.masPuertas();
        coche_1.mostrar();
    }
    // primera parte
    public static int suma(int a,int b,int c){
        return a+b+c;
    }
}
// segunda parte
class  coche{
    int puerta=0;

    public void masPuertas(){
        puerta=puerta+1;
    }

    public void mostrar(){
        System.out.println("El coche tiene "+puerta+" puertas");
    }

}