import java.util.Scanner;

public class AdditionMagic {
	private String type;
	private String color;
	public AdditionMagic(String type,String color) {
		this.color=color;
		this.type=type;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public String getColor()
	{
		return color;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		int  numberOfShapes=sc.nextInt();
		AdditionMagic[] shapes=new AdditionMagic[numberOfShapes];
		for (int i = 0; i < numberOfShapes; i++) {
			String type=sc.next();
			String color=sc.nextLine();
			shapes[i]=new AdditionMagic(type, color);
		}
		int numberOfOperations=sc.nextInt();
		
	}

}
