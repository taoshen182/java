public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "dirmap/as/sas";
		String[] dirname = dir.split("/");
		String addDir = "";
		String parent = "/";
		for (int i = 0; i < dirname.length; i++) {
			parent = i == 0 ? "/" : dirname[0];

			for (int j = 1; j < i; j++) {
				parent = parent + "/" + dirname[j];
			}
			addDir = dirname[i];
			System.out.println("parent," + parent + ",toadd-" + addDir);
			// 判断是否存在
		}
	}

}
