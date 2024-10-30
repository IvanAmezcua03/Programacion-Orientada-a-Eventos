public class Especialidad extends Medico {
    public String especialidad;
    public String numeroDeTelefono;
    public String horario;

    public Especialidad(String nombre, String numeroDeCedula, String edad, String especialidad, String numeroDeTelefono, String horario) {
        super(nombre, numeroDeCedula, edad);
        this.especialidad = especialidad;
        this.numeroDeTelefono = numeroDeTelefono;
        this.horario = horario;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void mostrarEspecialidad() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de cédula: " + getNumeroDeCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + getEspecialidad());
        System.out.println("Numero de telefono: " + getNumeroDeTelefono());
        System.out.println("Horario: " + getHorario());

    }

}
