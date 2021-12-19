package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.r */
public final class C50808r implements AbstractC50706n {

    /* renamed from: a */
    public static final C50809a f117254a = new C50809a((byte) 0);

    /* renamed from: b */
    private final String f117255b;

    /* renamed from: c */
    private final AbstractC50802n f117256c;

    static {
        Covode.recordClassIndex(59976);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.r$a */
    public static final class C50809a {
        static {
            Covode.recordClassIndex(59977);
        }

        private C50809a() {
        }

        public /* synthetic */ C50809a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC50706n m95157a(String str) {
            C89219l.m154721d(str, "");
            return new C50808r(str, new C50803o("filter_intensity_resId"), (byte) 0);
        }
    }

    private C50808r(String str, AbstractC50802n nVar) {
        this.f117255b = str;
        this.f117256c = nVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n
    /* renamed from: a */
    public final int mo86059a(FilterBean filterBean, AbstractC50703k kVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(kVar, "");
        int a = this.f117256c.mo86128a(this.f117255b + '-' + filterBean.getResId(), filterBean.getCompareKey());
        if (a == -1) {
            return C50648c.m94910a(filterBean, C50648c.m94908a(filterBean, kVar), kVar);
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n
    /* renamed from: a */
    public final void mo86060a(FilterBean filterBean, int i) {
        C89219l.m154721d(filterBean, "");
        this.f117256c.mo86129a(this.f117255b + '-' + filterBean.getResId(), i, filterBean.getCompareKey());
    }

    public /* synthetic */ C50808r(String str, AbstractC50802n nVar, byte b) {
        this(str, nVar);
    }
}
