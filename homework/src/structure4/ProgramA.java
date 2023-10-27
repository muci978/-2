package structure4;

import java.io.File;
import java.io.IOException;

/**
 * @Auther li hong you
 * @Date 2023/10/24
 * @Description 软件体系结构实验 202131060518
 */

public class ProgramA {
    public void run(String path1,String path2) throws IOException {
        File inFile = new File(path1);
        File outFile = new File(path2);
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

    }
}
