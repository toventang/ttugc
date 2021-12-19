package com.bytedance.jedi.arch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20369ag;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.jedi.arch.internal.c */
public final class C20485c<S> implements AbstractC20369ag<S> {

    /* renamed from: a */
    final C88958b<S> f48478a;

    /* renamed from: b */
    final C20488a<S> f48479b = new C20488a<>();

    /* renamed from: c */
    private final C88411a f48480c;

    /* renamed from: d */
    private final C88958b<C89391z> f48481d;

    /* renamed from: e */
    private final AbstractC88979t<S> f48482e;

    static {
        Covode.recordClassIndex(24008);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20369ag
    /* renamed from: b */
    public final AbstractC88979t<S> mo33700b() {
        return this.f48482e;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20369ag
    /* renamed from: a */
    public final S mo33698a() {
        S i = this.f48478a.mo143221i();
        if (i == null) {
            C89219l.m154707a();
        }
        return i;
    }

    /* renamed from: com.bytedance.jedi.arch.internal.c$a */
    static final class C20488a<S> {

        /* renamed from: a */
        private final LinkedList<AbstractC89172b<S, C89391z>> f48484a = new LinkedList<>();

        /* renamed from: b */
        private LinkedList<AbstractC89172b<S, S>> f48485b = new LinkedList<>();

        static {
            Covode.recordClassIndex(24011);
        }

        /* renamed from: a */
        public final synchronized AbstractC89172b<S, C89391z> mo33788a() {
            MethodCollector.m26663i(8343);
            if (this.f48484a.isEmpty()) {
                MethodCollector.m26664o(8343);
                return null;
            }
            AbstractC89172b<S, C89391z> removeFirst = this.f48484a.removeFirst();
            MethodCollector.m26664o(8343);
            return removeFirst;
        }

        /* renamed from: b */
        public final synchronized List<AbstractC89172b<S, S>> mo33790b() {
            MethodCollector.m26663i(8489);
            if (this.f48485b.isEmpty()) {
                MethodCollector.m26664o(8489);
                return null;
            }
            LinkedList<AbstractC89172b<S, S>> linkedList = this.f48485b;
            this.f48485b = new LinkedList<>();
            MethodCollector.m26664o(8489);
            return linkedList;
        }

        /* renamed from: a */
        public final synchronized void mo33789a(AbstractC89172b<? super S, C89391z> bVar) {
            MethodCollector.m26663i(8067);
            C89219l.m154719c(bVar, "");
            this.f48484a.add(bVar);
            MethodCollector.m26664o(8067);
        }

        /* renamed from: b */
        public final synchronized void mo33791b(AbstractC89172b<? super S, ? extends S> bVar) {
            MethodCollector.m26663i(8202);
            C89219l.m154719c(bVar, "");
            this.f48485b.add(bVar);
            MethodCollector.m26664o(8202);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20369ag
    /* renamed from: a */
    public final void mo33699a(AbstractC89172b<? super S, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f48479b.mo33789a(bVar);
        this.f48481d.onNext(C89391z.f203057a);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20369ag
    /* renamed from: b */
    public final void mo33701b(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        this.f48479b.mo33791b(bVar);
        this.f48481d.onNext(C89391z.f203057a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.l.b<S> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.AbstractC20369ag
    /* renamed from: c */
    public final void mo33702c(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        this.f48478a.onNext(bVar.invoke(mo33698a()));
    }

    public C20485c(S s, AbstractC88398aa aaVar) {
        C89219l.m154719c(s, "");
        C89219l.m154719c(aaVar, "");
        C88958b<S> a = C88958b.m154214a((Object) s);
        C89219l.m154709a((Object) a, "");
        this.f48478a = a;
        C88411a aVar = new C88411a();
        this.f48480c = aVar;
        C88958b<C89391z> bVar = new C88958b<>();
        C89219l.m154709a((Object) bVar, "");
        this.f48481d = bVar;
        AbstractC88979t<S> c = a.mo143283c();
        C89219l.m154709a((Object) c, "");
        this.f48482e = c;
        AbstractC88412b a2 = bVar.mo143261a(aaVar).mo143254a(new AbstractC88433f<C89391z>(this) {
            /* class com.bytedance.jedi.arch.internal.C20485c.C204861 */

            /* renamed from: a */
            final /* synthetic */ C20485c f48483a;

            static {
                Covode.recordClassIndex(24009);
            }

            {
                this.f48483a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: f.a.l.b<S> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89391z zVar) {
                C20485c cVar = this.f48483a;
                while (true) {
                    AbstractC89172b<S, C89391z> a = cVar.f48479b.mo33788a();
                    List<AbstractC89172b<S, S>> b = cVar.f48479b.mo33790b();
                    if (b != null) {
                        Object a2 = cVar.mo33698a();
                        Iterator<T> it = b.iterator();
                        while (it.hasNext()) {
                            a2 = it.next().invoke(a2);
                        }
                        cVar.f48478a.onNext(a2);
                    }
                    if (a != null) {
                        a.invoke((S) cVar.mo33698a());
                    } else {
                        return;
                    }
                }
            }
        }, new C20489d(new AbstractC89172b<Throwable, C89391z>(this) {
            /* class com.bytedance.jedi.arch.internal.C20485c.C204872 */

            static {
                Covode.recordClassIndex(24010);
            }

            @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
            public final String getName() {
                return "handleError";
            }

            @Override // p4600h.p4611f.p4613b.AbstractC89208c
            public final String getSignature() {
                return "handleError(Ljava/lang/Throwable;)V";
            }

            @Override // p4600h.p4611f.p4613b.AbstractC89208c
            public final AbstractC89278d getOwner() {
                return C89204ab.m154669a(C20485c.class);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Throwable th) {
                Throwable th2 = th;
                C89219l.m154719c(th2, "");
                while (true) {
                    if (th2 == null) {
                        break;
                    } else if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    } else if (th2 != null) {
                        throw th2;
                    }
                }
                return C89391z.f203057a;
            }
        }));
        C89219l.m154709a((Object) a2, "");
        aVar.mo142945a(a2);
    }
}
