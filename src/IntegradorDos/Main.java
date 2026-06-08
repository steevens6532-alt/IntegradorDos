package IntegradorDos;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== PRE GRADO =====");
        EstudiantePreGrado e1 = new EstudiantePreGrado(
                "PRE001", "Ana López", 2022, "ninguna", 15.5, "estatal");
        EstudiantePreGrado e2 = new EstudiantePreGrado(
                "PRE002", "Carlos Ríos", 2023, "bombero activo", 11.0, "particular");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println("Total pre grado registrados: " + EstudiantePreGrado.getContador());

        System.out.println("\n===== POST GRADO =====");
        EstudiantePostGrado e3 = new EstudiantePostGrado(
                "POS001", "María Torres", 2021, "ninguna", "bachiller");
        EstudiantePostGrado e4 = new EstudiantePostGrado(
                "POS002", "Juan Paz", 2020, "licenciado de fuerzas armadas", "titulado");

        System.out.println(e3);
        System.out.println(e4);
        System.out.println("Total post grado registrados: " + EstudiantePostGrado.getContador());
    }
}