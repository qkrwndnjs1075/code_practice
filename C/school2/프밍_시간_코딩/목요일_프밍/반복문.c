#include <stdio.h>

int main() {
    int v1, v2;
    int result = 0;

    printf("숫자 입력: ");
    scanf("%d %d", &v1, &v2);

    int min = v1 < v2 ? v1 : v2;
    int max = v1 > v2 ? v1 : v2;

    
    for (int i = min; i <= max; i++) {
      printf("%d ", i);
        result += i;
    }
    printf("\n");
    printf("두 수 사이의 정수 합: %d\n", result);

    return 0;
}