Student: Mursalimova Karima
Group: IT-2502
Part 1. Recursion with Numbers

Task 1
<img width="1246" height="645" alt="image" src="https://github.com/user-attachments/assets/9dced389-afb6-431a-b5a3-2e7f5cc76329" />

This program uses recursion to print all digits of a given integer in the correct order.
The method printDigits(int n) breaks the number into smaller parts by dividing it by 10 until it reaches 0 (base case). Then, as the recursion returns, it prints the last digit of each step using n % 10.

Task 2
<img width="1092" height="629" alt="image" src="https://github.com/user-attachments/assets/4fd13804-20fd-4b26-82fe-08e8473eb22f" />
This program calculates the sum and average of an array using recursion.
The method sum(int[] arr, int n) recursively computes the total sum of the first n elements of the array by adding the last element arr[n - 1] to the sum of the remaining elements.
The method avg(int[] arr, int n) calculates the average by dividing the total sum of the array elements by n
In main, the program computes the average of the array {3, 2, 4, 1}, which results in 2.5, and prints it.

Task 3
<img width="1201" height="626" alt="image" src="https://github.com/user-attachments/assets/e67ec357-e457-4354-96e6-69228667430b" />
This program checks whether a number is prime using recursion.
The method isPrime(int n, int i) tests if n has any divisors starting from i. If n is divisible by i, it returns false (not a prime number). If i * i becomes greater than n, it means no divisors were found, so the number is prime. The function recursively increases i to check the next possible divisor.

Task 4
<img width="1120" height="590" alt="image" src="https://github.com/user-attachments/assets/652d4171-ae88-4010-ba00-d69072aa7c09" />
This program calculates the factorial of a number using recursion.
The method fact(int n) multiplies the current number n by the factorial of n - 1. The recursion continues until it reaches the base case n == 1, where it returns 1.
In main, the program computes the factorial of 5, which results in 120, and prints it.

Part 2. Recursion with Sequences

Task 5
<img width="1206" height="644" alt="image" src="https://github.com/user-attachments/assets/32022a89-9a61-4de6-b565-7405767980ae" />
This program calculates Fibonacci numbers using recursion.
The method fib(int n) returns 0 when n is 0 and 1 when n is 1 (base cases). For all other values, it recursively computes the sum of the two previous Fibonacci numbers: fib(n - 1) + fib(n - 2).

Task 6
<img width="1234" height="594" alt="image" src="https://github.com/user-attachments/assets/9bdf4aa8-e1b4-426e-96d3-141e6436311a" />
This program calculates the power of a number using recursion.
The method power(int a, int n) computes a^n. If the exponent n is 0, it returns 1 (base case). Otherwise, it multiplies a by the result of power(a, n - 1), gradually reducing the exponent until it reaches 0.

Task 7
<img width="1069" height="662" alt="image" src="https://github.com/user-attachments/assets/87a2f5ae-db0b-43e9-ad8a-a0b1b1f919d2" />
This program reads n integers from the user and prints them in reverse order using recursion.
The method reverse(int n, Scanner sc) reads one number x from input, then recursively processes the remaining n - 1 numbers. After the recursive call returns, it prints x. Because printing happens after recursion, the numbers are displayed in reverse order.
In main, the program first reads n, then reads n integers and outputs them in reverse sequence.

Part 3. Recursion with Strings

Task 8
<img width="1120" height="639" alt="image" src="https://github.com/user-attachments/assets/3266625a-6a79-4435-a018-d90b1fdbb2e8" />
This program checks whether a given string consists only of digits using recursion.
The method isAllDigits(String s) examines the string character by character. If the string becomes empty, it returns "Yes", meaning all previous characters were digits. If the first character is not a digit, it immediately returns "No". Otherwise, it recursively checks the rest of the string using s.substring(1).
In main, the program tests two strings: "123456" returns "Yes", while "123a12" returns "No".

Task 9
<img width="1092" height="551" alt="image" src="https://github.com/user-attachments/assets/e5e3abc1-ba00-4b4b-b293-3607260caea4" />
This program calculates the length of a string using recursion.
The method length(String s) counts characters one by one. If the string is empty, it returns 0 (base case). Otherwise, it removes the first character using s.substring(1) and adds 1 to the result of the recursive call.
In main, the program prints the lengths of "hello" and "recursion", which are 5 and 9.

Task 10
<img width="1265" height="581" alt="image" src="https://github.com/user-attachments/assets/5c7881c5-ef8f-4976-a792-0d4fb676c4dd" />
This program calculates the Greatest Common Divisor (GCD) of two numbers using recursion.
The method gcd(int a, int b) uses the Euclidean algorithm. If b is 0, it returns a as the result. Otherwise, it recursively calls itself with b and the remainder of a % b, gradually reducing the problem until the base case is reached.
In main, the program prints the GCD of 32 and 48 (which is 16), and the GCD of 10 and 7 (which is 1).

Conclusion

These tasks demonstrate the use of recursion in solving a variety of fundamental programming problems. Across all examples, recursion is used to break complex problems into smaller subproblems until a base condition is reached, which stops the recursive calls.
The programs show different applications of recursion, including processing numbers digit by digit, working with arrays (sum and average), checking mathematical properties (prime numbers and GCD), performing mathematical computations (factorial, power, Fibonacci sequence), and handling strings (length calculation, digit validation). One task also demonstrates recursion with user input to reverse the order of elements.
Overall, these exercises highlight how recursion can be an effective technique for simplifying problem-solving and improving logical thinking in programming.
