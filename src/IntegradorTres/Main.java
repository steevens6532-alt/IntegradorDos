package IntegradorTres;

public class Main {
    public static void main(String[] args) {

        Ignaro  ignaro = new Ignaro("Ignaro");
        Mareal  mareal = new Mareal("Mareal");
        Petrus  petrus = new Petrus("Petrus");
        Zefir   zefir  = new Zefir("Zefir");

        System.out.println("===== INFO DE CRIATURAS =====");
        ignaro.mostrarInfo();
        mareal.mostrarInfo();
        petrus.mostrarInfo();
        zefir.mostrarInfo();

        System.out.println("\n===== COMBATE: IGNARO vs MAREAL =====");
        ignaro.ataqueBasico(mareal);
        mareal.usarMarea();
        ignaro.usarLlamarada(mareal);
        mareal.usarTorrente(ignaro);
        ignaro.usarExplosion(mareal);

        System.out.println("\n===== COMBATE: PETRUS vs ZEFIR =====");
        petrus.usarEscudoRoca();
        zefir.usarEvasion();
        petrus.usarTerremoto(zefir);       // Zefir esquiva
        zefir.usarCorreViento();
        zefir.usarRafaga(petrus);          // escudo absorbe
        petrus.usarLanzarRoca(zefir);

        System.out.println("\n===== ESTADO FINAL (polimorfismo) =====");
        Criatura[] criaturas = { ignaro, mareal, petrus, zefir };
        for (Criatura c : criaturas) {
            c.mostrarInfo();
            if (c instanceof IElementoFuego) System.out.println("  → Habilidades de fuego");
            if (c instanceof IElementoAgua)  System.out.println("  → Habilidades de agua");
            if (c instanceof IElementoTierra)System.out.println("  → Habilidades de tierra");
            if (c instanceof IElementoViento)System.out.println("  → Habilidades de viento");
            System.out.println("  Estado: " + (c.estaVivo() ? "En pie" : "Derrotado"));
        }
        System.out.println("\nTotal criaturas creadas: " + Criatura.getContador());
    }
}