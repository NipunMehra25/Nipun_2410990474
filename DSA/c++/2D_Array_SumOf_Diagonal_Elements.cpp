#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int a[100][100], diag = 0;

    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) {
            cin >> a[i][j];
            if (i == j)
                diag += a[i][j];
        }

    cout << "Sum of diagonal: " << diag << endl;
    return 0;
}
