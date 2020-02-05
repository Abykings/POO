/**
 * Casino
 */
public class Casino {

    public static void main(String[] args) {
        JuegoDeDado juego = new JuegoDeDado();
        juego.jugar(args[0],Integer.parseInt(args[1]));
    }
}