import java.util.*;
import java.io.*;

class Main {
  public static long A,C;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    A = Integer.parseInt(st.nextToken());
    long B = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    System.out.println(mul(B));
  }

  public static long mul(long num){
    if(num==1)  return A%C;
    long tmp = mul(num/2)%C;
    if(num%2==0) return (tmp*tmp)%C;
    else return (((tmp * tmp) % C) * A) % C;

  }
}