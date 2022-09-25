package javaString;

public class javaStrings {
	public static void main(String[] args) {

		String mesaj = "Selamın hello arkadaşlar";
		System.out.println("Mesajınız:	" + mesaj);
		System.out.println("5. eleman:	" + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Hırrime")); // mesaj birleştirir

		char[] karakter = new char[20];
		mesaj.getChars(0, 9, karakter, 3);
		System.out.println(karakter);

		System.out.println(mesaj.startsWith("b")); // \endsWith

		System.out.println(mesaj.indexOf("a") + 1); // harfin konumu

		System.out.println(mesaj.lastIndexOf("a")); // toplam - ilk

		System.out.println(mesaj.replace(' ', '-')); // karakter yer değiştirme

		System.out.println(mesaj.substring(2, 5)); // 2. indexten başlayarak yazdırır

		for (String kelime : mesaj.split(" ")) { // kelimlere dağıtır
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // harfleri küçültür
		System.out.println(mesaj.toUpperCase()); // harfleri büyütür

		System.out.println(mesaj.trim()); 	//baş ve sondaki boşlukları siliyor
	}

}
