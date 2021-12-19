package com.p2082ss.android.ugc.aweme.performance;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.HandlerThreadC29808t;
import com.p2082ss.android.ugc.aweme.performance.C62837c;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.performance.e */
final /* synthetic */ class RunnableC62840e implements Runnable {

    /* renamed from: a */
    private final C62837c.C62838a f142506a;

    /* renamed from: b */
    private final String f142507b;

    /* renamed from: c */
    private final long f142508c;

    /* renamed from: d */
    private final double f142509d;

    /* renamed from: e */
    private final JSONObject f142510e;

    static {
        Covode.recordClassIndex(73666);
    }

    RunnableC62840e(C62837c.C62838a aVar, String str, long j, double d, JSONObject jSONObject) {
        this.f142506a = aVar;
        this.f142507b = str;
        this.f142508c = j;
        this.f142509d = d;
        this.f142510e = jSONObject;
    }

    public final void run() {
        String valueOf;
        MethodCollector.m26663i(5895);
        C62837c.C62838a aVar = this.f142506a;
        String str = this.f142507b;
        long j = this.f142508c;
        double d = this.f142509d;
        JSONObject jSONObject = this.f142510e;
        HashMap hashMap = new HashMap();
        hashMap.put("scene", str);
        hashMap.put("duration", String.valueOf(j));
        if (d > 60.0d) {
            valueOf = "60";
        } else {
            valueOf = String.valueOf(d);
        }
        hashMap.put("fps", valueOf);
        C62837c.C62838a.m113243a(hashMap, jSONObject);
        JSONObject jSONObject2 = new JSONObject(hashMap);
        synchronized (aVar) {
            try {
                if (aVar.f142502b != null) {
                    aVar.f142502b.onDataAvailable(jSONObject2);
                    return;
                }
                HandlerThreadC29808t.m60042a().mo52082b(new RunnableC62841f(jSONObject2));
                MethodCollector.m26664o(5895);
            } finally {
                MethodCollector.m26664o(5895);
            }
        }
    }
}
