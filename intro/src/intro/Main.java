package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu="?nternet ?ubesine giriniz!";
		double dolarDun=8.05;
		double dolarBugun=8.05;
		boolean dustumu=false;
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D??t? resmi");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar Y?kseldi resmi");//imgsrc..
		}else {
			System.out.println("Dolar e?it resmi");
		}
		String kredi1="H?zl? Kredi";
		String kredi2="Emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="Msb Kredisi";
		String kredi5="Meb Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String [] krediler={"H?zl? Kredi",
				            "Emekli Kredisi",
				            "Konut Kredisi",
		                    "Msb Kredisi",
		                    "Meb Kredisi",
		                    "Kb kredisi"};
		for (String kredi:krediler) {
			System.out.println(kredi);//for each
		};
		for (int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		};
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[]sayilar1= {1,2,3,4,5};
		int[]sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		 sehir1= sehir2;
		 sehir2="izmir";
	System.out.println(sehir1);	 
				 
		
	}

}
