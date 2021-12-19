package com.bytedance.android.live.core.p214d;

import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.g */
public final /* synthetic */ class RunnableC3872g implements Runnable {

    /* renamed from: a */
    private final long f10700a;

    /* renamed from: b */
    private final JSONObject f10701b;

    /* renamed from: c */
    private final String f10702c;

    static {
        Covode.recordClassIndex(4401);
    }

    RunnableC3872g(long j, JSONObject jSONObject, String str) {
        this.f10700a = j;
        this.f10701b = jSONObject;
        this.f10702c = str;
    }

    public final void run() {
        long j = this.f10700a;
        JSONObject jSONObject = this.f10701b;
        String str = this.f10702c;
        JSONObject a = C3868c.m9485a(j);
        JSONObject a2 = C3868c.m9487a(jSONObject);
        if (C3868c.m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3873h(str, a, a2));
        }
    }
}
