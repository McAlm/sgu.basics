package de.commsult.sgu.basics.conditional;
class ColorSwitcher
{
  public static void main ( String[] args )
  {
    char   color = 'y' ;    
    String message = "Color is";
    
    switch ( color )
    {
    
      case 'R':
        message = message + " red" ;       
      case 'O':
        message = message + " orange" ;
      case 'y':                   
      case 'Y':
        message = message + " yellow" ;
        break;   
                        
      case 'G':
        message = message + " green" ;
        break;   
                        
      case 'B':
        message = message + " blue" ;
        break;   
                        
      case 'V':
        message = message + " violet" ;
        break;   
                        
      default:
        message = message + " unknown" ;
            
    }

  System.out.println ( message ) ;
  }
}