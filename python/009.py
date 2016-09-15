# A Pythagorean triplet is a set of three natural numbers, a < b < c
# for which, a2 + b2 = c2.
#
# For example, 32 + 42 = 9 + 16 = 25 = 52
# There exists exactly one Pythagorean triplet for which a + b + c = 1000
# Find the product abc.
#
# Answer: 31875000
# -ms

limit = 1000
hello = False

for a in range(0, int(limit / 3)):
    for b in range(0, int(limit / 2)):
        if b <= a:
            continue

        for c in range(0, limit):
            if c <= b:
                continue

            if a**2 + b**2 == c**2:
                if a + b + c == limit:
                   print(a * b * c)
                   hello = True
            if hello:
                break
        if hello:
            break
    if hello:
        break
