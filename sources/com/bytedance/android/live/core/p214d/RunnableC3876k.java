package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.k */
public final /* synthetic */ class RunnableC3876k implements Runnable {

    /* renamed from: a */
    private final long f10712a;

    /* renamed from: b */
    private final Map f10713b;

    /* renamed from: c */
    private final String f10714c;

    /* renamed from: d */
    private final int f10715d;

    static {
        Covode.recordClassIndex(4405);
    }

    RunnableC3876k(long j, Map map, String str, int i) {
        this.f10712a = j;
        this.f10713b = map;
        this.f10714c = str;
        this.f10715d = i;
    }

    public final void run() {
        C3868c.m9493a(this.f10714c, this.f10715d, C3868c.m9485a(this.f10712a), C3868c.m9486a(this.f10713b));
    }
}
