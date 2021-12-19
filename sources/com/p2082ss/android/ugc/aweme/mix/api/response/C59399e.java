package com.p2082ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33632h;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mix.api.response.e */
public final class C59399e extends BaseResponse implements AbstractC33631g {
    @AbstractC27891c(mo46611a = "videos")

    /* renamed from: a */
    public List<? extends Aweme> f135686a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public boolean f135687b;
    @AbstractC27891c(mo46611a = "max_cursor")

    /* renamed from: c */
    public long f135688c;
    @AbstractC27891c(mo46611a = "min_cursor")

    /* renamed from: e */
    public long f135689e;
    @AbstractC27891c(mo46611a = "has_more_of_load_before")

    /* renamed from: f */
    public boolean f135690f;
    @AbstractC27891c(mo46611a = "has_more_of_load_more")

    /* renamed from: g */
    public boolean f135691g;

    /* renamed from: h */
    private C14612a<?> f135692h;

    static {
        Covode.recordClassIndex(69791);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C33633i getRequestLog() {
        return AbstractC33632h.m68862a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C14612a<?> getRequestInfo() {
        return this.f135692h;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final void setRequestInfo(C14612a<?> aVar) {
        if (aVar != null) {
            this.f135692h = aVar;
        }
    }
}
