package com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.a.e.b */
public final class C57108b extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: a */
    public long f130021a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public boolean f130022b;
    @AbstractC27891c(mo46611a = "mc_list")

    /* renamed from: c */
    public List<C57110d> f130023c;

    static {
        Covode.recordClassIndex(67002);
    }

    /* renamed from: a */
    public final List<C57110d> mo94259a() {
        List<C57110d> list = this.f130023c;
        if (list == null || list.isEmpty()) {
            return this.f130023c;
        }
        return C57109c.m103480a(this.f130023c);
    }
}
