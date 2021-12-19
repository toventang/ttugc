package com.facebook.imagepipeline.p1889n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.p1891p.C24644b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.imagepipeline.n.ae */
public abstract class AbstractC24523ae<K, T extends Closeable> implements AbstractC24544ak<T> {

    /* renamed from: a */
    final Map<K, AbstractC24523ae<K, T>.C24524a> f58243a = new HashMap();

    /* renamed from: b */
    public final AbstractC24544ak<T> f58244b;

    static {
        Covode.recordClassIndex(28667);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo40387a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract K mo40388a(AbstractC24545al alVar);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.ae$a */
    public class C24524a {

        /* renamed from: a */
        final K f58245a;

        /* renamed from: b */
        public final CopyOnWriteArraySet<Pair<AbstractC24596k<T>, AbstractC24545al>> f58246b = new CopyOnWriteArraySet<>();

        /* renamed from: c */
        T f58247c;

        /* renamed from: d */
        float f58248d;

        /* renamed from: e */
        public C24586d f58249e;

        /* renamed from: f */
        AbstractC24523ae<K, T>.C24524a.C24526a f58250f;

        /* renamed from: h */
        private int f58252h;

        static {
            Covode.recordClassIndex(28668);
        }

        /* renamed from: b */
        public final synchronized List<AbstractC24546am> mo40393b() {
            MethodCollector.m26663i(4295);
            C24586d dVar = this.f58249e;
            if (dVar == null) {
                MethodCollector.m26664o(4295);
                return null;
            }
            List<AbstractC24546am> a = dVar.mo40441a(m46883e());
            MethodCollector.m26664o(4295);
            return a;
        }

        /* renamed from: c */
        public final synchronized List<AbstractC24546am> mo40394c() {
            MethodCollector.m26663i(4359);
            C24586d dVar = this.f58249e;
            if (dVar == null) {
                MethodCollector.m26664o(4359);
                return null;
            }
            List<AbstractC24546am> b = dVar.mo40442b(m46884f());
            MethodCollector.m26664o(4359);
            return b;
        }

        /* renamed from: d */
        public final synchronized List<AbstractC24546am> mo40395d() {
            MethodCollector.m26663i(4363);
            C24586d dVar = this.f58249e;
            if (dVar == null) {
                MethodCollector.m26664o(4363);
                return null;
            }
            List<AbstractC24546am> a = dVar.mo40440a(m46885g());
            MethodCollector.m26664o(4363);
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.n.ae$a$a */
        public class C24526a extends AbstractC24574b<T> {
            static {
                Covode.recordClassIndex(28670);
            }

            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final void mo40276a() {
                MethodCollector.m26663i(7327);
                try {
                    C24644b.m47156a();
                    C24524a aVar = C24524a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.f58250f == this) {
                                aVar.f58250f = null;
                                aVar.f58249e = null;
                                C24524a.m46882a(aVar.f58247c);
                                aVar.f58247c = null;
                                aVar.mo40390a();
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(7327);
                            throw th;
                        }
                    }
                } finally {
                    C24644b.m47156a();
                    MethodCollector.m26664o(7327);
                }
            }

            private C24526a() {
            }

            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final void mo40277a(float f) {
                MethodCollector.m26663i(7329);
                try {
                    C24644b.m47156a();
                    C24524a aVar = C24524a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.f58250f == this) {
                                aVar.f58248d = f;
                                Iterator<Pair<AbstractC24596k<T>, AbstractC24545al>> it = aVar.f58246b.iterator();
                                while (it.hasNext()) {
                                    Pair<AbstractC24596k<T>, AbstractC24545al> next = it.next();
                                    synchronized (next) {
                                        try {
                                            ((AbstractC24596k) next.first).mo40433b(f);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(7329);
                        }
                    }
                } finally {
                    C24644b.m47156a();
                    MethodCollector.m26664o(7329);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final void mo40279a(Throwable th) {
                MethodCollector.m26663i(7188);
                try {
                    C24644b.m47156a();
                    AbstractC24523ae<K, T>.C24524a aVar = C24524a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.f58250f == this) {
                                Iterator<Pair<AbstractC24596k<T>, AbstractC24545al>> it = aVar.f58246b.iterator();
                                aVar.f58246b.clear();
                                AbstractC24523ae.this.mo40389a(aVar.f58245a, aVar);
                                C24524a.m46882a(aVar.f58247c);
                                aVar.f58247c = null;
                                while (it.hasNext()) {
                                    Pair<AbstractC24596k<T>, AbstractC24545al> next = it.next();
                                    synchronized (next) {
                                        try {
                                            ((AbstractC24596k) next.first).mo40435b(th);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(7188);
                        }
                    }
                } finally {
                    C24644b.m47156a();
                    MethodCollector.m26664o(7188);
                }
            }

            /* synthetic */ C24526a(C24524a aVar, byte b) {
                this();
            }

            /* JADX INFO: finally extract failed */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.facebook.imagepipeline.n.ae$a */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo40278a(Object obj, int i) {
                Closeable closeable = (Closeable) obj;
                try {
                    C24644b.m47156a();
                    C24524a.this.mo40391a(this, closeable, i);
                    C24644b.m47156a();
                } catch (Throwable th) {
                    C24644b.m47156a();
                    throw th;
                }
            }
        }

        /* renamed from: e */
        private synchronized boolean m46883e() {
            MethodCollector.m26663i(4354);
            Iterator<Pair<AbstractC24596k<T>, AbstractC24545al>> it = this.f58246b.iterator();
            while (it.hasNext()) {
                if (!((AbstractC24545al) it.next().second).mo40419f()) {
                    MethodCollector.m26664o(4354);
                    return false;
                }
            }
            MethodCollector.m26664o(4354);
            return true;
        }

        /* renamed from: f */
        private synchronized boolean m46884f() {
            MethodCollector.m26663i(4361);
            Iterator<Pair<AbstractC24596k<T>, AbstractC24545al>> it = this.f58246b.iterator();
            while (it.hasNext()) {
                if (((AbstractC24545al) it.next().second).mo40421h()) {
                    MethodCollector.m26664o(4361);
                    return true;
                }
            }
            MethodCollector.m26664o(4361);
            return false;
        }

        /* renamed from: g */
        private synchronized EnumC24362c m46885g() {
            EnumC24362c cVar;
            MethodCollector.m26663i(4418);
            cVar = EnumC24362c.LOW;
            Iterator<Pair<AbstractC24596k<T>, AbstractC24545al>> it = this.f58246b.iterator();
            while (it.hasNext()) {
                cVar = EnumC24362c.getHigherPriority(cVar, ((AbstractC24545al) it.next().second).mo40420g());
            }
            MethodCollector.m26664o(4418);
            return cVar;
        }

        /* renamed from: a */
        public final void mo40390a() {
            boolean z;
            MethodCollector.m26663i(4294);
            synchronized (this) {
                try {
                    boolean z2 = true;
                    if (this.f58249e == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C24091i.m45620a(z);
                    if (this.f58250f != null) {
                        z2 = false;
                    }
                    C24091i.m45620a(z2);
                    if (this.f58246b.isEmpty()) {
                        AbstractC24523ae.this.mo40389a(this.f58245a, this);
                        return;
                    }
                    AbstractC24545al alVar = (AbstractC24545al) this.f58246b.iterator().next().second;
                    this.f58249e = new C24586d(alVar.mo40413a(), alVar.mo40415b(), alVar.mo40416c(), alVar.mo40417d(), alVar.mo40418e(), m46883e(), m46884f(), m46885g());
                    AbstractC24523ae<K, T>.C24524a.C24526a aVar = new C24526a(this, (byte) 0);
                    this.f58250f = aVar;
                    AbstractC24523ae.this.f58244b.mo40379a(aVar, this.f58249e);
                    MethodCollector.m26664o(4294);
                } finally {
                    MethodCollector.m26664o(4294);
                }
            }
        }

        /* renamed from: a */
        static void m46882a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public C24524a(K k) {
            this.f58245a = k;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.facebook.imagepipeline.n.k<T extends java.io.Closeable> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.facebook.imagepipeline.n.ae */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
            com.facebook.imagepipeline.p1889n.C24586d.m47027b(r6);
            com.facebook.imagepipeline.p1889n.C24586d.m47029d(r4);
            com.facebook.imagepipeline.p1889n.C24586d.m47028c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-enter(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
            if (r3 == r8.f58247c) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
            if (r3 == null) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            r3 = r8.f58251g.mo40387a(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
            monitor-exit(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            if (r3 == null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
            if (r2 <= 0.0f) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
            r9.mo40433b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            r9.mo40434b(r3, r1);
            m46882a(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
            r10.mo40414a(new com.facebook.imagepipeline.p1889n.AbstractC24523ae.C24524a.C245251(r8));
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4284);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4284);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo40392a(com.facebook.imagepipeline.p1889n.AbstractC24596k<T> r9, com.facebook.imagepipeline.p1889n.AbstractC24545al r10) {
            /*
            // Method dump skipped, instructions count: 124
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.AbstractC24523ae.C24524a.mo40392a(com.facebook.imagepipeline.n.k, com.facebook.imagepipeline.n.al):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            if (r2.hasNext() == false) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            r1 = r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            ((com.facebook.imagepipeline.p1889n.AbstractC24596k) r1.first).mo40434b(r6, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4425);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4425);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo40391a(com.facebook.imagepipeline.p1889n.AbstractC24523ae<K, T>.C24524a.C24526a r5, T r6, int r7) {
            /*
                r4 = this;
                r3 = 4425(0x1149, float:6.201E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                monitor-enter(r4)
                com.facebook.imagepipeline.n.ae<K, T>$a$a r0 = r4.f58250f     // Catch:{ all -> 0x005c }
                if (r0 == r5) goto L_0x000f
                monitor-exit(r4)     // Catch:{ all -> 0x005c }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return
            L_0x000f:
                T r0 = r4.f58247c
                m46882a(r0)
                r0 = 0
                r4.f58247c = r0
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.n.k<T>, com.facebook.imagepipeline.n.al>> r0 = r4.f58246b
                java.util.Iterator r2 = r0.iterator()
                boolean r0 = com.facebook.imagepipeline.p1889n.AbstractC24574b.m46994b(r7)
                if (r0 == 0) goto L_0x002f
                com.facebook.imagepipeline.n.ae r0 = com.facebook.imagepipeline.p1889n.AbstractC24523ae.this
                java.io.Closeable r0 = r0.mo40387a(r6)
                r4.f58247c = r0
                r4.f58252h = r7
            L_0x002d:
                monitor-exit(r4)
                goto L_0x003c
            L_0x002f:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.n.k<T>, com.facebook.imagepipeline.n.al>> r0 = r4.f58246b
                r0.clear()
                com.facebook.imagepipeline.n.ae r1 = com.facebook.imagepipeline.p1889n.AbstractC24523ae.this
                K r0 = r4.f58245a
                r1.mo40389a(r0, r4)
                goto L_0x002d
            L_0x003c:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x0058
                java.lang.Object r1 = r2.next()
                android.util.Pair r1 = (android.util.Pair) r1
                monitor-enter(r1)
                java.lang.Object r0 = r1.first     // Catch:{ all -> 0x0052 }
                com.facebook.imagepipeline.n.k r0 = (com.facebook.imagepipeline.p1889n.AbstractC24596k) r0     // Catch:{ all -> 0x0052 }
                r0.mo40434b(r6, r7)     // Catch:{ all -> 0x0052 }
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                goto L_0x003c
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            L_0x0058:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return
            L_0x005c:
                r0 = move-exception
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.AbstractC24523ae.C24524a.mo40391a(com.facebook.imagepipeline.n.ae$a$a, java.io.Closeable, int):void");
        }
    }

    protected AbstractC24523ae(AbstractC24544ak<T> akVar) {
        this.f58244b = akVar;
    }

    /* renamed from: b */
    private synchronized AbstractC24523ae<K, T>.C24524a m46876b(K k) {
        AbstractC24523ae<K, T>.C24524a aVar;
        aVar = new C24524a(k);
        this.f58243a.put(k, aVar);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized AbstractC24523ae<K, T>.C24524a mo40386a(K k) {
        return this.f58243a.get(k);
    }

    /* renamed from: a */
    public final synchronized void mo40389a(K k, AbstractC24523ae<K, T>.C24524a aVar) {
        if (this.f58243a.get(k) == aVar) {
            this.f58243a.remove(k);
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<T> kVar, AbstractC24545al alVar) {
        boolean z;
        AbstractC24523ae<K, T>.C24524a a;
        try {
            C24644b.m47156a();
            K a2 = mo40388a(alVar);
            do {
                z = false;
                synchronized (this) {
                    a = mo40386a((Object) a2);
                    if (a == null) {
                        a = m46876b(a2);
                        z = true;
                    }
                }
            } while (!a.mo40392a(kVar, alVar));
            if (z) {
                a.mo40390a();
            }
            C24644b.m47156a();
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }
}
