package com.p2082ss.android.ugc.aweme.p2727db;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.C34798f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.db.f */
public final class C40941f extends AbstractC40931a<C34798f> {

    /* renamed from: a */
    private final C34798f f95776a;

    static {
        Covode.recordClassIndex(48793);
    }

    private /* synthetic */ C40941f() {
        this(null);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34798f mo70128b() {
        C34798f fVar = this.f95776a;
        if (fVar != null) {
            return fVar;
        }
        throw new RuntimeException("pls pass labelItem or extends the LabelUnit");
    }

    public C40941f(C34798f fVar) {
        this.f95776a = fVar;
    }

    /* renamed from: a */
    public final void mo70135a(int i) {
        mo70126a(new C40943b(i));
    }

    /* renamed from: a */
    public final void mo70136a(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        mo70126a(new C40942a(charSequence));
    }

    /* renamed from: com.ss.android.ugc.aweme.db.f$a */
    static final class C40942a extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f95777a;

        static {
            Covode.recordClassIndex(48794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40942a(CharSequence charSequence) {
            super(1);
            this.f95777a = charSequence;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, this.f95777a.toString(), false, null, null, null, null, false, false, null, false, false, null, null, 8190);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.db.f$b */
    static final class C40943b extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        final /* synthetic */ int f95778a;

        static {
            Covode.recordClassIndex(48795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40943b(int i) {
            super(1);
            this.f95778a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            boolean z;
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            if (this.f95778a == 0) {
                z = true;
            } else {
                z = false;
            }
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, z, null, false, false, null, null, 8063);
        }
    }
}
