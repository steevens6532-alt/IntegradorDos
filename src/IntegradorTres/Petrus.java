package IntegradorTres;

public class Petrus extends Criatura implements IElementoTierra {

    public Petrus(String nombre) {
        super(nombre, "Tierra", 140, 40);
    }

    @Override
    public void ataqueBasico(Criatura objetivo) {
        System.out.println(getNombre() + " usa GOLPE SÍSMICO sobre " + objetivo.getNombre());
        objetivo.recibirDanio(20, getNombre());
    }

    @Override
    public void usarTerremoto(Criatura objetivo) {
        System.out.println(getNombre() + " usa TERREMOTO sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_TERREMOTO, getNombre());
    }

    @Override
    public void usarLanzarRoca(Criatura objetivo) {
        System.out.println(getNombre() + " usa LANZAR ROCA sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_ROCA, getNombre());
    }

    @Override
    public void usarEscudoRoca() {
        System.out.println(getNombre() + " usa ESCUDO DE ROCA");
        agregarEscudo(DEFENSA_ESCUDO);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Criatura: %s | Tipo: %s | Vida: %d/%d | Vel: %d%n",
                getNombre(), getTipo(), getVida(), getVidaMaxima(), getVelocidad());
        System.out.println("  Ataques: Golpe Sísmico, Terremoto, Lanzar Roca, Escudo de Roca");
    }
}