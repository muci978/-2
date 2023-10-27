package structure4;

import java.io.IOException;

/**
 * @Auther li hong you
 * @Date 2023/10/24
 * @Description 软件体系结构实验 202131060518
 */

public abstract class Filter {
    protected Pipe input;
    protected Pipe output;

    public Filter(Pipe input, Pipe output) {
        this.input = input;
        this.output = output;
    }
    protected abstract void transform() throws IOException;
}
