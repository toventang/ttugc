package com.facebook;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.o */
public final class C24910o extends C24798j {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final FacebookRequestError f59139a;

    static {
        Covode.recordClassIndex(29103);
    }

    public final FacebookRequestError getRequestError() {
        return this.f59139a;
    }

    @Override // com.facebook.C24798j
    public final String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.f59139a.f56431c + ", facebookErrorCode: " + this.f59139a.f56432d + ", facebookErrorType: " + this.f59139a.f56434f + ", message: " + this.f59139a.mo39341a() + "}";
    }

    public C24910o(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f59139a = facebookRequestError;
    }
}
