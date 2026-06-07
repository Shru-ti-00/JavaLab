public class ArrayDemo 
{ 
    public static void main(String[] args)
    { 
        int[] a = {1,2,3,4}; 
        int[][] b = {{1,2},{3,4}}; 
        for(int x : a) 
            System.out.print(x + " "); 
        System.out.println(); 
        
        for(int[] row : b)
        { 
            for(int y : row) 
                System.out.print(y + " "); 
        
            System.out.println(); 
        } 
    } 
} 