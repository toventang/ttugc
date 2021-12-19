package com.bytedance.android.live.base.model.p180b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.android.live.base.model.b.a */
public final class C2963a extends IOException {

    /* renamed from: a */
    private String f8713a;
    public int statusCode;

    static {
        Covode.recordClassIndex(3408);
    }

    public final String getMessage() {
        return this.f8713a;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C2963a(int i, String str) {
        this.statusCode = i;
        this.f8713a = str;
    }

    public C2963a(int i, String str, String str2, Throwable th) {
        super(str2, th);
        this.statusCode = i;
        this.f8713a = str;
    }
}
