package com.bytedance.android.live.core.p213c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.c.i */
public final /* synthetic */ class RunnableC3862i implements Runnable {

    /* renamed from: a */
    private final AbstractC3855b f10679a;

    /* renamed from: b */
    private final String f10680b;

    /* renamed from: c */
    private final JSONObject f10681c;

    static {
        Covode.recordClassIndex(4391);
    }

    RunnableC3862i(AbstractC3855b bVar, String str, JSONObject jSONObject) {
        this.f10679a = bVar;
        this.f10680b = str;
        this.f10681c = jSONObject;
    }

    public final void run() {
        AbstractC3855b bVar = this.f10679a;
        String str = this.f10680b;
        C3854a.m9453a(4, str, bVar.mo9219c(str, this.f10681c));
    }
}
