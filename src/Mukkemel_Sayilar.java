public class Mukkemel_Sayilar {
    public static void main(String[] args)
    {
        int sayi=28,toplam=0;
        if(sayi<6)
        {
            System.out.println(sayi+" mukemmel sayi aramasina uygun degildir.\nEn kucuk mukemmel sayi: 6'dir.");
            return;
        }
        for(int i=1;i<sayi;i++)
        {
            if(sayi%i==0)
            {
                toplam+=i;
            }
        }
        if(toplam==sayi)
        {
            System.out.println(sayi+" sayisi mukemmel sayidir.");
        }
        else
        {
            System.out.println(sayi+" sayisi mukemmel sayi degildir.");
        }
    }
}
