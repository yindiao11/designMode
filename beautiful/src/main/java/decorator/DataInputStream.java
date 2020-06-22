package decorator;

import java.io.IOException;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */

public class DataInputStream extends InputStream {
    protected volatile InputStream in;

    protected DataInputStream(InputStream in) {
        this.in = in;
    }

    @Override
    protected void f() {

    }

    @Override
    protected int read() throws IOException {
        return 0;
    }

    //...实现读取基本类型数据的接口
}