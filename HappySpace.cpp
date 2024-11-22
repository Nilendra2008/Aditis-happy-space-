#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>

void displayJoke() {
    std::vector<std::string> jokes = {
        "Why don't scientists trust atoms? Because they make up everything!",
        "What do you call a fake noodle? An impasta!",
        "Why did the scarecrow win an award? He was outstanding in his field!",
        "Why don't eggs tell jokes? They'd crack each other up!",
        "What do you call a can opener that doesn't work? A can't opener!"
    };

    srand(time(0));
    int randomIndex = rand() % jokes.size();
    std::cout << jokes[randomIndex] << std::endl;
}

int main() {
    std::cout << "Welcome, Aditi! This is your happy space!" << std::endl;
    std::cout << "Click for a joke!" << std::endl;
    char input;
    std::cin >> input;
    if (input == 'c' || input == 'C') {
        displayJoke();
    }
    return 0;
}
