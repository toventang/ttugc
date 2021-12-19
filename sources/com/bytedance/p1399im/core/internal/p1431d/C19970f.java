package com.bytedance.p1399im.core.internal.p1431d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1431d.p1433b.EnumC19964c;
import com.bytedance.p1399im.core.internal.utils.HandlerC20049x;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.proto.Response;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.d.f */
public final class C19970f implements AbstractC19969e {

    /* renamed from: a */
    private static final AbstractC19969e f47472a = new AbstractC19969e() {
        /* class com.bytedance.p1399im.core.internal.p1431d.C19970f.C199711 */

        static {
            Covode.recordClassIndex(22815);
        }

        @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
        /* renamed from: d */
        public final EnumC19964c mo31827d() {
            return null;
        }

        @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
        /* renamed from: e */
        public final void mo31829e() {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
        /* renamed from: a */
        public final void mo31820a(HandlerC20049x xVar) {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
        /* renamed from: e */
        public final void mo31830e(C19978k kVar) {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
        /* renamed from: a */
        public final void mo31822a(List<Long> list) {
            throw new IllegalStateException("can't access here");
        }

        @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
        /* renamed from: a */
        public final void mo31821a(Response response, C19608bd bdVar) {
            throw new IllegalStateException("can't access here");
        }
    };

    /* renamed from: b */
    private final AbstractC19972a f47473b;

    /* renamed from: c */
    private volatile AbstractC19969e f47474c = f47472a;

    /* renamed from: d */
    private HandlerC20049x f47475d;

    /* renamed from: com.bytedance.im.core.internal.d.f$a */
    public interface AbstractC19972a {
        static {
            Covode.recordClassIndex(22816);
        }

        /* renamed from: a */
        AbstractC19969e mo31849a();
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: d */
    public final EnumC19964c mo31827d() {
        return this.f47474c.mo31827d();
    }

    static {
        Covode.recordClassIndex(22814);
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: e */
    public final void mo31829e() {
        if (mo31859a()) {
            this.f47474c.mo31829e();
        }
    }

    /* renamed from: b */
    public final synchronized void mo31860b() {
        MethodCollector.m26663i(8430);
        if (!mo31859a()) {
            m37661c();
        }
        MethodCollector.m26664o(8430);
    }

    /* renamed from: c */
    private synchronized void m37661c() {
        MethodCollector.m26663i(8431);
        if (this.f47474c != f47472a) {
            MethodCollector.m26664o(8431);
            return;
        }
        this.f47474c = this.f47473b.mo31849a();
        this.f47474c.mo31820a(this.f47475d);
        MethodCollector.m26664o(8431);
    }

    /* renamed from: a */
    public final boolean mo31859a() {
        if (this.f47474c != f47472a) {
            return true;
        }
        return false;
    }

    public C19970f(AbstractC19972a aVar) {
        this.f47473b = aVar;
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: a */
    public final void mo31820a(HandlerC20049x xVar) {
        if (mo31859a()) {
            this.f47474c.mo31820a(xVar);
        } else {
            this.f47475d = xVar;
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: e */
    public final void mo31830e(C19978k kVar) {
        if (!mo31859a()) {
            m37661c();
        }
        this.f47474c.mo31830e(kVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: a */
    public final void mo31822a(List<Long> list) {
        if (mo31859a()) {
            this.f47474c.mo31822a(list);
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: a */
    public final void mo31821a(Response response, C19608bd bdVar) {
        if (!mo31859a()) {
            m37661c();
        }
        this.f47474c.mo31821a(response, bdVar);
    }
}
