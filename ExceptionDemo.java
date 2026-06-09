public class ExceptionDemo 
{ 
    public static void main(String[] args) 
    { 
        try{ 
            int a = 10/0; 
        } catch(Exception e) { 
            System.out.println("Error: " + e); 
        } finally { 
            System.out.println("Finally block executed"); 
        } 
    } 
} 