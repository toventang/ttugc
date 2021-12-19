package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.i */
public final /* synthetic */ class RunnableC3874i implements Runnable {

    /* renamed from: a */
    private final long f10706a;

    /* renamed from: b */
    private final String f10707b;

    /* renamed from: c */
    private final int f10708c;

    static {
        Covode.recordClassIndex(4403);
    }

    RunnableC3874i(long j, String str, int i) {
        this.f10706a = j;
        this.f10707b = str;
        this.f10708c = i;
    }

    public final void run() {
        C3868c.m9493a(this.f10707b, this.f10708c, C3868c.m9485a(this.f10706a), (JSONObject) null);
    }
}
