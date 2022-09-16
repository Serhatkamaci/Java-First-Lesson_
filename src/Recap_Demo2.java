public class Recap_Demo2 {
    public static void main(String[] args)
    {
        double[] myList={1.25,4.7,5.8,6.9};
        double toplam=0;

        for(double i:myList)
        {
            toplam+=i;
            System.out.println(i);
        }

        System.out.println("Double dizisi eleman toplami: "+toplam);

        double x=0;

        for(int i=0;i<myList.length;i++)
        {
            if(x<myList[i])
            {
                x=myList[i];
            }
        }

        System.out.println("Dizideki en buyuk sayi : "+x);

    }
}
