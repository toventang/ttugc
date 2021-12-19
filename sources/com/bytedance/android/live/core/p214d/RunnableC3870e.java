package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.e */
public final /* synthetic */ class RunnableC3870e implements Runnable {

    /* renamed from: a */
    private final String f10695a;

    /* renamed from: b */
    private final JSONObject f10696b;

    /* renamed from: c */
    private final int f10697c;

    static {
        Covode.recordClassIndex(4399);
    }

    RunnableC3870e(String str, JSONObject jSONObject, int i) {
        this.f10695a = str;
        this.f10696b = jSONObject;
        this.f10697c = i;
    }

    public final void run() {
        String str = this.f10695a;
        JSONObject jSONObject = this.f10696b;
        int i = this.f10697c;
        if (!str.startsWith("ttlive_")) {
            str = "ttlive_".concat(String.valueOf(str));
        }
        C3868c.m9484a().mo7730a(str, i, C3868c.m9487a(jSONObject));
    }
}
