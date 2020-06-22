package decorator;

import java.io.IOException;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public class BufferedInputStream extends InputStream {
    protected volatile InputStream in;

    protected BufferedInputStream(InputStream in) {
        this.in = in;
    }

    //...实现基于缓存的读数据接口...
    // f()函数不需要增强，只是重新调用一下InputStream in对象的f()
    public void f() {
        in.f();
    }

    @Override
    protected int read() throws IOException {
        return 0;
    }
}