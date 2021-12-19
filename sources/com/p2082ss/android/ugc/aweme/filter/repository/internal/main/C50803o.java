package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.o */
public final class C50803o implements AbstractC50802n {

    /* renamed from: a */
    public static final C50804a f117242a = new C50804a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f117243b;

    /* renamed from: c */
    private final String f117244c;

    static {
        Covode.recordClassIndex(59971);
    }

    /* renamed from: a */
    private final Keva m95135a() {
        return (Keva) this.f117243b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.o$a */
    public static final class C50804a {
        static {
            Covode.recordClassIndex(59972);
        }

        private C50804a() {
        }

        public /* synthetic */ C50804a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.o$b */
    static final class C50805b extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C50805b f117245a = new C50805b();

        static {
            Covode.recordClassIndex(59973);
        }

        C50805b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("filter_intensity");
        }
    }

    public /* synthetic */ C50803o() {
        this("filter_intensity");
    }

    public C50803o(String str) {
        C89219l.m154721d(str, "");
        this.f117244c = str;
        this.f117243b = C89250i.m154773a((AbstractC89171a) C50805b.f117245a);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.main.AbstractC50802n
    /* renamed from: a */
    public final int mo86128a(String str, String str2) {
        C89219l.m154721d(str, "");
        if (str2 != null) {
            return m95135a().getInt(str2, -1);
        }
        return m95135a().getInt(str, -1);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.main.AbstractC50802n
    /* renamed from: a */
    public final void mo86129a(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        if (str2 != null) {
            m95135a().storeInt(str2, i);
        } else {
            m95135a().storeInt(str, i);
        }
    }
}
