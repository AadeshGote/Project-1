package programs;

public class Panagram 
{
 public static void main(String[] args) 
 {
   	
   	String str="THE qUiCk BrOwn fox Jumps over the lazy DOg";
   	char[]ch=str.toCharArray();
   	int[]fr=new int[ch.length];
   	int tcount=0;
   	for(int i=0; i<str.length(); i++)
   	{
   		int count=1;
   		for(int j=i+1; j<ch.length; j++)
   		{
   			if(ch[i]==ch[j]&&(ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
   			{
   				count++;
   				fr[j]=-1;
   				
   			}
   		}
   		if(fr[i]!=-1&&ch[i]!=' ')
   		{
   			fr[i]=count;
   			
   		}
   	}
   	for(int k=0; k<fr.length; k++)
   	{
   		if(fr[k]!=-1&&ch[k]!=' ')
   		{
   			tcount+=fr[k];
   		}
   	}
  String ans=(tcount>=26)?"It is a panagram":"It is not a panagram";
   	System.out.println(ans);
 }
}
