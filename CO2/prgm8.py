def longestword(word):
    final=[]
    for i in word:
        final.append((len(i),i))
    final.sort()
    print("The longest word in the list is:",final[-1][1]," and its length is:",len(final[-1][1]))

a=[]
n=int(input("Enter the no of words:"))
for i in range(0,n):
    w=input("Enter the word:")
    a.append(w)
longestword(a)