import java.util.*;
public class TechStoreInventoryManager {
    public static void main(String[] args) {
            Map<String, Integer> currentStock = new HashMap<>();
            currentStock.put("MacBook", 5);
            currentStock.put("iPhone", 10);
            currentStock.put("AirPods", 25);

            Map<String, Integer> incomingStock = new HashMap<>();
            incomingStock.put("iPhone", 5);
            incomingStock.put("AirPods", 5);
            incomingStock.put("VisionPro", 2);
            for (String product : incomingStock.keySet()) {
                int incomingQty = incomingStock.get(product);
                if (currentStock.containsKey(product)) {
                    currentStock.put(product, currentStock.get(product) + incomingQty);
                } else {
                    currentStock.put(product, incomingQty);
                }
            }
            Map<String, Integer> sorted = new TreeMap<>(currentStock);
            int totalUnits = 0;
            System.out.println("Updated Stock:");
            for (String product : sorted.keySet()) {
                int qty = sorted.get(product);
                totalUnits += qty;
                System.out.println(product + "-> " + qty);
            }
            System.out.println("Total Units in Store: " + totalUnits);
        }
    }


