
import java.util.Scanner;

    public class Fifas {

        static class InvalidScoreException extends RuntimeException {
            public InvalidScoreException(String message) {
                super(message);
            }
        }

        static class ScoreBoard {
            int scored;
            int conceded;

            void acceptScores() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter goals scored:");
                scored = sc.nextInt();
                System.out.print("Enter goals conceded:");
                conceded = sc.nextInt();
            }

            int calculateDifference() {
                System.out.println("Calculating the goal difference");
                if (scored < 0 || conceded < 0) {
                    throw new InvalidScoreException("Negative scores not allowed");
                }
                return scored - conceded;
            }
        }

        public static int calculateGoalDifference(int scored, int conceded) {
            System.out.println("Inside calculateGoalDifference()");
            if (scored < 0 || conceded < 0) {
                throw new InvalidScoreException("Score cannot be negative");
            }
            return scored - conceded;
        }

        public static void main(String[] args) {

            try {
                int diff = calculateGoalDifference(3, -1);
                System.out.println("Goal Difference:" + diff);
            } catch (InvalidScoreException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Generic error occurred");
            } finally {
                System.out.println("Match stats processed");
            }

            ScoreBoard sb = new ScoreBoard();
            try {
                sb.acceptScores();
                int diff = sb.calculateDifference();
                System.out.println("Goal Difference:" + diff);
            } catch (InvalidScoreException e) {
                System.out.println("Error:" + e.getMessage());
            } finally {
                System.out.println("Match stats processed");
            }
        }
    }


