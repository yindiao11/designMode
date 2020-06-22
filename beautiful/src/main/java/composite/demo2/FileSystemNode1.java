package composite.demo2;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public abstract class FileSystemNode1 {
    protected String path;

    public FileSystemNode1(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}



