package IntegradorTres;

public interface IElementoFuego {
    int DANIO_LLAMARADA = 40;
    int DANIO_EXPLOSION = 55;
    int DANIO_CENIZA = 20;

    void usarLlamarada(Criatura objetivo);
    void usarExplosion(Criatura objetivo);
    void usarCeniza(Criatura objetivo);    // reduce velocidad del objetivo
}