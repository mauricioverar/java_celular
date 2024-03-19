package nuevoCelular;

public class Iphone {

    // atributos ***

    private int pantalla;
    private String marca;
    private String color;
    private int memoria;
    private int bateria;

    // accesadores para poder acceder a sus atributos privados usando get o set
    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    // constructor ***
    public Iphone(int pantalla, String marca, String color, int memoria, int bateria) {
        this.pantalla = pantalla;
        this.marca = marca;
        this.color = color;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    public Iphone( String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
}
