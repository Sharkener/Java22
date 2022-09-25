
public class VarMı {
	
	public static void main(String[] args) {
		
		
		int sayilar[]= new int[] {1,2,3,4,5,6,7};
		int aranacak = 1;
		boolean varMı = false;
		
	//	for(int sayi:sayilar) {
			
		///	if(aranacak==sayi){
				System.out.println("sayi bulunur");
			//}
			
			
	//	}
		
		for(int i=0;i<sayilar.length;i++) {
			
			if(sayilar[i]==aranacak) {
				
				varMı=true;
			}
			}
		if(varMı==true) {
			System.out.println(aranacak+" sayisi dizide bulunmaktadır");
		}
		else {			System.out.println(aranacak+" sayisi dizide bulunmamaktadır");
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
