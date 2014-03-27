/*
 * Bubble Sort
 * 
 * example input: 5 2 4 1 6 3
 * 
 */

#include <iostream>

using namespace std;

int Bubble(int arr[],int size);
int swap(int a,int b);

int main(void)
{
	int array[6]={5,2,4,1,6,3};
	
	Bubble(array,6);
	
	return 0;
}

int Bubble(int arr[],int size)
{
	int i,j;
	
	for(i=0;i<size;i++)
	{
		for(j=0;j<size-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				swap(arr[j+1],arr[j]);
			}
		}
		cout<<"\n"<<i<<" : ";
		for(int k=0;k<size;k++)
			cout<<arr[k]<<" ";
	}
	
	cout<<"\n The sorted array is ";
	for(i=0;i<size;i++)
		cout<<arr[i]<<" ";
		
	return 0;
}


int swap(int a,int b)
{
	int temp;
	
	temp=a;
	a=b;
	b=temp;
	return 0;
}
