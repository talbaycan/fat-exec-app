# Executable Fat Jar Oluşturma
Amacımız birden fazla class iceren bir executable fat jar oluşturup consoledan calıstırmak.

* **Proje Adı:** fat-exec-app
* **Package Adı:** com.albaycan.fatexecapp
* **Yapısı:** Uygulama içinde 3 adet class olsun

### 1. ExecPackageManager.java: 
* BasicMath'in instance'ını oluştursun. Oluştururken 2 adet sayı versin. Örnek 10 ve 4.
* add(), subtract(), multiply(), divide() methodlarını çalıştırıp aşağıdaki gibi sonuçları ekrana yazabilsin

		* '10' + '4' = '14'	
		* '10' - '4' = '6'
		* '10' * '4' = '40'
		* '10' / '4' = '2.50'
	
* AdvanceMath'ın instance'ını oluştursun. Oluştururken 2 adet sayı versin. Örnek 3 ve 6.
* calcSigma(), calcCombination() methodlarını sırasıyla çalıştırıp aşağıdaki sonuçları ekrana yazabilsin

		* 'Σ(2x-3)' where x>=3 and x<=6 equals to '24'
		* Combination of '6' by '3' is '120'

### 2. BasicMath.java: 
* Constructor'ında 2 tane integer deger alsın, x ve y. 
* 4 adet methodu olsun add(), subtract(), multiply(), divide().

		* add() --> x+y hesaplasın
		* subtract() --> x-y hesaplasın
		* multiply() --> x*y hesaplasın
		* divide() --> x/y hesaplasın. sonucu 0.00 seklinde float olarak döndürebilsin.
		
### 3. AdvancedMath.java:
* Constructor'ında 2 tane integer deger alsın a ve b. 
* 2 adet methodu olsun calcSigma() ve calcCombination()

		* calcSigma()-->  x>=a ve x<=b degerleri arasında Σ(2x-3) hesaplasın
		* calcCombination() --> b'nin a'li kombinasyonunu hesaplasın

## Implementation
1. Projeyi derleyip tek bir jar dosyası oluşturalım, console’dan çalıştırdığımızda direk yukarıdaki sonuçları ekrana bassın. Ekrandan hiçbir input almayacak.
2. GitHub'da yeni bir repository oluşturup, kodları oraya push edelim. Repo adı proje adının aynısı olsun.
	


### Dikkat edilecek hususlar
* Proje klasör yapısı şu şekilde olsun

		/fat-exec-app
		…./src 	--> tüm class'lar bu klasör içinde olsun.
		…..* 		--> diger tüm dosyalar ana kasör içinde yer alsın. (manifesto, readme, gitignore vs. )
	
* Git'e commit ederken hiçbir zaman target yada out klasörünün gitmesini istemiyoruz (gitignore kullanılacak burda)
* Proje klasörünün içine README.md dosyası oluşturup, içine tüm bu yazdıklarımı baştan sona kopyala yapıştır. 

