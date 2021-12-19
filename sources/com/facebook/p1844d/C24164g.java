package com.facebook.p1844d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.d.g */
public final class C24164g<T> implements AbstractC24093k<AbstractC24157c<T>> {

    /* renamed from: a */
    public final List<AbstractC24093k<AbstractC24157c<T>>> f57144a;

    /* renamed from: b */
    public final boolean f57145b = false;

    static {
        Covode.recordClassIndex(28295);
    }

    @Override // com.facebook.common.p1832d.AbstractC24093k
    /* renamed from: b */
    public final /* synthetic */ Object mo34217b() {
        return new C24165a();
    }

    public final int hashCode() {
        return this.f57144a.hashCode();
    }

    /* renamed from: com.facebook.d.g$a */
    class C24165a extends AbstractC24152a<T> {

        /* renamed from: a */
        int f57146a;

        /* renamed from: c */
        private ArrayList<AbstractC24157c<T>> f57148c;

        /* renamed from: d */
        private int f57149d;

        /* renamed from: e */
        private AtomicInteger f57150e;

        /* renamed from: f */
        private Throwable f57151f;

        static {
            Covode.recordClassIndex(28296);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final synchronized AbstractC24157c<T> mo39758h() {
            AbstractC24157c<T> a;
            MethodCollector.m26663i(9259);
            a = mo39762a(this.f57146a);
            MethodCollector.m26664o(9259);
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final void mo39765i() {
            Throwable th;
            if (this.f57150e.incrementAndGet() == this.f57149d && (th = this.f57151f) != null) {
                mo39744a(th);
            }
        }

        @Override // com.facebook.p1844d.AbstractC24157c, com.facebook.p1844d.AbstractC24152a
        /* renamed from: c */
        public final synchronized boolean mo39746c() {
            MethodCollector.m26663i(9261);
            if (C24164g.this.f57145b) {
                m45810j();
            }
            AbstractC24157c<T> h = mo39758h();
            if (h == null || !h.mo39746c()) {
                MethodCollector.m26664o(9261);
                return false;
            }
            MethodCollector.m26664o(9261);
            return true;
        }

        @Override // com.facebook.p1844d.AbstractC24157c, com.facebook.p1844d.AbstractC24152a
        /* renamed from: d */
        public final synchronized T mo39747d() {
            MethodCollector.m26663i(9260);
            if (C24164g.this.f57145b) {
                m45810j();
            }
            AbstractC24157c<T> h = mo39758h();
            if (h != null) {
                T d = h.mo39747d();
                MethodCollector.m26664o(9260);
                return d;
            }
            MethodCollector.m26664o(9260);
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            if (r1 == null) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            if (r2 >= r1.size()) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            m45808a((com.facebook.p1844d.AbstractC24157c) r1.get(r2));
            r2 = r2 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9262);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            return true;
         */
        @Override // com.facebook.p1844d.AbstractC24157c, com.facebook.p1844d.AbstractC24152a
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo39750g() {
            /*
                r4 = this;
                r3 = 9262(0x242e, float:1.2979E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                com.facebook.d.g r0 = com.facebook.p1844d.C24164g.this
                boolean r0 = r0.f57145b
                if (r0 == 0) goto L_0x000e
                r4.m45810j()
            L_0x000e:
                monitor-enter(r4)
                boolean r0 = super.mo39750g()     // Catch:{ all -> 0x003a }
                r2 = 0
                if (r0 != 0) goto L_0x001b
                monitor-exit(r4)     // Catch:{ all -> 0x003a }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return r2
            L_0x001b:
                java.util.ArrayList<com.facebook.d.c<T>> r1 = r4.f57148c
                r0 = 0
                r4.f57148c = r0
                monitor-exit(r4)
                if (r1 == 0) goto L_0x0035
            L_0x0023:
                int r0 = r1.size()
                if (r2 >= r0) goto L_0x0035
                java.lang.Object r0 = r1.get(r2)
                com.facebook.d.c r0 = (com.facebook.p1844d.AbstractC24157c) r0
                m45808a(r0)
                int r2 = r2 + 1
                goto L_0x0023
            L_0x0035:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                r0 = 1
                return r0
            L_0x003a:
                r0 = move-exception
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1844d.C24164g.C24165a.mo39750g():boolean");
        }

        /* renamed from: j */
        private void m45810j() {
            MethodCollector.m26663i(9256);
            if (this.f57150e != null) {
                MethodCollector.m26664o(9256);
                return;
            }
            synchronized (this) {
                try {
                    if (this.f57150e == null) {
                        this.f57150e = new AtomicInteger(0);
                        int size = C24164g.this.f57144a.size();
                        this.f57149d = size;
                        this.f57146a = size;
                        this.f57148c = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            AbstractC24157c<T> b = C24164g.this.f57144a.get(i).mo34217b();
                            this.f57148c.add(b);
                            b.mo39739a(new C24166a(i), C24065a.f56998a);
                            if (b.mo39746c()) {
                                break;
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(9256);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.d.g$a$a */
        public class C24166a implements AbstractC24160e<T> {

            /* renamed from: b */
            private int f57153b;

            static {
                Covode.recordClassIndex(28297);
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onCancellation(AbstractC24157c<T> cVar) {
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onFailure(AbstractC24157c<T> cVar) {
                C24165a.this.mo39763a(this.f57153b, cVar);
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onProgressUpdate(AbstractC24157c<T> cVar) {
                if (this.f57153b == 0) {
                    C24165a.this.mo39742a(cVar.mo39749f());
                }
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onNewResult(AbstractC24157c<T> cVar) {
                boolean z;
                MethodCollector.m26663i(9106);
                if (cVar.mo39746c()) {
                    C24165a aVar = C24165a.this;
                    int i = this.f57153b;
                    boolean b = cVar.mo39745b();
                    synchronized (aVar) {
                        try {
                            int i2 = aVar.f57146a;
                            if (cVar == aVar.mo39762a(i) && i != aVar.f57146a) {
                                if (aVar.mo39758h() == null || (b && i < aVar.f57146a)) {
                                    aVar.f57146a = i;
                                    i2 = i;
                                }
                                for (int i3 = aVar.f57146a; i3 > i2; i3--) {
                                    C24165a.m45808a((AbstractC24157c) aVar.mo39764b(i3));
                                }
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(9106);
                            throw th;
                        }
                    }
                    if (cVar == aVar.mo39758h()) {
                        if (i != 0 || !cVar.mo39745b()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        aVar.mo39743a((Object) null, z);
                    }
                    aVar.mo39765i();
                    MethodCollector.m26664o(9106);
                    return;
                }
                if (cVar.mo39745b()) {
                    C24165a.this.mo39763a(this.f57153b, cVar);
                }
                MethodCollector.m26664o(9106);
            }

            public C24166a(int i) {
                this.f57153b = i;
            }
        }

        /* renamed from: a */
        static void m45808a(AbstractC24157c<T> cVar) {
            if (cVar != null) {
                cVar.mo39750g();
            }
        }

        public C24165a() {
            if (!C24164g.this.f57145b) {
                m45810j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized AbstractC24157c<T> mo39762a(int i) {
            MethodCollector.m26663i(9257);
            ArrayList<AbstractC24157c<T>> arrayList = this.f57148c;
            if (arrayList == null || i >= arrayList.size()) {
                MethodCollector.m26664o(9257);
                return null;
            }
            AbstractC24157c<T> cVar = this.f57148c.get(i);
            MethodCollector.m26664o(9257);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final synchronized AbstractC24157c<T> mo39764b(int i) {
            MethodCollector.m26663i(9258);
            ArrayList<AbstractC24157c<T>> arrayList = this.f57148c;
            if (arrayList == null || i >= arrayList.size()) {
                MethodCollector.m26664o(9258);
                return null;
            }
            AbstractC24157c<T> cVar = this.f57148c.set(i, null);
            MethodCollector.m26664o(9258);
            return cVar;
        }

        /* renamed from: a */
        public final void mo39763a(int i, AbstractC24157c<T> cVar) {
            m45808a((AbstractC24157c) m45809b(i, cVar));
            if (i == 0) {
                this.f57151f = cVar.mo39748e();
            }
            mo39765i();
        }

        /* renamed from: b */
        private synchronized AbstractC24157c<T> m45809b(int i, AbstractC24157c<T> cVar) {
            MethodCollector.m26663i(9414);
            if (cVar == mo39758h()) {
                MethodCollector.m26664o(9414);
                return null;
            } else if (cVar == mo39762a(i)) {
                AbstractC24157c<T> b = mo39764b(i);
                MethodCollector.m26664o(9414);
                return b;
            } else {
                MethodCollector.m26664o(9414);
                return cVar;
            }
        }
    }

    public final String toString() {
        return C24088h.m45610a(this).mo39647a("list", this.f57144a).toString();
    }

    public C24164g(List<AbstractC24093k<AbstractC24157c<T>>> list) {
        C24091i.m45621a(!list.isEmpty(), "List of suppliers is empty!");
        this.f57144a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24164g)) {
            return false;
        }
        return C24088h.m45611a(this.f57144a, ((C24164g) obj).f57144a);
    }
}
