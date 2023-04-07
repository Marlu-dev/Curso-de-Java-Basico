package SmartDevice.Dispositivos;

import SmartDevice.SmartDevice;

public class SmartPhone extends SmartDevice {

    public float pulgadas_pantalla;
    public int almacenamiento;
    public float res_cam_principal;
    public float res_cam_secundaria;
    public String tipo_pantalla;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, float precio, int bateria, String so, float pulgadas_pantalla, int almacenamiento, float res_cam_principal, float res_cam_secundaria, String tipo_pantalla) {
        super(marca, modelo, precio, bateria, so);
        this.pulgadas_pantalla = pulgadas_pantalla;
        this.almacenamiento = almacenamiento;
        this.res_cam_principal = res_cam_principal;
        this.res_cam_secundaria = res_cam_secundaria;
        this.tipo_pantalla = tipo_pantalla;
    }
}
