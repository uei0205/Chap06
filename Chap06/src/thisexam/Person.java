package thisexam;

public class Person {
	String name;
	int age;
	
	//����Ʈ ������
	public Person() {
		//�ν��Ͻ� ������ �ʱ�ȭ�� �۾��� ����
//		name = "����"; //������ �ν��Ͻ��� ��� ������ ������ �Ǳ� ������ ���ɼ��� �����Ƿ� (����)
//		age = 1;
		//������ ���ο� �� �ٸ� �����ڸ� ȣ���Ͽ� ��� ������ �ʱ�ȭ�Ѵ�. 
		this("����", 1); // �ݵ�� ù ��° �ٿ� ����ؾ� ������ ���Ѵ�. 
	}
	
	//�Ű����� ������ : �ʱ�ȭ�� ��� ������ �Ű������� �����ϴ� ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age; //�̰� �־��� �� �ش��ϴ� ����� ���ܳ�
	}
	
	// �ڽ��� ��ȯ�ϴ� �޼���
	public Person returnSelf() {
		return this;
	}

	
}
