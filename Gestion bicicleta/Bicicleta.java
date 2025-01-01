public class Bicicleta {

    private String marca;
    private String color;
    private String tipo;
    private int modelo;

    public Bicicleta(String marca, String color, String tipo, int modelo) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        System.out.println("modelo: " + modelo);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public int getModelo() {
        return modelo;
    }
}
