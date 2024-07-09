import java.util.HashMap;
import java.util.Map;

public class Asistencia {
    private Empleado empleado;
    private Map<String, String> asistencia;

    public Asistencia(Empleado empleado) {
        this.empleado = empleado;
        this.asistencia = new HashMap<>();
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void registrarLlegada(String fecha, String hora) {
        String estado;
        if (hora.compareTo("09:00") > 0) {
            estado = "Tardanza";
        } else {
            estado = "Puntual";
        }
        asistencia.put(fecha, estado);
    }

    public void registrarFalta(String fecha) {
        asistencia.put(fecha, "Falta");
    }

    public String verificarAsistencia(String fecha) {
        return asistencia.getOrDefault(fecha, "Falta");
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "empleado=" + empleado +
                ", asistencia=" + asistencia +
                '}';
    }
}
