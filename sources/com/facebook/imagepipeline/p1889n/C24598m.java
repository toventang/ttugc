package com.facebook.imagepipeline.p1889n;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24104a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24127a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1882g.AbstractC24445e;
import com.facebook.imagepipeline.p1882g.C24446f;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24459h;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.imagepipeline.p1889n.C24618v;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1870h.C24313b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.m */
public final class C24598m implements AbstractC24544ak<C24117a<AbstractC24454c>> {

    /* renamed from: a */
    public final Executor f58439a;

    /* renamed from: b */
    public final AbstractC24442c f58440b;

    /* renamed from: c */
    public final boolean f58441c;

    /* renamed from: d */
    public final boolean f58442d;

    /* renamed from: e */
    private final AbstractC24104a f58443e;

    /* renamed from: f */
    private final AbstractC24445e f58444f;

    /* renamed from: g */
    private final AbstractC24544ak<C24456e> f58445g;

    /* renamed from: h */
    private final boolean f58446h;

    /* renamed from: i */
    private final int f58447i;

    static {
        Covode.recordClassIndex(28742);
    }

    /* renamed from: com.facebook.imagepipeline.n.m$a */
    class C24599a extends AbstractC24601c {
        static {
            Covode.recordClassIndex(28743);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c
        /* renamed from: c */
        public final AbstractC24459h mo40448c() {
            return C24458g.m46700a(0, false, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c
        /* renamed from: a */
        public final int mo40446a(C24456e eVar) {
            return eVar.mo40309h();
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c
        /* renamed from: a */
        public final synchronized boolean mo40447a(C24456e eVar, int i) {
            MethodCollector.m26663i(4529);
            if (m46994b(i)) {
                MethodCollector.m26664o(4529);
                return false;
            }
            boolean a = super.mo40447a(eVar, i);
            MethodCollector.m26664o(4529);
            return a;
        }

        public C24599a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar, boolean z, int i) {
            super(kVar, alVar, z, i);
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.m$c */
    abstract class AbstractC24601c extends AbstractC24604n<C24456e, C24117a<AbstractC24454c>> {

        /* renamed from: a */
        private final String f58453a = "ProgressiveDecoder";

        /* renamed from: b */
        public final AbstractC24545al f58454b;

        /* renamed from: c */
        public final C24618v f58455c;

        /* renamed from: f */
        private final AbstractC24547an f58457f;

        /* renamed from: g */
        private final C24361b f58458g;

        /* renamed from: h */
        private boolean f58459h;

        static {
            Covode.recordClassIndex(28745);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo40446a(C24456e eVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract AbstractC24459h mo40448c();

        /* renamed from: e */
        private synchronized boolean m47076e() {
            return this.f58459h;
        }

        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40276a() {
            mo40450d();
        }

        /* renamed from: d */
        public final void mo40450d() {
            m47074a(true);
            this.f58467e.mo40432b();
        }

        /* renamed from: c */
        private void m47075c(Throwable th) {
            m47074a(true);
            this.f58467e.mo40435b(th);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40277a(float f) {
            super.mo40277a(f * 0.99f);
        }

        /* renamed from: a */
        private void m47074a(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f58459h) {
                        this.f58467e.mo40433b(1.0f);
                        this.f58459h = true;
                        this.f58455c.mo40456a();
                    }
                }
            }
        }

        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40279a(Throwable th) {
            m47075c(th);
        }

        /* JADX INFO: finally extract failed */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            C24456e eVar = (C24456e) obj;
            try {
                C24644b.m47156a();
                boolean a = m46992a(i);
                if (a && !C24456e.m46682e(eVar)) {
                    m47075c(new C24127a("Encoded image is not valid."));
                    C24644b.m47156a();
                } else if (!mo40447a(eVar, i)) {
                    C24644b.m47156a();
                } else {
                    boolean a2 = m46993a(i, 4);
                    if (a || a2 || this.f58454b.mo40421h()) {
                        this.f58455c.mo40458b();
                    }
                    C24644b.m47156a();
                }
            } catch (Throwable th) {
                C24644b.m47156a();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40447a(C24456e eVar, int i) {
            return this.f58455c.mo40457a(eVar, i);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3 A[Catch:{ all -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd A[Catch:{ Exception -> 0x012d }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo40449b(com.facebook.imagepipeline.p1885j.C24456e r22, int r23) {
            /*
            // Method dump skipped, instructions count: 379
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c.mo40449b(com.facebook.imagepipeline.j.e, int):void");
        }

        public AbstractC24601c(AbstractC24596k<C24117a<AbstractC24454c>> kVar, final AbstractC24545al alVar, final boolean z, final int i) {
            super(kVar);
            this.f58454b = alVar;
            this.f58457f = alVar.mo40416c();
            C24361b bVar = alVar.mo40413a().mImageDecodeOptions;
            this.f58458g = bVar;
            this.f58459h = false;
            this.f58455c = new C24618v(C24598m.this.f58439a, new C24618v.AbstractC24622a(C24598m.this) {
                /* class com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c.C246021 */

                static {
                    Covode.recordClassIndex(28746);
                }

                @Override // com.facebook.imagepipeline.p1889n.C24618v.AbstractC24622a
                /* renamed from: a */
                public final void mo40422a(C24456e eVar, int i) {
                    if (eVar != null) {
                        if (C24598m.this.f58441c || !AbstractC24574b.m46993a(i, 16)) {
                            C24636b a = alVar.mo40413a();
                            if (C24598m.this.f58442d || !C24134g.m45737b(a.mSourceUri)) {
                                eVar.f58101h = C24610q.m47101a(a.mRotationOptions, a.mResizeOptions, eVar, i);
                            }
                        }
                        AbstractC24601c.this.mo40449b(eVar, i);
                    }
                }
            }, bVar.f57767b);
            alVar.mo40414a(new C24587e(C24598m.this) {
                /* class com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c.C246032 */

                static {
                    Covode.recordClassIndex(28747);
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: a */
                public final void mo34237a() {
                    if (z) {
                        AbstractC24601c.this.mo40450d();
                    }
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: c */
                public final void mo40397c() {
                    if (AbstractC24601c.this.f58454b.mo40421h()) {
                        AbstractC24601c.this.f58455c.mo40458b();
                    }
                }
            });
        }

        /* renamed from: a */
        private Map<String, String> m47073a(AbstractC24454c cVar, long j, AbstractC24459h hVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.f58457f.requiresExtraMap(this.f58454b.mo40415b())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(hVar.mo40313b());
            String valueOf3 = String.valueOf(z);
            if (cVar instanceof C24455d) {
                Bitmap bitmap = ((C24455d) cVar).f58089a;
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", bitmap.getWidth() + "x" + bitmap.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                return C24086f.copyOf(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return C24086f.copyOf(hashMap2);
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.m$b */
    class C24600b extends AbstractC24601c {

        /* renamed from: f */
        private final C24446f f58450f;

        /* renamed from: g */
        private final AbstractC24445e f58451g;

        /* renamed from: h */
        private int f58452h = 0;

        static {
            Covode.recordClassIndex(28744);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c
        /* renamed from: c */
        public final AbstractC24459h mo40448c() {
            return this.f58451g.mo40286b(this.f58450f.f58078a);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c
        /* renamed from: a */
        public final int mo40446a(C24456e eVar) {
            return this.f58450f.f58079b;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.C24598m.AbstractC24601c
        /* renamed from: a */
        public final synchronized boolean mo40447a(C24456e eVar, int i) {
            MethodCollector.m26663i(4521);
            boolean a = super.mo40447a(eVar, i);
            if ((m46994b(i) || m46993a(i, 8)) && !m46993a(i, 4) && C24456e.m46682e(eVar) && eVar.mo40303c() == C24313b.f57651a) {
                if (!this.f58450f.mo40287a(eVar)) {
                    MethodCollector.m26664o(4521);
                    return false;
                }
                int i2 = this.f58450f.f58078a;
                int i3 = this.f58452h;
                if (i2 <= i3) {
                    MethodCollector.m26664o(4521);
                    return false;
                } else if (i2 >= this.f58451g.mo40285a(i3) || this.f58450f.f58080c) {
                    this.f58452h = i2;
                } else {
                    MethodCollector.m26664o(4521);
                    return false;
                }
            }
            MethodCollector.m26664o(4521);
            return a;
        }

        public C24600b(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar, C24446f fVar, AbstractC24445e eVar, boolean z, int i) {
            super(kVar, alVar, z, i);
            this.f58450f = (C24446f) C24091i.m45617a(fVar);
            this.f58451g = (AbstractC24445e) C24091i.m45617a(eVar);
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar) {
        AbstractC24596k<C24456e> bVar;
        try {
            C24644b.m47156a();
            if (!C24134g.m45737b(alVar.mo40413a().mSourceUri)) {
                bVar = new C24599a(kVar, alVar, this.f58446h, this.f58447i);
            } else {
                bVar = new C24600b(kVar, alVar, new C24446f(this.f58443e), this.f58444f, this.f58446h, this.f58447i);
            }
            this.f58445g.mo40379a(bVar, alVar);
            C24644b.m47156a();
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    public C24598m(AbstractC24104a aVar, Executor executor, AbstractC24442c cVar, AbstractC24445e eVar, boolean z, boolean z2, boolean z3, AbstractC24544ak<C24456e> akVar, int i) {
        this.f58443e = (AbstractC24104a) C24091i.m45617a(aVar);
        this.f58439a = (Executor) C24091i.m45617a(executor);
        this.f58440b = (AbstractC24442c) C24091i.m45617a(cVar);
        this.f58444f = (AbstractC24445e) C24091i.m45617a(eVar);
        this.f58441c = z;
        this.f58442d = z2;
        this.f58445g = (AbstractC24544ak) C24091i.m45617a(akVar);
        this.f58446h = z3;
        this.f58447i = i;
    }
}
