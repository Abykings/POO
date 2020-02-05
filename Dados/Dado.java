/**
 * Dado
 */
public class Dado {

    private final int NUMERO_CARAS = 6;
    private int caraSuperior;
    public int mostrarCaraSuperior(){
        caraSuperior = (int)(Math.random()*NUMERO_CARAS)+1;
        return caraSuperior;
    }
}