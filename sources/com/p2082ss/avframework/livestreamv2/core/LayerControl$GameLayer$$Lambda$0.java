package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LayerControl;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$GameLayer$$Lambda$0 */
public final /* synthetic */ class LayerControl$GameLayer$$Lambda$0 implements Runnable {
    private final LayerControl.GameLayer arg$1;
    private final ByteBuffer arg$2;
    private final int arg$3;
    private final int arg$4;
    private final AtomicBoolean arg$5;

    static {
        Covode.recordClassIndex(100226);
    }

    LayerControl$GameLayer$$Lambda$0(LayerControl.GameLayer gameLayer, ByteBuffer byteBuffer, int i, int i2, AtomicBoolean atomicBoolean) {
        this.arg$1 = gameLayer;
        this.arg$2 = byteBuffer;
        this.arg$3 = i;
        this.arg$4 = i2;
        this.arg$5 = atomicBoolean;
    }

    public final void run() {
        this.arg$1.lambda$loadYuvAndDraw$0$LayerControl$GameLayer(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
