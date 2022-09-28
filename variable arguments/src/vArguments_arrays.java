
public class vArguments_arrays {

	public static void main(String[] args) {
		int patates[]= {1,2,3,4};
		
	int islem= topla(patates);
		System.out.println("sonuc: "+islem);

	}
	
	public static int topla(int... 	lokum) {
		int toplam =0;
		
		for(int sayi:lokum) {
			
			toplam+=sayi;
		}
		return toplam;
	
	}
	
}
