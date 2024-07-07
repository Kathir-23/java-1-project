public class Main
 {
   static int fact=1;
static int factorial(int n)
{
    for(int i=1;i<=n;i++){
       fact= fact*i;
      
    }
    return fact;
    

}
public static void main(String[] args) {
    factorial(8);
 
    System.out.println(fact);
}}
