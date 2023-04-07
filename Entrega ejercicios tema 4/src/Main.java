import SmartDevice.Dispositivos.SmartPhone;
import SmartDevice.Dispositivos.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone GalaxyS21 = new SmartPhone("Samsung", "Galaxy S21", 999.9f, 3000, "Android 12", 7.2f, 64, 50, 12, "AMOLED");
        SmartWatch WatchSeries7 = new SmartWatch("Apple", "Watch Series 7", 399.0f, 250, "WatchOS 8", true, false, true, true);

        //Algunos datos del Watch Series 7
        System.out.println("Algunos datos del Watch Series 7");
        System.out.println("Marca: "+ WatchSeries7.marca);
        System.out.println("Modelo: "+ WatchSeries7.modelo);
        System.out.println("Precio: "+ WatchSeries7.precio);
        System.out.println("Resistencia al agua: "+ WatchSeries7.resistencia_agua);
        System.out.println("Revisión de salud: "+ WatchSeries7.revision_salud);
        System.out.println("\n");


        System.out.println("Algunos datos del Galaxy S21");
        System.out.println("Marca: "+ GalaxyS21.marca);
        System.out.println("Modelo: "+ GalaxyS21.modelo);
        System.out.println("Precio: "+ GalaxyS21.precio);
        System.out.println("Almacenamiento: "+ GalaxyS21.almacenamiento);
        System.out.println("Resolución Cámara Principal: "+ GalaxyS21.res_cam_principal);
        System.out.println("Resolución Cámara Secundaria: "+ GalaxyS21.res_cam_secundaria);




    }
}
