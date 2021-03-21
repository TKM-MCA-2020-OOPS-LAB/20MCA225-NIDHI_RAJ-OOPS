class Publisher:
    def __init__(self,pubname):
        self.pubname=pubname
    def display(self):
        print("Publisher Name : ",self.pubname)
class Book(Publisher):
    def __init__(self,pubname,title,author):
        Publisher.__init__(self,pubname)
        self.title=title
        self.author=author

    def display(self):
        print("Title : ",self.title)
        print("Author : ",self.author)
class Python(Book):
    def __init__(self,pubname,title,author,price,no_of_pages):
        Book.__init__(self,pubname,title,author)
        self.price=price
        self.no_of_pages=no_of_pages
    def display(self):
        print("Price : ",self.price)
        print("Number of pages : ",self.no_of_pages)

s1=Python("Penguin Books","Adventures of Tenali Raman","Raman",100,300)
s1.display()
        
