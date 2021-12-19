package com.p2082ss.android.ugc.aweme.search.ecom.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.video.a */
public final class C67427a {

    /* renamed from: a */
    public final UrlModel f151065a;

    /* renamed from: b */
    public final List<C67394a> f151066b;

    static {
        Covode.recordClassIndex(79062);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67427a)) {
            return false;
        }
        C67427a aVar = (C67427a) obj;
        return C89219l.m154714a(this.f151065a, aVar.f151065a) && C89219l.m154714a(this.f151066b, aVar.f151066b);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f151065a;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        List<C67394a> list = this.f151066b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProductAnchor(iconUrlModel=" + this.f151065a + ", productList=" + this.f151066b + ")";
    }

    private /* synthetic */ C67427a() {
        this(null, null);
    }

    public C67427a(UrlModel urlModel, List<C67394a> list) {
        this.f151065a = urlModel;
        this.f151066b = list;
    }
}
