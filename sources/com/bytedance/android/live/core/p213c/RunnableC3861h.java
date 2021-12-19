package com.bytedance.android.live.core.p213c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.c.h */
public final /* synthetic */ class RunnableC3861h implements Runnable {

    /* renamed from: a */
    private final AbstractC3855b f10676a;

    /* renamed from: b */
    private final String f10677b;

    /* renamed from: c */
    private final JSONObject f10678c;

    static {
        Covode.recordClassIndex(4390);
    }

    public RunnableC3861h(AbstractC3855b bVar, String str, JSONObject jSONObject) {
        this.f10676a = bVar;
        this.f10677b = str;
        this.f10678c = jSONObject;
    }

    public final void run() {
        AbstractC3855b bVar = this.f10676a;
        String str = this.f10677b;
        C3854a.m9453a(5, str, bVar.mo9219c(str, this.f10678c));
    }
}
