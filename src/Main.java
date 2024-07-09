
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, 12345678, 30, "Kevin", "Perez", "Ingeniero");
        Empleado empleado2 = new Empleado(2, 87654321, 25, "Maria", "Lopez", "Analista");

        Asistencia asistencia1 = new Asistencia(empleado1);
        Asistencia asistencia2 = new Asistencia(empleado2);

        asistencia1.registrarLlegada("2024-07-01", "08:45");
        asistencia2.registrarLlegada("2024-07-01", "09:15");
        asistencia1.registrarFalta("2024-07-02");
        asistencia2.registrarLlegada("2024-07-02", "08:55");

        System.out.println(asistencia1.getEmpleado().getNombre() + " asistencia 2024-07-01: " + asistencia1.verificarAsistencia("2024-07-01"));
        System.out.println(asistencia2.getEmpleado().getNombre() + " asistencia 2024-07-01: " + asistencia2.verificarAsistencia("2024-07-01"));
        System.out.println(asistencia1.getEmpleado().getNombre() + " asistencia 2024-07-02: " + asistencia1.verificarAsistencia("2024-07-02"));
        System.out.println(asistencia2.getEmpleado().getNombre() + " asistencia 2024-07-02: " + asistencia2.verificarAsistencia("2024-07-02"));
    }
}