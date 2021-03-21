str=input("Enter a string:")
t=str[0]
l=len(str)
str=str.replace(t,"$")
str=t+str[1:]
print("String after replacement:",str)
