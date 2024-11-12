#include <stdio.h>

int main() {
    int n, sp[10][10], tr[10][3], r, c, i, j, k = 1;
    printf("Enter the no of rows of the sparse matrix: ");
    scanf("%d", &r);
    printf("Enter the no of columns of the sparse matrix: ");
    scanf("%d", &c);
    printf("Enter the elements of the sparse matrix:\n");
    for (i = 0; i < r; i++) {
        for (j = 0; j < c; j++) {
            scanf("%d", &sp[i][j]);
        }
    }
    printf("The sparse matrix entered is:\n");
    for (i = 0; i < r; i++) {
        for (j = 0; j < c; j++) {
            printf("%d ", sp[i][j]);
        }
        printf("\n");
    }
    for (i = 0; i < r; i++) {
        for (j = 0; j < c; j++) {
            if (sp[i][j] != 0) {
                tr[k][0] = i;
                tr[k][1] = j;
                tr[k][2] = sp[i][j];
                k++;
            }
        }
    }
    tr[0][0] = r;
    tr[0][1] = c;
    tr[0][2] = k - 1;
    printf("The triplet representation is:\n");
    for (i = 0; i < k; i++) {
        for (j = 0; j < 3; j++) {
            printf("%3d ", tr[i][j]);
        }
        printf("\n");
    }
    return 0;
}