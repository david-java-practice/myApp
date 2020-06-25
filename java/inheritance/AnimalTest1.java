package inheritance;
class Animal{
	public void move()
	{
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move()
	{
		System.out.println("����� �� �߷� �Ƚ��ϴ�. ");
	}
	
	public void readBook()
	{
		System.out.println("����� å�� �н��ϴ�. ");
	}
}

class Tiger extends Animal{
	public void move()
	{
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�. ");
	}
	
	public void hunting() 
	{
		System.out.println("ȣ���̰� ����� �մϴ�. ");
	}
}

class Eagle extends Animal{
	public void move()
	{
		System.out.println("�������� �ϴ��� ���ϴ� ");
	}
	
	public void flying() 
	{
		System.out.print("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}
}

public class AnimalTest1 {
	
	 public static void main(String[] args) {
		  AnimalTest1 aTest = new AnimalTest1();
		   aTest.moveAnimal(new Human());
		  aTest.moveAnimal(new Tiger());
		  aTest.moveAnimal(new Eagle());
		  
		  Human h = new Human();
		  if(h instanceof Animal) {
			  System.out.println("�´�");
		  }else {
			  System.out.println("Ʋ����");
		  }
		  Animal a = new Animal();
		  if(a instanceof Human) {
			  System.out.println("�´�11");
		  }else {
			  System.out.println("Ʋ����11");
		  }
			
	 }

	 public void moveAnimal(Animal animal) { //�Ű� ������ �ڷ����� ���� Ŭ����
		  animal.move();                     //������ �� �޼��� ȣ��
	 }   

}