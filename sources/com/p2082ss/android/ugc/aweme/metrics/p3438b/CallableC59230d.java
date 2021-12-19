package com.p2082ss.android.ugc.aweme.metrics.p3438b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.metrics.b.d */
public final /* synthetic */ class CallableC59230d implements Callable {

    /* renamed from: a */
    private final JSONObject f135156a;

    /* renamed from: b */
    private final String f135157b;

    /* renamed from: c */
    private final String f135158c;

    /* renamed from: d */
    private final Context f135159d;

    static {
        Covode.recordClassIndex(69593);
    }

    CallableC59230d(JSONObject jSONObject, String str, String str2, Context context) {
        this.f135156a = jSONObject;
        this.f135157b = str;
        this.f135158c = str2;
        this.f135159d = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C59227a.m108844a(this.f135156a, this.f135157b, this.f135158c, this.f135159d);
    }
}
