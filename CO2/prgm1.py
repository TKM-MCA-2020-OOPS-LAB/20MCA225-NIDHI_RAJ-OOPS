fact=1
n=int(input("Enter the number to find its factorial "))
if n<0:
    print("Factorial for -ve numbers not possible")
elif n==0:
    print("Factorial of 0 is 1")
else:
    for i in range(1,n+1):
        fact=fact*i
print("The factorial of ",n ,"is ",fact)
