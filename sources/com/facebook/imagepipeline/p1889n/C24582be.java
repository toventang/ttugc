package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1835g.AbstractC24115k;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.EnumC24132f;
import com.facebook.imagepipeline.nativecode.AbstractC24633c;
import com.facebook.imagepipeline.nativecode.C24634d;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.p1870h.C24313b;
import com.facebook.p1870h.C24314c;
import com.facebook.p1870h.C24316d;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.be */
public final class C24582be implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    final Executor f58404a;

    /* renamed from: b */
    public final AbstractC24113i f58405b;

    /* renamed from: c */
    private final AbstractC24544ak<C24456e> f58406c;

    static {
        Covode.recordClassIndex(28726);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        this.f58406c.mo40379a(new C24584a(kVar, alVar), alVar);
    }

    /* renamed from: com.facebook.imagepipeline.n.be$a */
    class C24584a extends AbstractC24604n<C24456e, C24456e> {

        /* renamed from: b */
        private final AbstractC24545al f58410b;

        /* renamed from: c */
        private EnumC24132f f58411c = EnumC24132f.UNSET;

        static {
            Covode.recordClassIndex(28728);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            EnumC24132f fVar;
            C24456e eVar = (C24456e) obj;
            if (this.f58411c == EnumC24132f.UNSET && eVar != null) {
                C24091i.m45617a(eVar);
                C24314c a = C24316d.m46270a(eVar.mo40301b());
                if (C24313b.m46265b(a)) {
                    AbstractC24633c cVar = C24634d.f58545a;
                    if (cVar != null) {
                        fVar = EnumC24132f.valueOf(!cVar.isWebpNativelySupported(a));
                    }
                    fVar = EnumC24132f.NO;
                } else {
                    if (a == C24314c.f57663a) {
                        fVar = EnumC24132f.UNSET;
                    }
                    fVar = EnumC24132f.NO;
                }
                this.f58411c = fVar;
            }
            if (this.f58411c != EnumC24132f.NO) {
                if (!m46992a(i)) {
                    return;
                }
                if (this.f58411c == EnumC24132f.YES && eVar != null) {
                    C24582be beVar = C24582be.this;
                    AbstractC24596k<O> kVar = this.f58467e;
                    AbstractC24545al alVar = this.f58410b;
                    C24091i.m45617a(eVar);
                    beVar.f58404a.execute(new AbstractC24562av<C24456e>(kVar, alVar.mo40416c(), "WebpTranscodeProducer", alVar.mo40415b(), C24456e.m46679a(eVar)) {
                        /* class com.facebook.imagepipeline.p1889n.C24582be.C245831 */

                        /* renamed from: b */
                        final /* synthetic */ C24456e f58407b;

                        static {
                            Covode.recordClassIndex(28727);
                        }

                        @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
                        /* renamed from: b */
                        public final void mo39639b() {
                            C24456e.m46681d(this.f58407b);
                            super.mo39639b();
                        }

                        /* JADX INFO: finally extract failed */
                        /* access modifiers changed from: private */
                        /* renamed from: d */
                        public C24456e mo39641c() {
                            AbstractC24115k a = C24582be.this.f58405b.mo39681a();
                            try {
                                C24456e eVar = this.f58407b;
                                InputStream b = eVar.mo40301b();
                                C24314c a2 = C24316d.m46270a(b);
                                if (a2 == C24313b.f57656f || a2 == C24313b.f57658h) {
                                    C24634d.f58545a.transcodeWebpToJpeg(b, a, 80);
                                    eVar.f58096c = C24313b.f57651a;
                                } else if (a2 == C24313b.f57657g || a2 == C24313b.f57659i) {
                                    C24634d.f58545a.transcodeWebpToPng(b, a);
                                    eVar.f58096c = C24313b.f57652b;
                                } else {
                                    throw new IllegalArgumentException("Wrong image format");
                                }
                                C24117a a3 = C24117a.m45706a(a.mo39691a());
                                try {
                                    C24456e eVar2 = new C24456e(a3);
                                    eVar2.mo40302b(this.f58407b);
                                    C24117a.m45712c(a3);
                                    return eVar2;
                                } catch (Throwable th) {
                                    C24117a.m45712c(a3);
                                    throw th;
                                }
                            } finally {
                                a.close();
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
                        /* renamed from: b */
                        public final /* synthetic */ void mo39640b(C24456e eVar) {
                            C24456e.m46681d(eVar);
                        }

                        @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
                        /* renamed from: a */
                        public final void mo39637a(Exception exc) {
                            C24456e.m46681d(this.f58407b);
                            super.mo39637a(exc);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
                        /* renamed from: a */
                        public final /* synthetic */ void mo39638a(C24456e eVar) {
                            C24456e.m46681d(this.f58407b);
                            super.mo39638a(eVar);
                        }

                        {
                            this.f58407b = r6;
                        }
                    });
                    return;
                }
            }
            this.f58467e.mo40434b(eVar, i);
        }

        public C24584a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
            super(kVar);
            this.f58410b = alVar;
        }
    }

    public C24582be(Executor executor, AbstractC24113i iVar, AbstractC24544ak<C24456e> akVar) {
        this.f58404a = (Executor) C24091i.m45617a(executor);
        this.f58405b = (AbstractC24113i) C24091i.m45617a(iVar);
        this.f58406c = (AbstractC24544ak) C24091i.m45617a(akVar);
    }
}
