package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.h */
final /* synthetic */ class CallableC73903h implements Callable {

    /* renamed from: a */
    private final C73852c.C738531.C738541 f165927a;

    /* renamed from: b */
    private final int f165928b;

    /* renamed from: c */
    private final int f165929c;

    /* renamed from: d */
    private final float f165930d;

    static {
        Covode.recordClassIndex(86649);
    }

    CallableC73903h(C73852c.C738531.C738541 r1, int i, int i2, float f) {
        this.f165927a = r1;
        this.f165928b = i;
        this.f165929c = i2;
        this.f165930d = f;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C73852c.C738531.C738541 r0 = this.f165927a;
        int i = this.f165928b;
        int i2 = this.f165929c;
        C73852c.this.f165784c.add("type:" + i + " ext:" + i2 + " f:" + this.f165930d);
        return null;
    }
}
