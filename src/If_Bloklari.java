public class If_Bloklari {
    public static void main(String[] args)
    {
        boolean x,y;

        // Hava yagmurlu mu ?

        x=true;
        y=false;

        if(x)
        {
            System.out.println("Hava yagmurludur.");
        }
        else if(y)
        {
            System.out.println("Hava bulutludur.");
        }
        else
        {
            System.out.println("Hava yagmurlu degildir.");
        }

    }
}
