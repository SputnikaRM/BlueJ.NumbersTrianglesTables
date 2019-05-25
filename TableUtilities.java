 
 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      String table = "";
      for (int x = 1; x <= 5; x++) {
        for (int y = 1; y<= 5; y++) {
            int multiple = x * y;
           table += String.format("%3d" + " |" , multiple);
         } 
         table += "\n";
         
        }
        return table; 
}

    public static String getLargeMultiplicationTable() {
        String table = "";
        for (int x = 1; x<= 10; x++) {
            for (int y=1; y <=10; y++) {
                int multiple = x* y;
                table += String.format("%3d" + " |", multiple);
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int x = 1; x <= tableSize; x++) {
            for (int y = 1; y <= tableSize; y++) {
                int multiple = x*y;
                table += String.format("%3d" + " |", multiple);
            }
            table += "\n";
        }
        return table;
    }
}
