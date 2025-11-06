package vortexpc;

import vortexpc.model.Pc;
import vortexpc.model.PCReportGenerator;
import vortexpc.model.Customer;
import vortexpc.model.SalesReport;
import vortexpc.components.core.*;
import vortexpc.components.storage.*;
import vortexpc.components.peripheral.*;

public class Tes {
    public static void main(String[] args) {
        Pc rakitan = new Pc();

        // Komponen Inti
        rakitan.setMotherboard(new Motherboard("ASUS Prime B450", 500));
        rakitan.setCpu(new Cpu("Intel Core i7-12700K", 700));
        rakitan.setRam(new Ram("Corsair Vengeance 16GB", 300));

        // Komponen Penyimpanan
        rakitan.addStorage(new Ssd("Samsung EVO 1TB", 400));

        // Periferal
        rakitan.addPeripheral(new Keyboard("Logitech K120", 150));
        rakitan.addPeripheral(new Mouse("Razer Viper Mini", 100));
        rakitan.addPeripheral(new Monitor("Dell UltraSharp 24\"", 600));
        rakitan.addPeripheral(new Webcam("Logitech C920", 200));
        rakitan.addPeripheral(new Speaker("Creative Pebble V3", 250));

        // Cetak detail harga
        rakitan.printDetailHarga();

        PCReportGenerator reporter = new PCReportGenerator();
        reporter.generateReport(rakitan);

        Customer pelanggan = new Customer("Nabila", "nabila@email.com", "08123456789");
        SalesReport laporan = new SalesReport();
        laporan.printCustomerSummary(pelanggan);


    }
}