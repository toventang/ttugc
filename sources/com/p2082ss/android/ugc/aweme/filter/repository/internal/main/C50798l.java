package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.l */
public final class C50798l implements AbstractC50706n {

    /* renamed from: a */
    public static final C50799a f117237a = new C50799a((byte) 0);

    /* renamed from: b */
    private final String f117238b;

    /* renamed from: c */
    private final AbstractC50802n f117239c;

    static {
        Covode.recordClassIndex(59966);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.l$a */
    public static final class C50799a {
        static {
            Covode.recordClassIndex(59967);
        }

        private C50799a() {
        }

        public /* synthetic */ C50799a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C50798l m95127a(String str) {
            C89219l.m154721d(str, "");
            return new C50798l(str, new C50803o(), (byte) 0);
        }
    }

    private C50798l(String str, AbstractC50802n nVar) {
        this.f117238b = str;
        this.f117239c = nVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n
    /* renamed from: a */
    public final int mo86059a(FilterBean filterBean, AbstractC50703k kVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(kVar, "");
        int a = this.f117239c.mo86128a(this.f117238b + '-' + filterBean.getId(), filterBean.getCompareKey());
        if (a == -1) {
            return C50648c.m94910a(filterBean, C50648c.m94908a(filterBean, kVar), kVar);
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n
    /* renamed from: a */
    public final void mo86060a(FilterBean filterBean, int i) {
        C89219l.m154721d(filterBean, "");
        this.f117239c.mo86129a(this.f117238b + '-' + filterBean.getId(), i, filterBean.getCompareKey());
    }

    public /* synthetic */ C50798l(String str, AbstractC50802n nVar, byte b) {
        this(str, nVar);
    }
}
