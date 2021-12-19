package com.bytedance.android.live.core.p213c;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.c.c */
public final /* synthetic */ class RunnableC3856c implements Runnable {

    /* renamed from: a */
    private final AbstractC3855b f10663a;

    /* renamed from: b */
    private final String f10664b;

    /* renamed from: c */
    private final Map f10665c;

    static {
        Covode.recordClassIndex(4385);
    }

    RunnableC3856c(AbstractC3855b bVar, String str, Map map) {
        this.f10663a = bVar;
        this.f10664b = str;
        this.f10665c = map;
    }

    public final void run() {
        this.f10663a.mo9216a(this.f10664b, AbstractC3855b.m9461a(this.f10665c));
    }
}
