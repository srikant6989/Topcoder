public class LuckyRemainder {

	public static int sum = 0;
	
	public static int getLuckyRemainder(String X) {
		
		int X_value = 0;
		int length = X.length();
		int j=0;

		while(j < length) {
			
			int i = j+1;
			
			while(i <= length) {
				
				sum = sum + Integer.parseInt(X.substring(j,i));
                                i++;
			
			}
			j++;
		
		}
		
		X_value = sum%9;
		return X_value;
	}
	
	public static void main(String[] args) {
		
		int x = getLuckyRemainder("123");
                System.out.println(sum);
                System.out.println(x);
	}

}