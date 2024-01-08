import java.util.*;
class Simple{
int min;
int max;
}
public class Minmax{
public static Simple Findminmax(int a[],int lb,int ub){
Simple x=new Simple();
Simple y=new Simple();
Simple z=new Simple();
int n=(ub-lb)+1;
if(n==1){
x.min=a[lb];
x.max=a[lb];
return x;
}
else if(n==2){
x.min=(a[lb]<a[ub])?a[lb]:a[ub];
x.max=(a[lb]>a[ub])?a[lb]:a[ub];
return x;
}else{
int mid=(lb+ub)/2;
x=Findminmax(a,lb,mid);
y=Findminmax(a,mid+1,ub);
z.min=(x.min<y.min)?x.min:y.min;
z.max=(x.max>y.max)?x.max:y.max;
System.out.println(z.min+" "+z.max);
return z;
}

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Simple s=new Simple();
System.out.println("Enter the no.of Elements");
int n=sc.nextInt();
int a[];
a=new int[n];
System.out.println("enter the elements one by one");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
s=Findminmax(a,0,n-1);
System.out.println("Min"+s.min+"Max"+s.max);
}
}
