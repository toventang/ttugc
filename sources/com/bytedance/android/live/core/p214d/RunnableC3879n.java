package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.n */
public final /* synthetic */ class RunnableC3879n implements Runnable {

    /* renamed from: a */
    private final String f10724a;

    /* renamed from: b */
    private final int f10725b;

    /* renamed from: c */
    private final JSONObject f10726c;

    /* renamed from: d */
    private final JSONObject f10727d;

    static {
        Covode.recordClassIndex(4408);
    }

    RunnableC3879n(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f10724a = str;
        this.f10725b = i;
        this.f10726c = jSONObject;
        this.f10727d = jSONObject2;
    }

    public final void run() {
        C3868c.m9484a().mo7731a(this.f10724a, this.f10725b, this.f10726c, this.f10727d);
    }
}
