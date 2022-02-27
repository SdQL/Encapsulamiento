package Encapsulamiento;

public class AutoMovil {
    private String marca, modelo, color;

    public AutoMovil (String marca, String modelo, String color) {
           this.marca = marca;
           this.modelo = modelo;
           this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "¡Hola! Soy un AutoMovil..." +
                " Mi marca es: " + marca +
                ", Mi color es: " + color +
                " y mi modelo es del año: " + modelo+ "" + "";


    }
}


