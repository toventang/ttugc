package com.p2082ss.bytertc.engine.utils;

import android.opengl.EGLContext;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.utils.TextureHelper$$Lambda$1 */
public final /* synthetic */ class TextureHelper$$Lambda$1 implements Callable {
    private final EGLContext arg$1;
    private final Handler arg$2;
    private final int arg$3;
    private final int arg$4;
    private final String arg$5;

    static {
        Covode.recordClassIndex(101166);
    }

    TextureHelper$$Lambda$1(EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        this.arg$1 = eGLContext;
        this.arg$2 = handler;
        this.arg$3 = i;
        this.arg$4 = i2;
        this.arg$5 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return TextureHelper.lambda$create$1$TextureHelper(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
