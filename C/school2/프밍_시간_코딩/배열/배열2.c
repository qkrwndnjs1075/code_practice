#include <stdio.h>
int main(){

  int i;
  int arr1[5]={1,2,3,4,5};

  int lenOArr1 = sizeof(arr1)/sizeof(int);

  //int LenOArr1 = sizeof(arr1)/sizeof(arr1[0]);
  printf("arr1[5]={1,2,3,4,5}의 ~~ \n");
  for(i=0; i<lenOArr1; i++)
    {
      printf("%번째 요소~~ : %d \n", i+1, arr1[i]);
    }
  printf("\n");
 
return 0;
}