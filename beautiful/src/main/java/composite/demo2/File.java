package composite.demo2;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public class File extends FileSystemNode1 {
    public File(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        java.io.File file = new java.io.File(path);
        if (!file.exists()) return 0;
        return file.length();
    }
}
