public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mm = "PELCGBTENCUL";
		char[] ch = mm.toCharArray();
		for (int j = 0; j < 26; j++) {
			String a ="";
			System.out.println("-----"+j+"-----");
			for (int i = 0; i < ch.length; i++) {
				int m = ch[i]+j;
				if(m>90) {
					m=65+ch[i]+j-90;
				}
				a+=(char)(m);
			}
			System.out.print(a);
			System.out.println("");
			String lowerCase = a.toLowerCase();
			System.out.println(lowerCase);
		}
		
	}

}
