package com.p2082ss.android.ugc.aweme.logger;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.logger.b */
public final /* synthetic */ class CallableC58948b implements Callable {

    /* renamed from: a */
    private final JSONObject f134186a;

    static {
        Covode.recordClassIndex(69272);
    }

    CallableC58948b(JSONObject jSONObject) {
        this.f134186a = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C29819a.m60077a("first_feed_show_time_v3", this.f134186a);
        return null;
    }
}
