#include <iostream>
using namespace std;

int main() {
    int r, c;
    cin >> r >> c;
    int a[100][100], bound = 0;

    for (int i = 0; i < r; i++)
        for (int j = 0; j < c; j++) {
            cin >> a[i][j];
            if (i == 0 || j == 0 || i == r - 1 || j == c - 1)
                bound += a[i][j];
        }

    cout << "Sum of boundary elements: " << bound << endl;
    return 0;
}
