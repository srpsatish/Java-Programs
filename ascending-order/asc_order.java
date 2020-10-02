class asc_order
{ public static void main (String args[])
{ int i, j, z;
  int n = args.length;
  int a[] =new int[n];
  for(i=0; i<n; i++)
   { a[i]=Integer.parseInt(args[i]);}
  for(i=0; i<n; i++) 
   {
    for(j=i+1; j<n; j++) 
     {
      if (a[i] > a[j]) 
       {
        z = a[i];
        a[i] = a[j];
        a[j] = z;
       }
     }
   }
  for(i=0; i<n; i++) 
   {
    System.out.print(a[i] + " ");
   }
 }}