package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1885j.C24456e;

/* renamed from: com.facebook.imagepipeline.n.a */
public final class C24512a implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    private final AbstractC24544ak<C24456e> f58222a;

    static {
        Covode.recordClassIndex(28656);
    }

    /* renamed from: com.facebook.imagepipeline.n.a$a */
    static class C24513a extends AbstractC24604n<C24456e, C24456e> {
        static {
            Covode.recordClassIndex(28657);
        }

        private C24513a(AbstractC24596k<C24456e> kVar) {
            super(kVar);
        }

        /* synthetic */ C24513a(AbstractC24596k kVar, byte b) {
            this(kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            if (eVar == null) {
                this.f58467e.mo40434b(null, i);
                return;
            }
            if (!C24456e.m46680c(eVar)) {
                eVar.mo40311j();
            }
            this.f58467e.mo40434b(eVar, i);
        }
    }

    public C24512a(AbstractC24544ak<C24456e> akVar) {
        this.f58222a = akVar;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        this.f58222a.mo40379a(new C24513a(kVar, (byte) 0), alVar);
    }
}
