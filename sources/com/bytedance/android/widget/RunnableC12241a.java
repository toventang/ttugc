package com.bytedance.android.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.widget.a */
public final /* synthetic */ class RunnableC12241a implements Runnable {

    /* renamed from: a */
    private final DataCenter f29501a;

    /* renamed from: b */
    private final String f29502b;

    /* renamed from: c */
    private final Object f29503c;

    static {
        Covode.recordClassIndex(13976);
    }

    RunnableC12241a(DataCenter dataCenter, String str, Object obj) {
        this.f29501a = dataCenter;
        this.f29502b = str;
        this.f29503c = obj;
    }

    public final void run() {
        this.f29501a.mo19693a(this.f29502b, this.f29503c);
    }
}
