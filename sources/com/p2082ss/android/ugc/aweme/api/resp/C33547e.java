package com.p2082ss.android.ugc.aweme.api.resp;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.multi.C60215m;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.resp.e */
public final class C33547e {
    @AbstractC27891c(mo46611a = "products")

    /* renamed from: a */
    public final List<C60215m> f79678a;

    static {
        Covode.recordClassIndex(40421);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33547e) && C89219l.m154714a(this.f79678a, ((C33547e) obj).f79678a);
        }
        return true;
    }

    public final int hashCode() {
        List<C60215m> list = this.f79678a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GetItemProductInfoResponseData(products=" + this.f79678a + ")";
    }
}
