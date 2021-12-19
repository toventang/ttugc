package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LayerControl;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$GameLayer$$Lambda$1 */
public final /* synthetic */ class LayerControl$GameLayer$$Lambda$1 implements Runnable {
    private final LayerControl.GameLayer arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100227);
    }

    LayerControl$GameLayer$$Lambda$1(LayerControl.GameLayer gameLayer, int i, int i2) {
        this.arg$1 = gameLayer;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$createTexture$1$LayerControl$GameLayer(this.arg$2, this.arg$3);
    }
}
