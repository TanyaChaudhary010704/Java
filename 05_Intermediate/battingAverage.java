//Calculate average batting score
import java.util.*;
public class battingAverage {
  static int averageRuns(int runs, int matches,int notout) {
    // Calculate number of
    // dismissals
    int out = matches - notout;

    // Check for 0 times out
    if (out == 0)
      return -1;

    // Calculate batting average
    int avg = (runs) / out;

    return avg;
  }

  // Driver code
  public static void main(String[] args) {
    int runs = 10000;
    int matches = 250;
    int notout = 50;

    int avg = averageRuns(runs, matches, notout);
    if (avg == -1)
      System.out.print("NA");
    else
      System.out.print(avg);
  }
}
