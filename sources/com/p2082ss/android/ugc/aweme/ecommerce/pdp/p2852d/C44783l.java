package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.Specification;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.l */
public final class C44783l implements AbstractC44779h {

    /* renamed from: a */
    public final List<Specification> f104487a;

    static {
        Covode.recordClassIndex(53169);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h
    /* renamed from: a */
    public final String mo75904a() {
        return "specifications";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44783l) && C89219l.m154714a(this.f104487a, ((C44783l) obj).f104487a);
        }
        return true;
    }

    public final int hashCode() {
        List<Specification> list = this.f104487a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectSpecificationVO(specification=" + this.f104487a + ")";
    }

    public C44783l(List<Specification> list) {
        C89219l.m154721d(list, "");
        this.f104487a = list;
    }
}
