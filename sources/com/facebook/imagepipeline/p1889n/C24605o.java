package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24086f;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.facebook.imagepipeline.n.o */
public class C24605o implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    public final AbstractC24544ak<C24456e> f58468a;

    /* renamed from: b */
    private final C24373e f58469b;

    /* renamed from: c */
    private final C24373e f58470c;

    /* renamed from: d */
    private final AbstractC24380f f58471d;

    static {
        Covode.recordClassIndex(28749);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40425a(AbstractC24545al alVar) {
        return alVar.mo40413a().mIsDiskCacheEnabled;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC24026e mo40424a(AbstractC24380f fVar, AbstractC24545al alVar) {
        C24636b a = alVar.mo40413a();
        alVar.mo40417d();
        return fVar.mo40187a(a);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public void mo40379a(final AbstractC24596k<C24456e> kVar, final AbstractC24545al alVar) {
        C24373e eVar;
        C24636b a = alVar.mo40413a();
        if (mo40425a(alVar)) {
            alVar.mo40416c().onProducerStart(alVar.mo40415b(), "DiskCacheProducer");
            AbstractC24026e a2 = mo40424a(this.f58471d, alVar);
            if (a.mCacheChoice == C24636b.EnumC24637a.SMALL) {
                eVar = this.f58470c;
            } else {
                eVar = this.f58469b;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C1731i<C24456e> a3 = eVar.mo39593a(a2, atomicBoolean);
            final String b = alVar.mo40415b();
            final AbstractC24547an c = alVar.mo40416c();
            a3.mo5532a(new AbstractC1729g<C24456e, Void>() {
                /* class com.facebook.imagepipeline.p1889n.C24605o.C246061 */

                static {
                    Covode.recordClassIndex(28750);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // p077b.AbstractC1729g
                public final /* synthetic */ Void then(C1731i<C24456e> iVar) {
                    boolean z;
                    if (iVar.mo5539b() || (iVar.mo5544c() && (iVar.mo5546e() instanceof CancellationException))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c.onProducerFinishWithCancellation(b, "DiskCacheProducer", null);
                        kVar.mo40432b();
                    } else if (iVar.mo5544c()) {
                        c.onProducerFinishWithFailure(b, "DiskCacheProducer", iVar.mo5546e(), null);
                        C24605o.this.f58468a.mo40379a(kVar, alVar);
                    } else {
                        C24456e d = iVar.mo5545d();
                        if (d != null) {
                            AbstractC24547an anVar = c;
                            String str = b;
                            anVar.onProducerFinishWithSuccess(str, "DiskCacheProducer", C24605o.m47092a(anVar, str, true, d.mo40309h()));
                            c.onUltimateProducerReached(b, "DiskCacheProducer", true);
                            kVar.mo40433b(1.0f);
                            kVar.mo40434b(d, 1);
                            d.close();
                        } else {
                            AbstractC24547an anVar2 = c;
                            String str2 = b;
                            anVar2.onProducerFinishWithSuccess(str2, "DiskCacheProducer", C24605o.m47092a(anVar2, str2, false, 0));
                            C24605o.this.f58468a.mo40379a(kVar, alVar);
                        }
                    }
                    return null;
                }
            });
            alVar.mo40414a(new C24587e() {
                /* class com.facebook.imagepipeline.p1889n.C24605o.C246072 */

                static {
                    Covode.recordClassIndex(28751);
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: a */
                public final void mo34237a() {
                    atomicBoolean.set(true);
                }
            });
        } else if (alVar.mo40418e().getValue() >= C24636b.EnumC24638b.DISK_CACHE.getValue()) {
            kVar.mo40434b(null, 1);
        } else {
            this.f58468a.mo40379a(kVar, alVar);
        }
    }

    public C24605o(C24373e eVar, C24373e eVar2, AbstractC24380f fVar, AbstractC24544ak<C24456e> akVar) {
        this.f58469b = eVar;
        this.f58470c = eVar2;
        this.f58471d = fVar;
        this.f58468a = akVar;
    }

    /* renamed from: a */
    static Map<String, String> m47092a(AbstractC24547an anVar, String str, boolean z, int i) {
        if (!anVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return C24086f.m45604of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C24086f.m45603of("cached_value_found", String.valueOf(z));
    }
}
