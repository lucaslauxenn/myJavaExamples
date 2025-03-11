

public class UsingLambda {
    public static void main(String[] args) {


        // Implementing the 'greetings()' method from the functional interface
        // with a Lambda expression.
        FunctionalWelcome implementedMethod = () -> System.out.println("Welcome");

        /* Java implicitly instantiate an anonymous class which overrides the interface method.

           Implicitly code executed dynamically by Java at runtime:
               --------------------------------------------------------------------
               FunctionalGreetings implementedMethod = new FunctionalGreetings() {
                    @Override
                    void Greetings() {
                        System.out.println("Greetings");
                    }
               };
               --------------------------------------------------------------------*/

        implementedMethod.welcome();   //Calling the method.
    }
}