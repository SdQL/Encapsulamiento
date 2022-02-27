package Encapsulamiento;

public class Main {

    public static void main(String[] args) {
        AutoMovil carro = new AutoMovil("Ford Mustang", "2011", "Gris");

            System.out.println(carro);
            carro.setModelo("2013");
            System.out.println("¡Hola otra vez! Mi modelo ha sido modificado al año: "+carro.getModelo());
        }

    }

