#https://open.kattis.com/problems/threepowers

import sys
from sys import stdin

n = int(stdin.readline())
# end program when 0 is read
while n != 0:
    subset = []
    subsetStr = "{ "

    if n == 1:
        subsetStr += "}"
    else:
        #Compute a binary representation of the nth-1 position
        binaryStr = bin(int(n)-1)[2:]
        numberOfDigits = len(binaryStr)
        i = 0

        numberOfDigits = len(binaryStr)
        while i < numberOfDigits:
            if binaryStr[numberOfDigits - 1 - i] == "1":
                subset.append(3**i)
            i += 1

        if len(subset) == 1:
            subsetStr += "%d }" % (subset[0])
        else:
            subsetStr += str(subset[0])
            i = 1
            while i < len(subset):
                subsetStr += ", %d" % (subset[i])
                i += 1
            subsetStr += " }"

    print(subsetStr)
    n = int(stdin.readline())
