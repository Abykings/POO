/**
 * Jugador
 */
public class Jugador {

    private String nombre;
    private int numeroGanador;
    private Dado dado1;
    private Dado dado2;
    public void tomarLosDados(Dado dado1,Dado dado2){
        this.dado1 = dado1;
        this.dado2 = dado2;
    }
    public void soplarLosDados(){
        System.out.println("fhsss");
    }
    public void agitarLosDados(){
        System.out.println("click click");
    }
    public void elegirNumeroGanador(int numero){
        numeroGanador= numero;
    }
    public int lanzarLosDados(){
        return dado1.mostrarCaraSuperior() + dado2.mostrarCaraSuperior();
    }
    public String getNombre(){
        return nombre;
    }
    public int getNumeroGanador(){
        return numeroGanador;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}