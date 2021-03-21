n=int(input("Enter the number to find its factor:"))
print("The factors are:")
for i in range(1,n+1):
    if n%i==0:
        print(i,end=" ")