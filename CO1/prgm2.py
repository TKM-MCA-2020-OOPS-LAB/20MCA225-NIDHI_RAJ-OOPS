l=int(input("Enter the last year"))
print("The leap years are:")
for i in range(2021,l+1):
    if i%4==0:
       print(i)
