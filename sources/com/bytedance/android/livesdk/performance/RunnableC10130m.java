package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.performance.m */
public final /* synthetic */ class RunnableC10130m implements Runnable {

    /* renamed from: a */
    private final LivePerformanceManager f24569a;

    /* renamed from: b */
    private final Map f24570b;

    /* renamed from: c */
    private final String f24571c;

    /* renamed from: d */
    private final String f24572d;

    /* renamed from: e */
    private final String f24573e;

    /* renamed from: f */
    private final String f24574f;

    /* renamed from: g */
    private final String f24575g;

    static {
        Covode.recordClassIndex(11693);
    }

    RunnableC10130m(LivePerformanceManager livePerformanceManager, Map map, String str, String str2, String str3, String str4, String str5) {
        this.f24569a = livePerformanceManager;
        this.f24570b = map;
        this.f24571c = str;
        this.f24572d = str2;
        this.f24573e = str3;
        this.f24574f = str4;
        this.f24575g = str5;
    }

    public final void run() {
        this.f24569a.lambda$reportPerformance$4$LivePerformanceManager(this.f24570b, this.f24571c, this.f24572d, this.f24573e, this.f24574f, this.f24575g);
    }
}
