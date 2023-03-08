import java.util.Scanner;

public class tema2 {
    public static void main(String[] args) {

        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
        Scanner input=new Scanner(System.in);
        double precio=0, iva, total;

        System.out.print("Ingrese precio de producto: ");
        precio=input.nextDouble();

        iva=precio*0.19;
        total=precio+iva;
        System.out.println("El precio el producto con el IVA incluido es "+total+" soles.");



    }
}
