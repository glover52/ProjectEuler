# If we list all the natural numbers below 10 that are multiples of 3 or 5,
# we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of
# all the multiples of 3 or 5 below 1000.
#
# Answer: 233168
#

max = 10
out = 0

# Check number(s) within specified range
for n in range(3, max):
    # If n is multiple of three or five
    if n % 3 == 0 or n % 5 == 0:
        # Increment total by n
        out += n

# Output total sum
print(out)
