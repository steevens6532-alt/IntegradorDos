package IntegradorTres;

public abstract class Criatura {
    private String nombre;
    private String tipo;
    private int vida;
    private int vidaMaxima;
    private int velocidad;
    private int escudo;
    private boolean evasionActiva;
    private static int contador = 0;

    public Criatura(String nombre, String tipo, int vidaMaxima, int velocidad) {
        this.nombre        = nombre;
        this.tipo          = tipo;
        this.vidaMaxima    = vidaMaxima;
        this.vida          = vidaMaxima;
        this.velocidad     = velocidad;
        this.escudo        = 0;
        this.evasionActiva = false;
        contador++;
    }

    // Getters
    public String getNombre()       { return nombre; }
    public String getTipo()         { return tipo; }
    public int getVida()            { return vida; }
    public int getVidaMaxima()      { return vidaMaxima; }
    public int getVelocidad()       { return velocidad; }
    public int getEscudo()          { return escudo; }
    public boolean isEvasionActiva(){ return evasionActiva; }
    public boolean estaVivo()       { return vida > 0; }
    public static int getContador() { return contador; }

    // Setters
    public void setVelocidad(int v) { this.velocidad = v; }

    // Método concreto: recibir daño (considera escudo y evasión)
    public void recibirDanio(int puntos, String nombreAtacante) {
        if (evasionActiva) {
            System.out.println("  ¡" + nombre + " esquivó el ataque!");
            evasionActiva = false;
            return;
        }
        if (escudo > 0) {
            int absorbe = Math.min(escudo, puntos);
            escudo -= absorbe;
            puntos -= absorbe;
            System.out.println("  Escudo de " + nombre + " absorbió " + absorbe + " pts. Escudo restante: " + escudo);
        }
        vida = Math.max(0, vida - puntos);
        System.out.println("  " + nombre + " recibió " + puntos + " de daño. Vida: " + vida + "/" + vidaMaxima);
        if (!estaVivo())
            System.out.println("  ¡" + nombre + " fue derrotado!");
    }

    // Método concreto: curar
    public void curar(int puntos) {
        vida = Math.min(vidaMaxima, vida + puntos);
        System.out.println("  " + nombre + " recuperó " + puntos + " de vida. Vida: " + vida + "/" + vidaMaxima);
    }

    // Método concreto: agregar escudo
    public void agregarEscudo(int puntos) {
        escudo += puntos;
        System.out.println("  " + nombre + " tiene escudo de " + escudo + " pts.");
    }

    // Método concreto: activar evasión
    public void activarEvasion() {
        evasionActiva = true;
        System.out.println("  " + nombre + " está en postura de evasión.");
    }

    // Métodos abstractos
    public abstract void ataqueBasico(Criatura objetivo);
    public abstract void mostrarInfo();
}