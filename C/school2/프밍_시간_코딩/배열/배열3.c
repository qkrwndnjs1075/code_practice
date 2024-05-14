#include <stdio.h>
int main(){

  int nArr1[5] = { 10,20,30,40,50 };
  int nArr2[5] = { 0 }; // 배열 전체 요소를 모두 0으로 초기화
  int i = 0;
  //배열 전체 요소를 동시에 대입하려 시도한다.
  // 아래와 같이 반복문으로 하나씩 복사해야 함.

  for (i=0; i < 5; i++){
    nArr2[i] = nArr1[i];
  }
  
  for(i = 0; i < 5; i++){
    printf("nArr2[%d] : %d\n", i, nArr2[i]);
  }
  printf("\n");

  return 0;
}