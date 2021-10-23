import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChecksAndImports {

    private List<String> listOfIP = new ArrayList<>();

    public void importOfFile() {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/blacklist.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            String line;

            while ((line = in.readLine()) != null) {
                listOfIP.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getListOfIP() {
        return listOfIP;
    }

    public boolean validIP(String ip) {
        try {
            if (ip.equals(null) || ip.isEmpty()) {
                return false;
            }

            String[] parts = ip.split("\\.");
            if (parts.length != 4) {
                return false;
            }

            for (String s : parts) {
                int i = Integer.parseInt(s);
                if ((i < 0) || (i > 255)) {
                    return false;
                }
            }
            if (ip.endsWith(".")) {
                return false;
            }

            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }

    public boolean chekIpInFile(String ip, List<String> listOfIP) {
        if (listOfIP.contains(ip)) {
            return true;
        } else {
            return false;
        }

    }
}


