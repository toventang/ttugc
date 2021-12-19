package com.facebook.p1844d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import java.util.List;

/* renamed from: com.facebook.d.f */
public final class C24161f<T> implements AbstractC24093k<AbstractC24157c<T>> {

    /* renamed from: a */
    public final List<AbstractC24093k<AbstractC24157c<T>>> f57138a;

    static {
        Covode.recordClassIndex(28292);
    }

    public final int hashCode() {
        return this.f57138a.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.d.f$a */
    public class C24162a extends AbstractC24152a<T> {

        /* renamed from: a */
        AbstractC24157c<T> f57139a;

        /* renamed from: b */
        AbstractC24157c<T> f57140b;

        /* renamed from: d */
        private int f57142d;

        static {
            Covode.recordClassIndex(28293);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final synchronized AbstractC24157c<T> mo39758h() {
            AbstractC24157c<T> cVar;
            MethodCollector.m26663i(9100);
            cVar = this.f57140b;
            MethodCollector.m26664o(9100);
            return cVar;
        }

        @Override // com.facebook.p1844d.AbstractC24157c, com.facebook.p1844d.AbstractC24152a
        /* renamed from: d */
        public final synchronized T mo39747d() {
            MethodCollector.m26663i(8354);
            AbstractC24157c<T> h = mo39758h();
            if (h != null) {
                T d = h.mo39747d();
                MethodCollector.m26664o(8354);
                return d;
            }
            MethodCollector.m26664o(8354);
            return null;
        }

        /* renamed from: i */
        private boolean m45800i() {
            AbstractC24157c<T> cVar;
            AbstractC24093k<AbstractC24157c<T>> j = m45801j();
            if (j != null) {
                cVar = j.mo34217b();
            } else {
                cVar = null;
            }
            if (!m45798c(cVar) || cVar == null) {
                m45797b(cVar);
                return false;
            }
            cVar.mo39739a(new C24163a(this, (byte) 0), C24065a.f56998a);
            return true;
        }

        /* renamed from: j */
        private synchronized AbstractC24093k<AbstractC24157c<T>> m45801j() {
            MethodCollector.m26663i(8801);
            if (mo39741a() || this.f57142d >= C24161f.this.f57138a.size()) {
                MethodCollector.m26664o(8801);
                return null;
            }
            List<AbstractC24093k<AbstractC24157c<T>>> list = C24161f.this.f57138a;
            int i = this.f57142d;
            this.f57142d = i + 1;
            AbstractC24093k<AbstractC24157c<T>> kVar = list.get(i);
            MethodCollector.m26664o(8801);
            return kVar;
        }

        @Override // com.facebook.p1844d.AbstractC24157c, com.facebook.p1844d.AbstractC24152a
        /* renamed from: c */
        public final synchronized boolean mo39746c() {
            MethodCollector.m26663i(8505);
            AbstractC24157c<T> h = mo39758h();
            if (h == null || !h.mo39746c()) {
                MethodCollector.m26664o(8505);
                return false;
            }
            MethodCollector.m26664o(8505);
            return true;
        }

        @Override // com.facebook.p1844d.AbstractC24157c, com.facebook.p1844d.AbstractC24152a
        /* renamed from: g */
        public final boolean mo39750g() {
            MethodCollector.m26663i(8649);
            synchronized (this) {
                try {
                    if (!super.mo39750g()) {
                        return false;
                    }
                    AbstractC24157c<T> cVar = this.f57139a;
                    this.f57139a = null;
                    AbstractC24157c<T> cVar2 = this.f57140b;
                    this.f57140b = null;
                    m45797b(cVar2);
                    m45797b(cVar);
                    MethodCollector.m26664o(8649);
                    return true;
                } finally {
                    MethodCollector.m26664o(8649);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.d.f$a$a */
        public class C24163a implements AbstractC24160e<T> {
            static {
                Covode.recordClassIndex(28294);
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onCancellation(AbstractC24157c<T> cVar) {
            }

            private C24163a() {
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onFailure(AbstractC24157c<T> cVar) {
                C24162a.this.mo39757a((AbstractC24157c) cVar);
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onProgressUpdate(AbstractC24157c<T> cVar) {
                C24162a.this.mo39742a(Math.max(C24162a.this.mo39749f(), cVar.mo39749f()));
            }

            @Override // com.facebook.p1844d.AbstractC24160e
            public final void onNewResult(AbstractC24157c<T> cVar) {
                AbstractC24157c<T> cVar2;
                MethodCollector.m26663i(9416);
                if (cVar.mo39746c()) {
                    C24162a aVar = C24162a.this;
                    boolean b = cVar.mo39745b();
                    synchronized (aVar) {
                        try {
                            if (cVar == aVar.f57139a && cVar != aVar.f57140b) {
                                if (aVar.f57140b != null) {
                                    if (!b) {
                                        cVar2 = null;
                                        C24162a.m45797b(cVar2);
                                    }
                                }
                                cVar2 = aVar.f57140b;
                                aVar.f57140b = cVar;
                                C24162a.m45797b(cVar2);
                            }
                        } finally {
                            MethodCollector.m26664o(9416);
                        }
                    }
                    if (cVar == aVar.mo39758h()) {
                        aVar.mo39743a((Object) null, cVar.mo39745b());
                    }
                    return;
                }
                if (cVar.mo39745b()) {
                    C24162a.this.mo39757a((AbstractC24157c) cVar);
                }
                MethodCollector.m26664o(9416);
            }

            /* synthetic */ C24163a(C24162a aVar, byte b) {
                this();
            }
        }

        /* renamed from: b */
        static void m45797b(AbstractC24157c<T> cVar) {
            if (cVar != null) {
                cVar.mo39750g();
            }
        }

        public C24162a() {
            if (!m45800i()) {
                mo39744a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: c */
        private synchronized boolean m45798c(AbstractC24157c<T> cVar) {
            MethodCollector.m26663i(8940);
            if (mo39741a()) {
                MethodCollector.m26664o(8940);
                return false;
            }
            this.f57139a = cVar;
            MethodCollector.m26664o(8940);
            return true;
        }

        /* renamed from: a */
        public final void mo39757a(AbstractC24157c<T> cVar) {
            if (m45799d(cVar)) {
                if (cVar != mo39758h()) {
                    m45797b(cVar);
                }
                if (!m45800i()) {
                    mo39744a(cVar.mo39748e());
                }
            }
        }

        /* renamed from: d */
        private synchronized boolean m45799d(AbstractC24157c<T> cVar) {
            MethodCollector.m26663i(8941);
            if (!mo39741a()) {
                if (cVar == this.f57139a) {
                    this.f57139a = null;
                    MethodCollector.m26664o(8941);
                    return true;
                }
            }
            MethodCollector.m26664o(8941);
            return false;
        }
    }

    /* renamed from: a */
    public final AbstractC24157c<T> mo34217b() {
        return new C24162a();
    }

    public final String toString() {
        return C24088h.m45610a(this).mo39647a("list", this.f57138a).toString();
    }

    /* renamed from: a */
    public static <T> C24161f<T> m45794a(List<AbstractC24093k<AbstractC24157c<T>>> list) {
        return new C24161f<>(list);
    }

    private C24161f(List<AbstractC24093k<AbstractC24157c<T>>> list) {
        C24091i.m45621a(!list.isEmpty(), "List of suppliers is empty!");
        this.f57138a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24161f)) {
            return false;
        }
        return C24088h.m45611a(this.f57138a, ((C24161f) obj).f57138a);
    }
}
