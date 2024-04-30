//Calculate Depreciation of Value

public class depreciation {
  public static void main(String[] args)
  {
    //v1 = initial value
    //t = time 
    //r = rate of depreciation
  
  float V1 = 200, R = 10, T = 2;
  float D = (float)(V1 * Math.pow((1 - R / 100), T));
    System.out.print(D); 
} 
}
