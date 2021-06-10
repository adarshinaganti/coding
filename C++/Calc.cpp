#include <iostream>
#include <cmath>
using namespace std;
const double pi = 3.14;

void square(int s){
  cout << "Enter side: ";
  cin >> s;
  int p = 4 * s;
  int a = s * s;
  cout << "Perimeter: " << p << endl;
  cout << "Area: " << a << endl;
}

void rect(int l, int b){
  cout << "Enter length: ";
  cin >> l;
  cout << "Enter breadth: ";
  cin >> b;
  int p = 2 * (l + b);
  int a = l * b;
  cout << "Perimeter: " << p << endl;
  cout << "Area: " << a << endl;
}

