package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.AbstractC24397p;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24459h;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.h */
public class C24590h implements AbstractC24544ak<C24117a<AbstractC24454c>> {

    /* renamed from: a */
    public final AbstractC24397p<AbstractC24026e, AbstractC24454c> f58423a;

    /* renamed from: b */
    private final AbstractC24380f f58424b;

    /* renamed from: c */
    private final AbstractC24544ak<C24117a<AbstractC24454c>> f58425c;

    static {
        Covode.recordClassIndex(28734);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo40445a() {
        return "BitmapMemoryCacheProducer";
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar) {
        Map<String, String> map;
        int i;
        Map<String, String> map2;
        try {
            C24644b.m47156a();
            AbstractC24547an c = alVar.mo40416c();
            String b = alVar.mo40415b();
            c.onProducerStart(b, mo40445a());
            AbstractC24026e a = this.f58424b.mo40188a(alVar.mo40413a(), alVar.mo40417d());
            C24117a<AbstractC24454c> a2 = this.f58423a.mo40201a(a);
            Map<String, String> map3 = null;
            if (a2 != null) {
                boolean c2 = a2.mo39695a().mo40297e().mo40314c();
                if (c2) {
                    String a3 = mo40445a();
                    if (c.requiresExtraMap(b)) {
                        map2 = C24086f.m45603of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    c.onProducerFinishWithSuccess(b, a3, map2);
                    c.onUltimateProducerReached(b, mo40445a(), true);
                    kVar.mo40433b(1.0f);
                    i = 1;
                } else {
                    i = 0;
                }
                kVar.mo40434b(a2, i);
                a2.close();
                if (c2) {
                    C24644b.m47156a();
                    return;
                }
            }
            if (alVar.mo40418e().getValue() >= C24636b.EnumC24638b.BITMAP_MEMORY_CACHE.getValue()) {
                String a4 = mo40445a();
                if (c.requiresExtraMap(b)) {
                    map = C24086f.m45603of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c.onProducerFinishWithSuccess(b, a4, map);
                c.onUltimateProducerReached(b, mo40445a(), false);
                kVar.mo40434b(null, 1);
                C24644b.m47156a();
                return;
            }
            AbstractC24596k<C24117a<AbstractC24454c>> a5 = mo40444a(kVar, a, alVar.mo40413a().mIsMemoryCacheEnabled);
            String a6 = mo40445a();
            if (c.requiresExtraMap(b)) {
                map3 = C24086f.m45603of("cached_value_found", "false");
            }
            c.onProducerFinishWithSuccess(b, a6, map3);
            C24644b.m47156a();
            this.f58425c.mo40379a(a5, alVar);
            C24644b.m47156a();
            C24644b.m47156a();
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC24596k<C24117a<AbstractC24454c>> mo40444a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, final AbstractC24026e eVar, final boolean z) {
        return new AbstractC24604n<C24117a<AbstractC24454c>, C24117a<AbstractC24454c>>(kVar) {
            /* class com.facebook.imagepipeline.p1889n.C24590h.C245911 */

            static {
                Covode.recordClassIndex(28735);
            }

            /* JADX INFO: finally extract failed */
            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.facebook.imagepipeline.d.p<com.facebook.c.a.e, com.facebook.imagepipeline.j.c> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final /* synthetic */ void mo40278a(Object obj, int i) {
                C24117a<AbstractC24454c> a;
                C24117a aVar = (C24117a) obj;
                try {
                    C24644b.m47156a();
                    boolean a2 = m46992a(i);
                    C24117a aVar2 = null;
                    if (aVar == null) {
                        if (a2) {
                            this.f58467e.mo40434b(null, i);
                        }
                        C24644b.m47156a();
                    } else if (((AbstractC24454c) aVar.mo39695a()).mo40291c() || m46993a(i, 8)) {
                        this.f58467e.mo40434b(aVar, i);
                        C24644b.m47156a();
                    } else {
                        if (!a2 && (a = C24590h.this.f58423a.mo40201a(eVar)) != null) {
                            try {
                                AbstractC24459h e = ((AbstractC24454c) aVar.mo39695a()).mo40297e();
                                AbstractC24459h e2 = a.mo39695a().mo40297e();
                                if (e2.mo40314c() || e2.mo40312a() >= e.mo40312a()) {
                                    this.f58467e.mo40434b(a, i);
                                    C24117a.m45712c(a);
                                    C24644b.m47156a();
                                    return;
                                }
                                C24117a.m45712c(a);
                            } catch (Throwable th) {
                                C24117a.m45712c(a);
                                throw th;
                            }
                        }
                        if (z) {
                            aVar2 = C24590h.this.f58423a.mo40202a(eVar, aVar);
                        }
                        if (a2) {
                            try {
                                this.f58467e.mo40433b(1.0f);
                            } catch (Throwable th2) {
                                C24117a.m45712c(aVar2);
                                throw th2;
                            }
                        }
                        AbstractC24596k<O> kVar = this.f58467e;
                        if (aVar2 != null) {
                            aVar = aVar2;
                        }
                        kVar.mo40434b(aVar, i);
                        C24117a.m45712c(aVar2);
                        C24644b.m47156a();
                    }
                } catch (Throwable th3) {
                    C24644b.m47156a();
                    throw th3;
                }
            }
        };
    }

    public C24590h(AbstractC24397p<AbstractC24026e, AbstractC24454c> pVar, AbstractC24380f fVar, AbstractC24544ak<C24117a<AbstractC24454c>> akVar) {
        this.f58423a = pVar;
        this.f58424b = fVar;
        this.f58425c = akVar;
    }
}
