package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67436a;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67438c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a.a */
public final class C42618a {
    @AbstractC27891c(mo46611a = "search_type")

    /* renamed from: a */
    public String f99422a;
    @AbstractC27891c(mo46611a = "filter_option")

    /* renamed from: b */
    public C67438c f99423b;
    @AbstractC27891c(mo46611a = "sort_option")

    /* renamed from: c */
    public C67438c f99424c;
    @AbstractC27891c(mo46611a = "activity_option")

    /* renamed from: d */
    public C67436a f99425d;

    static {
        Covode.recordClassIndex(50722);
    }

    /* renamed from: a */
    public final boolean mo72817a() {
        C67438c cVar = this.f99423b;
        if (cVar != null && !cVar.isEmpty()) {
            return false;
        }
        C67438c cVar2 = this.f99424c;
        if (cVar2 != null && !cVar2.isEmpty()) {
            return false;
        }
        C67436a aVar = this.f99425d;
        if (aVar == null || aVar.isEmpty()) {
            return true;
        }
        return false;
    }
}
