package structure2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Auther li hong you
 * @Date 2023/10/24
 * @Description 软件体系结构实验 202131060518
 */

public class Alphabetizer {
    private ArrayList<String> kwicList;

    public Alphabetizer(ArrayList<String> kwicList) {
        this.kwicList = kwicList;
    }

    public ArrayList<String> getKwicList() {
        return kwicList;
    }

    public void sort() {
        Collections.sort(this.kwicList, new AlphabetizerComparator());
    }

    private class AlphabetizerComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1 == null && o2 == null) {
                throw new NullPointerException();
            }
            int compareValue = 0;
            char o1c = o1.toLowerCase().charAt(0);
            char o2c = o2.toLowerCase().charAt(0);
            compareValue = o1c - o2c;
            return compareValue;

        }

    }
}
