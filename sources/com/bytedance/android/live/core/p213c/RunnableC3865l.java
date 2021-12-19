package com.bytedance.android.live.core.p213c;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.c.l */
public final /* synthetic */ class RunnableC3865l implements Runnable {

    /* renamed from: a */
    private final AbstractC3855b f10687a;

    /* renamed from: b */
    private final String f10688b;

    /* renamed from: c */
    private final Map f10689c;

    static {
        Covode.recordClassIndex(4394);
    }

    RunnableC3865l(AbstractC3855b bVar, String str, Map map) {
        this.f10687a = bVar;
        this.f10688b = str;
        this.f10689c = map;
    }

    public final void run() {
        AbstractC3855b bVar = this.f10687a;
        String str = this.f10688b;
        C3854a.m9453a(3, str, bVar.mo9219c(str, AbstractC3855b.m9461a(this.f10689c)));
    }
}
