// #include <stdio.h>

// int main() {
//     int n;
//     printf("마름모: ");
//     scanf("%d", &n);

//     for (int i = 1; i <= n; i++) {
//         // 공백 
//         for (int j = 1; j <= n - i; j++) {
//             printf(" ");
//         }
//         // 별표 
//         for (int j = 1; j <= 2 * i - 1; j++) {
//             printf("*");
//         }
//         printf("\n");
//     }
  
//   for (int i = n - 1; i >= 1; i--) {
//       // 공백 
//       for (int j = 1; j <= n - i; j++) {
//           printf(" ");
//       }
//       // 별표 
//       for (int j = 1; j <= 2 * i - 1; j++) {
//           printf("*");
//       }
//       printf("\n");
//   }


//     return 0;
// }