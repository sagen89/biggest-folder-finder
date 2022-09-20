import java.io.File;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
//        TODO команда в терменале для:
//                  выбора папки cd Desktop
//                  вывода файлов в консоль ls
//                  определения размера в раннее выбранной папке du -sh ./*
//        Files.walkFileTree();

        String folderPath = "data";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));
    }
    public  static long getFolderSize(File folder){
        if (folder.isFile()) {
            return folder.length();
        }
        File[] files = folder.listFiles();
        long sum = 0;
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return  sum;
    }
}
