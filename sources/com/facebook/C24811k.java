package com.facebook;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.k */
public final class C24811k extends C24798j {

    /* renamed from: a */
    private final C24915r f58873a;

    static {
        Covode.recordClassIndex(28982);
    }

    public final C24915r getGraphResponse() {
        return this.f58873a;
    }

    @Override // com.facebook.C24798j
    public final String toString() {
        FacebookRequestError facebookRequestError;
        C24915r rVar = this.f58873a;
        if (rVar != null) {
            facebookRequestError = rVar.f59155d;
        } else {
            facebookRequestError = null;
        }
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ").append(facebookRequestError.f56431c).append(", facebookErrorCode: ").append(facebookRequestError.f56432d).append(", facebookErrorType: ").append(facebookRequestError.f56434f).append(", message: ").append(facebookRequestError.mo39341a()).append("}");
        }
        return sb.toString();
    }

    public C24811k(C24915r rVar, String str) {
        super(str);
        this.f58873a = rVar;
    }
}
