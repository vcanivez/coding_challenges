#https://open.kattis.com/problems/r2
import sys
from sys import stdin

line = stdin.readline()
rs = line.split()
r = rs[0]
s = rs[1]

print(int(s)*2-int(r))
