package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.k */
public final class C61637k extends BaseResponse implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "avatar_list")

    /* renamed from: a */
    public final List<UrlModel> f139917a;
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: b */
    public final boolean f139918b;

    /* renamed from: c */
    private String f139919c;

    static {
        Covode.recordClassIndex(72364);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        return this.f139919c;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        this.f139919c = str;
    }
}
