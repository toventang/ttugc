package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.m */
public final class C50800m {
    static {
        Covode.recordClassIndex(59968);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.m$a */
    public static final class C50801a implements AbstractC50705m {

        /* renamed from: a */
        final /* synthetic */ AbstractC50706n f117240a;

        /* renamed from: b */
        final /* synthetic */ AbstractC50703k f117241b;

        static {
            Covode.recordClassIndex(59969);
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: a */
        public final AbstractC50703k mo86056a() {
            return this.f117241b;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: b */
        public final float mo86058b(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            return C50648c.m94908a(filterBean, this.f117241b);
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: a */
        public final float mo86055a(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            return C50648c.m94907a(filterBean, this.f117240a.mo86059a(filterBean, this.f117241b), this.f117241b);
        }

        C50801a(AbstractC50706n nVar, AbstractC50703k kVar) {
            this.f117240a = nVar;
            this.f117241b = kVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m
        /* renamed from: a */
        public final void mo86057a(FilterBean filterBean, float f) {
            C89219l.m154721d(filterBean, "");
            this.f117240a.mo86060a(filterBean, C50648c.m94910a(filterBean, f, this.f117241b));
        }
    }

    /* renamed from: a */
    public static final AbstractC50705m m95128a(AbstractC50706n nVar, AbstractC50703k kVar) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(kVar, "");
        return new C50801a(nVar, kVar);
    }
}
