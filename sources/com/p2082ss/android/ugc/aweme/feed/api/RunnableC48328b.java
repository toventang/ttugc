package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.api.b */
public final /* synthetic */ class RunnableC48328b implements Runnable {

    /* renamed from: a */
    static final Runnable f112000a = new RunnableC48328b();

    static {
        Covode.recordClassIndex(57100);
    }

    private RunnableC48328b() {
    }

    public final void run() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", -2);
            jSONObject.put("errorCode", -101);
            C29819a.m60077a("cache_feed_request_response", jSONObject);
        } catch (Exception unused) {
        }
    }
}
