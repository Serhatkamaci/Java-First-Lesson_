public class Arkadas_Sayilar {
    public static void main(String[] args)
    {
        int sayi1=220,sayi2=284,x=0,y=0;

        for(int i=1;i<sayi1;i++)
        {
            if(sayi1%i==0)
            {
                x+=i;
            }
        }
        for(int i=1;i<sayi2;i++)
        {
            if(sayi2%i==0)
            {
                y+=i;
            }
        }

        if(x==sayi2 && y==sayi1)
        {
            System.out.println(sayi1+" ve "+sayi2+" arkadas sayilardir.");
        }
        else
        {
            System.out.println(sayi1+" ve "+sayi2+" arkadas sayilar degildir.");
        }
    }
}
