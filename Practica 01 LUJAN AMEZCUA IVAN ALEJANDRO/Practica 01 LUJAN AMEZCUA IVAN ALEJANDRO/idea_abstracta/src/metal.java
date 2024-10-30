public class metal extends musica {
    private String subgenero;
    private String banda;
    private String cancion;

    public metal(int duracion, int volumen, String artista, String album, String genero, String subgenero, String banda, String cancion) {
        super(duracion, volumen, artista, album, genero);
        this.subgenero = subgenero;
        this.banda = banda;
        this.cancion = cancion;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public void editarMetal() {
        this.editarMusica();
        System.out.println("Ingresa el subgenero:");
        String subgenero = System.console().readLine();
        this.setSubgenero(subgenero);

        System.out.println("Ingresa el nombre de la banda:");
        String banda = System.console().readLine();
        this.setBanda(banda);

        System.out.println("Ingresa el nombre de la cancion:");
        String cancion = System.console().readLine();
        this.setCancion(cancion);
    }

    public void mostrarMetal() {
        this.mostrarMusica();
        System.out.println("Subgenero: " + this.subgenero);
        System.out.println("Banda: " + this.banda);
        System.out.println("Cancion: " + this.cancion);
    }

    String getSubgenero() {
        return subgenero;
    }

    String getBanda() {
        return banda;
    }

    String getCancion() {
        return cancion;
    }
}
