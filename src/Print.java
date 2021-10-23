public class Print {


    public static void print(String input) {

        ChecksAndImports checksAndImports = new ChecksAndImports();
        checksAndImports.importOfFile();

        if (!checksAndImports.validIP(input)) {
            System.out.println("Invalid IP address");

        } else if (!checksAndImports.chekIpInFile(input, checksAndImports.getListOfIP())) {
            System.out.println("Access disallowed");

        } else {
            System.out.println("Access allowed");
        }


    }
}
