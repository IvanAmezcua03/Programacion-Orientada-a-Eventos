import java.util.Scanner;
import java.util.Random;

public class Menu {
    private static final int MAX_DISPOSITIVOS = 20;
    private static Dispositivo[] dispositivos = new Dispositivo[MAX_DISPOSITIVOS];
    private static int contador = 0;

    public static void bienvenida() {
        System.out.println("Bienvenido al sistema de dispositivos");
        System.out.println("1. Agregar dispositivo");
        System.out.println("2. Editar dispositivo");
        System.out.println("3. Buscar dispositivo");
        System.out.println("4. Mostrar dispositivos");
        System.out.println("5. Generar dispositivos aleatorios");
        System.out.println("6. Salir");
    }

    public static void agregarDispositivo() {
        if (contador < MAX_DISPOSITIVOS) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la marca del dispositivo");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el sistema operativo del dispositivo");
            String sistemaOperativo = scanner.nextLine();
            System.out.println("Ingrese el modelo del dispositivo");
            String modelo = scanner.nextLine();
            Dispositivo dispositivo = new Dispositivo(marca, sistemaOperativo, modelo);
            dispositivos[contador] = dispositivo;
            contador++;
            System.out.println("Dispositivo agregado correctamente");
        } else {
            System.out.println("No se pueden agregar más dispositivos");
        }
    }

    public static void editarDispositivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el modelo del dispositivo a editar");
        String modelo = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (dispositivos[i].getModelo().equals(modelo)) {
                System.out.println("Ingrese la marca del dispositivo");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el sistema operativo del dispositivo");
                String sistemaOperativo = scanner.nextLine();
                dispositivos[i].setMarca(marca);
                dispositivos[i].setSistema_Operativo(sistemaOperativo);
                System.out.println("Dispositivo editado correctamente");
                return;
            }
        }
        System.out.println("Dispositivo no encontrado");
    }

    public static void buscarDispositivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el modelo del dispositivo a buscar");
        String modelo = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (dispositivos[i].getModelo().equals(modelo)) {
                System.out.println("Marca: " + dispositivos[i].getMarca());
                System.out.println("Sistema Operativo: " + dispositivos[i].getSistema_Operativo());
                System.out.println("Modelo: " + dispositivos[i].getModelo());
                return;
            }
        }
        System.out.println("Dispositivo no encontrado");
    }

    public static void mostrarDispositivos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Marca: " + dispositivos[i].getMarca());
            System.out.println("Sistema Operativo: " + dispositivos[i].getSistema_Operativo());
            System.out.println("Modelo: " + dispositivos[i].getModelo());
        }
    }

    public static void generarDispositivosAleatorios() {
        String[] marcas = {"Samsung", "Apple", "Huawei", "Xiaomi", "Sony"};
        String[] sistemasOperativos = {"Android", "iOS", "HarmonyOS", "MIUI"};
        String[] modelos = {"A1", "B2", "C3", "D4", "E5"};

        Random random = new Random();

        for (int i = 0; i < MAX_DISPOSITIVOS; i++) {
            String marca = marcas[random.nextInt(marcas.length)];
            String sistemaOperativo = sistemasOperativos[random.nextInt(sistemasOperativos.length)];
            String modelo = modelos[random.nextInt(modelos.length)];
            Dispositivo dispositivo = new Dispositivo(marca, sistemaOperativo, modelo);
            dispositivos[i] = dispositivo;
        }
        contador = MAX_DISPOSITIVOS;
    }

}