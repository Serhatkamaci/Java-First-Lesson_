public class Strinlerle_Calismak {
    public static void main(String[] args)
    {
        String[] k={"ser hat","  KAMACİ  ","young","Engineer"};

        System.out.println("Eleman Sayilari");
        for(String i:k)
        {
            System.out.println(i.length());
        }
        System.out.println("\n"); // 1 Bosluk asagisina gecirir.
        String[] i=k[0].split(" ");

        for(String z:i)
        {
            System.out.println(z);
        }

        String c=k[2].concat(k[3]);

        System.out.println("Result: "+c);

        System.out.println(k[0].startsWith("A"));
        System.out.println(k[0].endsWith("t"));


        char [] g=new char[5];

        k[2].getChars(0,k[2].length(),g,0);

        for(char l: g)
        {
            System.out.println(l);
        }


        System.out.println(k[0].indexOf("e"));
        System.out.println(k[0].lastIndexOf("a"));


        System.out.println(k[0].replace('s','S'));

        System.out.println(k[1].trim());

        System.out.println(k[0].substring(0,2));

        System.out.println(k[1].toLowerCase());
        System.out.println(k[2].toUpperCase());


    }
}
