package com.facebook;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.i */
public final class C24318i extends C24798j {
    static final long serialVersionUID = 1;

    /* renamed from: a */
    private int f57670a;

    /* renamed from: b */
    private String f57671b;

    static {
        Covode.recordClassIndex(28459);
    }

    public final int getErrorCode() {
        return this.f57670a;
    }

    public final String getFailingUrl() {
        return this.f57671b;
    }

    @Override // com.facebook.C24798j
    public final String toString() {
        return "{FacebookDialogException: errorCode: " + getErrorCode() + ", message: " + getMessage() + ", url: " + getFailingUrl() + "}";
    }

    public C24318i(String str, int i, String str2) {
        super(str);
        this.f57670a = i;
        this.f57671b = str2;
    }
}
