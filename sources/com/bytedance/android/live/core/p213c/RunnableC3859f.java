package com.bytedance.android.live.core.p213c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.c.f */
public final /* synthetic */ class RunnableC3859f implements Runnable {

    /* renamed from: a */
    private final AbstractC3855b f10670a;

    /* renamed from: b */
    private final String f10671b;

    /* renamed from: c */
    private final JSONObject f10672c;

    static {
        Covode.recordClassIndex(4388);
    }

    public RunnableC3859f(AbstractC3855b bVar, String str, JSONObject jSONObject) {
        this.f10670a = bVar;
        this.f10671b = str;
        this.f10672c = jSONObject;
    }

    public final void run() {
        AbstractC3855b bVar = this.f10670a;
        String str = this.f10671b;
        C3854a.m9453a(6, str, bVar.mo9219c(str, this.f10672c));
    }
}
