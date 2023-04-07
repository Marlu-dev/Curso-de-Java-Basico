package SmartDevice;

public class SmartDevice {
    public String marca;
    public String modelo;
    public float precio;
    public int bateria;
    public String so;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, float precio, int bateria, String so) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.bateria = bateria;
        this.so = so;
    }
}
