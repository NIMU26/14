public class Cliant{
	public static void main(String[]args){
		Dengen dengen;
		
		dengen = new AcAdapter();
		int denatsu = dengen.kyuuden();
		System.out.println(denatsu + "Vで給電されています");
	}
}

class Dengen{
}

class JapaneseConsent implements Dengen{
	public int kyuuden(){
		return 100;
	}
}

class AcAdapter extends{
	private int kyuuden(){
		int i = kyuuden();
		i = i * 0.16;
		return i;
}