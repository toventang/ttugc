package com.bytedance.assem.jedi_vm.p798a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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

/* renamed from: com.bytedance.assem.jedi_vm.a.a */
public final class C12857a<S> implements AbstractC12866e<S> {

    /* renamed from: a */
    final C88958b<S> f31288a;

    /* renamed from: b */
    final C12860a<S> f31289b = new C12860a<>();

    /* renamed from: c */
    private final C88411a f31290c;

    /* renamed from: d */
    private final C88958b<C89391z> f31291d;

    /* renamed from: e */
    private final AbstractC88979t<S> f31292e;

    static {
        Covode.recordClassIndex(14689);
    }

    @Override // com.bytedance.assem.jedi_vm.p798a.AbstractC12866e
    /* renamed from: a */
    public final AbstractC88979t<S> mo20695a() {
        return this.f31292e;
    }

    @Override // com.bytedance.assem.jedi_vm.p798a.AbstractC12866e
    /* renamed from: b */
    public final S mo20697b() {
        S i = this.f31288a.mo143221i();
        if (i == null) {
            C89219l.m154707a();
        }
        return i;
    }

    /* renamed from: com.bytedance.assem.jedi_vm.a.a$a */
    static final class C12860a<S> {

        /* renamed from: a */
        private final LinkedList<AbstractC89172b<S, C89391z>> f31294a = new LinkedList<>();

        /* renamed from: b */
        private LinkedList<AbstractC89172b<S, S>> f31295b = new LinkedList<>();

        static {
            Covode.recordClassIndex(14692);
        }

        /* renamed from: a */
        public final synchronized AbstractC89172b<S, C89391z> mo20700a() {
            MethodCollector.m26663i(2568);
            if (this.f31294a.isEmpty()) {
                MethodCollector.m26664o(2568);
                return null;
            }
            AbstractC89172b<S, C89391z> removeFirst = this.f31294a.removeFirst();
            MethodCollector.m26664o(2568);
            return removeFirst;
        }

        /* renamed from: b */
        public final synchronized List<AbstractC89172b<S, S>> mo20702b() {
            MethodCollector.m26663i(2573);
            if (this.f31295b.isEmpty()) {
                MethodCollector.m26664o(2573);
                return null;
            }
            LinkedList<AbstractC89172b<S, S>> linkedList = this.f31295b;
            this.f31295b = new LinkedList<>();
            MethodCollector.m26664o(2573);
            return linkedList;
        }

        /* renamed from: a */
        public final synchronized void mo20701a(AbstractC89172b<? super S, C89391z> bVar) {
            MethodCollector.m26663i(2526);
            C89219l.m154719c(bVar, "");
            this.f31294a.add(bVar);
            MethodCollector.m26664o(2526);
        }

        /* renamed from: b */
        public final synchronized void mo20703b(AbstractC89172b<? super S, ? extends S> bVar) {
            MethodCollector.m26663i(2564);
            C89219l.m154719c(bVar, "");
            this.f31295b.add(bVar);
            MethodCollector.m26664o(2564);
        }
    }

    @Override // com.bytedance.assem.jedi_vm.p798a.AbstractC12866e
    /* renamed from: a */
    public final void mo20696a(AbstractC89172b<? super S, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f31289b.mo20701a(bVar);
        this.f31291d.onNext(C89391z.f203057a);
    }

    @Override // com.bytedance.assem.jedi_vm.p798a.AbstractC12866e
    /* renamed from: b */
    public final void mo20698b(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        this.f31289b.mo20703b(bVar);
        this.f31291d.onNext(C89391z.f203057a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.l.b<S> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.jedi_vm.p798a.AbstractC12866e
    /* renamed from: c */
    public final void mo20699c(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        this.f31288a.onNext(bVar.invoke(mo20697b()));
    }

    public C12857a(S s, AbstractC88398aa aaVar) {
        C89219l.m154719c(s, "");
        C89219l.m154719c(aaVar, "");
        C88958b<S> a = C88958b.m154214a((Object) s);
        C89219l.m154709a((Object) a, "");
        this.f31288a = a;
        C88411a aVar = new C88411a();
        this.f31290c = aVar;
        C88958b<C89391z> bVar = new C88958b<>();
        C89219l.m154709a((Object) bVar, "");
        this.f31291d = bVar;
        AbstractC88979t<S> c = a.mo143283c();
        C89219l.m154709a((Object) c, "");
        this.f31292e = c;
        AbstractC88412b a2 = bVar.mo143261a(aaVar).mo143254a(new AbstractC88433f<C89391z>(this) {
            /* class com.bytedance.assem.jedi_vm.p798a.C12857a.C128581 */

            /* renamed from: a */
            final /* synthetic */ C12857a f31293a;

            static {
                Covode.recordClassIndex(14690);
            }

            {
                this.f31293a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: f.a.l.b<S> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89391z zVar) {
                C12857a aVar = this.f31293a;
                while (true) {
                    AbstractC89172b<S, C89391z> a = aVar.f31289b.mo20700a();
                    List<AbstractC89172b<S, S>> b = aVar.f31289b.mo20702b();
                    if (b != null) {
                        Object b2 = aVar.mo20697b();
                        Iterator<T> it = b.iterator();
                        while (it.hasNext()) {
                            b2 = it.next().invoke(b2);
                        }
                        aVar.f31288a.onNext(b2);
                    }
                    if (a != null) {
                        a.invoke((S) aVar.mo20697b());
                    } else {
                        return;
                    }
                }
            }
        }, new C12861b(new AbstractC89172b<Throwable, C89391z>(this) {
            /* class com.bytedance.assem.jedi_vm.p798a.C12857a.C128592 */

            static {
                Covode.recordClassIndex(14691);
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
                return C89204ab.m154669a(C12857a.class);
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
