public class CricketScoreAnalyser {
    public static void main(String[] args) {
        
        int[] runs = {45, 120, 78, 10, 5, 150};

        int highest = runs[0];
        int lowest = runs[0];
        int sum = 0;

        
        for (int i = 0; i < runs.length; i++) {
            int score = runs[i];

           
            if (score > highest) {
                highest = score;
            }

           
            if (score < lowest) {
                lowest = score;
            }

            
            sum += score;

            
            if (score >= 100) {
                System.out.println("Century Scorer: Batsman " + (i + 1) + " (" + score + " runs)");
            }
        }

       
        double average = (double) sum / runs.length;

        
        System.out.println("\n--- Score Analysis ---");
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);
    }
}
