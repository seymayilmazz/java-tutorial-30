/**
 * Created by Şeyma Yılmaz on 5.6.2017.
 */
public class Main {
    public static void main(String[] args) {
        String name = "Şeyma Yılmaz";

        System.out.println("length() : " + name.length());
        String nameUpperCase = name.toUpperCase();
        System.out.println("name : " + name + ", nameUpperCase : " + nameUpperCase);
        String nameLowerCase  = name.toLowerCase();
        System.out.println("name : " + name + ", nameUpperCase : " + nameLowerCase);

        String name1 = "Şeyma Yılmaz";
        String name2 = "Burak Köken";

        /* == istenmiyor!!!, equals() -> referans karsilastirmak */
        /* compareTo, eger 0 ise iki string birbirine esit
         * eger 0'dan buyuk donerse ilk string sozluk sirasi daha buyuk
         * eger 0'dan kucuk donerse ilk string sozluk sirasi daha kucuk
         */
        int resultCompare = name1.compareTo(name2);
        if(resultCompare == 0){
            System.out.println("iki string esit");
        }
        else if(resultCompare < 0){
            System.out.println("ilk string daha once");
        }
        else if(resultCompare > 0){
            System.out.println("ilk string daha sonra");
        }

        /* equals metodu referanslari karsilasitirir
         * stringlerin karsilastirilmasinda kullanilmaz
         */
        Person person1 = new Person();
        Person person2 = new Person();
        if(person1.equals(person2) == true){
            System.out.println("iki referans ayni");
        }
        else{
            System.out.println("iki referans farkli");
        }

        String name3 = "Şeyma Yılmaz";
        String name4 = "şeyma YILMAZ";

        int resultCompareIgnore = name2.compareToIgnoreCase(name4);
        if(resultCompareIgnore== 0){
            System.out.println("iki string esit (Ignore Case)");
        }
        else {
            System.out.println("iki string esit degil ");
        }

        /* contains */
        String message = "Hello World! Hello java! Hello Android!";
        if(message.toUpperCase().contains("JAVA")){
            System.out.println("mesaj icerisinde Java kelimesi bulunuyor");
        }
        else{
            System.out.println("mesaj icerisinde Java kelimesi bulunmuyor");
        }

        /* substring */
        String message2 = "Hello World!";
        String newMessage1 = message2.substring(2);
        String newMessage2 = message2.substring(2, 8);
        System.out.println("newMessage1 : " + newMessage1);
        System.out.println("newMessage2 : " + newMessage2);


        /* replace */
        String message3 = "Hello Java World ";
        String s1 = message3.replace('o', 'j');
        String s2 = message3.replace("Java", "Python");
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

        /* split */
        String[] tokens = message3.split(" ");
        System.out.println("tokens[0] = " + tokens[0]);

        /* concat */
        String s3 = message3.concat(" Android");
        System.out.println("s3 : " + s3);

        /* indexOf */
        int javaIndex = message3.indexOf("Java");
        System.out.println("java baslangic indisi : " + javaIndex);

        /* charAt */
        char karakter = message3.charAt(3);
        System.out.println("karakter : " + karakter);
    }
}
