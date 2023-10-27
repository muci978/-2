
import structure1.Demo1;
import structure2.ProgramC;
import structure3.ProgramD;
import structure4.ProgramA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @Auther li hong you
 * @Date 2023/10/24
 * @Description 软件体系结构实验 202131060518
 */

// 主窗口
public class TestDialog extends JFrame {
    public TestDialog() throws HeadlessException {
        setVisible(true);
        setBounds(100, 100, 400, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);
        /**
         * =================================================
         */
        // 按钮
        JButton jButton1 = new JButton("1.主程序-子程序软件体系结构");
        jButton1.setBounds(100, 50, 200, 50);
//        点击这个按钮的时候 弹出一个对话框
        jButton1.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });

        // ==================================================
        //        按钮
        JButton jButton2 = new JButton("2.面向对象软件体系结构");
        jButton2.setBounds(100, 100, 200, 50);
//        点击这个按钮的时候 弹出一个对话框
        jButton2.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog1();
            }
        });

        /**
         *
         */

        // 按钮3
        JButton jButton3 = new JButton("3.事件系统软件体系结构（以观察者模式为例）");
        jButton3.setBounds(100, 150, 200, 50);
        jButton3.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog2();
            }
        });


        // 按钮4
        JButton jButton4 = new JButton("4.管道-过滤软件体系结构");
        jButton4.setBounds(100, 200, 200, 50);
        jButton4.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog3();
            }
        });
        /**
         * ================================================
         */

        /**
         * 按钮5  程序运行按钮
         */
        JButton jButton5 = new JButton("运行代码1");
        jButton5.setBounds(10, 280, 150, 50);
        jButton5.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                Demo1 demo1 = new Demo1();
                main(null);
                System.out.println("执行了主程序-子程序体系结构代码!");
                new MyDialog();
            }
        });


        JButton jButton6 = new JButton("运行代码2");
        jButton6.setBounds(220, 280, 150, 50);
        jButton6.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                ProgramC programC = new ProgramC();
                System.out.println("执行了面向对象软件体系结构代码!");
                new MyDialog1();
            }
        });

        JButton jButton7 = new JButton("运行代码3");
        jButton7.setBounds(10, 350, 150, 50);
        jButton7.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                ProgramD programD = new ProgramD();
                System.out.println("执行了事件系统软件体系结构代码!");
                new MyDialog2();
            }
        });
        JButton jButton8 = new JButton("运行代码4");
        jButton8.setBounds(220, 350, 150, 50);
        //        点击这个按钮的时候 弹出一个对话框
        jButton8.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                ProgramA programA = new ProgramA();
                System.out.println("执行了管道-过滤器软件体系结构代码!");
                new MyDialog3();
            }
        });

        /**
         * =================================================
         */
        container.add(jButton1);
        container.add(jButton2);
        container.add(jButton3);
        container.add(jButton4);
        container.add(jButton5);
        container.add(jButton6);
        container.add(jButton7);
        container.add(jButton8);
    }

    public static void main(String[] args) {
        new TestDialog();
    }
}


// 弹窗的窗口
class MyDialog extends JDialog {
    public MyDialog() {
        setVisible(true);
        setBounds(500, 100, 500, 500);

        JLabel JLabel =  new JLabel("主程序-子程序软件体系结构");
        this.add(JLabel);
        this.add(createPanel());

        Container container = getContentPane();
        container.setBackground(Color.WHITE);
    }

    public static JComponent createPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        String content_desc = new String();
        String content_code = new String();

        content_desc = "主程序/子程序风格将系统组织成层次结构，\n包括一个主程序和一系列子程序，\n"
                + "主要用于能够将系统功能依层次分解为多个顺序执行步骤的系统。";
        content_code = "核心代码:\r\n"
                + "public static void main(String[] args) {\r\n"
                + "        demo1 kwic = new demo1();\r\n"
                + "        kwic.input(\"images and other files/input.txt\");\r\n"
                + "        kwic.shift();\r\n"
                + "        kwic.alphabetizer();\r\n"
                + "        kwic.output(\"images and other files/output.txt\");\r\n"
                + "    }";

        JTextArea desc = new JTextArea(content_desc);
        JScrollPane scroll_desc = new JScrollPane(desc);
        scroll_desc.setFont(new Font(null, Font.PLAIN, 50));
        GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
        gridBagConstraints_1.gridy = 0;//行
        gridBagConstraints_1.gridx = 0;//列
        gridBagConstraints_1.weightx = 0.2;
        gridBagConstraints_1.weighty = 0.5;
        gridBagConstraints_1.fill = GridBagConstraints.BOTH;
        panel.add(scroll_desc,gridBagConstraints_1);


