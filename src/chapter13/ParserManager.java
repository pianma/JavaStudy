package chapter13;

//�� ���� �����⸦ ������ִ�Ŭ����
public class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("krean")) {
			return new KoreanParser();
		}else {
			return new EnglishParser();
			
		}
	}

}
