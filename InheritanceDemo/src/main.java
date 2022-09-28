
public class main {

	public static void main(String[] args) {
		TarimKrediManager tarimKrediManager= new TarimKrediManager();
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		KrediUI krediUI=new KrediUI();
		
		
		
		tarimKrediManager.Hesapla();
		ogretmenKrediManager.Hesapla();
		
		
		krediUI.KrediHesapla(tarimKrediManager);
		
		krediUI.KrediHesapla(ogretmenKrediManager);


	}

}
