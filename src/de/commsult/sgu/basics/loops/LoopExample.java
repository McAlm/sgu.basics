package de.commsult.sgu.basics.loops;
public class LoopExample
{
  public static void main (String[] args ) 
  {
    // start count out at one
    int count = 1;   
    
    // loop while count is <= 3      
    while ( count <= 3 )   
    {
      System.out.println( "count is:" + count );
      
      // add one to count
      count = count + 1;    
    }
    System.out.println( "Done with the loop" );
  }
}