        JScrollPane scroll_result = new JScrollPane(null);

        JTextArea code = new JTextArea(content_code);
        JScrollPane scroll_code = new JScrollPane(code);
        scroll_result.setFont(new Font(null, Font.PLAIN, 10));
        GridBagConstraints gridBagConstraints_3 = new GridBagConstraints();
        gridBagConstraints_3.gridy = 1;//行
        gridBagConstraints_3.gridx = 0;//列
        gridBagConstraints_3.weightx = 0.5;
        gridBagConstraints_3.weighty = 0.5;
        gridBagConstraints_3.fill = GridBagConstraints.BOTH;
        panel.add(scroll_code,gridBagConstraints_3);
        return panel;

    }


}


class MyDialog1 extends JDialog {
    public MyDialog1() {
        setVisible(true);
        setBounds(500, 100, 500, 500);

        JLabel JLabel =  new JLabel("面向对象软件体系结构");
        this.add(JLabel);
        this.add(createPanel());

        Container container = getContentPane();
        container.setBackground(Color.WHITE);
    }

    public static JComponent createPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        String content_desc = new String();
        String content_code = new String();

        content_desc = "面向对象式风格将系统组织为多个独立的对象，\n每个对象封装其内部的数据，\n并基于数据对外提供服务，\n"
                + "适用于那些能够基于数据信息分解和组织的软件系统。";
        content_code = "核心代码:\r\n"
                + "public static void main(String[] args) {\r\n"
                + "        Input input = new Input();\r\n"
                + "        input.input(\"images and other files/input.txt\");\r\n"
                + "        Shift shift = new Shift(input.getLineTxt());\r\n"
                + "        shift.shift();\r\n"
                + "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\r\n"
                + "        alphabetizer.sort();\r\n"
                + "        Output output = new Output(alphabetizer.getKwicList());\r\n"
                + "        output.output(\"images and other files/output.txt\");\r\n"
                + "    }";

        JTextArea desc = new JTextArea(content_desc);
        JScrollPane scroll_desc = new JScrollPane(desc);
        scroll_desc.setFont(new Font(null, Font.PLAIN, 50));
        GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
        gridBagConstraints_1.gridy = 0;//行
        gridBagConstraints_1.gridx = 0;//列
        gridBagConstraints_1.weightx = 0.2;
        gridBagConstraints_1.weighty = 0.5;
        gridBagConstraints_1.fill = GridBagConstraints.BOTH;
        panel.add(scroll_desc,gridBagConstraints_1);

        JScrollPane scroll_result = new JScrollPane(null);

        JTextArea code = new JTextArea(content_code);
        JScrollPane scroll_code = new JScrollPane(code);
        scroll_result.setFont(new Font(null, Font.PLAIN, 10));
        GridBagConstraints gridBagConstraints_3 = new GridBagConstraints();
        gridBagConstraints_3.gridy = 1;//行
        gridBagConstraints_3.gridx = 0;//列
        gridBagConstraints_3.weightx = 0.5;
        gridBagConstraints_3.weighty = 0.5;
        gridBagConstraints_3.fill = GridBagConstraints.BOTH;
        panel.add(scroll_code,gridBagConstraints_3);
        return panel;

    }

}

class MyDialog2 extends JDialog {
    public MyDialog2() {
        setVisible(true);
        setBounds(500, 100, 500, 500);

        JLabel JLabel =  new JLabel("事件系统软件体系结构（以观察者模式为例）");
        this.add(JLabel);
        this.add(createPanel());
        Container container = getContentPane();
        container.setBackground(Color.WHITE);
    }

    public static JComponent createPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        String content_desc = new String();
        String content_code = new String();

        content_desc = "观察者模式定义了一种一对多的依赖关系，\n让多个观察者对象同时监听某一个主题对象。\n"
                + "这个主题对象在状态变化时，\n会通知所有的观察者对象，\n使他们能够自动更新自己。\n它可以实现表示层和数据逻辑层的分离。";
        content_code = "核心代码:\r\n"
                + "public static void main(String[] args) {\r\n"
                + "        //创建主题\r\n"
                + "        KWICSubject kwicSubject = new KWICSubject();\r\n"
                + "        //创建观察者\r\n"
                + "        Input input = new Input(\"images and other files/input.txt\");\r\n"
                + "        Shift shift = new Shift(input.getLineTxt());\r\n"
                + "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\r\n"
                + "        Output output = new Output(alphabetizer.getKwicList(), \"images and other files/output.txt\");\r\n"
                + "\r\n"
                + "        // 将观察者加入主题\r\n"
                + "        kwicSubject.addObserver(input);\r\n"
                + "        kwicSubject.addObserver(shift);\r\n"
                + "        kwicSubject.addObserver(alphabetizer);\r\n"
                + "        kwicSubject.addObserver(output);\r\n"
                + "        // 逐步调用各个观察者\r\n"
                + "        kwicSubject.startKWIC();\r\n"
                + "    }";

