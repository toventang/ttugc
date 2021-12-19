package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;

/* renamed from: com.facebook.imagepipeline.n.j */
public final class C24594j implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    public final AbstractC24544ak<C24456e> f58435a;

    /* renamed from: b */
    private final AbstractC24544ak<C24456e> f58436b;

    static {
        Covode.recordClassIndex(28738);
    }

    /* renamed from: com.facebook.imagepipeline.n.j$a */
    class C24595a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: b */
        private AbstractC24545al f58438b;

        static {
            Covode.recordClassIndex(28739);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40279a(Throwable th) {
            C24594j.this.f58435a.mo40379a(this.f58467e, this.f58438b);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            C24636b a = this.f58438b.mo40413a();
            boolean a2 = m46992a(i);
            boolean a3 = C24581bd.m47017a(eVar, a.mResizeOptions);
            if (eVar != null && (a3 || a.mLocalThumbnailPreviewsEnabled)) {
                if (!a2 || !a3) {
                    this.f58467e.mo40434b(eVar, i & -2);
                } else {
                    this.f58467e.mo40434b(eVar, i);
                    return;
                }
            }
            if (a2 && !a3) {
                C24456e.m46681d(eVar);
                C24594j.this.f58435a.mo40379a(this.f58467e, this.f58438b);
            }
        }

        private C24595a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
            super(kVar);
            this.f58438b = alVar;
        }

        /* synthetic */ C24595a(C24594j jVar, AbstractC24596k kVar, AbstractC24545al alVar, byte b) {
            this(kVar, alVar);
        }
    }

    public C24594j(AbstractC24544ak<C24456e> akVar, AbstractC24544ak<C24456e> akVar2) {
        this.f58436b = akVar;
        this.f58435a = akVar2;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        this.f58436b.mo40379a(new C24595a(this, kVar, alVar, (byte) 0), alVar);
    }
}
