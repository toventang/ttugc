package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.AbstractC24397p;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1870h.C24314c;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.s */
public final class C24612s implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    private final AbstractC24397p<AbstractC24026e, AbstractC24111h> f58488a;

    /* renamed from: b */
    private final AbstractC24380f f58489b;

    /* renamed from: c */
    private final AbstractC24544ak<C24456e> f58490c;

    static {
        Covode.recordClassIndex(28756);
    }

    /* renamed from: com.facebook.imagepipeline.n.s$a */
    static class C24613a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: a */
        private final AbstractC24397p<AbstractC24026e, AbstractC24111h> f58491a;

        /* renamed from: b */
        private final AbstractC24026e f58492b;

        /* renamed from: c */
        private final boolean f58493c;

        static {
            Covode.recordClassIndex(28757);
        }

        /* JADX INFO: finally extract failed */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            try {
                C24644b.m47156a();
                if (m46994b(i) || eVar == null || m46995c(i) || eVar.mo40303c() == C24314c.f57663a) {
                    this.f58467e.mo40434b(eVar, i);
                    C24644b.m47156a();
                    return;
                }
                C24117a<AbstractC24111h> b = C24117a.m45711b(eVar.f58094a);
                if (b != null) {
                    C24117a<AbstractC24111h> aVar = null;
                    try {
                        if (this.f58493c) {
                            aVar = this.f58491a.mo40202a(this.f58492b, b);
                        }
                        if (aVar != null) {
                            try {
                                C24456e eVar2 = new C24456e(aVar);
                                eVar2.mo40302b(eVar);
                                try {
                                    this.f58467e.mo40433b(1.0f);
                                    this.f58467e.mo40434b(eVar2, i);
                                    C24456e.m46681d(eVar2);
                                    C24644b.m47156a();
                                    return;
                                } catch (Throwable th) {
                                    C24456e.m46681d(eVar2);
                                    throw th;
                                }
                            } finally {
                                C24117a.m45712c(aVar);
                            }
                        }
                    } finally {
                        C24117a.m45712c(b);
                    }
                }
                this.f58467e.mo40434b(eVar, i);
                C24644b.m47156a();
            } catch (Throwable th2) {
                C24644b.m47156a();
                throw th2;
            }
        }

        public C24613a(AbstractC24596k<C24456e> kVar, AbstractC24397p<AbstractC24026e, AbstractC24111h> pVar, AbstractC24026e eVar, boolean z) {
            super(kVar);
            this.f58491a = pVar;
            this.f58492b = eVar;
            this.f58493c = z;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        Map<String, String> map;
        try {
            C24644b.m47156a();
            String b = alVar.mo40415b();
            AbstractC24547an c = alVar.mo40416c();
            c.onProducerStart(b, "EncodedMemoryCacheProducer");
            C24636b a = alVar.mo40413a();
            AbstractC24380f fVar = this.f58489b;
            alVar.mo40417d();
            AbstractC24026e a2 = fVar.mo40187a(a);
            C24117a<AbstractC24111h> a3 = this.f58488a.mo40201a(a2);
            Map<String, String> map2 = null;
            if (a3 != null) {
                try {
                    C24456e eVar = new C24456e(a3);
                    try {
                        if (c.requiresExtraMap(b)) {
                            map2 = C24086f.m45603of("cached_value_found", "true");
                        }
                        c.onProducerFinishWithSuccess(b, "EncodedMemoryCacheProducer", map2);
                        c.onUltimateProducerReached(b, "EncodedMemoryCacheProducer", true);
                        kVar.mo40433b(1.0f);
                        kVar.mo40434b(eVar, 1);
                        C24456e.m46681d(eVar);
                        C24117a.m45712c(a3);
                        C24644b.m47156a();
                    } catch (Throwable th) {
                        C24456e.m46681d(eVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    C24117a.m45712c(a3);
                    throw th2;
                }
            } else if (alVar.mo40418e().getValue() >= C24636b.EnumC24638b.ENCODED_MEMORY_CACHE.getValue()) {
                if (c.requiresExtraMap(b)) {
                    map = C24086f.m45603of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c.onProducerFinishWithSuccess(b, "EncodedMemoryCacheProducer", map);
                c.onUltimateProducerReached(b, "EncodedMemoryCacheProducer", false);
                kVar.mo40434b(null, 1);
                C24117a.m45712c(a3);
                C24644b.m47156a();
            } else {
                C24613a aVar = new C24613a(kVar, this.f58488a, a2, alVar.mo40413a().mIsMemoryCacheEnabled);
                if (c.requiresExtraMap(b)) {
                    map2 = C24086f.m45603of("cached_value_found", "false");
                }
                c.onProducerFinishWithSuccess(b, "EncodedMemoryCacheProducer", map2);
                this.f58490c.mo40379a(aVar, alVar);
                C24117a.m45712c(a3);
                C24644b.m47156a();
            }
        } catch (Throwable th3) {
            C24644b.m47156a();
            throw th3;
        }
    }

    public C24612s(AbstractC24397p<AbstractC24026e, AbstractC24111h> pVar, AbstractC24380f fVar, AbstractC24544ak<C24456e> akVar) {
        this.f58488a = pVar;
        this.f58489b = fVar;
        this.f58490c = akVar;
    }
}
