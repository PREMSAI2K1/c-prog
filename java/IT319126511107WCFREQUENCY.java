import java.util.HashMap;
public class IT319126511107WCFREQUENCY
{
public static void main(String args[])
{
String st="Python is an object-oriented programming language";

HashMap<Character,Integer>freq=new HashMap<>();
for(int i=0;i<st.length();i++)
{
Character ch=st.charAt(i);
if(freq.containsKey(ch))
{
int count = freq.get(ch);
freq.put(ch,count+1);
}
else
{
freq.put(ch,1);
}
}
System.out.println(freq);

String a[] = st.split(" ");
HashMap<String,Integer> word = new HashMap<>();
for(String str : a) 
{
if(word.containsKey(str))
{
word.put(str, 1 + word.get(str));
} 
else 
{
word.put(str, 1);
}
}
System.out.println(word);
}
}