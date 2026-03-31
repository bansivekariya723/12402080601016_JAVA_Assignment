import java.io.File;

class Main6 {
    public static void main(String[] args) {
        File dir = new File(".");

        File[] files = dir.listFiles();

        for (File f : files) {
            if (f.isFile())
                System.out.println("File: " + f.getName());
            else
                System.out.println("Folder: " + f.getName());
        }
    }
}