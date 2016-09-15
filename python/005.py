# 2520 is the smallest number that can be divided by each of the numbers
# from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly divisible by all of
# the numbers from 1 to 20?
#
# Answer: 232792560
# -ms

ranges = []
rangeLimit = 10
output = 1

def divisibleByRange(n):
    for i in range(0, len(ranges) - 1):
        if n % ranges[i] != 0:
            return False
    return True

# Assigns all values from 1 to limit to an array
for i in range(0, rangeLimit):
    ranges.append(i + 1)

# Checks if given number is divisible by numbers 1 to rangeLimit
while not divisibleByRange(output):
    output += 60

# Output number divisible by numbers 1 to rangeLimit
print(output)
