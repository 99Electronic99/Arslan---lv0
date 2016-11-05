
public class POTATO {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			speak(Integer.toString(i));
			speak("Potato");

		}
		speak("four");

		for (int i = 5; i <= 7; i++) {
			speak(Integer.toString(i));
			speak("Potato");

		}
		speak("more");

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}