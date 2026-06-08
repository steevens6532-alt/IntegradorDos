package IntegradorTres;

public class Zefir extends Criatura implements IElementoViento {

    public Zefir(String nombre) {
        super(nombre, "Viento", 90, 85);
    }

    @Override
    public void ataqueBasico(Criatura objetivo) {
        System.out.println(getNombre() + " usa CORTE DE AIRE sobre " + objetivo.getNombre());
        objetivo.recibirDanio(16, getNombre());
    }

    @Override
    public void usarRafaga(Criatura objetivo) {
        System.out.println(getNombre() + " usa RÁFAGA sobre " + objetivo.getNombre());
        objetivo.recibirDanio(DANIO_RAFAGA, getNombre());
    }

    @Override
    public void usarCorreViento() {
        System.out.println(getNombre() + " usa CORREVIENTO");
        setVelocidad(getVelocidad() + BONUS_VELOCIDAD);
        System.out.println("  Velocidad de " + getNombre() + " aumentó a " + getVelocidad());
    }

    @Override
    public void usarEvasion() {
        System.out.println(getNombre() + " usa EVASIÓN");
        activarEvasion();
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Criatura: %s | Tipo: %s | Vida: %d/%d | Vel: %d%n",
                getNombre(), getTipo(), getVida(), getVidaMaxima(), getVelocidad());
        System.out.println("  Ataques: Corte de Aire, Ráfaga, Correviento, Evasión");
    }
}