import java.util.Scanner;
import java.util.Random;

public class Menu {

    private static final int MAX_MEDICOS = 20;
    private static Medico[] medicos = new Medico[MAX_MEDICOS];
    private static int contador = 0;

    public static void bienvenida() {
        System.out.println("Bienvenido a la base de datos de Medicos");
        System.out.println("1. Agregar Medico");
        System.out.println("2. Editar Medico");
        System.out.println("3. Buscar Medico");
        System.out.println("4. Mostrar Medicos");
        System.out.println("5. Eliminar Medico");
        System.out.println("6. Generar Medicos Aleatorios");
        System.out.println("7. Salir");
    }

    public static void agregarMedico() {
        if (contador < MAX_MEDICOS) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre del medico");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el numero de cedula del medico");
            String numeroDeCedula = scanner.nextLine();
            System.out.println("Ingrese la edad del medico");
            String edad = scanner.nextLine();
            System.out.println("Ingrese la especialidad del medico");
            String especialidad = scanner.nextLine();
            System.out.println("ingrese el numro de telefono del medico");
            String numeroDeTelefono = scanner.nextLine();
            System.out.println("Ingrese el horario del medico");
            String horario = scanner.nextLine();
            Especialidad medico = new Especialidad(nombre, numeroDeCedula, edad, especialidad, numeroDeTelefono, horario);
            medicos[contador] = medico;
            contador++;
            System.out.println("Medico agregado correctamente");
        } else {
            System.out.println("No se pueden agregar más medicos");
        }
    }

    public static void editarMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del medico a editar");
        String numeroDeCedula = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (medicos[i].getNumeroDeCedula().equals(numeroDeCedula)) {
                System.out.println("Ingrese el nombre del medico");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del medico");
                String edad = scanner.nextLine();
                System.out.println("Ingrese la especialidad del medico");
                String especialidad = scanner.nextLine();
                System.out.println("ingrese el numro de telefono del medico");
                String numeroDeTelefono = scanner.nextLine();
                System.out.println("Ingrese el horario del medico");
                String horario = scanner.nextLine();
                medicos[i].setNombre(nombre);
                medicos[i].setEdad(edad);
                if (medicos[i] instanceof Especialidad) {
                    ((Especialidad) medicos[i]).setEspecialidad(especialidad);
                }
                System.out.println("Medico editado correctamente");
                return;
            }
        }
        System.out.println("Medico no encontrado");
    }

    public static void buscarMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del medico a buscar");
        String numeroDeCedula = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (medicos[i].getNumeroDeCedula().equals(numeroDeCedula)) {
                System.out.println("Nombre: " + medicos[i].getNombre());
                System.out.println("Número de cédula: " + medicos[i].getNumeroDeCedula());
                System.out.println("Edad: " + medicos[i].getEdad());
                if (medicos[i] instanceof Especialidad) {
                    System.out.println("Especialidad: " + ((Especialidad) medicos[i]).getEspecialidad());
                }
                return;
            }
        }
        System.out.println("Medico no encontrado");
    }

    public static void mostrarMedicos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + medicos[i].getNombre());
            System.out.println("Número de cédula: " + medicos[i].getNumeroDeCedula());
            System.out.println("Edad: " + medicos[i].getEdad());
            System.out.println("Numero de telefono: " + ((Especialidad) medicos[i]).getNumeroDeTelefono());
            System.out.println("Horario: " + ((Especialidad) medicos[i]).getHorario());

            if (medicos[i] instanceof Especialidad) {
                System.out.println("Especialidad: " + ((Especialidad) medicos[i]).getEspecialidad());
            }
        }
    }

    public static void eliminarMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del medico a eliminar");
        String numeroDeCedula = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (medicos[i].getNumeroDeCedula().equals(numeroDeCedula)) {
                for (int j = i; j < contador - 1; j++) {
                    medicos[j] = medicos[j + 1];
                }
                contador--;
                System.out.println("Medico eliminado correctamente");
                return;
            }
        }
        System.out.println("Medico no encontrado");
    }

    public static void generarMedicosAleatorios() {
        Random random = new Random();
        String[] nombres = {"Juan", "Maria", "Pedro", "Ana", "Luis", "Laura", "Carlos", "Lucia", "Diego", "Sofia"};
        String[] apellidos = {"Perez", "Gomez", "Lopez", "Rodriguez", "Gonzalez", "Fernandez", "Martinez", "Sanchez", "Ramirez", "Torres"};
        String[] especialidades = {"Cardiologia", "Dermatologia", "Endocrinologia", "Gastroenterologia", "Geriatría", "Hematologia", "Infectologia", "Medicina General", "Nefrologia", "Neumologia"};
        String[] horario = {"Lunes a Viernes de 8:00 a 16:00", "Lunes a Viernes de 9:00 a 17:00", "Lunes a Viernes de 10:00 a 18:00", "Lunes a Viernes de 11:00 a 19:00", "Lunes a Viernes de 12:00 a 20:00"};
        String[] numerosDeTelefono = {"22222222", "33333333", "44444444", "55555555", "66666666", "77777777", "88888888", "99999999", "00000000", "11111111"};
        for (int i = 0; i < 5; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            String numeroDeCedula = String.valueOf(random.nextInt(1000000000));
            String edad = String.valueOf(random.nextInt(100));
            String especialidad = especialidades[random.nextInt(especialidades.length)];
            String numeroDeTelefono = String.valueOf(random.nextInt(1000000000));
            Especialidad medico = new Especialidad(nombre + " " + apellido, numeroDeCedula, edad, especialidad, numeroDeTelefono, horario[random.nextInt(horario.length)]);
            medicos[contador] = medico;
            contador++;
        }
    }
}