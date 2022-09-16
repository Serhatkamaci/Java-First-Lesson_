public class Sayi_Bulma {
    public static void main(String[] args)
    {
        int[] sayilar={10,20,40,50,70};
        int aranacak=75,x=0;

        for(int i:sayilar)
        {
            if(aranacak==i)
            {
                x=1;
                break;
            }
        }

        if(x==1)
        {
            System.out.println("Aranacak sayi dizide bulundu.");
        }
        else
        {
            System.out.println("Aranacak sayi dizide bulunamadi.");
        }
    }
}
