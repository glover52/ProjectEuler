# The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
# factor of the number 600851475143?
#
# Answer: 6857

import math

primes = [2]
input = 600851475143
factor = 0

def isprime(number):
    if len(primes) <= math.sqrt(number):
        return True

    for n in range(0, int(number**.5)):
        if number % primes[n] == 0:
            return False

    return True

for i in range(3, int(input**.5), 2):
    if isprime(i):
        primes.append(i)

        if input % i == 0:
            factor = i

print(factor)
