package fabonacci.series;
public class FabonacciSeries {
    public static void main(String[] args) {
        int num=0,num2=1, fabo;
        System.out.print(num+" "+num2+" ");
        for (int a=1;a<=19;a++)
        {
        fabo=num+num2;
            System.out.print(fabo+" ");
        num=num2;
        num2=fabo;
        }
    }  
}