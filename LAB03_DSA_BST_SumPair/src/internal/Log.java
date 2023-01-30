package internal;

public class Log {

	public static boolean ENABLE = false;

	public static void log(String operationName, String message, Argument... arguments) {

		if (!ENABLE) {
			return;
		}

		StringBuilder contents = new StringBuilder();

		contents.append("[" + operationName + "]");
		contents.append(System.getProperty("line.separator"));

		String finalMessage = String.format(message, arguments);

		contents.append(finalMessage);
		contents.append(System.getProperty("line.separator"));

		System.out.println(contents.toString());
	}

	public static void lineSeparator() {

		if (!ENABLE) {
			return;
		}

		System.out.println("**************************************");
	}
}