package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ef */
public final class C71798ef extends RuntimeException {

    /* renamed from: a */
    SynthetiseResult f160906a;

    static {
        Covode.recordClassIndex(84343);
    }

    public final SynthetiseResult getResult() {
        return this.f160906a;
    }

    public final int getCode() {
        return this.f160906a.ret;
    }

    public C71798ef(String str, SynthetiseResult synthetiseResult) {
        super(str);
        this.f160906a = synthetiseResult;
    }

    public C71798ef(Throwable th, SynthetiseResult synthetiseResult) {
        super(th);
        this.f160906a = synthetiseResult;
    }
}
