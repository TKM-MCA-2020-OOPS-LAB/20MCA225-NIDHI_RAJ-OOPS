ip=input("Enter a word:")
if ip[-3:]=="ing":
    ip+="ly"
else:
    ip+="ing"
print("After changing the word is:",ip)
