import java.util.*; 
public class UniqueInArray 
{   
    public static void main(String args[]) 
    { 
        int ar[] = { 10, 5, 3, 4, 3, 5, 6 }; 
        HashSet<Integer> hm = new HashSet<Integer>(); 
        for (int i = 0; i < ar.length; i++) 
            hm.put(ar[i], i); 
        System.out.println(hm.keySet()); 
    }
} 