
public class sayiAsalMi {
	public static void main(String[] args) {

		int number = 91;
		boolean isPrime = true;

		if (number <= 1) {
			System.out.println("sayi asal degildir");

			return;
		}

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				isPrime = false;
			}

		}

		if (isPrime == true) {

			System.out.println("sayi asaldir");
		} else {
			System.out.println("sayi asal degildir");
		}

	}

}
