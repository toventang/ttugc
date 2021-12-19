package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.C24456e;

/* renamed from: com.facebook.imagepipeline.n.ap */
public final class C24549ap implements AbstractC24544ak<C24117a<AbstractC24111h>> {

    /* renamed from: a */
    private final AbstractC24544ak<C24456e> f58308a;

    static {
        Covode.recordClassIndex(28693);
    }

    public C24549ap(AbstractC24544ak<C24456e> akVar) {
        this.f58308a = akVar;
    }

    /* renamed from: com.facebook.imagepipeline.n.ap$a */
    class C24550a extends AbstractC24604n<C24456e, C24117a<AbstractC24111h>> {
        static {
            Covode.recordClassIndex(28694);
        }

        private C24550a(AbstractC24596k<C24117a<AbstractC24111h>> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            C24117a aVar = null;
            try {
                if (C24456e.m46682e(eVar)) {
                    aVar = C24117a.m45711b(eVar.f58094a);
                }
                this.f58467e.mo40434b(aVar, i);
            } finally {
                C24117a.m45712c(aVar);
            }
        }

        /* synthetic */ C24550a(C24549ap apVar, AbstractC24596k kVar, byte b) {
            this(kVar);
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24117a<AbstractC24111h>> kVar, AbstractC24545al alVar) {
        this.f58308a.mo40379a(new C24550a(this, kVar, (byte) 0), alVar);
    }
}
