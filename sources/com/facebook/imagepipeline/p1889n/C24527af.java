package com.facebook.imagepipeline.p1889n;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24104a;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1835g.AbstractC24115k;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24360a;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.AbstractC24529ag;
import com.facebook.imagepipeline.p1891p.C24644b;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.af */
public final class C24527af implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    final AbstractC24113i f58256a;

    /* renamed from: b */
    final AbstractC24104a f58257b;

    /* renamed from: c */
    final AbstractC24529ag f58258c;

    static {
        Covode.recordClassIndex(28671);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, String> mo40399a(C24614t tVar, int i) {
        if (!tVar.mo40452b().requiresExtraMap(tVar.mo40451a())) {
            return null;
        }
        return this.f58258c.getExtraMap(tVar, i);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        alVar.mo40416c().onProducerStart(alVar.mo40415b(), "NetworkFetchProducer");
        final C24614t createFetchState = this.f58258c.createFetchState(kVar, alVar);
        this.f58258c.fetch(createFetchState, new AbstractC24529ag.AbstractC24530a() {
            /* class com.facebook.imagepipeline.p1889n.C24527af.C245281 */

            static {
                Covode.recordClassIndex(28672);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag.AbstractC24530a
            /* renamed from: a */
            public final void mo40400a() {
                C24527af afVar = C24527af.this;
                C24614t tVar = createFetchState;
                tVar.mo40452b().onProducerFinishWithCancellation(tVar.mo40451a(), "NetworkFetchProducer", afVar.mo40399a(tVar, -1));
                tVar.f58494d.mo40432b();
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag.AbstractC24530a
            /* renamed from: a */
            public final void mo40402a(Throwable th) {
                String str;
                C24527af afVar = C24527af.this;
                C24614t tVar = createFetchState;
                Map<String, String> a = afVar.mo40399a(tVar, -1);
                if (a == null) {
                    a = new HashMap<>(1);
                }
                if (afVar.f58258c == null) {
                    str = "null";
                } else {
                    str = afVar.f58258c.getClass().getName() + ", " + afVar.f58258c.toString();
                }
                a.put("NetworkFetcher", str);
                tVar.mo40452b().onProducerFinishWithFailure(tVar.mo40451a(), "NetworkFetchProducer", th, a);
                tVar.mo40452b().onUltimateProducerReached(tVar.mo40451a(), "NetworkFetchProducer", false);
                tVar.f58494d.mo40435b(th);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag.AbstractC24530a
            /* renamed from: a */
            public final void mo40401a(InputStream inputStream, int i) {
                AbstractC24115k a;
                float f;
                MethodCollector.m26663i(7941);
                C24644b.m47156a();
                C24527af afVar = C24527af.this;
                C24614t tVar = createFetchState;
                if (i > 0) {
                    a = afVar.f58256a.mo39682a(i);
                } else {
                    a = afVar.f58256a.mo39681a();
                }
                byte[] bArr = (byte[]) afVar.f58257b.mo39664a(16384);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read < 0) {
                            afVar.f58258c.onFetchCompletion(tVar, a.mo39692b());
                            Map<String, String> a2 = afVar.mo40399a(tVar, a.mo39692b());
                            AbstractC24547an b = tVar.mo40452b();
                            b.onProducerFinishWithSuccess(tVar.mo40451a(), "NetworkFetchProducer", a2);
                            b.onUltimateProducerReached(tVar.mo40451a(), "NetworkFetchProducer", true);
                            C24527af.m46900a(a, tVar.f58497g | 1, tVar.f58498h, tVar.f58494d);
                            afVar.f58257b.mo39665a(bArr);
                            a.close();
                            C24644b.m47156a();
                            MethodCollector.m26664o(7941);
                            return;
                        } else if (read > 0) {
                            a.write(bArr, 0, read);
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (tVar.f58495e.mo40421h() && afVar.f58258c.shouldPropagate(tVar) && uptimeMillis - tVar.f58496f >= 100) {
                                tVar.f58496f = uptimeMillis;
                                tVar.mo40452b().onProducerEvent(tVar.mo40451a(), "NetworkFetchProducer", "intermediate_result");
                                C24527af.m46900a(a, tVar.f58497g, tVar.f58498h, tVar.f58494d);
                            }
                            int b2 = a.mo39692b();
                            if (i > 0) {
                                f = ((float) b2) / ((float) i);
                            } else {
                                double d = (double) (-b2);
                                Double.isNaN(d);
                                f = 1.0f - ((float) Math.exp(d / 50000.0d));
                            }
                            tVar.f58494d.mo40433b(f);
                        }
                    } catch (Throwable th) {
                        afVar.f58257b.mo39665a(bArr);
                        a.close();
                        MethodCollector.m26664o(7941);
                        throw th;
                    }
                }
            }
        });
    }

    public C24527af(AbstractC24113i iVar, AbstractC24104a aVar, AbstractC24529ag agVar) {
        this.f58256a = iVar;
        this.f58257b = aVar;
        this.f58258c = agVar;
    }

    /* renamed from: a */
    static void m46900a(AbstractC24115k kVar, int i, C24360a aVar, AbstractC24596k<C24456e> kVar2) {
        Throwable th;
        C24117a a = C24117a.m45706a(kVar.mo39691a());
        C24456e eVar = null;
        try {
            C24456e eVar2 = new C24456e(a);
            try {
                eVar2.f58103j = aVar;
                eVar2.mo40311j();
                kVar2.mo40434b(eVar2, i);
                C24456e.m46681d(eVar2);
                C24117a.m45712c(a);
            } catch (Throwable th2) {
                th = th2;
                eVar = eVar2;
                C24456e.m46681d(eVar);
                C24117a.m45712c(a);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C24456e.m46681d(eVar);
            C24117a.m45712c(a);
            throw th;
        }
    }
}
