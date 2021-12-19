package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.t */
public final /* synthetic */ class RunnableC34650t implements Serializable, Runnable {

    /* renamed from: a */
    private final String f81827a;

    /* renamed from: b */
    private final String f81828b;

    /* renamed from: c */
    private final String f81829c;

    static {
        Covode.recordClassIndex(41619);
    }

    RunnableC34650t(String str, String str2, String str3) {
        this.f81827a = str;
        this.f81828b = str2;
        this.f81829c = str3;
    }

    public final void run() {
        String str = this.f81827a;
        String str2 = this.f81828b;
        String str3 = this.f81829c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("service", str2);
            C12290b.m22064a(str3, jSONObject);
        } catch (Exception unused) {
        }
    }
}
