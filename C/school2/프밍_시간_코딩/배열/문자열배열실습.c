 #include <stdio.h>
 int main(){

   int cnt = 0; // 이름의 길이를 세는 변수
   char sName[100], sNum[10]; // 이름과 학번을 문자열로 저장하는 배열
   printf("이름을 영어로 입력하세요 : ");
   scanf("%s", sName); //이름을 문자열로 입력받기
   printf("학번을 입력하세요 : ");
   scanf("%d", sNum);
   // 학번 입력받기
   while(sName[cnt] != '\0'){
    
     cnt++;
    
   }
   printf("당신의 이름은 %s이고 학번은 %s입니다.", sName, sNum);


   return 0;
 }