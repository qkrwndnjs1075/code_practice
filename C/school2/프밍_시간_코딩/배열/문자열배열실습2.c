 #include <stdio.h>

 int main() {
    
     int min = 100, max = 0, num; 
     double total;
    
     printf("학생 수: ");
     scanf("%d", &num);
       int scores[num];

     for (int i = 0; i < num; i++) {
         printf("%d의 점수: ", i + 1);
      
         scanf("%d", &scores[i]);
         total += scores[i];
         if (scores[i] > max) {
             max = scores[i];
         }
         if (scores[i] < min) {
             min = scores[i];
         }
     }

     printf("1등: %d\n", max);
     printf("꼴등: %d\n", min);
     printf("평균은 %lf입니다", total/num);

     return 0;
 }