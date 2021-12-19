package com.p2082ss.android.ugc.aweme.metrics.p3438b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.b.b */
public final /* synthetic */ class CallableC59228b implements Callable {

    /* renamed from: a */
    private final JSONObject f135147a;

    /* renamed from: b */
    private final String f135148b;

    /* renamed from: c */
    private final String f135149c;

    /* renamed from: d */
    private final String f135150d;

    /* renamed from: e */
    private final Context f135151e;

    static {
        Covode.recordClassIndex(69591);
    }

    public CallableC59228b(JSONObject jSONObject, String str, String str2, String str3, Context context) {
        this.f135147a = jSONObject;
        this.f135148b = str;
        this.f135149c = str2;
        this.f135150d = str3;
        this.f135151e = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C59227a.m108845a(this.f135147a, this.f135148b, this.f135149c, this.f135150d, this.f135151e);
    }
}
