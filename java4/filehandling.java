import java.io.*;
class filehandling
{
	public static void main(String chaudhary[])
	{
		try{
			File f=new File("java1");
			f.mkdir();
				System.out.println(f.exists());
			File f1=new File("java1","java2");
			f1.createNewFile();
				System.out.println(f1.exists());
			File f2=new File("java1","java3");
			f2.createNewFile();
			File f3=new File("java1","java4");
			f3.mkdir();
			String l[]=f.list();
			System.out.println(l.length+"\nfiles in f are:\n");
			for(String l1:l)
			{
				File f5=new File(f,l1);
				if(f5.isFile())
				System.out.println(l1);
			}System.out.println("\ndirectory in f are:\n");
			for(String l1:l)
			{
				File f5=new File(f,l1);
				if(f5.isDirectory())
				System.out.println(l1);
			}
		}
		catch(IOException e){}


	}

}