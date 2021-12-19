package com.bytedance.android.live.core.p218f;

import android.graphics.Bitmap;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.l */
final /* synthetic */ class RunnableC3946l implements Runnable {

    /* renamed from: a */
    private final C3951p.AbstractC3955b f10846a;

    /* renamed from: b */
    private final Bitmap f10847b;

    static {
        Covode.recordClassIndex(4475);
    }

    RunnableC3946l(C3951p.AbstractC3955b bVar, Bitmap bitmap) {
        this.f10846a = bVar;
        this.f10847b = bitmap;
    }

    public final void run() {
        this.f10846a.mo9306a(this.f10847b);
    }
}
