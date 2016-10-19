public class Mod {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if(((60*i+1)%11)==0) {
				System.out.println(i);
				System.out.println((60*i+1)/11);
				System.out.println(60*i+1);
				break;
			}
		}
	}
}
