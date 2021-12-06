package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes >>> not anymore after changing "else if" to "if"
        //nf.find(new int[] {4, 3, 2, 1});

        //null and decimal return    error
        //literal returns ASCII value
        nf.find(new  int[] {5, 'A', 10, -7});

        System.out.println("Largest: " + nf.getLargest());
        System.out.println("Smallest: " + nf.getSmallest());
    }
}
