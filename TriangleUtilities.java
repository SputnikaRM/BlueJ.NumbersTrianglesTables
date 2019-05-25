public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String x = "";
        for (int j = 0; j< numberOfStars; j++){
          x += '*';  
          }
    
       return x; 
        }
    
    public static String getTriangle(int numberOfRows) {
         
       String x = "";
       for (int j = 1; j <= numberOfRows  ; j ++) {
           for (int p = 1; p <= j; p++) {
            x+= '*';
            }
            x += "\n";
           
        }
        
        return x;
       
        
    }



    public static String getSmallTriangle() {
         String x= "";
         
         for (int j = 1; j<=4; j++) {
             for (int p = 1; p <= j; p++) {
               x+= '*';
            
        }
            x += "\n"; 
            }
        return x;
        
    }

    public static String getLargeTriangle() {
         String x= "";
         for (int j = 1; j<=9; j++) {
             for (int p =1; p <=j; p++) {
            x+= '*';
        }
            x+= "\n";
            }
        return x;
    }
}
