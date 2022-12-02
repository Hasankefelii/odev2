package ödev2;

public class Main {

	public static void main(String[] args) {
			
		int sayı = 61 ;
		int remainder = sayı % 2;
		boolean isPrime = true;
		
		if (sayı==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if (sayı<1) {
			System.out.println("Geçersiz sayı");
			return;
			
		}
		
		for (int i = 2; i < sayı; i++) {
			if (sayı % i==0) {
				isPrime = false;
			}
			
		}
		for(int i =60; i <= sayı; i++ ) {
			System.out.println(i);

		}
		System.out.println("Plaka bulundu");
		if (isPrime) {
			System.out.println("Sayı asaldır");
			
		}else {
			System.out.println("Sayı asal değildir.");
		}
			


		for (int i = 2; i < sayı; i++) {
			if (sayı % i==0) {
				isPrime = false;
			}
			
		}
				
		if (sayı<61) {
			
			System.out.println("Trabzon'un plaka Numarası değildir.");
		} else if (sayı>61) {
			System.out.println("Trabzon'un plaka Numarası değildir.");
		} else {
			System.out.println("Trabzon'un plaka Numarası : " + sayı);
		}
	

	}

}
