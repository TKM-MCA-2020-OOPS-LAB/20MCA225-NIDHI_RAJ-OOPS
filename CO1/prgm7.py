l1=[1,2,3,4,20,5]
l2=[5,6,7,8,9]
len1=len(l1)
len2=len(l2)
if len1==len2:
  print("The 2 lists are of equal lengths")
else:
    print("Not of equal lengths")
s1=sum(l1)
s2=sum(l2)
l3=[]
f=0
if(s1==s2):
    print("The 2 lists sum are equal")
else:
    print("Sum's are not equal")
for x in l1:
    for y in l2:
        if x==y:
          f=f+1
          l3.append(x)
if(f!=0):
  print("The common elements are:",l3)
else:
    print("No common elements")