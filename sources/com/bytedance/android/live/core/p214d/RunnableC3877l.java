package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.l */
public final /* synthetic */ class RunnableC3877l implements Runnable {

    /* renamed from: a */
    private final long f10716a;

    /* renamed from: b */
    private final String f10717b;

    /* renamed from: c */
    private final int f10718c;

    /* renamed from: d */
    private final JSONObject f10719d;

    static {
        Covode.recordClassIndex(4406);
    }

    RunnableC3877l(long j, String str, int i, JSONObject jSONObject) {
        this.f10716a = j;
        this.f10717b = str;
        this.f10718c = i;
        this.f10719d = jSONObject;
    }

    public final void run() {
        long j = this.f10716a;
        C3868c.m9493a(this.f10717b, this.f10718c, C3868c.m9485a(j), this.f10719d);
    }
}
