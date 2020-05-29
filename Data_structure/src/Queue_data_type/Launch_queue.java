package Queue_data_type;

import java.util.Scanner;

public class Launch_queue {

	public static void main(String[] args) {
		queue x = new queue();
		int choice;
		while (true) {
			System.out.println("Press 1 to insert");
			System.out.println("Press 2 to delete");
			System.out.println("Press 3 to display");
			System.out.println("Press 4 to stop");
			System.out.println("Enter your choice");
			Scanner kb = new Scanner(System.in);
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				x.insert();
				break;
			case 2:
				x.delete();
				break;
			case 3:
				x.display();
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}
}

class queue {
	int q[] = new int[5];
	int size = 5;
	int front = 0;
	int rear = -1;

	public void insert() {
		int item;

		if (rear == size - 1) {
			System.out.println("insertion is not possible");
		} else {
			System.out.println("Enter the item to be insurted");
			Scanner kb = new Scanner(System.in);
			item = kb.nextInt();
			++rear;
			q[rear] = item;
		}
	}

	public void delete() {
		if (front > rear) {
			System.out.println("Deletion is not possible");
		} else {
			System.out.println("Element deleted" + q[front]);
			++front;

		}
	}

public void display()
{
	if(front>rear)
	{
		System.out.println("Display is not possible");
		
	}
	else
	{
		for(int i=front;i<=rear;++i)
		{
			System.out.println(q[i]);
			
		}
	}

}
}
