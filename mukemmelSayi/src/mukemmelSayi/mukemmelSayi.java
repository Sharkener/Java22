package mukemmelSayi;

public class mukemmelSayi {
	public static void main(String[] args) {
		
		
		int number=8;
		int toplam =0;
		
		
		for(int i=1; i<number;i++) {
			if(number%i==0) {
				toplam=toplam+i;
				
				
				}
		}
		if(toplam==number) {
			System.out.println("Sayi mükemmeldir");
		}
		else {System.out.println("mükemmel degildir");}
		
	
}
}
