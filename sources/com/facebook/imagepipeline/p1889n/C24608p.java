package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1870h.C24314c;

/* renamed from: com.facebook.imagepipeline.n.p */
public final class C24608p implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    private final C24373e f58479a;

    /* renamed from: b */
    private final C24373e f58480b;

    /* renamed from: c */
    private final AbstractC24380f f58481c;

    /* renamed from: d */
    private final AbstractC24544ak<C24456e> f58482d;

    static {
        Covode.recordClassIndex(28752);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        C24609a aVar = kVar;
        if (alVar.mo40418e().getValue() >= C24636b.EnumC24638b.DISK_CACHE.getValue()) {
            aVar.mo40434b(null, 1);
            return;
        }
        if (alVar.mo40413a().mIsDiskCacheEnabled) {
            aVar = new C24609a(aVar, alVar, this.f58479a, this.f58480b, this.f58481c, (byte) 0);
        }
        this.f58482d.mo40379a(aVar, alVar);
    }

    /* renamed from: com.facebook.imagepipeline.n.p$a */
    static class C24609a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: a */
        private final AbstractC24545al f58483a;

        /* renamed from: b */
        private final C24373e f58484b;

        /* renamed from: c */
        private final C24373e f58485c;

        /* renamed from: d */
        private final AbstractC24380f f58486d;

        static {
            Covode.recordClassIndex(28753);
        }

        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            if (m46994b(i) || eVar == null || m46995c(i) || eVar.mo40303c() == C24314c.f57663a) {
                this.f58467e.mo40434b(eVar, i);
                return;
            }
            C24636b a = this.f58483a.mo40413a();
            AbstractC24380f fVar = this.f58486d;
            this.f58483a.mo40417d();
            AbstractC24026e a2 = fVar.mo40187a(a);
            if (a.mCacheChoice == C24636b.EnumC24637a.SMALL) {
                this.f58485c.mo40175a(a2, eVar);
            } else {
                this.f58484b.mo40175a(a2, eVar);
            }
            this.f58467e.mo40434b(eVar, i);
        }

        private C24609a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar, C24373e eVar, C24373e eVar2, AbstractC24380f fVar) {
            super(kVar);
            this.f58483a = alVar;
            this.f58484b = eVar;
            this.f58485c = eVar2;
            this.f58486d = fVar;
        }

        /* synthetic */ C24609a(AbstractC24596k kVar, AbstractC24545al alVar, C24373e eVar, C24373e eVar2, AbstractC24380f fVar, byte b) {
            this(kVar, alVar, eVar, eVar2, fVar);
        }
    }

    public C24608p(C24373e eVar, C24373e eVar2, AbstractC24380f fVar, AbstractC24544ak<C24456e> akVar) {
        this.f58479a = eVar;
        this.f58480b = eVar2;
        this.f58481c = fVar;
        this.f58482d = akVar;
    }
}
