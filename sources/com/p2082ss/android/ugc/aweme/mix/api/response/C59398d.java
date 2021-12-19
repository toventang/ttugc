package com.p2082ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33632h;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;

/* renamed from: com.ss.android.ugc.aweme.mix.api.response.d */
public final class C59398d extends BaseResponse implements AbstractC33631g {
    @AbstractC27891c(mo46611a = "mix")

    /* renamed from: a */
    public C59867d f135684a;

    /* renamed from: b */
    private C14612a<?> f135685b;

    static {
        Covode.recordClassIndex(69790);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C33633i getRequestLog() {
        return AbstractC33632h.m68862a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C14612a<?> getRequestInfo() {
        return this.f135685b;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final void setRequestInfo(C14612a<?> aVar) {
        if (aVar != null) {
            this.f135685b = aVar;
        }
    }
}
