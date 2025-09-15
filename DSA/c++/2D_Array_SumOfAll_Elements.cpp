#include <iostream>
using namespace std;

int main() {
    int r, c;
    cin >> r >> c;
    int a[100][100], total = 0;

    for (int i = 0; i < r; i++)
        for (int j = 0; j < c; j++) {
            cin >> a[i][j];
            total += a[i][j];
        }

    cout << "Sum of all elements: " << total << endl;
    return 0;
}
