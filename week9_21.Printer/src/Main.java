
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        //Printer t = new Printer("src/textfile.txt");
        Printer t = new Printer("src/kalevala.txt");
//        t.printLinesWhichContain("vanha");
        t.printLinesWhichContain("putoelevat");
        t.printLinesWhichContain("koe");

    }
}
