import java.util.Scanner;
class Stack
{
	static Scanner sc=new Scanner(System.in);
	static int stack[],top=-1,size,item;
	static
	{
		create();
	}
	public static void main(String[] args)
	{
		int ch;
		while(true)
		{
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.println("4.Traverse");
		System.out.println("Enter your choice:");

		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter the Element ");
			item=sc.nextInt();
			 push(item);
			 System.out.println("The Pushed item is:"+item);
			break;
			case 2:
					pop();
			if(item==0)
			{
				System.out.println("Stack is underflown");
			}
			else
			{
				System.out.println("Popped item:"+item);
			}
			break;
			case 3:peek();
			if(item==0)
			{
				System.out.println("Stack is underflown");
			}
			else
			{
				System.out.println("Peek item:"+item);
			}
			break;
			case 4:traverse();
			break;
			case 5:System.exit(1);
			break;
			default:
			System.out.println("Invalid Choice");
		}
	}
}
	static void create()
	{
		int size;
		System.out.print("Enter size of the stack");
		size=sc.nextInt();
		stack=new int[size];
		System.out.println("Stack created with size:"+size);
	}
	static void push(int item)
	{
		if(isFull())
		{
			System.out.println("Stack is OverFlown");
		}
		else
		{
			stack[++top]=item;
		}
	}
	static boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static int pop()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			return stack[top--];
		}
	}
	static int peek()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			return stack[top];
		}
	}
	static boolean isEmpty()
	{ 
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static void traverse()
	{
			if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Element of the stack");
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			} 
		}
	}
}