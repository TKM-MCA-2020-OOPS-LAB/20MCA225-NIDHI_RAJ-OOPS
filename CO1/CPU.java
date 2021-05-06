public class CPU
{
  int attribute;
  CPU(int a)
  {
	  this.attribute=a;
  }
  void discpu()
  {
	  System.out.println("Attribute :"+this.attribute);
  }
  public static class Processor
  {
	  int noc;
	  String man;
	  Processor(int c,String m)
	  {
		  this.noc=c;
		  this.man=m;
	  }
	  void dispro()
	  {
		System.out.println("No of cores :"+this.noc+"\nManufacturer of Processor:"+this.man);
      }
  }
  static class RAM
  {
   int memory;
   String Manufacturer;
   RAM(int mem, String m)
   {
     this.memory=mem;
     this.Manufacturer=m;
   }
   void disRAM()
   {
     System.out.println("Memory :"+this.memory+"\nManufacturer of RAM:"+this.Manufacturer);	   
   }
  }
  public static void main(String args[])
  {
	  CPU i=new CPU(10000);
	  CPU.Processor p=new CPU.Processor(4,"AMD");
	  CPU.RAM r=new CPU.RAM(256,"Asus");
	  System.out.println("Details are as follows:");
	  i.discpu();
	  p.dispro();
	  r.disRAM();
  }
}
