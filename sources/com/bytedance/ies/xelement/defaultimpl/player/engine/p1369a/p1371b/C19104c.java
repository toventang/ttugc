package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.p1364b.C19004g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.c */
public final class C19104c implements AbstractC19161f, AbstractC19162g, AbstractC19192a {

    /* renamed from: b */
    public static final C19105a f45235b = new C19105a((byte) 0);

    /* renamed from: a */
    final CopyOnWriteArrayList<AbstractC19161f> f45236a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(21867);
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.c$a */
    public static final class C19105a {
        static {
            Covode.recordClassIndex(21868);
        }

        private C19105a() {
        }

        public /* synthetic */ C19105a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        this.f45236a.clear();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: f */
    public final boolean mo30469f() {
        boolean z = false;
        for (T t : this.f45236a) {
            try {
                if (!z) {
                    z = t.mo30469f();
                }
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g
    /* renamed from: b */
    public final void mo30389b(AbstractC19161f fVar) {
        C89219l.m154719c(fVar, "");
        this.f45236a.remove(fVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g
    /* renamed from: a */
    public final void mo30376a(AbstractC19161f fVar) {
        C89219l.m154719c(fVar, "");
        if (!this.f45236a.contains(fVar)) {
            this.f45236a.add(fVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: a */
    public final boolean mo30464a(C19194c cVar) {
        boolean z = false;
        for (T t : this.f45236a) {
            try {
                if (!z) {
                    z = t.mo30464a(cVar);
                }
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final C19169n mo30465b(C19169n nVar) {
        Iterator<T> it = this.f45236a.iterator();
        while (it.hasNext()) {
            try {
                nVar = it.next().mo30465b(nVar);
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return nVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: c */
    public final boolean mo30467c(C19194c cVar) {
        boolean z = false;
        for (T t : this.f45236a) {
            try {
                if (!z) {
                    z = t.mo30467c(cVar);
                }
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: d */
    public final boolean mo30468d(C19194c cVar) {
        boolean z = false;
        for (T t : this.f45236a) {
            try {
                if (!z) {
                    z = t.mo30468d(cVar);
                }
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final boolean mo30466b(C19194c cVar) {
        boolean z = false;
        for (T t : this.f45236a) {
            try {
                if (!z) {
                    z = t.mo30466b(cVar);
                }
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }
}
