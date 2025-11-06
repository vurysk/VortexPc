package vortexpc;

import vortexpc.model.Pc;
import vortexpc.components.core.*;
import vortexpc.components.storage.*;
import vortexpc.components.peripheral.*;

public class Main {
    public static void main(String[] args) {
        Pc rakitan = new Pc();
        rakitan.setCpu(new Cpu("Intel Core i9-13900K", 850));
        rakitan.setMotherboard(new Motherboard("ASUS ROG Maximus Z790", 950));
        rakitan.setRam(new Ram("Corsair Vengeance 16GB x2", 600));

        rakitan.addStorage(new Ssd("Samsung 980 Pro 1TB", 700));

        rakitan.addPeripheral(new Mouse("Logitech G Pro X", 350));
        rakitan.addPeripheral(new Keyboard("Keychron K6", 500));
        rakitan.addPeripheral(new Monitor("LG UltraGear 27\"", 1200));
        rakitan.addPeripheral(new Speaker("Edifier R1700BT", 600));

        System.out.println("--- PC Build by Team 14 \"Bila & Jua\" ---");
        System.out.println("CPU: " + rakitan.getCpu().getName());
        System.out.println("Motherboard: " + rakitan.getMotherboard().getName());
        System.out.println("RAM: " + rakitan.getRam().getName());

        System.out.print("Storage: ");
        for (int i = 0; i < rakitan.getStorages().size(); i++) {
            System.out.print(rakitan.getStorages().get(i).getName());
            if (i < rakitan.getStorages().size() - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.print("Peripheral: ");
        for (int i = 0; i < rakitan.getPeripherals().size(); i++) {
            System.out.print(rakitan.getPeripherals().get(i).getName());
            if (i < rakitan.getPeripherals().size() - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.println("---------------------------------");
        System.out.printf("Final Price: Rp %.0f%n", rakitan.calculateTotalPrice());
        System.out.println("--- Build Successful! ---");
    }
}