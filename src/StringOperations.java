public class StringOperations {
    public static void StrOp() {
        String inputString = "I like Java!!!";
        System.out.println("Строка " + inputString);

        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит подстроку \"Java\": " + containsJava);

        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается с подстроки \"I like\": " + startsWithILike);

        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается подстрокой \"!!!\": " + endsWithExclamation);

        if (containsJava && startsWithILike && endsWithExclamation) {
            String upperCaseString = inputString.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseString);
        }

        String replacedString = inputString.replace('a', 'o').substring(7,11);
        System.out.println("Замена символов 'a' на 'o': " + replacedString);
    }
}
