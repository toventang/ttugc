package com.p2082ss.android.ugc.aweme.p2727db;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.db.c */
public class C40934c extends AbstractC40931a<C34796d> {

    /* renamed from: a */
    private final C34796d f95766a;

    static {
        Covode.recordClassIndex(48786);
    }

    public /* synthetic */ C40934c() {
        this(null);
    }

    /* renamed from: a */
    public C34796d mo70128b() {
        C34796d dVar = this.f95766a;
        if (dVar != null) {
            return dVar;
        }
        throw new RuntimeException("pls pass item or extends the SwitchUnit");
    }

    public C40934c(C34796d dVar) {
        this.f95766a = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: a */
    public final void mo70127a(boolean z) {
        mo70126a(new C40936b(this, z));
    }

    /* renamed from: com.ss.android.ugc.aweme.db.c$a */
    public static final class C40935a extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        final /* synthetic */ C40934c f95767a;

        /* renamed from: b */
        final /* synthetic */ int f95768b = 8;

        static {
            Covode.recordClassIndex(48787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40935a(C40934c cVar) {
            super(1);
            this.f95767a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            C89219l.m154721d(dVar, "");
            return C34796d.m71048a((C34796d) this.f95767a.mo70132l(), null, null, null, null, false, null, null, null, false, null, false, null, false, false, null, true, this.f95768b, 32767);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.db.c$b */
    static final class C40936b extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        final /* synthetic */ C40934c f95769a;

        /* renamed from: b */
        final /* synthetic */ boolean f95770b;

        static {
            Covode.recordClassIndex(48788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40936b(C40934c cVar, boolean z) {
            super(1);
            this.f95769a = cVar;
            this.f95770b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            C89219l.m154721d(dVar, "");
            return C34796d.m71048a((C34796d) this.f95769a.mo70132l(), null, null, null, null, this.f95770b, null, null, null, false, null, false, null, false, false, null, false, 0, 131055);
        }
    }
}
