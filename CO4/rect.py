class rect:
 __len=0
 __bre=0
 __area=0
 def __init__(self,l,b):
  self.__len=l
  self.__bre=b
 def rect_area(self):
  self.__area=self.__len+self.__bre
 def __gt__(self,other):
  if(self.__area>other.__area):
    return True
  else:
    return False

r1=rect(2,4)
r1.rect_area()
r2=rect(4,6)
r2.rect_area()
if(r1 > r2):
	print("R1 greater than R2")
else:
	print("R2 greater than R1")
