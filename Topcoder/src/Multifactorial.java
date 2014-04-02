public class Multifactorial {
	
	public static long fact = 1;
        public long check = 1000000000000000000L;
	
	public String calcMultiFact (int n, int k) {
		
            long n1 = Long.valueOf(n);
            long k1 = Long.valueOf(k);
            
		if(k1 >= n1)
			return Long.toString(n1);
		
		while (n1 > 0) {
			
                    if(fact > (check ) )
			return "overflow";
                    
			fact = fact * n1;
			n1 = n1 - k1;
		}
		
		
		if(fact > (check ) )
			return "overflow";
		
		return Long.toString(fact);
	}
	
	public static void main(String[] args) {
            
            Multifactorial m = new Multifactorial();
            String s = m.calcMultiFact(1000, 2);
            
            System.out.println(s);
	}
}