package IntegradorDos;

public class EstudiantePostGrado extends Estudiante implements Descuentos {

    private String gradoAcademico; // "bachiller" o "titulado"
    private static int contador = 0;

    public EstudiantePostGrado(String codigo, String nombres, int semestreIngreso,
                               String condicionSocial, String gradoAcademico) {
        super(codigo, nombres, semestreIngreso, condicionSocial);
        this.gradoAcademico = gradoAcademico;
        contador++;
    }

    // Getters y Setters propios
    public String getGradoAcademico()            { return gradoAcademico; }
    public void setGradoAcademico(String g)      { this.gradoAcademico = g; }
    public static int getContador()              { return contador; }

    @Override
    public double pagoParcialPension() {
        if (gradoAcademico.equalsIgnoreCase("bachiller")) {
            return PENSION_BACHILLER;    // 1200
        } else {
            return PENSION_TITULADO;     // 130
        }
    }

    @Override
    public double descuentos() {
        return 50 + descuentoCondicion();  // 50 fijos + descuento por condición
    }

    @Override
    public double descuentoCondicion() {
        double pago = pagoParcialPension();
        String condicion = getCondicionSocial().toLowerCase();
        switch (condicion) {
            case "bombero activo":
                return pago * DESCUENTO_CONDICION1;           // 15%
            case "licenciado de fuerzas armadas":
                return pago * DESCUENTO_CONDICION2;           // 20%
            default:
                return 0;                                      // ninguna
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | Grado: %s | Pago final: S/ %.2f",
                gradoAcademico, pagoFinalPension()
        );
    }
}