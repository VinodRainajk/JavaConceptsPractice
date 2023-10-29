package CategoryProblem;

public record AnonymousClassImpl() {

    public static void main(String[] args) {
        System.out.println("Hello inside the Anonymous Class");
        int sumvar = 10;

        AnonymousInterface aI = new AnonymousInterface()
                    {
                                    @Override
                                    public int View(int incoming) {
                                        incoming =  incoming +10;
                                        System.out.println("Hello inside the Anonymous Inteface" +incoming);
                                        return incoming;
                                    }
                    };

        System.out.println(aI.View(sumvar));
        System.out.println(sumvar);

    }
}
