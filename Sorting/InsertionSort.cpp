/*
 * Insertion Sort
 * 
 * Example input:
 * 				5 2 4 6 1 3
 * Expected output per iteration:
 * 
 *  1. 2 5 4 6 1 3
 *  2. 2 4 5 6 1 3
 *  3. 2 4 5 6 1 3
 *  4. 1 2 4 5 6 3
 *  5. 1 2 3 4 5 6
 * 
 * 
 */

#include <iostream>

using namespace std;

int Insertion(int arr[],int size);

int main(void)
{
	int Array[6]={5,2,4,6,1,3};
	
	Insertion(Array,6);
	
	return 0;
}

int Insertion(int arr[],int size)
{
	int i,j,k;
	for(i=1;i<size;i++)
	{
		for(k=i;k>=1 && arr[k] <arr[k-1];k--)
		{
			swap(arr[k],arr[k-1]);
		}
		cout<<"\n"<<i<<" : ";
		for(j=0;j<size;j++)
		{
			cout<<arr[j];
		}
	}
}	

int swap(int a,int b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	return 0;
}
