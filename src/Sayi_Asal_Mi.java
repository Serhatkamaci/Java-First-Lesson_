public class Sayi_Asal_Mi {
    public static void main(String[] args)
    {
        int a=13,x=0;

        if(a<2)
        {
            System.out.println("Asal sayilar icin gecerli bir sayi giriniz.");
            return;
        }
        if(a==2)
        {
            x=1;
        }
        else
        {
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    break;
                }
                else
                {
                    x=1;
                }
            }
        }
        if(x==0)
        {
            System.out.println(a+" sayisi asal degildir.");
        }
        else
        {
            System.out.println(a+" sayisi asal sayidir.");
        }
    }
}
