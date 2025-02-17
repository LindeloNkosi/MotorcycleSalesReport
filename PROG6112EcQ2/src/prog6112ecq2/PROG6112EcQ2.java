package prog6112ecq2;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class PROG6112EcQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] Sales = {       {500, 100, 500},
                                 {70,  80,   200},
                                 {100, 100, 200},
                                 {100, 70,  50},
                                 {300, 100, 500}  
                                                    };
        
         System.out.print("\t");  
//        System.out.print("\tBRAND");
        System.out.print("\tQUARTER 1");
        System.out.print("\tQUETER 2");
        System.out.print("\tQUETER 3");
//        System.out.println("\tTOTAL");
//        System.out.println("\tSTATUS");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        for(int i = 0; i < Sales.length; i++){
            System.out.println();
             switch(i){
               case 0 : System.out.print("Triumph             ");break;
               case 1 : System.out.print("Honda               ");break;
               case 2 : System.out.print("Suzuki              ");break;
               case 3 : System.out.print("Yamaha              ");break;
               case 5 : System.out.print("Ducati              ");break;
             }
            
            for(int j = 0; j < Sales[i].length;j++){
                System.out.print( "\t" + Sales[i][j]);
                
            }
            System.out.println();  
        }
    }
    
}
