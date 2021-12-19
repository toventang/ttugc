package com.p2082ss.android.ugc.aweme.p2727db;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.db.d */
public class C40937d extends AbstractC40931a<C34797e> {

    /* renamed from: a */
    private final C34797e f95771a;

    static {
        Covode.recordClassIndex(48789);
    }

    public /* synthetic */ C40937d() {
        this(null);
    }

    /* renamed from: a */
    public C34797e mo70128b() {
        C34797e eVar = this.f95771a;
        if (eVar != null) {
            return eVar;
        }
        throw new RuntimeException("pls pass item or extends the DividerUnit");
    }

    public C40937d(C34797e eVar) {
        this.f95771a = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.db.d$a */
    static final class C40938a extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        final /* synthetic */ C40937d f95772a;

        /* renamed from: b */
        final /* synthetic */ String f95773b;

        static {
            Covode.recordClassIndex(48790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40938a(C40937d dVar, String str) {
            super(1);
            this.f95772a = dVar;
            this.f95773b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C89219l.m154721d(eVar, "");
            return C34797e.m71059a((C34797e) this.f95772a.mo70132l(), this.f95773b, false, false, null, 14);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.db.d$b */
    static final class C40939b extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        final /* synthetic */ C40937d f95774a;

        /* renamed from: b */
        final /* synthetic */ boolean f95775b;

        static {
            Covode.recordClassIndex(48791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40939b(C40937d dVar, boolean z) {
            super(1);
            this.f95774a = dVar;
            this.f95775b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C89219l.m154721d(eVar, "");
            return C34797e.m71059a((C34797e) this.f95774a.mo70132l(), null, false, this.f95775b, null, 11);
        }
    }

    /* renamed from: a */
    public final void mo70134a(String str) {
        C89219l.m154721d(str, "");
        mo70126a(new C40938a(this, str));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: a */
    public final void mo70127a(boolean z) {
        mo70126a(new C40939b(this, z));
    }
}
