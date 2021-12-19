package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.VideoFrameStatics */
public class VideoFrameStatics {
    private List<Long> mList = new ArrayList();
    private final int mWinMs;

    static {
        Covode.recordClassIndex(100099);
    }

    private void update() {
        if (!this.mList.isEmpty()) {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - ((long) this.mWinMs));
            while (!this.mList.isEmpty()) {
                Long l = this.mList.get(0);
                if (l.longValue() < valueOf.longValue()) {
                    this.mList.remove(l);
                } else {
                    return;
                }
            }
        }
    }

    public void add() {
        MethodCollector.m26663i(856);
        synchronized (this.mList) {
            try {
                update();
                this.mList.add(Long.valueOf(System.currentTimeMillis()));
            } finally {
                MethodCollector.m26664o(856);
            }
        }
    }

    public float getRealRatePerSecond() {
        MethodCollector.m26663i(876);
        synchronized (this.mList) {
            try {
                update();
                if (!this.mList.isEmpty()) {
                    List<Long> list = this.mList;
                    Long valueOf = Long.valueOf(list.get(list.size() - 1).longValue() - this.mList.get(0).longValue());
                    if (valueOf.longValue() == 0) {
                        return 0.0f;
                    }
                    float size = (((float) this.mList.size()) * 1000.0f) / ((float) valueOf.longValue());
                    MethodCollector.m26664o(876);
                    return size;
                }
                MethodCollector.m26664o(876);
                return 0.0f;
            } finally {
                MethodCollector.m26664o(876);
            }
        }
    }

    public VideoFrameStatics(int i) {
        this.mWinMs = i;
    }
}
