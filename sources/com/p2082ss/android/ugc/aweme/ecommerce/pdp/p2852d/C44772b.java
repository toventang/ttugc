package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.b */
public final class C44772b {

    /* renamed from: a */
    public final List<Image> f104456a;

    static {
        Covode.recordClassIndex(53158);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44772b) && C89219l.m154714a(this.f104456a, ((C44772b) obj).f104456a);
        }
        return true;
    }

    public final int hashCode() {
        List<Image> list = this.f104456a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "HeaderBannerVO(images=" + this.f104456a + ")";
    }

    public C44772b(List<Image> list) {
        C89219l.m154721d(list, "");
        this.f104456a = list;
    }
}
