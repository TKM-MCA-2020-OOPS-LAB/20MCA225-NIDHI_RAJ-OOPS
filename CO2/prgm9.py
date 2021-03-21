n=5
for i in range(0,n):
    for j in range(1,i+1):
      print("*",end=" ")
    print("\n")
for k in range(n,0,-1):
    for l in range(k+1,0,-1):
        print("*",end=" ")
    print("\n")
