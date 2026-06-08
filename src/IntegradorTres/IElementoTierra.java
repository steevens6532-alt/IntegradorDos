package IntegradorTres;

public interface IElementoTierra {
    int DANIO_TERREMOTO   = 45;
    int DANIO_ROCA = 30;
    int DEFENSA_ESCUDO   = 20;            // puntos de escudo temporal

    void usarTerremoto(Criatura objetivo);
    void usarLanzarRoca(Criatura objetivo);
    void usarEscudoRoca();                // se agrega escudo a sí mismo
}