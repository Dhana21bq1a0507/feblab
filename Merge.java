import java.util.*;
public class Merge{
public static void Mergepass(int a[],int lb,int ub){
if(lb!=ub){
int mid=(lb+ub)/2;
Mergepass(a,lb,mid);
Mergepass(a,mid+1,ub);
Mergesort(a,lb,mid,ub);
}
}
public static void Mergesort(int a[],int lb,int mid,int ub){
int i=lb;
int j=mid+1;
int temp[]=new int[100];
int k=lb;
while(i<=mid && j<=ub){
if(a[i]<a[j])
temp[k++]=a[i++];
else
temp[k++]=a[j++];

}
while(i<=mid)
temp[k++]=a[i++];
while(j<=ub)
temp[k++]=a[j++];
for(int h=lb;h<=ub;h++)
a[h]=temp[h];

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of Elements");
int n=sc.nextInt();
int a[];
a=new int[n];
System.out.println("enter the elements one by one");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
Mergepass(a,0,n-1);
System.out.println("After sorting");
for(int i=0;i<n;i++)
System.out.print(a[i]+"\t");
}
}

