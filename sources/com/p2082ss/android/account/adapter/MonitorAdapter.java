package com.p2082ss.android.account.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1664o.AbstractC22510c;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.p2132c.C29819a;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.adapter.MonitorAdapter */
public class MonitorAdapter implements AbstractC22510c {
    static {
        Covode.recordClassIndex(35729);
    }

    @Override // com.bytedance.sdk.p1625a.p1664o.AbstractC22510c
    /* renamed from: a */
    public final void mo36784a(String str, JSONObject jSONObject) {
        C29819a.m60077a(str, jSONObject);
    }

    @Override // com.bytedance.sdk.p1625a.p1664o.AbstractC22510c
    /* renamed from: a */
    public final void mo36783a(long j, String str) {
        AppLog.setUserId(j);
        AppLog.setSessionKey(str);
    }
}
