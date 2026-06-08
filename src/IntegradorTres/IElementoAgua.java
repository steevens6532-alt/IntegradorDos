package IntegradorTres;

public interface IElementoAgua {
    int DANIO_TORRENTE = 35;
    int DANIO_VORTICE = 50;
    int CURAR_MAREA      = 25;             // se cura a sí mismo

    void usarTorrente(Criatura objetivo);
    void usarVortice(Criatura objetivo);
    void usarMarea();                      // habilidad de autocuración
}