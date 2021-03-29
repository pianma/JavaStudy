package chapter13;

//언어에 따른 번역기를 만들어주는클래스
public class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("krean")) {
			return new KoreanParser();
		}else {
			return new EnglishParser();
			
		}
	}

}
