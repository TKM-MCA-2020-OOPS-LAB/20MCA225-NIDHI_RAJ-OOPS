class rect:
	def __init__(self,leng,bre):
		self.l=leng
		self.b=bre
	def area(self):
		a=(self.l*self.b)
		return a
	def perimeter(self):
	    p=2*(self.l+self.b)
	    return p

a=int(input("Enter the length of rectangle 1:"))
b=int(input("Enter the breadth of rectangle 1:"))
c=int(input("Enter the length of rectangle 2:"))
d=int(input("Enter the breadth of rectangle 2:"))

ob1=rect(a,b)
ob2=rect(c,d)

print("Rectangle 1: Area=",ob1.area(),"Perimeter=",ob1.perimeter())
print("Rectangle 2: Area=",ob2.area(),"Perimeter=",ob2.perimeter())

if( ob1.area()==ob2.area()):
	print("Both have equal area")
elif (ob1.area() > ob2.area()):
	print("Rectangle 1 has greater area".ob1.area())
else:
	print("Rectangle 2 has greate area".ob2.area())