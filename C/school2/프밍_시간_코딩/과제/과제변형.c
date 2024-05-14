#include <stdio.h>

int main() {
    int a, b;
    printf("입력: ");
    scanf("%d %d", &a, &b);

    for (int i = (a > b) ? b : a; i <= ((a > b) ? a : b); i++) {
        printf("%d ", i);
    }

    return 0;
}