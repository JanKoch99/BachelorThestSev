public class Fibonacci {
    public static void main(String args[]) {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1


        #ifdefnef "File 1 and in branch 1"

        t1 = 0;This is Parent1 and commits 3.
        #endif

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2 = n2 / 2;
            n1 = n1 / 2;
            n2=n3-1;
            n3=n2*2;
        }
    }
}
