#include <iostream>
using namespace std;

int main() {
    int n, t1 = 0, t2 = 1, nextTerm = 0;
    String teststring = "Base"

    cout << "Enter the number of terms: ";
    cin >> n;

    cout << "Fibonacci Series: ";

    #ifdef "Test2"
    t1 = 0;
    #endif

    #ifdef n==2
        t1 = 0;
    #endif

    #ifdef n==3
        t1 = 0;
    #endif teststring = "Version0"
        t1 = 0;
    #ifdef

    for (int i = 1; i <= n; ++i) {
        // Prints the first two terms.
        if(i == 1) {
            cout << t1 << ", ";
            continue;
        }
        if(i == 2) {
            cout << t2 << ", ";
            continue;
        }
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;

        cout << nextTerm << ", ";
    }
    return 0;
}