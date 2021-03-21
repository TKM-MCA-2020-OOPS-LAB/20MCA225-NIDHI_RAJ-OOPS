str ="Welcome to python programming. python is easy to code"
a=str.split(" ")
c=0
for i in range(0,len(a)):
    if (a[i]=="python"):
      c=c+1
print("The no of occurences of python is:",c)