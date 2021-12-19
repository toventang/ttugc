package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import okhttp3.C90198s;

/* renamed from: com.twitter.sdk.android.core.t */
public class C87813t {

    /* renamed from: a */
    public int f199475a;

    /* renamed from: b */
    public int f199476b;

    /* renamed from: c */
    public long f199477c;

    static {
        Covode.recordClassIndex(103822);
    }

    C87813t(C90198s sVar) {
        if (sVar != null) {
            for (int i = 0; i < sVar.f204855a.length / 2; i++) {
                if ("x-rate-limit-limit".equals(sVar.mo145027a(i))) {
                    this.f199475a = Integer.valueOf(sVar.mo145031b(i)).intValue();
                } else if ("x-rate-limit-remaining".equals(sVar.mo145027a(i))) {
                    this.f199476b = Integer.valueOf(sVar.mo145031b(i)).intValue();
                } else if ("x-rate-limit-reset".equals(sVar.mo145027a(i))) {
                    this.f199477c = Long.valueOf(sVar.mo145031b(i)).longValue();
                }
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }
}
