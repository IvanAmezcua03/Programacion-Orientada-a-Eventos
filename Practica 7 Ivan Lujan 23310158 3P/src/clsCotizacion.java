public class clsCotizacion {
    private int dias;
    private String destino;
    private String tipoHabitacion;
    private String tipoPago;
    private double subtotal;
    private static double IVA = 0.16;
    private double totalPagar;
    private double mensualidades;

    //Apuntador a la siguiente estructura
    private clsCotizacion siguiente;

    // Empty Constructor
    public clsCotizacion() {
        this.dias = 0;
        this.destino = "";
        this.tipoHabitacion = "";
        this.tipoPago = "";
        this.subtotal = 0;
        this.totalPagar = 0;
        this.mensualidades = 0;
        this.siguiente = null;
    }
    public clsCotizacion(int dias, String destino, String tipoHabitacion, String tipoPago, double subtotal, double IVA, double totalPagar, double mensualidades) {
        this.dias = dias;
        this.destino = destino;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoPago = tipoPago;
        this.subtotal = subtotal;
        this.IVA = IVA;
        this.totalPagar = totalPagar;
        this.mensualidades = mensualidades;
    }

    //metodos set
    public void setDias(int dias){
        this.dias = dias;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setTipoHabitacion(String tipoHabitacion){
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setTipoPago(String tipoPago){
        this.tipoPago = tipoPago;
    }

    public void setSubtotal(double subtotal){
        this.subtotal = subtotal;
    }

    public void setIVA(double IVA){
        this.IVA = IVA;
    }

    public void setTotalPagar(double totalPagar){
        this.totalPagar = totalPagar;
    }

    public void setMensualidades(double mensualidades){
        this.mensualidades = mensualidades;
    }

    //metodos get

    public int getDias(){
        return dias;
    }

    public String getDestino(){
        return destino;
    }

    public String getTipoHabitacion(){
        return tipoHabitacion;
    }

    public String getTipoPago(){
        return tipoPago;
    }

    public double getSubtotal(){
        return subtotal;
    }

    public double getIVA(){
        return IVA;
    }

    public double getTotalPagar(){
        return totalPagar;
    }

    public double getMensualidades(){
        return mensualidades;
    }

    public clsCotizacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(clsCotizacion siguiente) {
        this.siguiente = siguiente;
    }

}
