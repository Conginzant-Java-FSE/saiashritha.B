import java.util.*;
public class TrainingFeedbackAnalyzer {
    public static void main(String[] args) {
        List<Integer>ratings=Arrays.asList(9,10,12,8,-1,7,11,10,6);
        List<Integer>cleaned=new ArrayList<>();
        for(int r : ratings){
            if(r>=1&&r<= 10)cleaned.add(r);
        }

        Collections.sort(cleaned);

        int highest = cleaned.get(cleaned.size() - 1);
        int lowest = cleaned.get(0);
        double sum = 0;
        for (int r : cleaned)sum += r;
        double avg = sum / cleaned.size();
        System.out.println("Cleaned Ratings:"+cleaned);
        System.out.println("Highest Rating:"+highest);
        System.out.println("Lowest Rating:"+lowest);
        System.out.printf("Average Rating:%.2f%n",avg);
    }
}
