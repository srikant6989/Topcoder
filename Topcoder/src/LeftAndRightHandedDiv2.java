public class LeftAndRightHandedDiv2 {
        
    public static int sum = 0;
	public int count(String S) {
	
		if(S.length() == 1)
			return 0;
		int i = 0;
                int j = i+1;
		
                while(i < S.length()-1) {
                    
                    if(S.charAt(i) == 'R') {
                        if(S.charAt(j) == 'L')
                        {i++;j++;sum ++;}
                        else {
                            i++;
                            j++;
                    }}      
                    else {
                        i++;j++;
                    }
                }
                return sum;
	}
	
	public static void main(String[] args) {
            
            LeftAndRightHandedDiv2 l = new LeftAndRightHandedDiv2();
            String S = "LRLRLR";
            int i = l.count(S);
            System.out.println("i");
        }
}