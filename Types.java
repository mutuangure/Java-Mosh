public class Types
{
    public static void main(String[] args)
    {
        System.out.println("Hello world" + "\nWhat is your name??");
        //CREATION OF ARRAYS
        int[] numbs = {3,7,2,4};
        //change the value
        numbs[1] = 5;

        System.out.println(numbs[1]);

        int[] numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 3;
        numbers[3] = 9;

        for(int j=0;j<4;j++)
        //for(int j=0;j<numbers.lenght;j++)
        {
            System.out.println(numbers[j]);
        }

        //Enhanced for loop
        for(int H : numbers)
        {
            System.out.print(H);
        }

    }
}