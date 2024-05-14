// #include <stdio.h>
// #include <stdlib.h>

// int main(){

//   int *pi; // point Intiger
//   pi=(int*)malloc(sizeof(int)); //malloc = 메모리를 할당해라

//   if(pi == 0){

//     printf("동적 메모리 할당에 실패하였습니다.\n");
//     exit(1);
//   }
//   *pi = 100;
//   printf("%d\n", *pi); // 동적 메모리를 사용한 이후에는 무조건 해당 메모리                           를 반환합다다
//   free(pi);
  

//   return 0;
// }