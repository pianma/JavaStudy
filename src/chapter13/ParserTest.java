package chapter13;

public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("korean");
		parser.parse("�ѱ������� ����ִ� ����.pdf");
		
		parser = ParserManager.getParser("english");
		parser.parse("���������� ����ִ� ����.pdf");
	}

}
