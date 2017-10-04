import java.io.*;
import java.util.Calendar;
class calendar
{
public static void main(String args[])throws IOException
{
String months[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
Calendar c=Calendar.getInstance();
System.out.print("DATE");
System.out.println(months[c.get(Calendar.MONTH)]);
System.out.println(c.get(Calendar.DATE)+":");
System.out.println(c.get(Calendar.YEAR)+":");
System.out.print("TIME");
System.out.println(c.get(Calendar.HOUR)+":");
System.out.println(c.get(Calendar.MINUTE)+":");
System.out.println(c.get(Calendar.SECOND)+":");
c.set(Calendar.HOUR,10);
c.set(Calendar.MINUTE,29);
c.set(Calendar.SECOND,22);
System.out.print("UPDATE TIME:");
System.out.println(c.get(Calendar.HOUR)+":");
System.out.println(c.get(Calendar.MINUTE)+":");
System.out.println(c.get(Calendar.SECOND)+":");
}
}