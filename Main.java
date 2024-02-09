import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //String a = "Direncan"; //Stringleri farklı şekilde tanımlayabiliriz. //1

        /*String b = new String("Direncan"); //Strin bir class olduğu için bu şekilde de tanımlayabiliyoruz. //2

        System.out.println(b);*/

        /*String metodlarını inceleyelim. Stringlerin bir çok metodu var. Biz bu dertse birkaç tanesini ele alacağız.
          Ezberlemiyoruz. Örneğin ihityaç olduğunda b. şeklinde baktığımızda Java hepsini karşımıza çıkarıyor.
          Bu şekilde Javanın açıklamalarından hangisinin ne işe yarağına bakarak kullanabiliriz.
          Aşağıda metodlar ile ilgili birkaç örnek yapalım.*/ //3

        /*System.out.println("Harf Sayısı : " + b.length()); //b'nin harf sayısını yazdırdık. //4

         //Stringlerin indexlemesi de aynı. 0dan başlayıp devam ediyor. //5

        System.out.println("0. indeks : " + b.charAt(0)); //b'nin ilk harfini yani 0. indeksi bulduk //6

        System.out.println("2 indeks : " + b.charAt(2));

        System.out.println("Son eleman : " + b.charAt(b.length() - 1)); //Son harfi bulduk. //7 */

        /*for (int i = 0 ; i < b.length() ; i++) {
            System.out.println(b.charAt(i)); //Tüm harfleri(Tüm indekseri) tek tek bastırdık. //8
        }*/

        /*System.out.println(b.startsWith("Mu")); //startsWith metodu, b'nin parantez içine yazılan ile başlıyor mu anlamına gelir.
        System.out.println(b.endsWith("an")); //endsWith metodu, b'nin parantez içine yazılan ile bitiyor mu anlamına gelir.
        //startsWith veya endsWith metodları sadece true veya false değerleri dönerler. //9

        System.out.println(b.indexOf('a')); //İçerisinde a harfi mevcut. 6. indeks olarak çıktı verdi.
        System.out.println(b.indexOf('b')); //İçerisinde olmadığı için "-1" değerini döndü.

        System.out.println(b.lastIndexOf('n')); //Birden fazla aynı eleman varsa bile sondan başlayarak ik karşılaştığını yazdırır.*/ //10

        /*System.out.println(b.toLowerCase()); //Tüm harfleri küçüğe çevirdi.
        System.out.println(b.toUpperCase()); //Tüm harfleri büyüğe çevirdi.*/ //11

        /* //String'den int'e nasıl çeviririz ona bakalım; //12

        String a1 = "1923";

        int b1 = Integer.parseInt(a1); //Stringi int'e çevirdik.

        System.out.println(b1);*/


        /* //int'i String'e nasıl çeviririz ona bakalım; //13

        int b1 = 1923;

        String a1 = String.valueOf(b1); //int'i Stringe çevirdik.

        System.out.println(a1); */

        //Stringlerin eşitlik durumlarını inceleyelim; //14

        String c1 = new String("Direncan");
        String c2 = new String("Direncan");

        if (c1 == c2) {

            System.out.println("Birbirlerine eşitler...");
        }
        else {

            System.out.println("Birbirlerine eşit değiller..."); /* c1 ve c2 referansları bellekte farklı yerleri
                                                                    gösterdikleri için çıktı "Birbirlerine eşit değiller..."
                                                                     şeklinde oldu. */
        }

        if (c1.equals(c2)) {

            System.out.println("Birbirlerine eşitler...");/* Fakat referansların içeriğinin eşitlik kontrolünü sağladığımızda
                                                             eşit çıktı "Birbirlerine eşitler..." şeklinde yazılmış oldu. */
        }
        else {

            System.out.println("Birbirlerine eşit değiller...");
        }

    }
}