if __name__ == '__main__':
    studentScoreList = []
    for i in range(int(input())):
        name = input()
        score = float(input())
        studentScoreList.append([name, score])

    #Convert in dict
    studentScoreList = dict(studentScoreList)

    # Delete duplicate & sort
    unique = sorted(set(studentScoreList.values()))

    # obtain 2 lowest score and find student's name with this score
    secondLowest = unique[1]
    studentsNewList = [name for name, score in sorted(
        studentScoreList.items()) if score == secondLowest]
    [print(name) for name in studentsNewList]
