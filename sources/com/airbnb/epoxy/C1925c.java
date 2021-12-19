package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.airbnb.epoxy.c */
public final class C1925c {

    /* renamed from: a */
    final Executor f5773a;

    /* renamed from: b */
    public final AbstractC1930c f5774b;

    /* renamed from: c */
    final C1445j.AbstractC1451e<AbstractC1956s<?>> f5775c;

    /* renamed from: d */
    final C1929b f5776d = new C1929b((byte) 0);

    /* renamed from: e */
    volatile List<? extends AbstractC1956s<?>> f5777e;

    /* renamed from: f */
    public volatile List<? extends AbstractC1956s<?>> f5778f = Collections.emptyList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.c$c */
    public interface AbstractC1930c {
        static {
            Covode.recordClassIndex(2121);
        }

        /* renamed from: a */
        void mo5712a(C1941k kVar);
    }

    static {
        Covode.recordClassIndex(2116);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.c$b */
    public static class C1929b {

        /* renamed from: a */
        private volatile int f5791a;

        /* renamed from: b */
        private volatile int f5792b;

        static {
            Covode.recordClassIndex(2120);
        }

        private C1929b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized int mo5708a() {
            int i;
            MethodCollector.m26663i(6516);
            i = this.f5791a + 1;
            this.f5791a = i;
            MethodCollector.m26664o(6516);
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final synchronized boolean mo5710b() {
            boolean c;
            MethodCollector.m26663i(6666);
            c = mo5711c();
            this.f5792b = this.f5791a;
            MethodCollector.m26664o(6666);
            return c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final synchronized boolean mo5711c() {
            MethodCollector.m26663i(6668);
            if (this.f5791a > this.f5792b) {
                MethodCollector.m26664o(6668);
                return true;
            }
            MethodCollector.m26664o(6668);
            return false;
        }

        /* synthetic */ C1929b(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized boolean mo5709a(int i) {
            boolean z;
            MethodCollector.m26663i(6806);
            if (this.f5791a != i || i <= this.f5792b) {
                z = false;
            } else {
                z = true;
                this.f5792b = i;
            }
            MethodCollector.m26664o(6806);
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.c$a */
    public static class C1928a extends C1445j.AbstractC1447a {

        /* renamed from: a */
        final List<? extends AbstractC1956s<?>> f5788a;

        /* renamed from: b */
        final List<? extends AbstractC1956s<?>> f5789b;

        /* renamed from: c */
        private final C1445j.AbstractC1451e<AbstractC1956s<?>> f5790c;

        static {
            Covode.recordClassIndex(2119);
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: a */
        public final int mo3768a() {
            return this.f5788a.size();
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: b */
        public final int mo3770b() {
            return this.f5789b.size();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: a */
        public final Object mo3769a(int i, int i2) {
            return this.f5790c.mo4955c(this.f5788a.get(i), this.f5789b.get(i2));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: b */
        public final boolean mo3771b(int i, int i2) {
            return this.f5790c.mo4953a(this.f5788a.get(i), this.f5789b.get(i2));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: c */
        public final boolean mo3772c(int i, int i2) {
            return this.f5790c.mo4954b(this.f5788a.get(i), this.f5789b.get(i2));
        }

        C1928a(List<? extends AbstractC1956s<?>> list, List<? extends AbstractC1956s<?>> list2, C1445j.AbstractC1451e<AbstractC1956s<?>> eVar) {
            this.f5788a = list;
            this.f5789b = list2;
            this.f5790c = eVar;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo5704a(List<AbstractC1956s<?>> list) {
        boolean b;
        MethodCollector.m26663i(5929);
        b = this.f5776d.mo5710b();
        mo5705a(list, this.f5776d.mo5708a());
        MethodCollector.m26664o(5929);
        return b;
    }

    /* renamed from: a */
    public final synchronized boolean mo5705a(List<? extends AbstractC1956s<?>> list, int i) {
        MethodCollector.m26663i(6081);
        if (this.f5776d.mo5709a(i)) {
            this.f5777e = list;
            if (list == null) {
                this.f5778f = Collections.emptyList();
            } else {
                this.f5778f = Collections.unmodifiableList(list);
            }
            MethodCollector.m26664o(6081);
            return true;
        }
        MethodCollector.m26664o(6081);
        return false;
    }

    /* renamed from: a */
    public final void mo5703a(final int i, final List<? extends AbstractC1956s<?>> list, final C1941k kVar) {
        C1907ab.f5754c.execute(new Runnable() {
            /* class com.airbnb.epoxy.C1925c.RunnableC19272 */

            static {
                Covode.recordClassIndex(2118);
            }

            public final void run() {
                boolean a = C1925c.this.mo5705a(list, i);
                if (kVar != null && a) {
                    C1925c.this.f5774b.mo5712a(kVar);
                }
            }
        });
    }

    C1925c(Handler handler, AbstractC1930c cVar, C1445j.AbstractC1451e<AbstractC1956s<?>> eVar) {
        this.f5773a = new ExecutorC1976w(handler);
        this.f5774b = cVar;
        this.f5775c = eVar;
    }
}
