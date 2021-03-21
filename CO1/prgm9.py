str=input("Enter a string:")
newlist=list(str)
store= newlist[0], newlist[-1]
newlist[0]=store[1]
newlist[-1]=store[0]
print("String after replacement:")
print(''.join(newlist))