
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srikant
 */
public class PowersOfTwo {
    
    public ArrayList<Long> size = new ArrayList<Long>();
    public static long sum = 0;
    
    public long count(long[] powers) {
        
        size.add(new Long(0));
        
        for(int g = 0; g<powers.length; g++) {
            if(!size.contains(powers[g]))
                size.add(new Long(powers[g]));
        }
        
        int i =0;
        int j=i +1;
        
        while(i < powers.length - 1) {
            
            while(j < powers.length)
                sum = powers[i] + powers[j];
                    if(!size.contains(sum)) {
                        size.add(sum);
                    }
                    j++;
        }
        
        return size.size();
    }
    
    public static void main(String[] args) {
        
    }
    
}
