public class Main {
    public static int First_THings(int a[],int i,int key)
    {
        if(i==a.length-1)
        {
            return -1;
        }
        if(a[i]==key)
        {
            return i;
        }
        return First_THings(a,i+1,key);
    }
    public static void main(String[] args) {
        int key =1;
        int a[]={1,34,5,6,7,8,2,9};
        System.out.println(First_THings(a,0,key));
        System.out.println("Hello world!");
    }
}