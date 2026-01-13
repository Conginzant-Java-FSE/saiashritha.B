
import java.util.*;
public class BillionDollarHiringPortal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Candidates: ");
        String input = sc.nextLine();
        String[] names = input.split(",");

        List<String> candidates = new ArrayList<>();
        for (String name : names){
            candidates.add(name.trim());
        }
        int realSize = candidates.size();
        Set<String> newApplicants = new HashSet<>(candidates);
        int duplicates = realSize - newApplicants.size();
        System.out.println("New Applicants: "+ newApplicants);
        System.out.println("Duplicates Removed: "+ duplicates);

    }
}