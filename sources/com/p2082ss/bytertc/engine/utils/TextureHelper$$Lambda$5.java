package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.utils.TextureHelper$$Lambda$5 */
final /* synthetic */ class TextureHelper$$Lambda$5 implements Runnable {
    private final int arg$1;

    static {
        Covode.recordClassIndex(101170);
    }

    TextureHelper$$Lambda$5(int i) {
        this.arg$1 = i;
    }

    public final void run() {
        TextureHelper.lambda$releaseTextureID$5$TextureHelper(this.arg$1);
    }
}
