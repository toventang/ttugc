package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.utils.TextureHelper$$Lambda$3 */
public final /* synthetic */ class TextureHelper$$Lambda$3 implements Runnable {
    private final TextureHelper arg$1;
    private final int[] arg$2;

    static {
        Covode.recordClassIndex(101168);
    }

    TextureHelper$$Lambda$3(TextureHelper textureHelper, int[] iArr) {
        this.arg$1 = textureHelper;
        this.arg$2 = iArr;
    }

    public final void run() {
        this.arg$1.lambda$dequeueTexture$3$TextureHelper(this.arg$2);
    }
}
