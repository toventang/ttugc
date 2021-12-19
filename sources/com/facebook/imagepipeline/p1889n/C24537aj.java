package com.facebook.imagepipeline.p1889n;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24086f;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.AbstractC24642e;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.aj */
public final class C24537aj implements AbstractC24544ak<C24117a<AbstractC24454c>> {

    /* renamed from: a */
    public final AbstractC24357f f58286a;

    /* renamed from: b */
    public final Executor f58287b;

    /* renamed from: c */
    private final AbstractC24544ak<C24117a<AbstractC24454c>> f58288c;

    static {
        Covode.recordClassIndex(28681);
    }

    /* renamed from: com.facebook.imagepipeline.n.aj$a */
    class C24538a extends AbstractC24604n<C24117a<AbstractC24454c>, C24117a<AbstractC24454c>> {

        /* renamed from: a */
        final AbstractC24547an f58289a;

        /* renamed from: b */
        final String f58290b;

        /* renamed from: c */
        final AbstractC24641d f58291c;

        /* renamed from: d */
        public C24117a<AbstractC24454c> f58292d;

        /* renamed from: f */
        public int f58293f;

        /* renamed from: g */
        public boolean f58294g;

        /* renamed from: h */
        boolean f58295h;

        /* renamed from: j */
        private boolean f58297j;

