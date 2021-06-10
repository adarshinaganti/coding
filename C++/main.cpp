#include <iostream>
using namespace std;

int main(){
    const int dollarValue = 100;
    const int quarterValue = 25;
    const int dimeValue = 10;
    const int nickelValue = 5;
    const int pennyValue = 1;

    int amount;

    cout << "Enter a value in cents: ";
    cin >> amount;

    int dollars, quarters, dimes, nickels, pennies, balance;

    dollars = amount / dollarValue;
    balance = amount - (dollars * dollarValue);

    quarters = balance / quarterValue;
    balance -= quarters * quarterValue;

    dimes = balance / dimeValue;
    balance -= dimes * dimeValue;

    nickels = balance / nickelValue;
    balance -= nickels * nickelValue;

    pennies = balance * pennyValue;

    cout << "Dollars: " << dollars << endl;
    cout << "Quarters: " << quarters << endl;
    cout << "Dimes: " << dimes << endl;
    cout << "Nickels: " << nickels << endl;
    cout << "Pennies: " << pennies << endl;
    return 0;
}
