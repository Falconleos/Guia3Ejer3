package Model;

import Interfaces.VehiculoPasajeros;
import Enums.TipoVehiculo;

public class Automovil extends Vehiculo implements VehiculoPasajeros {

    private String color;
    private Integer cantPuertas;
    private Integer cantOcupantes;
    private TipoVehiculo tipoVehiculo;

    public Automovil(String marca, String modelo, Integer velMax, String color, Integer cantPuertas, Integer cantOcupantes) {
        super(marca, modelo, velMax);
        this.color = color;
        this.cantPuertas = cantPuertas;
        this.cantOcupantes = cantOcupantes;
        this.tipoVehiculo = TipoVehiculo.AUTOMOVIL;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(Integer cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public Integer getCantOcupantes() {
        return cantOcupantes;
    }

    public void setCantOcupantes(Integer cantOcupantes) {
        this.cantOcupantes = cantOcupantes;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public void encender(){
        System.out.println("Auto encendido");
    }
    @Override
    public void arrancar(){
        System.out.println("Auto arrancado");
    }
    @Override
    public void detenerse(){
        System.out.println("Auto detenido");
    }
    @Override
    public void llevarPasajeros(Integer cantidadMax){
        System.out.println("Cantidad maxima del " + this.tipoVehiculo + " es " + cantidadMax);
    }

    @Override
    public String toString() {
        return "Automovil:\n" +
                "color='" + this.color + '\'' +
                ",\n cantidad de Puertas=" + this.cantPuertas +
                ",\n cantidad de Ocupantes=" + this.cantOcupantes +
                ",\n tipo de Vehiculo=" + this.tipoVehiculo ;
    }
}
