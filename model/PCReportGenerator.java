package vortexpc.model;

import vortexpc.model.Pc; 

public class PCReportGenerator {
    public void generateReport(Pc pc) {
        pc.generateReport();
    }
}


// public class PCReportGenerator {
//     // METHOD INI CEMBURU PADA PC!
//     public void generateReport(Pc pc) {
//         System.out.println("--- PC Build Report ---");
//         System.out.println("CPU: " + pc.getCpu().getName());
//         System.out.println("Motherboard: " + pc.getMotherboard().getName());
//         System.out.println("RAM: " + pc.getRam().getName());
//         System.out.println("Storage Count: " + pc.getStorages().size());
//         System.out.println("Peripheral Count: " + pc.getPeripherals().size());
//         System.out.println("-----------------------");
//     }
// }
