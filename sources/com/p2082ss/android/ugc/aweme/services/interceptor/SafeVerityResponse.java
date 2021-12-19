package com.p2082ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.SafeVerityResponse */
public class SafeVerityResponse {
    public int requestCode;
    public int resultCode;
    public String ticket;
    public String uid;

    static {
        Covode.recordClassIndex(79893);
    }

    public SafeVerityResponse(String str, int i, int i2, String str2) {
        this.ticket = str;
        this.resultCode = i;
        this.requestCode = i2;
        this.uid = str2;
    }
}
