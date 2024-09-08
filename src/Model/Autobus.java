package Model;

import Enums.TipoVehiculo;
import Interfaces.VehiculoPasajeros;

public class Autobus extends Vehiculo implements VehiculoPasajeros {

    private String categoria;
    private Integer cantRuedas;
    private TipoVehiculo tipoVehiculo;

    public Autobus() {
    }

    public Autobus(String marca, String modelo, Integer velMax, String categoria, Integer cantRuedas) {
        super(marca, modelo, velMax);
        this.categoria = categoria;
        this.cantRuedas = cantRuedas;
        this.tipoVehiculo = TipoVehiculo.AUTOBUS;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(Integer cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    @Override
    public void encender(){
        System.out.println("Autobus encendido");
    }

    @Override
    public void arrancar(){
        System.out.println("Autobus arrancado");
    }

    @Override
    public void detenerse(){
        System.out.println("Autobus detenido");
    }

    @Override
    public void llevarPasajeros(Integer cantidadMax){
        System.out.println("Autobus trasladando " + cantidadMax);
    }

    @Override
    public String toString() {
        return "Autobus: \n" +
                "categoria='" + categoria + '\'' +
                ",\n cantRuedas=" + cantRuedas +
                ",\n tipoVehiculo=" + tipoVehiculo;
    }
}
