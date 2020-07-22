
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer1, tokenizer2;
       Scanner in = new Scanner(System.in);

       tokenizer1 = new StringTokenizer(in.nextLine(), " ", false);
       tokenizer2 = new StringTokenizer(in.nextLine(), "+-/*", true);
       	
       while (tokenizer1.hasMoreTokens()) {
            tokenizer1.nextToken();
       

       try
       {
          leftString   = tokenizer2.nextToken();
          operator     = tokenizer2.nextToken();
          rightString  = tokenizer2.nextToken();

          leftOperand  = Double.parseDouble(leftString);
          rightOperand = Double.parseDouble(rightString);

          if (operator.equals("+")) 
             result = leftOperand + rightOperand;
          else if (operator.equals("-")) 
              result = leftOperand - rightOperand;
          else if (operator.equals("*"))
              result = leftOperand * rightOperand;
          else if (operator.equals("/"))
              result = leftOperand / rightOperand;
          else
              result = 0.0;
          
          System.out.println("Result: " + result);
       }
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException nfe)
       {
          System.out.println("One or more operands is not a number");
       }
       }
    }
}
