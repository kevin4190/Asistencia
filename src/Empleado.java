import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Empleado {
    int codigo, dni, edad;
    String nombre, apellido, puesto;
    private Map<String, Boolean> asistencia;

    public Empleado(int codigo, int dni, int edad, String nombre, String apellido, String puesto) {
        this.codigo = codigo;
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.asistencia = new HashMap<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void marcarAsistencia(String fecha) {
        asistencia.put(fecha, true);
    }

    public boolean verificarAsistencia(String fecha) {
        return asistencia.getOrDefault(fecha, false);
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "codigo=" + codigo +
                ", dni=" + dni +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado that = (Empleado) o;
        return codigo == that.codigo &&
                dni == that.dni &&
                edad == that.edad &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(puesto, that.puesto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, dni, edad, nombre, apellido, puesto);
    }
}


