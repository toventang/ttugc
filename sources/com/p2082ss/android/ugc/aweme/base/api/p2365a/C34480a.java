package com.p2082ss.android.ugc.aweme.base.api.p2365a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.api.a.a */
public class C34480a extends RuntimeException {

    /* renamed from: a */
    private final int f81464a;

    static {
        Covode.recordClassIndex(41435);
    }

    public int getErrorCode() {
        return this.f81464a;
    }

    public C34480a(int i) {
        super("error_code = ".concat(String.valueOf(i)));
        this.f81464a = i;
    }

    public C34480a(int i, Throwable th) {
        super("error_code = ".concat(String.valueOf(i)), th);
        this.f81464a = i;
    }
}
