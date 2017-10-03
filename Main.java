class Shop
{
int p;
int f=0;
synchronized void put(int i)
{
try
{
if(f==1)
wait();
p=i;
f=1;
System.out.println("Producer="+p);
notify();
}
catch(InterruptedException ie){}
}
synchronized int get()
{
try
{
if(f==0)
wait();
f=0;
notify();
}
catch(InterruptedException ie){}
return(p);
}
}
class Producer extends Thread
{
Shop s;
Producer(Shop s)
{
this.s=s;
}
public void run()
{
int i=1;
try
{
while(true)
{
s.put(i);
i++;
sleep(300);
}
}catch(Exception e){}
}
}
class Consumer extends Thread
{
Shop s;
Consumer(Shop s)
{
this.s=s;
}
public void run()
{
try
{
while(true)
{
System.out.println("Consumer="+s.get());
sleep(300);
}
}
catch(InterruptedException ie){}
}}
class Main
{
public static void main(String arg[])
{
Shop s=new Shop();
Producer p=new Producer(s);
Consumer c=new Consumer(s);
p.start();
c.start();
}
}