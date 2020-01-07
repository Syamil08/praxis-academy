Dalam latihan kali ini yang dilakukan adalah melakukan penginstalan terlebih dahulu untuk jdk dan visual studio code, dibawah ini akan diberikan sebuah gambar dan cara pengecekan jika sudah melakukan penginstalan.



Selanjutnya untuk point nomor 11 - 14 

11. Kompilasi dan menjalankan aplikasi yang diprogram
	-> jika kita ingin menjalankan program java kita maka hal pertama yang harus kita lakukan adalah membuat file nya terlebih dahulu
	dicontoh ini saya membuat file dengan nama HelloWorld.java. maka setelah membuat file tersebut kita lakukan penyusunan kode untuk penyusunan kode dijelaskan pada nomer selanjutnya, untuk menjalankan file java tersebut maka ada beberapa tahapan yang dilakukan :
	
	a. Compile Class 
	-> lakukan compile class dengan cara : javac HelloWorld.java -> kode ini akan menghasilkan sebuah file baru bernama HelloWorld.class

	b. Run Class
	-> setelah menjalankan kode di atas maka langkah selanjutnya adalah menjalankan program nya agar kita tahu bahwa kode tersebut sesuai dengan ekspektasi kita atau tidak
	maka lakukan perintah berikut : java HelloWorld (disini tidak perlu .class / .java karena kita langsung mengarah ke nama class nya sehingga nantinya class akan menjalakan program yang ada pada main(public static void main).
	
	c. Memuat file ber-ekstensi JAR
	-> pada bagian ini kita akan membuat sebuah file JAR dengan cara seperti berikut:
	jar cfm HelloWorld.jar Manifest.txt HelloWorld.class -> jar cfm "mendefinisikan nama untuk jar nya" "mendefinisikan file manifest yang sudah kita buat" "mendefinisikan file kita yang ber ekstensi .class"
	
	d. Menjalankan program yang sudah dibuat ber-ekstensi JAR
	-> pada bagian ini kita akan mencoba menjalankan file yang sudah dibuat menjadi ber-ekstensi JAR dengan cara seperti dibawah ini :
	java -jar HelloWorld.jar -> maka setelah kita menjalankan perintah itu akan menhasilkan output dari kode yang telah kita buat.
	 

12. Struktur dasar code dalam bahasa pemrograman java
	-> struktur dari kode dalam bahasa java seperti berikut ini :
	Disini saya memiliki file bernama HelloWorld.java

	Struktur :
	
	import java.*; -> melakukan import library / package yang dibutuhkan

	class HelloWorld{ 
		public void static main(String[] args){
			System.out.println("Hello World");
		}
	}

	dimulai dengan :
	class -> sebuah blueprint yang digunakan untuk mencetak program yang sudah kita buat
	dilanjutkan pada baris selanjutnya terdapan main yang digunakan sebagai inti dari program jadi ketika menjalankan program yang pertama kali di jalankan adalah bagian main tersebut
	kemudian di dalam main kita berikan kode yang kita inginkan disini saya melakukan sebuah perintah untuk mengeluarkan pesan "Hello World"

13. Penggunaan variabel, konstanta, operator, ekspresi, statement,block, dan tipe data dasar di java
	-> variabel : adalah sebuah wadah untuk menampung sebuah value dari program kita contoh : int a -> disini a sebagai variabel nantinya a akan digunakan untuk menyimpan sebuah nilai.
	-> konstanta : adalah sebuah nilai tetap atau nilai yang selalu sama atau biasa disebut konstan nantinya nilai ini akan selalu sama dan tidak akan berubah-ubah, Contoh konstanta : final double PI = 3.14 (nantinya nilai dari variabel PI ini akan selalu sama.
	-> ekspresi : sebuah tanda yang digunakan untuk menunjukkan kondisi suatu kejadian contoh ekspresi :
	 int a = 2, b = 4, total=0;
	 total = a + b; -> a + b disini adalah ekspresi.
	
	-> operator : sebuah simbol yang bisa digunakan untuk melakukan suatu pekerjaan dan operator juga bisa digunakan untuk menentukan kondisi.
	contoh operator :
	+ , - , * , / , % , ++ , -- , == , >= , <= , < , > , != , dll.
	
	-> tipe data :sebuah variabel tidak akan pernah tertinggal dengan tipe data nya karena itu satu paket , tipe data berfungsi untuk menghasilkan nilai sesuai yang kita inginkan jika kita ingin nilai itu bilangan bulat, pecahan , atau nilai nya berbentuk karakter.
	contoh tipe data dasar :
	a. int
	b. String
	c. short
	d. long
	e. float
	f. double
	g. boolean
	h. char

14. Looping , If , dan switch
	-> looping : suatu kondisi dimana program akan melakukan pengulangan selama yang kita inginkan agar bisa mendapatkan hasil yang diinginkan.
	-> if / else : suatu perintah atau kondisi dimana kita hanya memiliki 2 kemungkinan yaitu ya / tidak.
	-> switch : hampir sama dengan kondisi if / else namun switch bisa dibuat dengan menggunakan nomor.

untuk contoh dari penjelasan nomor 11 - 14 telah dilampirkan pada folder ini.
