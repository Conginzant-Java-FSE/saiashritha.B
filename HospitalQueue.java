import java.util.*;
public class HospitalQueue {
    static class Patient {
        String name;
        int severity;
        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Arjun", 5),
                new Patient("Mia", 9),
                new Patient("Leo", 7),
                new Patient("Sara", 10)
        );
        Queue<Patient> normalQueue = new LinkedList<>();
        List<Patient> emergencyList = new ArrayList<>();
        for (Patient p : patients) {
            if (p.severity > 8) emergencyList.add(p);
            else normalQueue.add(p);
        }
        for (Patient e : emergencyList) {
            System.out.println("Emergency case->"+e.name);
        }
        while (!normalQueue.isEmpty()) {
            System.out.println("Treating ->"+normalQueue.poll().name);
        }
    }
}