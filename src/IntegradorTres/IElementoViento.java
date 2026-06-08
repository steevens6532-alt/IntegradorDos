package IntegradorTres;

public interface IElementoViento {
    int DANIO_RAFAGA = 25;
    int BONUS_VELOCIDAD  = 15;            // aumenta su propia velocidad

    void usarRafaga(Criatura objetivo);
    void usarCorreViento();               // se aumenta velocidad
    void usarEvasion();                   // siguiente ataque recibido falla
}