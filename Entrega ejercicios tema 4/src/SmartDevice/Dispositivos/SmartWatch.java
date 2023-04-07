package SmartDevice.Dispositivos;

import SmartDevice.SmartDevice;

public class SmartWatch extends SmartDevice {

    public boolean resistencia_agua;
    public boolean revision_salud;
    public boolean bluetooth;
    public boolean wifi;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, float precio, int bateria, String so, boolean resistencia_agua, boolean revision_salud, boolean bluetooth, boolean wifi) {
        super(marca, modelo, precio, bateria, so);
        this.resistencia_agua = resistencia_agua;
        this.revision_salud = revision_salud;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }
}
