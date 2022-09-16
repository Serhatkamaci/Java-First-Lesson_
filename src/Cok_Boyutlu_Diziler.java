public class Cok_Boyutlu_Diziler {
    public static void main(String[] args)
    {
        double[][] numeric_variables={{10,20,30},{10.25,75.86,98.75}};

        for(int i=0;i<numeric_variables.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(numeric_variables[i][j]);
            }
        }
    }
}
