input1 = input()
m = set(map(int, input().split()))

input2 = input()
n = set(map(int, input().split()))

finalList = sorted(m.symmetric_difference(n))
[print(i) for i in finalList]
