package com.bytedance.android.live.core.p213c;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.c.g */
public final /* synthetic */ class RunnableC3860g implements Runnable {

    /* renamed from: a */
    private final AbstractC3855b f10673a;

    /* renamed from: b */
    private final String f10674b;

    /* renamed from: c */
    private final Map f10675c;

    static {
        Covode.recordClassIndex(4389);
    }

    RunnableC3860g(AbstractC3855b bVar, String str, Map map) {
        this.f10673a = bVar;
        this.f10674b = str;
        this.f10675c = map;
    }

    public final void run() {
        AbstractC3855b bVar = this.f10673a;
        String str = this.f10674b;
        C3854a.m9453a(6, str, bVar.mo9219c(str, AbstractC3855b.m9461a(this.f10675c)));
    }
}
