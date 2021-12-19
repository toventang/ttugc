package com.p2082ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.Statistics */
public class Statistics {
    private List<Cell> mList = new ArrayList();
    private int mWindowSizeMs;

    static {
        Covode.recordClassIndex(100450);
    }

    /* access modifiers changed from: package-private */
    public int getWindowLen() {
        return this.mWindowSizeMs;
    }

    public int getSize() {
        int size;
        MethodCollector.m26663i(2257);
        synchronized (this.mList) {
            try {
                update_l(System.currentTimeMillis());
                size = this.mList.size();
            } finally {
                MethodCollector.m26664o(2257);
            }
        }
        return size;
    }

    public double getAverageSize() {
        MethodCollector.m26663i(2244);
        synchronized (this.mList) {
            try {
                update_l(System.currentTimeMillis());
                double d = 0.0d;
                for (Cell cell : this.mList) {
                    d += cell.data;
                }
                if (this.mList.size() > 0) {
                    double size = (double) this.mList.size();
                    Double.isNaN(size);
                    return d / size;
                }
                MethodCollector.m26664o(2244);
                return 0.0d;
            } finally {
                MethodCollector.m26664o(2244);
            }
        }
    }

    public float getRatePerSecond() {
        MethodCollector.m26663i(2251);
        synchronized (this.mList) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                update_l(currentTimeMillis);
                int size = this.mList.size();
                float f = 0.0f;
                if (size > 0) {
                    float f2 = ((float) (currentTimeMillis - this.mList.get(size - 1).timeMs)) / 1000.0f;
                    if (f2 != 0.0f) {
                        f = ((float) size) / f2;
                    }
                    return f;
                }
                MethodCollector.m26664o(2251);
                return 0.0f;
            } finally {
                MethodCollector.m26664o(2251);
            }
        }
    }

    public Statistics(int i) {
        this.mWindowSizeMs = i;
    }

    public void add(double d) {
        MethodCollector.m26663i(2267);
        synchronized (this.mList) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                update_l(currentTimeMillis);
                this.mList.add(new Cell(d, currentTimeMillis));
            } finally {
                MethodCollector.m26664o(2267);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void update_l(long j) {
        long j2 = j - ((long) this.mWindowSizeMs);
        while (!this.mList.isEmpty() && this.mList.get(0).timeMs < j2) {
            this.mList.remove(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.Statistics$Cell */
    public class Cell {
        double data;
        long timeMs;

        static {
            Covode.recordClassIndex(100451);
        }

        public Cell(Statistics statistics, double d) {
            this(d, System.currentTimeMillis());
        }

        public Cell(double d, long j) {
            this.data = d;
            this.timeMs = j;
        }
    }
}
