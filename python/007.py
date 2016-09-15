# By listing the first six prime numbers:2, 3, 5, 7, 11, and 13, we can see
# that the 6th prime is 13.
#
# What is the 10 001st prime number?
#
# Answer: 104743
# -ms

import math

primes = [2]
limit = 13
number = 3


def isprime(n):
    for n in range(0, int(n**.5)):
        if n % primes[n] == 0:
            return False

    return True

while len(primes) <= limit:
    if isprime(number):
        print(str(len(primes)) + " + " + str(number))
        primes.append(number)

    number+=2

print(primes[limit - 1])
