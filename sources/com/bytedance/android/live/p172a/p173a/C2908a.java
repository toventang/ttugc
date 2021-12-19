package com.bytedance.android.live.p172a.p173a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.a.a.a */
public class C2908a extends Exception {

    /* renamed from: a */
    private final int f8662a;

    static {
        Covode.recordClassIndex(3338);
    }

    public int getErrorCode() {
        return this.f8662a;
    }

    public String getMessage() {
        return " TYPE = ApiException, errorCode = " + this.f8662a + " " + super.getMessage();
    }

    public C2908a(int i) {
        this.f8662a = i;
    }

    public C2908a(int i, Throwable th) {
        super(th);
        this.f8662a = i;
    }
}
