package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.utils.TextureHelper$$Lambda$4 */
public final /* synthetic */ class TextureHelper$$Lambda$4 implements Runnable {
    private final TextureHelper arg$1;
    private final int arg$2;

    static {
        Covode.recordClassIndex(101169);
    }

    TextureHelper$$Lambda$4(TextureHelper textureHelper, int i) {
        this.arg$1 = textureHelper;
        this.arg$2 = i;
    }

    public final void run() {
        this.arg$1.lambda$queueTexture$4$TextureHelper(this.arg$2);
    }
}
