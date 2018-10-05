class Main
{ 
    public static boolean Even(int x) 
    { 
    return (x % 2 == 0); 
    } 
    public static void main(String[] args) 
    { 
    int x =5; 
        if(Even(x) == true) 
            System.out.print("Odd"); 
        else
            System.out.print("Even"); 
    } 
} 
