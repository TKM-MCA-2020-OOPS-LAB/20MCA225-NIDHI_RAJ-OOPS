names=[]
n=int(input("Enter the number of names:"))
a_c=0
for i in range(n):
  name=input("Enter a name:")
  names.append(name)
ch=input("Enter letter to be counted:")
for name in names:
    count=name.count(ch)
    a_c+=count
print(a_c)