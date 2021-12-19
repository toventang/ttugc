package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.i */
final /* synthetic */ class CallableC81611i implements Callable {

    /* renamed from: a */
    private final C81609h f182501a;

    /* renamed from: b */
    private final int f182502b;

    /* renamed from: c */
    private final int f182503c;

    /* renamed from: d */
    private final int f182504d;

    /* renamed from: e */
    private final int f182505e;

    static {
        Covode.recordClassIndex(95008);
    }

    CallableC81611i(C81609h hVar, int i, int i2, int i3, int i4) {
        this.f182501a = hVar;
        this.f182502b = i;
        this.f182503c = i2;
        this.f182504d = i3;
        this.f182505e = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.m26663i(8673);
        C81609h hVar = this.f182501a;
        int i = this.f182502b;
        int i2 = this.f182503c;
        int i3 = this.f182504d;
        int i4 = this.f182505e;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((float) (-i3), (float) (-i4));
        hVar.f182498b.f43654d.draw(canvas);
        MethodCollector.m26664o(8673);
        return createBitmap;
    }
}
