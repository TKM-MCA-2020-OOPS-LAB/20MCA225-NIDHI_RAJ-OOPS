color_list1=['red','yellow','blue','green']
color_list2=['black','red','violet']
l=[]
for i in color_list1:
    if i not in color_list2:
           l.append(i)
print("The colors in list1 which are not in list2:",l)