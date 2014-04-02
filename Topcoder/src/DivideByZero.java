
import java.util.ArrayList;

public class DivideByZero {
    
    public static int last_num = 0;
    public static int k = 0;

	public static int CountNumbers(int[] numbers) {
		
            ArrayList<Integer> numbers1 = new ArrayList<Integer>();           
            
            k = numbers.length;
            
            if(numbers.length == 1) {
                
                return 1;
            }
            
            for(int f =0; f<numbers.length; f++)
                numbers1.add(numbers[f]);
            
            for(int i=0;i<numbers.length;i++) {
                
                for(int j=0;j<numbers.length;j++) {
                    
                    if(j==i)
                        continue;
                    
                    if(numbers[i] > numbers[j]) {
                        int new_last_num = numbers[i]/numbers[j];
                        
                        if(find(new_last_num, numbers1)) {
                        
                        if(new_last_num != last_num) {
                            numbers1.add(new_last_num);
                            last_num = new_last_num;
                        }
                        }
                    }
                    
                }
            }
            
            return numbers1.size();
	}
        
        public static boolean find(int h, ArrayList<Integer> numbers1) {
            
            if(numbers1.contains(h))
                    return false;                            
            
            return true;
        }
	
	public static void main(String[] args) {
            int[] a = {9,2};
            
            
                int h = CountNumbers(a);
                 System.out.println(h);
	}
}