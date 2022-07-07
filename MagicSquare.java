import java.io.*;
class magic_square
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a odd no");
        int n=Integer.parseInt(br.readLine());
        int sum,x,y,count;
        int a[][]=new int[n+1][n+1];
        count=1;
        x=1;
        y=n/2;
        a[x][y]=count;
        count++;
        for(int i=1;i<=n*n-1;i++)
        {
            x=x-1;
            y=y+1;
            if(x==0 && y==n)
            {
                x=x+2;
                y=y-1;
            }
            if(x==0 && y!=n)
            {
                x=n;
            }
            if(x!=0 && y==n)
            y=0;
            if(a[x][y]!=0)
            {
                x=x+2;
                y=y-1;
            }
            a[x][y]=count;
            count++;
        }//iloop
        
       System.out.println("MAGIC SQUARE FOR"+n+"x"+n);  
for(int j=1;j<=n;j++)
{
    
    for(int k=0;k<=n-1;k++)
    System.out.print(a[j][k]+"\t");
    System.out.println();
}//jlooop

//sum of rows
for(int i=1;i<=n;i++)
{
    sum=0;
    System.out.print("sum of row:"+i+" = ");
    for(int j=0;j<=n-1;j++)
    sum+=a[i][j];
    System.out.println(+sum);
}//i loop

//for columns
for(int i=0;i<=n-1;i++)
{
    sum=0;
    System.out.print("sum of column:"+(i+1)+" = ");
    for(int j=1;j<=n;j++)
     sum+=a[j][i];
    System.out.println(+sum);
}//i loop
    
//left diagonal
sum=0;
x=0;
y=-1;
for(int i=1;i<=n;i++)
{
    x=x+1;
    y=y+1;
    sum+=a[x][y];
}
System.out.println("sum of left diagonal = "+sum);

//right diagonal
sum=0;
x=0;
y=n;
for(int i=1;i<=n;i++)
{
    x=x+1;
    y=y-1;
    sum+=a[x][y];
}
System.out.println("sum of right diagonal = "+sum);
}//main
}//class
