package com.p2082ss.android.ugc.aweme.metrics.p3438b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.metrics.b.c */
public final /* synthetic */ class CallableC59229c implements Callable {

    /* renamed from: a */
    private final String f135152a;

    /* renamed from: b */
    private final String f135153b;

    /* renamed from: c */
    private final String f135154c;

    /* renamed from: d */
    private final Context f135155d;

    static {
        Covode.recordClassIndex(69592);
    }

    CallableC59229c(String str, String str2, String str3, Context context) {
        this.f135152a = str;
        this.f135153b = str2;
        this.f135154c = str3;
        this.f135155d = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f135152a;
        String str2 = this.f135153b;
        String str3 = this.f135154c;
        Context context = this.f135155d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("label", str2);
        jSONObject.put("session_id", str3);
        jSONObject.put("scene", "low_retain");
        jSONObject.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject);
        return null;
    }
}
