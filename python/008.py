# The four adjacent digits in the 1000-digit number that have the
# greatest product are 9 * 9 * 8 * 9 = 5832
#
# < 1000-digit number listed in 008.in >
#
# Find the thirteen adjacent digits in the 1000-digit number that
# have the greatest product. What is tha value of this product?
#
# Answer: 23514624000
# -ms

largest = 0
adj = 13
counter = 0

with open("input/008.in", "r") as inputFile:
    # Hold all the numbers and remove newline characters
    lines = inputFile.read().replace("\n", "")

for a in range(0, len(lines) - adj):
    current = 1
    for b in range(0, adj):
        # Removes unnecessary number from product
        if int(lines[a + b]) <= 3:
            a += b
            break

        # Multiply the working number
        current *= int(lines[a + b])

    # Compare largest fond number to current working number
    largest = max(largest, current)

# Output final number
print(largest)
