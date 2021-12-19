package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.m */
public final /* synthetic */ class RunnableC3878m implements Runnable {

    /* renamed from: a */
    private final JSONObject f10720a;

    /* renamed from: b */
    private final String f10721b;

    /* renamed from: c */
    private final int f10722c;

    /* renamed from: d */
    private final JSONObject f10723d;

    static {
        Covode.recordClassIndex(4407);
    }

    RunnableC3878m(JSONObject jSONObject, String str, int i, JSONObject jSONObject2) {
        this.f10720a = jSONObject;
        this.f10721b = str;
        this.f10722c = i;
        this.f10723d = jSONObject2;
    }

    public final void run() {
        JSONObject jSONObject = this.f10720a;
        C3868c.m9484a().mo7731a(this.f10721b, this.f10722c, this.f10723d, C3868c.m9487a(jSONObject));
    }
}
