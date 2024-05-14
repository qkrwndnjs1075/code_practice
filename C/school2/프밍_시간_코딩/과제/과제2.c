#include <stdio.h>

int main() {
    int num;
    int max = 0; 
    int min = 100; 
    

    printf("학생 수: ");
    scanf("%d", &num);

    for (int i = 0; i < num; i++) {
        int s;
        printf("%d의 점수: ", i + 1);
        scanf("%d", &s);
      
        if (s > max) {
            max = s;
        }
        if (s < min) {
            min = s;
        }
    }
    printf("1등: %d\n", max);
    printf("꼴등: %d\n", min);

    return 0;
}