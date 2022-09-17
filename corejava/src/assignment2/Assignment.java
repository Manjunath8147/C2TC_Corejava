package assignment2;

   class Assignment 
{
   public void methodAssignment()
   {
     System.out.println("state method");
   }
}
class city extends Assignment
{
     public void methodcity()
       {
        System.out.println("city method");
       }
}
class district extends city
{
   public void methoddistrict()
   {
     System.out.println(" district method");
   }
}
	
