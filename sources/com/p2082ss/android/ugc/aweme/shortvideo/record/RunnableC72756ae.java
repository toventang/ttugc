package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ae */
public final /* synthetic */ class RunnableC72756ae implements Runnable {

    /* renamed from: a */
    private final C72809t f163134a;

    /* renamed from: b */
    private final int f163135b;

    /* renamed from: c */
    private final Bitmap f163136c;

    static {
        Covode.recordClassIndex(85442);
    }

    RunnableC72756ae(C72809t tVar, int i, Bitmap bitmap) {
        this.f163134a = tVar;
        this.f163135b = i;
        this.f163136c = bitmap;
    }

    public final void run() {
        this.f163134a.mo115098a(this.f163135b, this.f163136c);
    }
}
