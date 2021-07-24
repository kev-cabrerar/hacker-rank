if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    uniqueList = []

    [uniqueList.append(i) for i in arr if i not in uniqueList]
    uniqueList = sorted(uniqueList)
    print(uniqueList[-2])
