package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.AbstractC24397p;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.AbstractC24642e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.ai */
public final class C24535ai implements AbstractC24544ak<C24117a<AbstractC24454c>> {

    /* renamed from: a */
    private final AbstractC24397p<AbstractC24026e, AbstractC24454c> f58279a;

    /* renamed from: b */
    private final AbstractC24380f f58280b;

    /* renamed from: c */
    private final AbstractC24544ak<C24117a<AbstractC24454c>> f58281c;

    static {
        Covode.recordClassIndex(28679);
    }

    /* renamed from: com.facebook.imagepipeline.n.ai$a */
    public static class C24536a extends AbstractC24604n<C24117a<AbstractC24454c>, C24117a<AbstractC24454c>> {

        /* renamed from: a */
        private final AbstractC24026e f58282a;

        /* renamed from: b */
        private final boolean f58283b;

        /* renamed from: c */
        private final AbstractC24397p<AbstractC24026e, AbstractC24454c> f58284c;

        /* renamed from: d */
        private final boolean f58285d;

        static {
            Covode.recordClassIndex(28680);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.facebook.imagepipeline.d.p<com.facebook.c.a.e, com.facebook.imagepipeline.j.c> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24117a aVar = (C24117a) obj;
            C24117a aVar2 = null;
            if (aVar == null) {
                if (m46992a(i)) {
                    this.f58467e.mo40434b(aVar2, i);
                }
            } else if (!m46994b(i) || this.f58283b) {
                if (this.f58285d) {
                    aVar2 = this.f58284c.mo40202a(this.f58282a, aVar);
                }
                try {
                    this.f58467e.mo40433b(1.0f);
                    AbstractC24596k<O> kVar = this.f58467e;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    kVar.mo40434b(aVar, i);
                } finally {
                    C24117a.m45712c(aVar2);
                }
            }
        }

        public C24536a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24026e eVar, boolean z, AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar, boolean z2) {
            super(kVar);
            this.f58282a = eVar;
            this.f58283b = z;
            this.f58284c = pVar;
            this.f58285d = z2;
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar) {
        AbstractC24547an c = alVar.mo40416c();
        String b = alVar.mo40415b();
        C24636b a = alVar.mo40413a();
        Object d = alVar.mo40417d();
        AbstractC24641d dVar = a.mPostprocessor;
        if (dVar == null || dVar.getPostprocessorCacheKey() == null) {
            this.f58281c.mo40379a(kVar, alVar);
            return;
        }
        c.onProducerStart(b, "PostprocessedBitmapMemoryCacheProducer");
        AbstractC24026e b2 = this.f58280b.mo40190b(a, d);
        C24117a<AbstractC24454c> a2 = this.f58279a.mo40201a(b2);
        Map<String, String> map = null;
        if (a2 != null) {
            if (c.requiresExtraMap(b)) {
                map = C24086f.m45603of("cached_value_found", "true");
            }
            c.onProducerFinishWithSuccess(b, "PostprocessedBitmapMemoryCacheProducer", map);
            c.onUltimateProducerReached(b, "PostprocessedBitmapMemoryCacheProducer", true);
            kVar.mo40433b(1.0f);
            kVar.mo40434b(a2, 1);
            a2.close();
            return;
        }
        C24536a aVar = new C24536a(kVar, b2, dVar instanceof AbstractC24642e, this.f58279a, alVar.mo40413a().mIsMemoryCacheEnabled);
        if (c.requiresExtraMap(b)) {
            map = C24086f.m45603of("cached_value_found", "false");
        }
        c.onProducerFinishWithSuccess(b, "PostprocessedBitmapMemoryCacheProducer", map);
        this.f58281c.mo40379a(aVar, alVar);
    }

    public C24535ai(AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar, AbstractC24380f fVar, AbstractC24544ak<C24117a<AbstractC24454c>> akVar) {
        this.f58279a = pVar;
        this.f58280b = fVar;
        this.f58281c = akVar;
    }
}
