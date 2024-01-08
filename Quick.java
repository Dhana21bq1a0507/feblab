import java.util.*;
public class Quick{
public static void Quicksort(int a[],int lb,int ub){
int left=lb;
int right=ub;
int pivot=lb;
while(left<right){
while(a[pivot]<a[right] && pivot!=right)
right--;
if(pivot!=right){
int temp=a[pivot];
a[pivot]=a[right];
a[right]=temp;
pivot=right;
}
while(a[pivot]>a[left] && pivot!=left)
left++;
if(pivot!=left){
int temp=a[pivot];
a[pivot]=a[left];
a[left]=temp;
pivot=left;
}
}
if(lb<pivot)
Quicksort(a,lb,pivot-1);
if(pivot<ub)
Quicksort(a,pivot+1,ub);

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
Quicksort(a,0,n-1);
System.out.println("After sorting");
for(int i=0;i<n;i++)
System.out.print(a[i]+"\t");
}
}