        JTextArea desc = new JTextArea(content_desc);
        JScrollPane scroll_desc = new JScrollPane(desc);
        scroll_desc.setFont(new Font(null, Font.PLAIN, 50));
        GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
        gridBagConstraints_1.gridy = 0;//行
        gridBagConstraints_1.gridx = 0;//列
        gridBagConstraints_1.weightx = 0.2;
        gridBagConstraints_1.weighty = 0.5;
        gridBagConstraints_1.fill = GridBagConstraints.BOTH;
        panel.add(scroll_desc,gridBagConstraints_1);


        JScrollPane scroll_result = new JScrollPane(null);

        JTextArea code = new JTextArea(content_code);
        JScrollPane scroll_code = new JScrollPane(code);
        scroll_result.setFont(new Font(null, Font.PLAIN, 10));
        GridBagConstraints gridBagConstraints_3 = new GridBagConstraints();
        gridBagConstraints_3.gridy = 1;//行
        gridBagConstraints_3.gridx = 0;//列
        gridBagConstraints_3.weightx = 0.5;
        gridBagConstraints_3.weighty = 0.5;
        gridBagConstraints_3.fill = GridBagConstraints.BOTH;
        panel.add(scroll_code,gridBagConstraints_3);
        return panel;

    }


}

class MyDialog3 extends JDialog {
    public MyDialog3() {
        setVisible(true);
        setBounds(500, 100, 500, 500);

        JLabel JLabel =  new JLabel("管道-过滤软件体系结构");
        this.add(JLabel);
        this.add(createPanel());
        Container container = getContentPane();
        container.setBackground(Color.WHITE);
    }

    public static JComponent createPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        String content_desc = new String();
        String content_code = new String();

        content_desc = "管道-过滤器模式结构就像是一条产品加工流水线，\n原材料在流水线上经过一个个工人的加工，\n最终生产出产品。\n"
                + "适用于很容易地被分解成一组离散的、独立的步骤的软件。";
        content_code = "核心代码:\r\n"
                + "public static void main(String[] args) throws IOException {\r\n"
                + "        File inFile = new File(\"images and other files/input.txt\");\r\n"
                + "        File outFile = new File(\"images and other files/output.txt\");\r\n"
                + "        Pipe pipe1 = new Pipe();\r\n"
                + "        Pipe pipe2 = new Pipe();\r\n"
                + "        Pipe pipe3 = new Pipe();\r\n"
                + "        Input input = new Input(inFile, pipe1);\r\n"
                + "        Shift shift = new Shift(pipe1, pipe2);\r\n"
                + "        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);\r\n"
                + "        Output output = new Output(outFile,pipe3);\r\n"
                + "        input.transform();\r\n"
                + "        shift.transform();\r\n"
                + "        alphabetizer.transform();\r\n"
                + "        output.transform();\r\n"
                + "    }";

        JTextArea desc = new JTextArea(content_desc);
        JScrollPane scroll_desc = new JScrollPane(desc);
        scroll_desc.setFont(new Font(null, Font.PLAIN, 50));
        GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
        gridBagConstraints_1.gridy = 0;//行
        gridBagConstraints_1.gridx = 0;//列
        gridBagConstraints_1.weightx = 0.2;
        gridBagConstraints_1.weighty = 0.5;
        gridBagConstraints_1.fill = GridBagConstraints.BOTH;
        panel.add(scroll_desc,gridBagConstraints_1);

        JScrollPane scroll_result = new JScrollPane(null);

        JTextArea code = new JTextArea(content_code);
        JScrollPane scroll_code = new JScrollPane(code);
        scroll_result.setFont(new Font(null, Font.PLAIN, 10));
        GridBagConstraints gridBagConstraints_3 = new GridBagConstraints();
        gridBagConstraints_3.gridy = 1;
        gridBagConstraints_3.gridx = 0;
        gridBagConstraints_3.weightx = 0.5;
        gridBagConstraints_3.weighty = 0.5;
        gridBagConstraints_3.fill = GridBagConstraints.BOTH;
        panel.add(scroll_code,gridBagConstraints_3);
        return panel;

    }

}

