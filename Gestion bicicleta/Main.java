public class Main {
    public static void main(String[] args) {

        GestionBicicleta gestionBicicleta = new GestionBicicleta(10);

        gestionBicicleta.crearBicicleta();
        gestionBicicleta.buscarBicicletaModelo();
        gestionBicicleta.busquedaBicicletaMarca();
    }
}