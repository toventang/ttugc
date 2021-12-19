package com.p2082ss.android.ugc.aweme.openauthorize.p3539a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.a.e */
public final class C62701e extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "client_info")

    /* renamed from: a */
    private final C62699c f142146a;
    @AbstractC27891c(mo46611a = "scope_list")

    /* renamed from: b */
    private List<C62703g> f142147b;
    @AbstractC27891c(mo46611a = "text_list")

    /* renamed from: c */
    private final List<C62702f> f142148c;
    @AbstractC27891c(mo46611a = "bc_scope_list")

    /* renamed from: d */
    private final List<C62703g> f142149d;

    static {
        Covode.recordClassIndex(73507);
    }

    public final List<C62703g> getBcScopeList() {
        return this.f142149d;
    }

    public final C62699c getClientInfo() {
        return this.f142146a;
    }

    public final List<C62703g> getScopeList() {
        return this.f142147b;
    }

    public final List<C62702f> getTextList() {
        return this.f142148c;
    }

    public final void setScopeList(List<C62703g> list) {
        this.f142147b = list;
    }
}
