package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ttnet.org.chromium.net.impl.a */
public class C87590a extends NetworkExceptionImpl {

    /* renamed from: a */
    static final /* synthetic */ boolean f198900a = true;

    static {
        Covode.recordClassIndex(103572);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87646k, com.ttnet.org.chromium.net.impl.NetworkExceptionImpl
    public boolean immediatelyRetryable() {
        int i = this.mCronetInternalErrorCode;
        if (i != -358 && i != -352) {
            return super.immediatelyRetryable();
        }
        if (f198900a || this.mErrorCode == 11) {
            return true;
        }
        throw new AssertionError();
    }

    public C87590a(String str, int i, int i2) {
        super(str, i, i2);
    }
}
