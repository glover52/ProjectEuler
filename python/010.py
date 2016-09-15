# The sum of the primes below 10 is "2 + 3 + 5 + 7 = 17"
# Find the sum of all the primes below two million.
# Answer: 142913828922
# 943ms
import time
start = time.time()

limit = 2000000

primes = []
for i in range(0, limit):
    primes.append(True)

for i in range(2, int(limit**0.5) + 1):
    if primes[i]:
        for j in range(i**2, limit, i):
            primes[j] = False

output = 0
for i in range(2, limit):
    if primes[i]:
        output += i

print(output)
print('%dms' % (1000 * (time.time() - start)))
