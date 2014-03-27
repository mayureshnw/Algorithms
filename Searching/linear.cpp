#include <iostream>
#include <stdio.h>
int main()
{

int arr[10],i,j,num;

cout<<"Enter 10 numbers ";
for(i=0;i<10;i++)
cin>>arr[i];


cout<<"\nNumber to be found?";
cin>>num;

for(i=0;i<10;i++)
{
if(num==arr[i])
cout<<"found";
}

return 0;
}
