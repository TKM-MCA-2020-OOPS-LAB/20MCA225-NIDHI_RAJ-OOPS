class Time:
 __sec=0
 __min=0
 __hr=0

 def __init__(self,h,m,s):
  self.__hr=h
  self.__min=m
  self.__sec=s

 def __add__(self,other):
   self.__hr+=other.__hr
   self.__min+=other.__min
   self.__sec+=other.__sec
   if(self.__sec >= 60):
     extra_m=int(self.__sec/60)
     self.__sec=self.__sec%60
     self.__min+=extra_m
   if(self.__min>=60):
     extra_h=int(self.__min/60)
     self.__min=self.__min%60
     self.__hr+=extra_h

   return "Hours:"+str(self.__hr)+" Minutes:"+str(self.__min)+" Seconds:"+str(self.__sec)
  
t1=Time(1,2,12)
t2=Time(3,10,49)
print(t1+t2)
