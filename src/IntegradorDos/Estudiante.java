package IntegradorDos;

public abstract class Estudiante implements Valores {

    private String codigo;
    private String nombres;
    private int semestreIngreso;
    private String condicionSocial; // "ninguna", "bombero activo", "licenciado de fuerzas armadas"

    public Estudiante(String codigo, String nombres, int semestreIngreso, String condicionSocial) {
        this.codigo           = codigo;
        this.nombres          = nombres;
        this.semestreIngreso  = semestreIngreso;
        this.condicionSocial  = condicionSocial;
    }

    // Getters
    public String getCodigo()           { return codigo; }
    public String getNombres()          { return nombres; }
    public int getSemestreIngreso()     { return semestreIngreso; }
    public String getCondicionSocial()  { return condicionSocial; }

    // Setters
    public void setCodigo(String codigo)                     { this.codigo = codigo; }
    public void setNombres(String nombres)                   { this.nombres = nombres; }
    public void setSemestreIngreso(int semestreIngreso)      { this.semestreIngreso = semestreIngreso; }
    public void setCondicionSocial(String condicionSocial)   { this.condicionSocial = condicionSocial; }

    // Métodos abstractos
    public abstract double pagoParcialPension();
    public abstract double descuentos();

    // Método concreto: pago final
    public double pagoFinalPension() {
        return pagoParcialPension() - descuentos();
    }

    @Override
    public String toString() {
        return String.format(
                "Código: %s | Nombres: %s | Semestre: %d | Condición: %s",
                codigo, nombres, semestreIngreso, condicionSocial
        );
    }
}
