#!/bin/python3

import math
import os
import random
import re
import sys


if __name__ == '__main__':
    n = int(input().strip())
    aux = ""
    if(n % 2 != 0):
        aux = "Weird"
    elif(n in range(2, 6)):
        aux = "Not Weird"
    elif(n in range(6, 21)):
        aux = "Weird"
    elif(n > 20):
        aux = "Not Weird"

    print(aux)
