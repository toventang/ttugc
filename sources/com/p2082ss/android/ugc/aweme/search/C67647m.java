package com.p2082ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.m */
public final class C67647m extends BaseResponse {
    @AbstractC27891c(mo46611a = "hotspot_items")

    /* renamed from: a */
    public List<? extends Aweme> f151550a;
    @AbstractC27891c(mo46611a = "billboard_info")

    /* renamed from: b */
    public ArrayList<C67590l> f151551b;
    @AbstractC27891c(mo46611a = "item_related_event_id")

    /* renamed from: c */
    public String f151552c;
    @AbstractC27891c(mo46611a = "billboard_type")

    /* renamed from: d */
    public int f151553d;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: e */
    public int f151554e;
    @AbstractC27891c(mo46611a = "offset")

    /* renamed from: f */
    public int f151555f;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: g */
    public int f151556g;

    static {
        Covode.recordClassIndex(79287);
    }

    /* renamed from: a */
    public final boolean mo106639a() {
        if (this.f151554e == 1) {
            return true;
        }
        return false;
    }
}
