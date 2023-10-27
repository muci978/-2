package structure3;

/**
 * @Auther li hong you
 * @Date 2023/10/24
 * @Description 软件体系结构实验 202131060518
 */

public class ProgramD {
        public void run(String path1,String path2) {
            //创建主题
            KWICSubject kwicSubject = new KWICSubject();
            //创建观察者
            Input input = new Input(path1);
            Shift shift = new Shift(input.getLineTxt());
            Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
            Output output = new Output(alphabetizer.getKwicList(), path2);

            // 将观察者加入主题
            kwicSubject.addObserver(input);
            kwicSubject.addObserver(shift);
            kwicSubject.addObserver(alphabetizer);
            kwicSubject.addObserver(output);
            // 逐步调用各个观察者
            kwicSubject.startKWIC();
        }
}
