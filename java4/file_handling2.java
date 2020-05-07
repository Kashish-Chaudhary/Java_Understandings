import java.io.*;
class file_handling2
{
public static void main(String args[]) throws IOException
{
FileReader f=new FileReader("ABC.txt");
StreamTokenizer st=new StreamTokenizer(f);
int c=0;
st.eolIsSignificant(true);
while(st.nextToken()!=StreamTokenizer.TT_EOF)
{
System.out.println("line no."+st.lineno());

if(st.ttype==StreamTokenizer.TT_NUMBER)
System.out.println("Number="+(int)(st.nval));
else if(st.ttype==StreamTokenizer.TT_WORD)
System.out.println("Word="+st.sval);
else if(st.ttype==StreamTokenizer.TT_EOL)
c=st.lineno();
}
System.out.println("count"+c+" "+StreamTokenizer.TT_EOF);



}
}