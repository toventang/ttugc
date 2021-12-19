package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1828b.C24058k;
import com.facebook.p1826c.p1828b.C24061m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.facebook.imagepipeline.n.ax */
public final class C24565ax extends C24605o {

    /* renamed from: b */
    public final C24373e f58355b;

    /* renamed from: c */
    public final C24373e f58356c;

    /* renamed from: d */
    public final boolean f58357d;

    /* renamed from: e */
    public final int f58358e;

    /* renamed from: f */
    private final AbstractC24380f f58359f;

    /* renamed from: g */
    private final AbstractC24544ak<C24456e> f58360g;

    static {
        Covode.recordClassIndex(28709);
    }

    /* renamed from: a */
    public static boolean m46976a(C1731i<?> iVar) {
        if (iVar.mo5539b()) {
            return true;
        }
        if (!iVar.mo5544c() || !(iVar.mo5546e() instanceof CancellationException)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.facebook.imagepipeline.n.ax$a */
    public class C24569a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: a */
        public C24456e f58374a;

        /* renamed from: c */
        private final C24373e f58376c;

        /* renamed from: d */
        private final AbstractC24026e f58377d;

        static {
            Covode.recordClassIndex(28713);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            if (eVar != null && m46992a(i) && !(eVar instanceof C24061m)) {
                if (C24565ax.this.f58357d) {
                    int h = eVar.mo40309h();
                    if (h <= 0 || h >= C24565ax.this.f58358e) {
                        C24565ax.this.f58355b.mo40175a(this.f58377d, eVar);
                    } else {
                        C24565ax.this.f58356c.mo40175a(this.f58377d, eVar);
                    }
                } else {
                    this.f58376c.mo40175a(this.f58377d, eVar);
                }
            }
            this.f58467e.mo40434b(eVar, i);
        }

        private C24569a(AbstractC24596k<C24456e> kVar, C24373e eVar, AbstractC24026e eVar2, C24456e eVar3) {
            super(kVar);
            this.f58376c = eVar;
            this.f58377d = eVar2;
            this.f58374a = eVar3;
        }

        /* synthetic */ C24569a(C24565ax axVar, AbstractC24596k kVar, C24373e eVar, AbstractC24026e eVar2, C24456e eVar3, byte b) {
            this(kVar, eVar, eVar2, eVar3);
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.C24605o, com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(final AbstractC24596k<C24456e> kVar, final AbstractC24545al alVar) {
        final C24373e eVar;
        C1731i<C24456e> a;
        final C24373e eVar2;
        C24373e eVar3;
        C1731i<C24456e> a2;
        C24636b a3 = alVar.mo40413a();
        if (!a3.mIsDiskCacheEnabled) {
            mo40426a(kVar, kVar, alVar);
            return;
        }
        alVar.mo40416c().onProducerStart(alVar.mo40415b(), "DiskCacheProducer");
        AbstractC24380f fVar = this.f58359f;
        alVar.mo40417d();
        final AbstractC24026e a4 = fVar.mo40187a(a3);
        if (a3.mCacheChoice == C24636b.EnumC24637a.SMALL) {
            eVar = this.f58356c;
        } else {
            eVar = this.f58355b;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.f58357d) {
            boolean c = this.f58356c.mo40176c(a4);
            boolean c2 = this.f58355b.mo40176c(a4);
            if (c || !c2) {
                eVar3 = this.f58356c;
                eVar2 = this.f58355b;
            } else {
                eVar3 = this.f58355b;
                eVar2 = this.f58356c;
            }
            if (eVar3 instanceof C24058k) {
                a2 = ((C24058k) eVar3).mo39595b(a4, atomicBoolean);
            } else {
                a2 = eVar3.mo39593a(a4, atomicBoolean);
            }
            a = a2.mo5537b(new AbstractC1729g<C24456e, C1731i<C24456e>>() {
                /* class com.facebook.imagepipeline.p1889n.C24565ax.C245661 */

                static {
                    Covode.recordClassIndex(28710);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // p077b.AbstractC1729g
                public final /* synthetic */ C1731i<C24456e> then(C1731i<C24456e> iVar) {
                    if (C24565ax.m46976a(iVar)) {
                        return iVar;
                    }
                    if (!iVar.mo5544c() && iVar.mo5545d() != null) {
                        return iVar;
                    }
                    C24373e eVar = eVar2;
                    if (eVar instanceof C24058k) {
                        return ((C24058k) eVar).mo39595b(a4, atomicBoolean);
                    }
                    return eVar.mo39593a(a4, atomicBoolean);
                }
            });
        } else if (eVar instanceof C24058k) {
            a = ((C24058k) eVar).mo39595b(a4, atomicBoolean);
        } else {
            a = eVar.mo39593a(a4, atomicBoolean);
        }
        final String b = alVar.mo40415b();
        final AbstractC24547an c3 = alVar.mo40416c();
        a.mo5532a(new AbstractC1729g<C24456e, Void>() {
            /* class com.facebook.imagepipeline.p1889n.C24565ax.C245672 */

            static {
                Covode.recordClassIndex(28711);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Void then(C1731i<C24456e> iVar) {
                if (C24565ax.m46976a(iVar)) {
                    c3.onProducerFinishWithCancellation(b, "DiskCacheProducer", null);
                    kVar.mo40432b();
                } else if (iVar.mo5544c()) {
                    c3.onProducerFinishWithFailure(b, "DiskCacheProducer", iVar.mo5546e(), null);
                    C24565ax.this.mo40426a(kVar, new C24569a(C24565ax.this, kVar, eVar, a4, null, (byte) 0), alVar);
                } else {
                    C24456e d = iVar.mo5545d();
                    if (d == null || (d instanceof C24061m)) {
                        AbstractC24547an anVar = c3;
                        String str = b;
                        anVar.onProducerFinishWithSuccess(str, "DiskCacheProducer", C24605o.m47092a(anVar, str, false, d.mo40309h()));
                        C24565ax.this.mo40426a(kVar, new C24569a(C24565ax.this, kVar, eVar, a4, d, (byte) 0), alVar);
                    } else {
                        AbstractC24547an anVar2 = c3;
                        String str2 = b;
                        anVar2.onProducerFinishWithSuccess(str2, "DiskCacheProducer", C24605o.m47092a(anVar2, str2, true, d.mo40309h()));
                        kVar.mo40433b(1.0f);
                        kVar.mo40434b(d, 1);
                        d.close();
                    }
                }
                return null;
            }
        });
        alVar.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1889n.C24565ax.C245683 */

            static {
                Covode.recordClassIndex(28712);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* renamed from: a */
    public final void mo40426a(AbstractC24596k<C24456e> kVar, AbstractC24596k<C24456e> kVar2, AbstractC24545al alVar) {
        if (alVar.mo40418e().getValue() >= C24636b.EnumC24638b.DISK_CACHE.getValue()) {
            kVar.mo40434b(null, 1);
        } else {
            this.f58360g.mo40379a(kVar2, alVar);
        }
    }
}
