package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.performance.n */
public final /* synthetic */ class RunnableC10131n implements Runnable {

    /* renamed from: a */
    private final LivePerformanceManager f24576a;

    /* renamed from: b */
    private final double f24577b;

    /* renamed from: c */
    private final JSONObject f24578c;

    static {
        Covode.recordClassIndex(11694);
    }

    RunnableC10131n(LivePerformanceManager livePerformanceManager, double d, JSONObject jSONObject) {
        this.f24576a = livePerformanceManager;
        this.f24577b = d;
        this.f24578c = jSONObject;
    }

    public final void run() {
        this.f24576a.lambda$reportFps$5$LivePerformanceManager(this.f24577b, this.f24578c);
    }
}
