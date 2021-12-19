package com.android.installreferrer.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public class ReferrerDetails {

    /* renamed from: a */
    public final Bundle f6798a;

    static {
        Covode.recordClassIndex(2474);
    }

    public ReferrerDetails(Bundle bundle) {
        this.f6798a = bundle;
    }

    /* renamed from: a */
    public final String mo6236a() {
        return this.f6798a.getString("install_referrer");
    }
}
