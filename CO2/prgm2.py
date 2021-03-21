n=int(input("Enter the no of terms:"))
n1=0
n2=1
c=0
if n<0:
    print("Enter +ve integers")
elif n==1:
    print ("0")
else:
   print("The fibanocci series is:") 
   while c<n:
       print(n1)
       temp=n1+n2
       n1=n2
       n2=temp
       c=c+1

