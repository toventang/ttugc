package com.p2082ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$$Lambda$3 */
final /* synthetic */ class FilterManager$$Lambda$3 implements Runnable {
    private final FilterManager arg$1;
    private final IVideoEffectProcessor.IEffectInfoChangeListener arg$2;

    static {
        Covode.recordClassIndex(100462);
    }

    FilterManager$$Lambda$3(FilterManager filterManager, IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.arg$1 = filterManager;
        this.arg$2 = iEffectInfoChangeListener;
    }

    public final void run() {
        this.arg$1.lambda$setEffectInfoChangeListener$3$FilterManager(this.arg$2);
    }
}
