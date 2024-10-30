//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        metal musica1 = new metal(100, 100, "Metallica", "Black Album", "Metal", "Heavy Metal", "Metallica", "Enter Sandman");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Registrar Musica");
            System.out.println("2 - Editar Musica");
            System.out.println("3 - Mostrar Musica");
            System.out.println("4 - Sair");

            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la duracion:");
                    int duracion = Integer.parseInt(System.console().readLine());
                    musica1.setDuracion(duracion);

                    System.out.println("Ingresa el volumen:");
                    int volumen = Integer.parseInt(System.console().readLine());
                    musica1.setVolumen(volumen);

                    System.out.println("Ingresa el nombre del artista:");
                    String artista = System.console().readLine();
                    musica1.setArtista(artista);

                    System.out.println("Ingresa el nombre del album:");
                    String album = System.console().readLine();
                    musica1.setAlbum(album);

                    System.out.println("Ingresa el genero:");
                    String genero = System.console().readLine();
                    musica1.setGenero(genero);

                    System.out.println("Ingresa el subgenero:");
                    String subgenero = System.console().readLine();
                    musica1.setSubgenero(subgenero);

                    System.out.println("Ingresa el nombre de la banda:");
                    String banda = System.console().readLine();
                    musica1.setBanda(banda);

                    System.out.println("Ingresa el nombre de la cancion:");
                    String cancion = System.console().readLine();
                    musica1.setCancion(cancion);
                    break;
                case 2:
                    musica1.editarMetal();
                    break;
                case 3:
                    musica1.mostrarMetal();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}