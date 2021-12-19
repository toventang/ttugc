package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.e */
public final class C71839e {

    /* renamed from: a */
    final AbstractC89244h f161001a;

    /* renamed from: b */
    public final C81779c f161002b;

    static {
        Covode.recordClassIndex(84388);
    }

    public /* synthetic */ C71839e() {
        this(C33918a.m69453b());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.e$a */
    static final class C71840a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C71839e f161003a;

        static {
            Covode.recordClassIndex(84389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71840a(C71839e eVar) {
            super(0);
            this.f161003a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.f161003a.f161002b == null || !this.f161003a.f161002b.f182870d) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    private C71839e(C81779c cVar) {
        this.f161002b = cVar;
        this.f161001a = C89250i.m154773a((AbstractC89171a) new C71840a(this));
    }
}
