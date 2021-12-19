package com.bytedance.android.live.core.p213c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.c.k */
public final /* synthetic */ class RunnableC3864k implements Runnable {

    /* renamed from: a */
    private final AbstractC3855b f10684a;

    /* renamed from: b */
    private final String f10685b;

    /* renamed from: c */
    private final JSONObject f10686c;

    static {
        Covode.recordClassIndex(4393);
    }

    RunnableC3864k(AbstractC3855b bVar, String str, JSONObject jSONObject) {
        this.f10684a = bVar;
        this.f10685b = str;
        this.f10686c = jSONObject;
    }

    public final void run() {
        AbstractC3855b bVar = this.f10684a;
        String str = this.f10685b;
        C3854a.m9453a(3, str, bVar.mo9219c(str, this.f10686c));
    }
}
