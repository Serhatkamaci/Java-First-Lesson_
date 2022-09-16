public class Kalin_ve_Ince_Sesli_Harfler {
    public static void main(String[] args)
    {
        String[] ince_sesli={"e","i","ü","ö"};
        String[] kalin_sesli={"a","ı","u","o"};
        int x=0,y=0;

        String karakter="ö";

        for(String i:ince_sesli)
        {
            if (i==karakter)
            {
                x=1;
            }
        }

        for(String i: kalin_sesli)
        {
            if(i==karakter)
            {
                y=1;
            }
        }

        if(x==1)
        {
            System.out.println(karakter+"'i "+"ince sesli harfdir.");
        }
        else if(y==1)
        {
            System.out.println(karakter+"'i "+"kalin sesli bir harfdir.");
        }
        else
        {
            System.out.println(karakter+"'i "+"ne ince sesli ne de kalin sesli bir harfdir.");
        }








    }
}
