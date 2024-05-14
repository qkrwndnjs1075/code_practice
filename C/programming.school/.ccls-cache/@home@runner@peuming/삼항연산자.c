#include <stdio.h>
int main(){

  int a;


  printf("주민등록번호의 끝자리 첫번째 숫자를 입력하시오 : ");
  scanf("%d", &a);

  if(a<=0 || a>9) ? printf("오류입니다") : (a%2==0) ? printf("여자") : printf("남자");




  return 0;
}