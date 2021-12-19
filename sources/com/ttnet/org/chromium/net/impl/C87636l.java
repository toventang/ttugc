package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87652q;

/* renamed from: com.ttnet.org.chromium.net.impl.l */
public final class C87636l extends AbstractC87652q {

    /* renamed from: a */
    private final int f199024a;

    /* renamed from: b */
    private final NetworkExceptionImpl f199025b;

    static {
        Covode.recordClassIndex(103618);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87652q
    public final int getQuicDetailedErrorCode() {
        return this.f199024a;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87646k
    public final int getCronetInternalErrorCode() {
        return this.f199025b.getCronetInternalErrorCode();
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87646k
    public final int getErrorCode() {
        return this.f199025b.getErrorCode();
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87646k
    public final boolean immediatelyRetryable() {
        return this.f199025b.immediatelyRetryable();
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(this.f199025b.getMessage());
        sb.append(", QuicDetailedErrorCode=").append(this.f199024a);
        return sb.toString();
    }

    public C87636l(String str, int i, int i2, int i3) {
        super(str);
        this.f199025b = new NetworkExceptionImpl(str, i, i2);
        this.f199024a = i3;
    }
}
