public class Switch_Bloklari {
    public static void main(String[] args)
    {
        char grade='B';

        switch (grade)
        {
            case 'A':
                System.out.println("Harf notu: "+grade);
                break;
            case 'B':
                System.out.println("Harf notu: "+grade);
                break;
            case 'C':
                System.out.println("Harf notu: "+grade);
                break;
            case 'D':
                System.out.println("Harf notu: "+grade);
                break;
            default:
                System.out.println("Gecersiz harf notu girdiniz.");
        }
    }
}
