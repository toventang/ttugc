package com.facebook.imagepipeline.p1889n;

import android.net.Uri;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24104a;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1835g.AbstractC24115k;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24360a;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1870h.C24314c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.facebook.imagepipeline.n.ah */
public final class C24531ah implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    private final C24373e f58261a;

    /* renamed from: b */
    private final AbstractC24380f f58262b;

    /* renamed from: c */
    private final AbstractC24113i f58263c;

    /* renamed from: d */
    private final AbstractC24104a f58264d;

    /* renamed from: e */
    private final AbstractC24544ak<C24456e> f58265e;

    static {
        Covode.recordClassIndex(28675);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(final AbstractC24596k<C24456e> kVar, final AbstractC24545al alVar) {
        C24636b a = alVar.mo40413a();
        if (!a.mIsDiskCacheEnabled) {
            this.f58265e.mo40379a(kVar, alVar);
            return;
        }
        alVar.mo40416c().onProducerStart(alVar.mo40415b(), "PartialDiskCacheProducer");
        Uri build = a.mSourceUri.buildUpon().appendQueryParameter("fresco_partial", "true").build();
        AbstractC24380f fVar = this.f58262b;
        alVar.mo40417d();
        final AbstractC24026e a2 = fVar.mo40186a(build);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C1731i<C24456e> a3 = this.f58261a.mo39593a(a2, atomicBoolean);
        final String b = alVar.mo40415b();
        final AbstractC24547an c = alVar.mo40416c();
        a3.mo5532a(new AbstractC1729g<C24456e, Void>() {
            /* class com.facebook.imagepipeline.p1889n.C24531ah.C245321 */

            static {
                Covode.recordClassIndex(28676);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Void then(C1731i<C24456e> iVar) {
                boolean z;
                boolean z2;
                boolean z3 = false;
                if (iVar.mo5539b() || (iVar.mo5544c() && (iVar.mo5546e() instanceof CancellationException))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c.onProducerFinishWithCancellation(b, "PartialDiskCacheProducer", null);
                    kVar.mo40432b();
                } else if (iVar.mo5544c()) {
                    c.onProducerFinishWithFailure(b, "PartialDiskCacheProducer", iVar.mo5546e(), null);
                    C24531ah.this.mo40404a(kVar, alVar, a2, (C24456e) null);
                } else {
                    C24456e d = iVar.mo5545d();
                    if (d != null) {
                        AbstractC24547an anVar = c;
                        String str = b;
                        anVar.onProducerFinishWithSuccess(str, "PartialDiskCacheProducer", C24531ah.m46909a(anVar, str, true, d.mo40309h()));
                        int h = d.mo40309h() - 1;
                        if (h > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C24091i.m45620a(z2);
                        C24360a aVar = new C24360a(0, h);
                        d.f58103j = aVar;
                        int h2 = d.mo40309h();
                        C24636b a = alVar.mo40413a();
                        C24360a aVar2 = a.mBytesRange;
                        if (aVar2 == null || aVar.f57764a > aVar2.f57764a || aVar.f57765b < aVar2.f57765b) {
                            kVar.mo40434b(d, 8);
                            C24639c a2 = C24639c.m47150a(a);
                            int i = h2 - 1;
                            if (i >= 0) {
                                z3 = true;
                            }
                            C24091i.m45620a(z3);
                            a2.f58565p = new C24360a(i, Integer.MAX_VALUE);
                            C24531ah.this.mo40404a(kVar, new C24561au(a2.mo40483a(), alVar), a2, d);
                        } else {
                            c.onUltimateProducerReached(b, "PartialDiskCacheProducer", true);
                            kVar.mo40434b(d, 9);
                        }
                    } else {
                        AbstractC24547an anVar2 = c;
                        String str2 = b;
                        anVar2.onProducerFinishWithSuccess(str2, "PartialDiskCacheProducer", C24531ah.m46909a(anVar2, str2, false, 0));
                        C24531ah.this.mo40404a(kVar, alVar, a2, d);
                    }
                }
                return null;
            }
        });
        alVar.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1889n.C24531ah.C245332 */

            static {
                Covode.recordClassIndex(28677);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.ah$a */
    public static class C24534a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: a */
        private final C24373e f58274a;

        /* renamed from: b */
        private final AbstractC24026e f58275b;

        /* renamed from: c */
        private final AbstractC24113i f58276c;

        /* renamed from: d */
        private final AbstractC24104a f58277d;

        /* renamed from: f */
        private final C24456e f58278f;

        static {
            Covode.recordClassIndex(28678);
        }

        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar;
            Throwable th;
            C24456e eVar2 = (C24456e) obj;
            if (m46994b(i)) {
                return;
            }
            if (this.f58278f == null || eVar2.f58103j == null) {
                if (m46993a(i, 8) && m46992a(i) && eVar2.mo40303c() != C24314c.f57663a) {
                    this.f58274a.mo40175a(this.f58275b, eVar2);
                }
                this.f58467e.mo40434b(eVar2, i);
                return;
            }
            try {
                C24456e eVar3 = this.f58278f;
                AbstractC24115k a = this.f58276c.mo39682a(eVar2.mo40309h() + eVar2.f58103j.f57764a);
                m46913a(eVar3.mo40301b(), a, eVar2.f58103j.f57764a);
                m46913a(eVar2.mo40301b(), a, eVar2.mo40309h());
                C24117a a2 = C24117a.m45706a(a.mo39691a());
                try {
                    eVar = new C24456e(a2);
                    try {
                        eVar.mo40311j();
                        this.f58467e.mo40434b(eVar, 1);
                        C24456e.m46681d(eVar);
                        C24117a.m45712c(a2);
                        eVar2.close();
                        this.f58278f.close();
                        this.f58274a.mo40180g(this.f58275b);
                    } catch (Throwable th2) {
                        th = th2;
                        C24456e.m46681d(eVar);
                        C24117a.m45712c(a2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    eVar = null;
                    C24456e.m46681d(eVar);
                    C24117a.m45712c(a2);
                    throw th;
                }
            } catch (IOException e) {
                C24099a.m45658c("PartialDiskCacheProducer", "Error while merging image data", e);
                this.f58467e.mo40435b(e);
            } catch (Throwable th4) {
                eVar2.close();
                this.f58278f.close();
                throw th4;
            }
        }

        /* renamed from: a */
        private void m46913a(InputStream inputStream, OutputStream outputStream, int i) {
            MethodCollector.m26663i(4029);
            byte[] bArr = (byte[]) this.f58277d.mo39664a(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f58277d.mo39665a(bArr);
                    MethodCollector.m26664o(4029);
                    throw th;
                }
            }
            this.f58277d.mo39665a(bArr);
            if (i2 <= 0) {
                MethodCollector.m26664o(4029);
                return;
            }
            IOException iOException = new IOException(C1764a.m5929a(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            MethodCollector.m26664o(4029);
            throw iOException;
        }

        private C24534a(AbstractC24596k<C24456e> kVar, C24373e eVar, AbstractC24026e eVar2, AbstractC24113i iVar, AbstractC24104a aVar, C24456e eVar3) {
            super(kVar);
            this.f58274a = eVar;
            this.f58275b = eVar2;
            this.f58276c = iVar;
            this.f58277d = aVar;
            this.f58278f = eVar3;
        }

        /* synthetic */ C24534a(AbstractC24596k kVar, C24373e eVar, AbstractC24026e eVar2, AbstractC24113i iVar, AbstractC24104a aVar, C24456e eVar3, byte b) {
            this(kVar, eVar, eVar2, iVar, aVar, eVar3);
        }
    }

    /* renamed from: a */
    public final void mo40404a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar, AbstractC24026e eVar, C24456e eVar2) {
        this.f58265e.mo40379a(new C24534a(kVar, this.f58261a, eVar, this.f58263c, this.f58264d, eVar2, (byte) 0), alVar);
    }

    /* renamed from: a */
    static Map<String, String> m46909a(AbstractC24547an anVar, String str, boolean z, int i) {
        if (!anVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return C24086f.m45604of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C24086f.m45603of("cached_value_found", String.valueOf(z));
    }

    public C24531ah(C24373e eVar, AbstractC24380f fVar, AbstractC24113i iVar, AbstractC24104a aVar, AbstractC24544ak<C24456e> akVar) {
        this.f58261a = eVar;
        this.f58262b = fVar;
        this.f58263c = iVar;
        this.f58264d = aVar;
        this.f58265e = akVar;
    }
}
