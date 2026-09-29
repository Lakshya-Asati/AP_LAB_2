public class Main
{
	public static void main(String[] args) {
		int n = 49;
		boolean prime = true;
		for(int i = 2; i<= Math.sqrt(n); i++) {
			if(n%i == 0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}