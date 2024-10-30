//clase para que me explique el mike

public class clsLista {

    private clsCotizacion destinos;

    public clsLista() {
        destinos = null;
    }

    public void insertar(int d, String des, String th, String tp, double s, double t, double tap, double m) {
        clsCotizacion nuevo = new clsCotizacion();
        nuevo.setDias(d);
        nuevo.setDestino(des);
        nuevo.setTipoHabitacion(th);
        nuevo.setTipoPago(tp);
        nuevo.setSubtotal(s);
        nuevo.setIVA(t);
        nuevo.setTotalPagar(tap);
        nuevo.setMensualidades(m);
        if (destinos == null) {
            destinos = nuevo;
        } else {
            clsCotizacion aux = destinos;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }

    }

    public String recorrerDestinos(){
        StringBuilder datos = new StringBuilder();
        clsCotizacion aux = destinos;
        if(destinos == null){
            datos = new StringBuilder("La lista esta vacia.");
        } else {
            while(aux != null){
                datos.append("Dias: ").append(aux.getDias()).append("\n");
                datos.append("Destino: ").append(aux.getDestino()).append("\n");
                datos.append("Tipo de Habitacion: ").append(aux.getTipoHabitacion()).append("\n");
                datos.append("Tipo de Pago: ").append(aux.getTipoPago()).append("\n");
                datos.append("Subtotal: ").append(aux.getSubtotal()).append("\n");
                datos.append("IVA: ").append(aux.getIVA()).append("\n");
                datos.append("Total a Pagar: ").append(aux.getTotalPagar()).append("\n");
                datos.append("Mensualidades: ").append(aux.getMensualidades()).append("\n");
                datos.append("--------------------------------------\n");
                aux = aux.getSiguiente();
            }
        }
        return datos.toString();
    }

    public boolean estaVacia(){
        return destinos == null;
    }

    public String buscarDestino(String des){
        StringBuilder datos = new StringBuilder();
        boolean encontrado = false;
        clsCotizacion aux = destinos;
        while(aux != null && !encontrado){
            if(aux.getDestino().equals(des)){
                datos.append("Dias: ").append(aux.getDias()).append("\n");
                datos.append("Destino: ").append(aux.getDestino()).append("\n");
                datos.append("Tipo de Habitacion: ").append(aux.getTipoHabitacion()).append("\n");
                datos.append("Tipo de Pago: ").append(aux.getTipoPago()).append("\n");
                datos.append("Subtotal: ").append(aux.getSubtotal()).append("\n");
                datos.append("IVA: ").append(aux.getIVA()).append("\n");
                datos.append("Total a Pagar: ").append(aux.getTotalPagar()).append("\n");
                datos.append("Mensualidades: ").append(aux.getMensualidades()).append("\n");
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }
        if(!encontrado){
            datos = new StringBuilder("No se encontro el destino.");
        }
        return datos.toString();
    }

}
