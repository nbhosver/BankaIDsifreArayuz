Scanner scanner = new Scanner(System.in);
	int bakiye = 1000;
	String islemler = "1. işlem : bakiye öğrenme \n"
						+ "2. işlem : Para çekme\n"
						+ "3. işlem : Para tatırma\n"
						+ "Çıkış için q ya basınız.";
	System.out.println("*********************************");
	System.out.println(islemler);
	System.out.println("*********************************");
	
	while(true) {
		System.out.println("Bir işlem seçiniz");
		String islem = scanner.nextLine();
		if (islem.equals("q")) {
			System.out.println("Pragramdan çıkılıyor");
			break;
			
		}
		else if (islem.equals("1")) {
			System.out.println("Bakiyeniz : " + bakiye);
			
			
		}
		else if (islem.equals("2")) {
			System.out.println("Çekmek istediğiniz tutar : ");
			int tutar = scanner.nextInt();
			scanner.nextLine();
			
			if (bakiye - tutar < 0) {
				System.out.println("Yeterli bakiye yok. " + bakiye);
				
			}
			else { 
				bakiye -= tutar;
				System.out.println("Yeni bakiyeniz : " + bakiye);
			}
			
			
		}
		else if (islem.equals("3")) {
			System.out.println("Para yatırmak istediğiniz tutar :");
			int tutar = scanner.nextInt();
			scanner.nextLine();
			bakiye += tutar;
			System.out.println("Yeni bakiyeniz : " + bakiye);
			
			
		}
		else  {
			
		System.out.println("Geçersiz işlem yaptınız ...")
