import java.util.ArrayList;
import java.util.Scanner;

public class GestionBicicleta {

    private ArrayList<Bicicleta> arr;
    private int numBicicletas;
    private int maxBicicletas;

    public GestionBicicleta(int maxBicicletas) {
        this.maxBicicletas = maxBicicletas;
        arr = new ArrayList<>();
    }

    public void crearBicicleta() {
        Scanner teclado = new Scanner(System.in);

        int count = 1;

        System.out.println("ingresa el numero de bicicletas");
        int numBicicletas = teclado.nextInt();

        if (numBicicletas > 0 && numBicicletas < maxBicicletas) {
            while (count <= numBicicletas) {

                System.out.println("ingresa la marca de la bicicleta " + count);
                String marca = teclado.next();

                System.out.println("ingresa el color de la bicicleta " + count);
                String color = teclado.next();

                System.out.println("ingrese el tipo de bicicleta " + count);
                String tipo = teclado.next();

                System.out.println("ingrese el modelo de la bicicleta " + count);
                int modelo = teclado.nextInt();

                Bicicleta bicicleta = new Bicicleta(marca, color, tipo, modelo);

                arr.add(bicicleta);
                count++;
            }
            this.numBicicletas = count - 1;
        }
    }

    public void buscarBicicletaModelo() {
        Scanner teclado = new Scanner(System.in);

        if (numBicicletas > 0 && numBicicletas < maxBicicletas) {

            System.out.println("ingrese el modelo de la bicicleta que quiere buscar");
            int modelo = teclado.nextInt();

            for (int i = 0; i < arr.size(); i++) {
                Bicicleta bicicleta = arr.get(i);
                if (modelo == bicicleta.getModelo()) {
                    System.out.println("Marca: " + bicicleta.getMarca());
                    System.out.println("Color: " + bicicleta.getColor());
                    System.out.println("Tipo: " + bicicleta.getTipo());
                    System.out.println("modelo: " + bicicleta.getModelo());
                }
            }
        }

    }

    public void busquedaBicicletaMarca() {
        Scanner teclado = new Scanner(System.in);

        if (numBicicletas > 0 && numBicicletas < maxBicicletas) {

            System.out.println("ingrese la marca de bicicleta que quiere buscar");
            String marca = teclado.next();

            for (int i = 0; i < arr.size(); i++) {
                Bicicleta bicicleta = arr.get(i);
                if (marca.equals(bicicleta.getMarca()) == true) {
                    System.out.println("Marca: " + bicicleta.getMarca());
                    System.out.println("Color: " + bicicleta.getColor());
                    System.out.println("Tipo: " + bicicleta.getTipo());
                    System.out.println("modelo: " + bicicleta.getModelo());
                }
            }
        }
    }

}
