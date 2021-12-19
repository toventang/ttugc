package com.google.android.gms.common;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.e */
public final class C25502e extends C25578j {

    /* renamed from: a */
    private final int f60483a;

    static {
        Covode.recordClassIndex(30901);
    }

    public final int getConnectionStatusCode() {
        return this.f60483a;
    }

    public C25502e(int i, String str, Intent intent) {
        super(str, intent);
        this.f60483a = i;
    }
}
