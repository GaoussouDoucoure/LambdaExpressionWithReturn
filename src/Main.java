@FunctionalInterface
interface A
{
    int add(int i, int j);
}


public class Main {
    public static void main(String[] args) {
//
//   	A obj=new A()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};

        A obj=(i,j) -> i+j;
        /*
        No need to write return i+j above, it will result to an error and lambda by default will return
         */

        int result=obj.add(5, 4);
        System.out.println(result);
    }
}