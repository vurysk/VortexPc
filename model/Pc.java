package vortexpc.model;

import vortexpc.components.Component;
import vortexpc.components.core.*;
import java.util.ArrayList;
import java.util.List;

public class Pc {
    private Motherboard motherboard;
    private Cpu cpu;
    private Ram ram;
    private final List<Component> storages = new ArrayList<>();
    private final List<Component> peripherals = new ArrayList<>();

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void addStorage(Component storage) {
        storages.add(storage);
    }

    public void addPeripheral(Component peripheral) {
        peripherals.add(peripheral);
    }

    public Cpu getCpu() {
    return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public List<Component> getStorages() {
        return storages;
    }

    public List<Component> getPeripherals() {
        return peripherals;
    }


    public double calculateTotalPrice() {
        double total = 0;
        if (motherboard != null) total += motherboard.getPrice();
        if (cpu != null) total += cpu.getPrice();
        if (ram != null) total += ram.getPrice();
        for (Component s : storages) total += s.getPrice();
        for (Component p : peripherals) total += p.getPrice();
        return total;
    }

    public void printDetailHarga() {
        System.out.println("Daftar Komponen Rakitan:");
        if (motherboard != null)
            System.out.printf("- Motherboard (%s): Rp %.0f%n", motherboard.getName(), motherboard.getPrice());
        if (cpu != null)
            System.out.printf("- CPU (%s): Rp %.0f%n", cpu.getName(), cpu.getPrice());
        if (ram != null)
            System.out.printf("- RAM (%s): Rp %.0f%n", ram.getName(), ram.getPrice());

        for (Component s : storages) {
            String jenis = s.getClass().getSimpleName();
            System.out.printf("- %s (%s): Rp %.0f%n", jenis, s.getName(), s.getPrice());
        }

        for (Component p : peripherals) {
            String jenis = p.getClass().getSimpleName();
            System.out.printf("- %s (%s): Rp %.0f%n", jenis, p.getName(), p.getPrice());
        }

        System.out.println("-----------------------------");
        System.out.printf("Total Harga Rakitan: Rp %.0f%n", calculateTotalPrice());
    }

    public void generateReport() {
    System.out.println("\n-----------------------------");
    System.out.println("--- PC Build Report ---");
    if (cpu != null) System.out.println("CPU: " + cpu.getName());
    if (motherboard != null) System.out.println("Motherboard: " + motherboard.getName());
    if (ram != null) System.out.println("RAM: " + ram.getName());
    System.out.println("Storage Count: " + storages.size());
    System.out.println("Peripheral Count: " + peripherals.size());
    System.out.println("-----------------------");
}
}