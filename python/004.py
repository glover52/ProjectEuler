# A palindromic number reads the same both ways. The largest palindrome
# made from the product of two 2-digit numbers is 9009 = 91 * 99. Find the
# largest palindrome made from the product of two 3-digit numbers.
#
# Answer: 906609

import math

n = 9999
current = 0
palin = []

exit = False
for i in range(n, int(n * .9), -1):
    for j in range(n, int(n * .9), -1):
        string = str(i * j)
        if string[::-1] == string[::1]:
            palin.append(i * j)
            print("n: " + str(i * j) + " i: " + str(i) + " j: " + str(j))

print(max(palin))
