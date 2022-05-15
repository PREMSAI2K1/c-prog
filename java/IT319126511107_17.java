class IT319126511107_17
{
    public static void main(String args[])
   {
   try{
      int a=30/0;
      System.out.println(a);
     }
   catch(Exception e)
   {
       System.out.println("Exception occured"+e);
     }
    finally{
         System.out.println("Finally block is executed");
       }
     }
}