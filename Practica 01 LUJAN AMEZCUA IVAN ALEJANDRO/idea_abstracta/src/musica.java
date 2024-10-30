public class musica {
    private int duracion;
    private int volumen;
    private String artista;
    private String album;
    private String genero;

    public musica(int duracion, int volumen, String artista, String album, String genero) {
        this.duracion = duracion;
        this.volumen = volumen;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void editarMusica() {
        System.out.println("Ingresa la duracion:");
        int duracion = Integer.parseInt(System.console().readLine());
        this.setDuracion(duracion);

        System.out.println("Ingresa el volumen:");
        int volumen = Integer.parseInt(System.console().readLine());
        this.setVolumen(volumen);

        System.out.println("Ingresa el nombre del artista:");
        int artista = Integer.parseInt(System.console().readLine());
        this.setDuracion(artista);

        System.out.println("Ingresa el genero:");
        int genero = Integer.parseInt(System.console().readLine());
        this.setDuracion(genero);

        System.out.println("Ingresa el nombre del album:");
        int album = Integer.parseInt(System.console().readLine());
        this.setDuracion(album);

    }

    public void mostrarMusica() {
        System.out.println("Duracion: " + this.duracion);
        System.out.println("Volumen: " + this.volumen);
        System.out.println("Artista: " + this.artista);
        System.out.println("Genero: " + this.genero);
        System.out.println("Album: " + this.album);
    }

    int getDuracion() {
        return duracion;
    }

    int getVolumen() {
        return volumen;
    }

    String getArtista() {
        return artista;
    }

    String getAlbum() {
        return album;
    }

    String getGenero() {
        return genero;
    }
}
