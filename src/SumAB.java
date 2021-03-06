import java.io.*;
import java.util.*;

public class SumAB
{
   public static void main(String[] args) throws IOException
   {
      new SumAB().run();
   }

   StreamTokenizer in;
   PrintWriter out;

   int nextInt() throws IOException
   {
      in.nextToken();
      return (int)in.nval;
   }

   void run() throws IOException
   {
      in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
      out = new PrintWriter(System.out);
      solve();
      out.flush();
   }

   void solve() throws IOException
   {
      int a = nextInt();
      int b = nextInt();
      out.print(a + b);
   }
}