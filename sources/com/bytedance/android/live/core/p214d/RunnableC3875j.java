package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.j */
public final /* synthetic */ class RunnableC3875j implements Runnable {

    /* renamed from: a */
    private final String f10709a;

    /* renamed from: b */
    private final int f10710b;

    /* renamed from: c */
    private final JSONObject f10711c;

    static {
        Covode.recordClassIndex(4404);
    }

    RunnableC3875j(String str, int i, JSONObject jSONObject) {
        this.f10709a = str;
        this.f10710b = i;
        this.f10711c = jSONObject;
    }

    public final void run() {
        C3868c.m9493a(this.f10709a, this.f10710b, (JSONObject) null, this.f10711c);
    }
}
