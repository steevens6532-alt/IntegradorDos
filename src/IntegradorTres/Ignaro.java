package IntegradorTres;

public class Ignaro extends Criatura implements IElementoFuego {

    public Ignaro(String nombre) {
        super(nombre, "Fuego", 110, 60);
    }

    @Override
    public void ataqueBasico(Criatura objetivo) {
        System.out.println(getNombre() + " usa MORDIDA DE BRASA sobre " + objetivo.getNombre());
        objetivo.recibirDanio(18, getNombre());
    }

    @Override
    public void usarLlamarada(Criatura objetivo) {
        System.out.println(getNombre() + " usa LLAMARADA sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_LLAMARADA, getNombre());
    }

    @Override
    public void usarExplosion(Criatura objetivo) {
        System.out.println(getNombre() + " usa EXPLOSIÓN sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_EXPLOSION, getNombre());
    }

    @Override
    public void usarCeniza(Criatura objetivo) {
        System.out.println(getNombre() + " usa LLUVIA DE CENIZA sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_CENIZA, getNombre());
        objetivo.setVelocidad(Math.max(0, objetivo.getVelocidad() - 10));
        System.out.println("  Velocidad de " + objetivo.getNombre() + " reducida a " + objetivo.getVelocidad());
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Criatura: %s | Tipo: %s | Vida: %d/%d | Vel: %d%n",
                getNombre(), getTipo(), getVida(), getVidaMaxima(), getVelocidad());
        System.out.println("  Ataques: Mordida de Brasa, Llamarada, Explosión, Lluvia de Ceniza");
    }
}