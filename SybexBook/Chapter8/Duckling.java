public class Duckling {
    public static void makeSound(String sound) {
        // satisfying the LearnToSpeak functional interface, by passing in a lambda
        //LearnToSpeak learner = s -> System.out.println(s);// satisfying the LearnToSpeak functional interface, by passing in a lambda

        // satifying the LearnToSpeak functional interface, by passing in a method reference
        LearnToSpeak learner = System.out::println;

        DuckHelper.teacher(sound, learner);
    }
}
