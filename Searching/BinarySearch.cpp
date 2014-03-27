/*
 * Implementing the Binary Search .
 * 	 Note: Needs an array sorted in ascending or descending order
 * 
 * Fucntions:
 * 			1. Recursive
 * 			2. Iterative
 */

#include <iostream>

using namespace std;

int Recursive(int arr[], int val, int imin, int imax);
int Iterative(int arr[], int val, int imin, int imax);

int main(void)
{
	int array[10] = {10,20,30,40,50,60,70,80,90,100};
	int val;
	
	cout<<" Enter the element to be found\n";
	cin>>val;
	cout<<"\n\n";
	cout<<" Iterative answer :: ";
	Iterative(array, val, 0, 9);
	cout<<" Recursive answer :: ";
	Recursive(array, val, 0, 9);
	
	return 0;
}

int Iterative(int arr[], int val, int imin, int imax)
{
	int flag=0;
	while(imax >= imin )
	{
		int imid = (imax+imin)/2;
		
		if( arr[imid] == val )
			cout<<" Value "<<val<<" Found at "<<imid<<"\n";
			flag = 1;
		if( arr[imid] < val )
			imin = imid+1;
		
		else
			imax = imid-1;
	}
	if (flag==0)
		cout<<" Value not found \n";
}

int Recursive(int arr[], int val, int imin, int imax)
{
	if(imax<imin)
	 {cout<<" Value Not Found \n";}
	 
	else
	{
		int imid = (imin+imax)/2;
		
		if(arr[imid]>val)
		{ return Recursive(arr, val, imin, imid-1);}
		
		else if( arr[imid] < val )
		{ return Recursive(arr, val, imid+1,imax);}
		else
			cout<<" Value "<<val<<" Found at position"<<imid<<"\n";
			return imid;
	}
}
