
public class RSA {

	public static void main(String[] args) {
		//公钥{5,323},{11,143}
		double mw = 3;
		System.out.println("加密前："+mw);
		double mm = Math.pow(mw, 11) % 143; 
		System.out.println("加密后："+mm);
		//私钥{29,323},{11,143}
		double jm = Math.pow(mm,11) % 143; 
		System.out.println("解密后："+jm);
	}
}
