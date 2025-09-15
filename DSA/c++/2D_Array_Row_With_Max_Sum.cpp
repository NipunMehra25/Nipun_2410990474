#include <iostream>
using namespace std;

int main() {
    int r, c;
    cin >> r >> c;
    int a[100][100];
    int maxRowSum = -1e9, maxRow = 0;

    for (int i = 0; i < r; i++) {
        int rowSum = 0;
        for (int j = 0; j < c; j++) {
            cin >> a[i][j];
            rowSum += a[i][j];
        }
        if (rowSum > maxRowSum) {
            maxRowSum = rowSum;
            maxRow = i;
        }
    }

    cout << "Row with max sum: " << maxRow << " (sum = " << maxRowSum << ")" << endl;
    return 0;
}
