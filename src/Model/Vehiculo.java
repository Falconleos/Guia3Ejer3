package Model;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private Integer velMax;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer velMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velMax = velMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelMax() {
        return velMax;
    }

    public void setVelMax(Integer velMax) {
        this.velMax = velMax;
    }

    public abstract void encender();
    public abstract void arrancar();
    public abstract void detenerse();
}
