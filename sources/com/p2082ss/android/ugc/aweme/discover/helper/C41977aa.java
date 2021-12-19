package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41957c;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42175a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.aa */
public final class C41977aa implements AbstractC41957c {

    /* renamed from: b */
    private final AbstractC89244h f97899b = C89250i.m154773a((AbstractC89171a) C41978a.f97904a);

    /* renamed from: c */
    private final AbstractC89244h f97900c = C89250i.m154773a((AbstractC89171a) new C41979b(this));

    /* renamed from: d */
    private boolean f97901d;

    /* renamed from: e */
    private int f97902e;

    /* renamed from: f */
    private int f97903f = -1;

    static {
        Covode.recordClassIndex(49907);
    }

    /* renamed from: c */
    private final int m84038c() {
        return ((Number) this.f97900c.getValue()).intValue();
    }

    /* renamed from: a */
    public final C42175a.C42176a mo71149a() {
        return (C42175a.C42176a) this.f97899b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.aa$a */
    static final class C41978a extends AbstractC89220m implements AbstractC89171a<C42175a.C42176a> {

        /* renamed from: a */
        public static final C41978a f97904a = new C41978a();

        static {
            Covode.recordClassIndex(49908);
        }

        C41978a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42175a.C42176a invoke() {
            return C42175a.m84430a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41957c
    /* renamed from: b */
    public final void mo71125b() {
        this.f97901d = false;
        this.f97902e = 0;
        this.f97903f = -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.aa$b */
    static final class C41979b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C41977aa f97905a;

        static {
            Covode.recordClassIndex(49909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41979b(C41977aa aaVar) {
            super(0);
            this.f97905a = aaVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            C42175a.C42176a a = this.f97905a.mo71149a();
            if (a != null) {
                i = a.getPosition();
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41957c
    /* renamed from: a */
    public final void mo71123a(AbstractC89172b<? super Integer, C89391z> bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        if (!this.f97901d && (i = this.f97903f) != -1) {
            bVar.invoke(Integer.valueOf(i));
            this.f97901d = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41957c
    /* renamed from: a */
    public final void mo71124a(boolean z, AbstractC89171a<Integer> aVar, AbstractC89172b<? super Integer, Integer> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        if (!this.f97901d && mo71149a() != null && m84038c() >= 0 && this.f97903f == -1) {
            if (m84038c() == 0) {
                this.f97903f = bVar.invoke(0).intValue();
            } else if (z) {
                this.f97903f = bVar.invoke(1).intValue();
            } else {
                int intValue = this.f97902e + aVar.invoke().intValue();
                this.f97902e = intValue;
                if (intValue >= m84038c()) {
                    this.f97903f = bVar.invoke(1).intValue();
                }
            }
        }
    }
}
