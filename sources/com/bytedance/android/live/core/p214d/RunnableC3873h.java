package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.h */
final /* synthetic */ class RunnableC3873h implements Runnable {

    /* renamed from: a */
    private final String f10703a;

    /* renamed from: b */
    private final JSONObject f10704b;

    /* renamed from: c */
    private final JSONObject f10705c;

    static {
        Covode.recordClassIndex(4402);
    }

    RunnableC3873h(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f10703a = str;
        this.f10704b = jSONObject;
        this.f10705c = jSONObject2;
    }

    public final void run() {
        C3868c.m9484a().mo7734a(this.f10703a, this.f10704b, this.f10705c);
    }
}
