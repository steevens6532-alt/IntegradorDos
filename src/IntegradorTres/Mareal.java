package IntegradorTres;

public class Mareal extends Criatura implements IElementoAgua {

    public Mareal(String nombre) {
        super(nombre, "Agua", 120, 55);
    }

    @Override
    public void ataqueBasico(Criatura objetivo) {
        System.out.println(getNombre() + " usa CHORRO FRÍO sobre " + objetivo.getNombre());
        objetivo.recibirDanio(15, getNombre());
    }

    @Override
    public void usarTorrente(Criatura objetivo) {
        System.out.println(getNombre() + " usa TORRENTE sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_TORRENTE, getNombre());
    }

    @Override
    public void usarVortice(Criatura objetivo) {
        System.out.println(getNombre() + " usa VÓRTICE sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_VORTICE, getNombre());
    }

    @Override
    public void usarMarea() {
        System.out.println(getNombre() + " usa MAREA CURATIVA");
        curar(CURAR_MAREA);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Criatura: %s | Tipo: %s | Vida: %d/%d | Vel: %d%n",
                getNombre(), getTipo(), getVida(), getVidaMaxima(), getVelocidad());
        System.out.println("  Ataques: Chorro Frío, Torrente, Vórtice, Marea Curativa");
    }
}