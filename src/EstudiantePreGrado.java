public class EstudiantePreGrado extends Estudiante {

    private double promedioPonderado;
    private String colegioProcedencia; // "estatal" o "particular"
    private static int contador = 0;

    public EstudiantePreGrado(String codigo, String nombres, int semestreIngreso,
                              String condicionSocial, double promedioPonderado,
                              String colegioProcedencia) {
        super(codigo, nombres, semestreIngreso, condicionSocial);
        this.promedioPonderado  = promedioPonderado;
        this.colegioProcedencia = colegioProcedencia;
        contador++;
    }

    // Getters y Setters propios
    public double getPromedioPonderado()             { return promedioPonderado; }
    public String getColegioProcedencia()            { return colegioProcedencia; }
    public void setPromedioPonderado(double p)       { this.promedioPonderado = p; }
    public void setColegioProcedencia(String c)      { this.colegioProcedencia = c; }
    public static int getContador()                  { return contador; }

    @Override
    public double pagoParcialPension() {
        if (colegioProcedencia.equalsIgnoreCase("estatal")) {
            return PENSION_ESTATAL;       // 560
        } else {
            return PENSION_PARTICULAR;    // 650
        }
    }

    @Override
    public double descuentos() {
        double pago = pagoParcialPension();
        if (promedioPonderado < 13) {
            return pago * PORCENTAJE1;    // 0% → descuento = 0
        } else {
            return pago * PORCENTAJE2;    // 8%
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " | Promedio: %.2f | Colegio: %s | Pago final: S/ %.2f",
                promedioPonderado, colegioProcedencia, pagoFinalPension()
        );
    }
}