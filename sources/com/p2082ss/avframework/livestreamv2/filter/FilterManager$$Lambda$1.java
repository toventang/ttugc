package com.p2082ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.opengl.YuvConverter;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$$Lambda$1 */
final /* synthetic */ class FilterManager$$Lambda$1 implements Runnable {
    private final YuvConverter arg$1;

    static {
        Covode.recordClassIndex(100460);
    }

    FilterManager$$Lambda$1(YuvConverter yuvConverter) {
        this.arg$1 = yuvConverter;
    }

    public final void run() {
        FilterManager.lambda$release$1$FilterManager(this.arg$1);
    }
}