        static {
            Covode.recordClassIndex(28682);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40276a() {
            mo40410e();
        }

        /* renamed from: f */
        private synchronized boolean m46919f() {
            boolean z;
            MethodCollector.m26663i(6881);
            z = this.f58297j;
            MethodCollector.m26664o(6881);
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo40407c() {
            C24537aj.this.f58287b.execute(new Runnable() {
                /* class com.facebook.imagepipeline.p1889n.C24537aj.C24538a.RunnableC245402 */

                static {
                    Covode.recordClassIndex(28684);
                }

                public final void run() {
                    C24117a<AbstractC24454c> aVar;
                    int i;
                    C24117a<AbstractC24454c> aVar2;
                    boolean d;
                    MethodCollector.m26663i(4928);
                    synchronized (C24538a.this) {
                        try {
                            aVar = C24538a.this.f58292d;
                            i = C24538a.this.f58293f;
                            aVar2 = null;
                            C24538a.this.f58292d = null;
                            C24538a.this.f58294g = false;
                        } finally {
                            MethodCollector.m26664o(4928);
                        }
                    }
                    if (C24117a.m45710a((C24117a<?>) aVar)) {
                        try {
                            C24538a aVar3 = C24538a.this;
                            C24091i.m45620a(C24117a.m45710a((C24117a<?>) aVar));
                            if (!(aVar.mo39695a() instanceof C24455d)) {
                                aVar3.mo40406a(aVar, i);
                            } else {
                                aVar3.f58289a.onProducerStart(aVar3.f58290b, "PostprocessorProducer");
                                try {
                                    aVar = aVar3.mo40405a(aVar.mo39695a());
                                    try {
                                        aVar3.f58289a.onProducerFinishWithSuccess(aVar3.f58290b, "PostprocessorProducer", C24538a.m46918a(aVar3.f58289a, aVar3.f58290b, aVar3.f58291c));
                                        aVar3.mo40406a(aVar, i);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                } catch (Exception e) {
                                    aVar3.f58289a.onProducerFinishWithFailure(aVar3.f58290b, "PostprocessorProducer", e, C24538a.m46918a(aVar3.f58289a, aVar3.f58290b, aVar3.f58291c));
                                    aVar3.mo40408c(e);
                                }
                                C24117a.m45712c(aVar2);
                            }
                            C24117a.m45712c(aVar);
                        } finally {
                            C24117a.m45712c(aVar);
                            MethodCollector.m26664o(4928);
                        }
                    }
                    C24538a aVar4 = C24538a.this;
                    synchronized (aVar4) {
                        try {
                            aVar4.f58295h = false;
                            d = aVar4.mo40409d();
                        } finally {
                            MethodCollector.m26664o(4928);
                        }
                    }
                    if (d) {
                        aVar4.mo40407c();
                    }
                }
            });
        }

        /* renamed from: e */
        public final void mo40410e() {
            if (m46920g()) {
                this.f58467e.mo40432b();
            }
        }

        /* renamed from: g */
        private boolean m46920g() {
            MethodCollector.m26663i(6882);
            synchronized (this) {
                try {
                    if (this.f58297j) {
                        return false;
                    }
                    C24117a<AbstractC24454c> aVar = this.f58292d;
                    this.f58292d = null;
                    this.f58297j = true;
                    C24117a.m45712c(aVar);
                    MethodCollector.m26664o(6882);
                    return true;
                } finally {
                    MethodCollector.m26664o(6882);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final synchronized boolean mo40409d() {
            MethodCollector.m26663i(6599);
            if (this.f58297j || !this.f58294g || this.f58295h || !C24117a.m45710a((C24117a<?>) this.f58292d)) {
                MethodCollector.m26664o(6599);
                return false;
            }
            this.f58295h = true;
            MethodCollector.m26664o(6599);
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40279a(Throwable th) {
            mo40408c(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo40408c(Throwable th) {
            if (m46920g()) {
                this.f58467e.mo40435b(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C24117a<AbstractC24454c> mo40405a(AbstractC24454c cVar) {
            C24455d dVar = (C24455d) cVar;
            C24117a<Bitmap> process = this.f58291c.process(dVar.f58089a, C24537aj.this.f58286a);
            try {
                return C24117a.m45706a(new C24455d(process, cVar.mo40297e(), dVar.f58090b, dVar.f58091c));
            } finally {
                C24117a.m45712c(process);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo40406a(C24117a<AbstractC24454c> aVar, int i) {
            if (!m46992a(i)) {
                if (m46919f()) {
                    return;
                }
            } else if (!m46920g()) {
                return;
            }
            this.f58467e.mo40434b(aVar, i);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            com.facebook.common.p1836h.C24117a.m45712c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            if (r0 == false) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
            mo40407c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7022);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            return;
         */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo40278a(java.lang.Object r4, int r5) {
            /*
                r3 = this;
                r2 = 7022(0x1b6e, float:9.84E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
                com.facebook.common.h.a r4 = (com.facebook.common.p1836h.C24117a) r4
                boolean r0 = com.facebook.common.p1836h.C24117a.m45710a(r4)
                if (r0 != 0) goto L_0x001b
                boolean r0 = m46992a(r5)
                if (r0 == 0) goto L_0x0017
                r0 = 0
                r3.mo40406a(r0, r5)
            L_0x0017:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
                return
            L_0x001b:
                monitor-enter(r3)
                boolean r0 = r3.f58297j     // Catch:{ all -> 0x0043 }
                if (r0 == 0) goto L_0x0025
                monitor-exit(r3)     // Catch:{ all -> 0x0043 }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
                return
            L_0x0025:
                com.facebook.common.h.a<com.facebook.imagepipeline.j.c> r1 = r3.f58292d
                com.facebook.common.h.a r0 = com.facebook.common.p1836h.C24117a.m45711b(r4)
                r3.f58292d = r0
                r3.f58293f = r5
                r0 = 1
                r3.f58294g = r0
                boolean r0 = r3.mo40409d()
                monitor-exit(r3)
                com.facebook.common.p1836h.C24117a.m45712c(r1)
                if (r0 == 0) goto L_0x003f
                r3.mo40407c()
            L_0x003f:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
                return
            L_0x0043:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24537aj.C24538a.mo40278a(java.lang.Object, int):void");
        }

        /* renamed from: a */
        static Map<String, String> m46918a(AbstractC24547an anVar, String str, AbstractC24641d dVar) {
            if (!anVar.requiresExtraMap(str)) {
                return null;
            }
            return C24086f.m45603of("Postprocessor", dVar.getName());
        }

        public C24538a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24547an anVar, String str, AbstractC24641d dVar, AbstractC24545al alVar) {
            super(kVar);
            this.f58289a = anVar;
            this.f58290b = str;
            this.f58291c = dVar;
            alVar.mo40414a(new C24587e(C24537aj.this) {
                /* class com.facebook.imagepipeline.p1889n.C24537aj.C24538a.C245391 */

                static {
                    Covode.recordClassIndex(28683);
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: a */
                public final void mo34237a() {
                    C24538a.this.mo40410e();
                }
            });
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.aj$b */
    class C24541b extends AbstractC24604n<C24117a<AbstractC24454c>, C24117a<AbstractC24454c>> {

        /* renamed from: b */
        private boolean f58302b;

        /* renamed from: c */
        private C24117a<AbstractC24454c> f58303c;

        static {
            Covode.recordClassIndex(28685);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40276a() {
            if (mo40412c()) {
                this.f58467e.mo40432b();
            }
        }

        /* renamed from: c */
        public final boolean mo40412c() {
            MethodCollector.m26663i(6455);
            synchronized (this) {
                try {
                    if (this.f58302b) {
                        return false;
                    }
                    C24117a<AbstractC24454c> aVar = this.f58303c;
                    this.f58303c = null;
                    this.f58302b = true;
                    C24117a.m45712c(aVar);
                    MethodCollector.m26664o(6455);
                    return true;
                } finally {
                    MethodCollector.m26664o(6455);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24604n, com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final void mo40279a(Throwable th) {
            if (mo40412c()) {
                this.f58467e.mo40435b(th);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            MethodCollector.m26663i(6592);
            C24117a aVar = (C24117a) obj;
            if (!m46994b(i)) {
                synchronized (this) {
                    try {
                        if (!this.f58302b) {
                            C24117a<AbstractC24454c> aVar2 = this.f58303c;
                            this.f58303c = C24117a.m45711b(aVar);
                            C24117a.m45712c(aVar2);
                        }
                    } finally {
                        MethodCollector.m26664o(6592);
                    }
                }
                synchronized (this) {
                    try {
                        if (!this.f58302b) {
                            C24117a b = C24117a.m45711b(this.f58303c);
                            try {
                                this.f58467e.mo40434b(b, 0);
                            } finally {
                                C24117a.m45712c(b);
                                MethodCollector.m26664o(6592);
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(6592);
                    }
                }
            } else {
                MethodCollector.m26664o(6592);
            }
        }

        private C24541b(C24538a aVar, AbstractC24545al alVar) {
            super(aVar);
            alVar.mo40414a(new C24587e(C24537aj.this) {
                /* class com.facebook.imagepipeline.p1889n.C24537aj.C24541b.C245421 */

                static {
                    Covode.recordClassIndex(28686);
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: a */
                public final void mo34237a() {
                    if (C24541b.this.mo40412c()) {
                        C24541b.this.f58467e.mo40432b();
                    }
                }
            });
        }

        /* synthetic */ C24541b(C24537aj ajVar, C24538a aVar, AbstractC24545al alVar, byte b) {
            this(aVar, alVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.aj$c */
    class C24543c extends AbstractC24604n<C24117a<AbstractC24454c>, C24117a<AbstractC24454c>> {
        static {
            Covode.recordClassIndex(28687);
        }

        private C24543c(C24538a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
        /* renamed from: a */
        public final /* synthetic */ void mo40278a(Object obj, int i) {
            if (!m46994b(i)) {
                this.f58467e.mo40434b(obj, i);
            }
        }

        /* synthetic */ C24543c(C24537aj ajVar, C24538a aVar, byte b) {
            this(aVar);
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24117a<AbstractC24454c>> kVar, AbstractC24545al alVar) {
        AbstractC24596k<C24117a<AbstractC24454c>> cVar;
        AbstractC24547an c = alVar.mo40416c();
        AbstractC24641d dVar = alVar.mo40413a().mPostprocessor;
        C24538a aVar = new C24538a(kVar, c, alVar.mo40415b(), dVar, alVar);
        if (dVar instanceof AbstractC24642e) {
            cVar = new C24541b(this, aVar, alVar, (byte) 0);
        } else {
            cVar = new C24543c(this, aVar, (byte) 0);
        }
        this.f58288c.mo40379a(cVar, alVar);
    }

    public C24537aj(AbstractC24544ak<C24117a<AbstractC24454c>> akVar, AbstractC24357f fVar, Executor executor) {
        this.f58288c = (AbstractC24544ak) C24091i.m45617a(akVar);
        this.f58286a = fVar;
        this.f58287b = (Executor) C24091i.m45617a(executor);
    }
}
