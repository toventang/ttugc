package com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50684c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.d.a.e */
public final class C50679e implements AbstractC50684c {

    /* renamed from: a */
    private final AbstractC50707o f117022a;

    static {
        Covode.recordClassIndex(59841);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50684c
    /* renamed from: a */
    public final void mo86020a() {
        this.f117022a.mo86064a();
    }

    public C50679e(AbstractC50707o oVar) {
        C89219l.m154721d(oVar, "");
        this.f117022a = oVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50684c
    /* renamed from: a */
    public final FilterBean mo86019a(int i) {
        return C50691c.m94986a(this.f117022a.mo86071f(), i);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50684c
    /* renamed from: b */
    public final String mo86021b(int i) {
        return C50687a.m94981b(C50691c.m94986a(this.f117022a.mo86071f(), i));
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50684c
    /* renamed from: c */
    public final String mo86022c(int i) {
        return C50687a.m94976a(C50691c.m94986a(this.f117022a.mo86071f(), i));
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50684c
    /* renamed from: d */
    public final String mo86023d(int i) {
        return this.f117022a.mo86072g().mo86054c(i);
    }
}
