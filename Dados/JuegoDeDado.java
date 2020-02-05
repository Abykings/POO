/**
 * JuegoDeDado
 */
public class JuegoDeDado {

    private Jugador jugador;
    private Dado dado1;
    private Dado dado2;
    public void jugar(String nombre,int numeroGanador){
        jugador = new Jugador();
        jugador.setNombre(nombre);
        dado1 = new Dado();
        dado2 = new Dado();
        jugador.tomarLosDados(dado1, dado2);
        jugador.soplarLosDados();
        jugador.agitarLosDados();
        jugador.agitarLosDados();
        jugador.elegirNumeroGanador(numeroGanador);
        int numero = jugador.lanzarLosDados();
        if(numero == jugador.getNumeroGanador()){
            System.out.println(jugador.getNombre()+"ganaste con"+numero);
        }else{
            System.out.println(jugador.getNombre()+"perdiste por"+numero
            +"distinto de "+jugador.getNumeroGanador());
        }

    }
}