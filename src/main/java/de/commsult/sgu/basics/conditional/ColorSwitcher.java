package de.commsult.sgu.basics.conditional;
class ColorSwitcher
{
  public static void main ( String[] args )
  {
    char   color = 'Y' ;    
    String message = "Color is";
    
    switch ( color )
    {
    
      case 'R':
        message = message + " red" ;
                        
      case 'O':
        message = message + " orange" ;
                        
      case 'Y':
        message = message + " yellow" ;
                        
      case 'G':
        message = message + " green" ;
                        
      case 'B':
        message = message + " blue" ;
                        
      case 'V':
        message = message + " violet" ;
                        
      default:
        message = message + " unknown" ;
            
    }

  System.out.println ( message ) ;
  }
}