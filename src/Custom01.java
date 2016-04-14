public class Custom01 {
    /*
     * This is a custom problem that was asked during a recent class discussion.
     *
     * Given Strings 'a' and 'b', check if the letters within string 'a' can be made
     * up using ALL the letters in string 'b', and ake it return true if b is a subset
     * of a.
     * ie: A = Cat, B = at
     */
    private String a, b;

    public static void main(String[] args) {
        // Record current system time for efficiency findProduct
        final long start = System.currentTimeMillis();

        // Create custom problem object
        Custom01 problem = new Custom01("Cat", "cat");

        // Check if string B is a subset of A
        if(problem.string_Is_Subset())
            System.out.println(problem.getA() + " can be made using " + problem.getB());

        else
            System.out.println("Can't be made with given characters!");

        // Output difference in time to console
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public Custom01(String a, String b) {
        this.a = a;
        this.b = b;
    }

    private boolean string_Is_Subset() {
        // If A is less than B, then B can not be contained in A
        if(a.length() < b.length())
            return false;

        // Convert A & B to lowercase and check if A contains a character in B
        for(int i = 0; i < b.length(); ++i)
            if(!a.toLowerCase().contains(b.toLowerCase().substring(i, i + 1)))
                return false;

        return true;
    }

    private String getA() {
        return a;
    }

    private String getB() {
        return b;
    }


}
