n=int(input("Enter the number of imputs:"))
l=[]
for i in range(0,n):
    ele=int(input())
    l.append(ele)
for i in range(0,n):
    if l[i]>100:
        l[i]="over"
print(l)