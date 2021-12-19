package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.C20466f;
import com.bytedance.jedi.arch.C20535w;
import com.bytedance.jedi.arch.C20536x;
import com.bytedance.jedi.arch.ext.list.C20462n;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.p1464a.AbstractC20429a;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89088ab;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class ListMiddleware<S extends AbstractC20368af, T, P extends C20465o> extends C20536x<S, ListState<T, P>> implements C20438e.AbstractC20440b {

    /* renamed from: e */
    private final AbstractC89244h<C20402e.C204031> f48288e;

    /* renamed from: f */
    private final AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> f48289f;

    /* renamed from: g */
    private final AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> f48290g;

    /* renamed from: h */
    private final AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> f48291h;

    /* renamed from: i */
    private final AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> f48292i;

    static {
        Covode.recordClassIndex(23911);
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$e */
    static final class C20402e extends AbstractC89220m implements AbstractC89171a<C204031> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f48307a;

        static {
            Covode.recordClassIndex(23918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20402e(ListMiddleware listMiddleware) {
            super(0);
            this.f48307a = listMiddleware;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C204031 invoke() {
            return new AbstractC20429a(this) {
                /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.C20402e.C204031 */

                /* renamed from: a */
                final /* synthetic */ C20402e f48308a;

                static {
                    Covode.recordClassIndex(23919);
                }

                @Override // com.bytedance.jedi.arch.ext.list.p1464a.AbstractC20429a
                /* renamed from: a */
                public final void mo33736a() {
                    this.f48308a.f48307a.loadMore();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f48308a = r1;
                }

                @Override // com.bytedance.jedi.arch.ext.list.p1464a.AbstractC20429a
                /* renamed from: a */
                public final void mo33737a(AbstractC89172b<? super Integer, C89391z> bVar) {
                    C89219l.m154719c(bVar, "");
                    this.f48308a.f48307a.mo33807a(new C20404a(bVar));
                }

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$e$1$a */
                static final class C20404a extends AbstractC89220m implements AbstractC89172b<ListState<T, P>, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC89172b f48309a;

                    static {
                        Covode.recordClassIndex(23920);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C20404a(AbstractC89172b bVar) {
                        super(1);
                        this.f48309a = bVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Object obj) {
                        ListState listState = (ListState) obj;
                        C89219l.m154719c(listState, "");
                        if (listState.getHasMore().f48382a) {
                            this.f48309a.invoke(Integer.valueOf(listState.getList().size()));
                        }
                        return C89391z.f203057a;
                    }
                }
            };
        }
    }

    public final void loadMore() {
        AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> bVar = this.f48290g;
        if (bVar != null) {
            mo33808a(new C20396a(this, bVar, this.f48292i));
        }
    }

    public final void refresh() {
        mo33808a(new C20398b(this, this.f48289f, this.f48291h));
    }

    @Override // com.bytedance.jedi.arch.ext.list.p1464a.C20438e.AbstractC20440b
    /* renamed from: a */
    public final void mo33729a(int i) {
        this.f48288e.getValue().mo33729a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$k */
    public static final class C20411k extends AbstractC89220m implements AbstractC89172b<RECEIVER, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48322a;

        static {
            Covode.recordClassIndex(23927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20411k(AbstractC20443c cVar) {
            super(1);
            this.f48322a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            this.f48322a.mo33773a().invoke(obj);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$n */
    public static final class C20414n extends AbstractC89220m implements AbstractC89172b<RECEIVER, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48325a;

        static {
            Covode.recordClassIndex(23930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20414n(AbstractC20443c cVar) {
            super(1);
            this.f48325a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            this.f48325a.mo33773a().invoke(obj);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$p */
    public static final class C20416p extends AbstractC89220m implements AbstractC89172b<ListState<T, P>, ListState<T, P>> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f48327a;

        /* renamed from: b */
        final /* synthetic */ List f48328b;

        static {
            Covode.recordClassIndex(23932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20416p(ListMiddleware listMiddleware, List list) {
            super(1);
            this.f48327a = listMiddleware;
            this.f48328b = list;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            ListState listState = (ListState) obj;
            C89219l.m154719c(listState, "");
            List list = this.f48328b;
            return ListState.copy$default(listState, null, list, null, null, ListMiddleware.m38614a(listState, list), 13, null);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$c */
    static final class C20400c extends AbstractC89220m implements AbstractC89172b<ListState<T, P>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f48301a;

        /* renamed from: b */
        final /* synthetic */ int f48302b;

        /* renamed from: c */
        final /* synthetic */ Object f48303c;

        static {
            Covode.recordClassIndex(23916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20400c(ListMiddleware listMiddleware, int i, Object obj) {
            super(1);
            this.f48301a = listMiddleware;
            this.f48302b = i;
            this.f48303c = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            C89219l.m154719c(listState, "");
            int i = this.f48302b;
            if (i < 0 || i >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C89088ab.f202802a || z) {
                List<? extends T> g = C89070n.m154585g((Collection) listState.getList());
                g.add(this.f48302b, this.f48303c);
                this.f48301a.mo33732a(g);
                return C89391z.f203057a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$d */
    public static final class C20401d extends AbstractC89220m implements AbstractC89172b<ListState<T, P>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f48304a;

        /* renamed from: b */
        final /* synthetic */ int f48305b;

        /* renamed from: c */
        final /* synthetic */ List f48306c;

        static {
            Covode.recordClassIndex(23917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20401d(ListMiddleware listMiddleware, int i, List list) {
            super(1);
            this.f48304a = listMiddleware;
            this.f48305b = i;
            this.f48306c = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            C89219l.m154719c(listState, "");
            int i = this.f48305b;
            if (i < 0 || i >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C89088ab.f202802a || z) {
                List<? extends T> g = C89070n.m154585g((Collection) listState.getList());
                g.addAll(this.f48305b, this.f48306c);
                this.f48304a.mo33732a(g);
                return C89391z.f203057a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: a */
    public final void mo33732a(List<? extends T> list) {
        C89219l.m154719c(list, "");
        mo33811b(new C20416p(this, list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$g */
    public static final class C20407g extends AbstractC89220m implements AbstractC89183m<RECEIVER, P, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48318a;

        static {
            Covode.recordClassIndex(23923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20407g(AbstractC89183m mVar) {
            super(2);
            this.f48318a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(obj2, "");
            this.f48318a.invoke(obj, obj2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$f */
    public static final class C20405f extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20427a f48310a;

        /* renamed from: b */
        final /* synthetic */ ListMiddleware f48311b;

        /* renamed from: c */
        final /* synthetic */ AbstractC20468h f48312c;

        /* renamed from: d */
        final /* synthetic */ boolean f48313d;

        /* renamed from: e */
        final /* synthetic */ boolean f48314e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f48315f;

        static {
            Covode.recordClassIndex(23921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20405f(AbstractC20427a aVar, ListMiddleware listMiddleware, AbstractC20468h hVar, boolean z, boolean z2, AbstractC89172b bVar) {
            super(2);
            this.f48310a = aVar;
            this.f48311b = listMiddleware;
            this.f48312c = hVar;
            this.f48313d = z;
            this.f48314e = z2;
            this.f48315f = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C204061 r0;
            final AbstractC20467g gVar = (AbstractC20467g) obj;
            List<? extends T> list = (List) obj2;
            C89219l.m154719c(gVar, "");
            C89219l.m154719c(list, "");
            AbstractC20427a aVar = this.f48310a;
            final AbstractC89172b bVar = this.f48315f;
            if (bVar != null) {
                r0 = new AbstractC89171a<C89391z>() {
                    /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.C20405f.C204061 */

                    static {
                        Covode.recordClassIndex(23922);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* bridge */ /* synthetic */ C89391z invoke() {
                        bVar.invoke(gVar);
                        return C89391z.f203057a;
                    }
                };
            } else {
                r0 = null;
            }
            aVar.mo33763a(list, r0);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$h */
    public static final class C20408h extends AbstractC89220m implements AbstractC89183m<RECEIVER, C20442b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48319a;

        static {
            Covode.recordClassIndex(23924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20408h(AbstractC89183m mVar) {
            super(2);
            this.f48319a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, C20442b bVar) {
            C20442b bVar2 = bVar;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(bVar2, "");
            this.f48319a.invoke(obj, Boolean.valueOf(bVar2.f48382a));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$i */
    public static final class C20409i extends AbstractC89220m implements AbstractC89183m<RECEIVER, C20442b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48320a;

        static {
            Covode.recordClassIndex(23925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20409i(AbstractC89183m mVar) {
            super(2);
            this.f48320a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, C20442b bVar) {
            C20442b bVar2 = bVar;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(bVar2, "");
            this.f48320a.invoke(obj, Boolean.valueOf(bVar2.f48382a));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$j */
    public static final class C20410j extends AbstractC89220m implements AbstractC89183m<RECEIVER, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48321a;

        static {
            Covode.recordClassIndex(23926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20410j(AbstractC20443c cVar) {
            super(2);
            this.f48321a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(th, "");
            this.f48321a.mo33774b().invoke(obj, th);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$l */
    public static final class C20412l extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48323a;

        static {
            Covode.recordClassIndex(23928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20412l(AbstractC20443c cVar) {
            super(2);
            this.f48323a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(obj2, "");
            this.f48323a.mo33775c().invoke(obj, obj2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$m */
    public static final class C20413m extends AbstractC89220m implements AbstractC89183m<RECEIVER, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48324a;

        static {
            Covode.recordClassIndex(23929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20413m(AbstractC20443c cVar) {
            super(2);
            this.f48324a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(th, "");
            this.f48324a.mo33774b().invoke(obj, th);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$o */
    public static final class C20415o extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48326a;

        static {
            Covode.recordClassIndex(23931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20415o(AbstractC20443c cVar) {
            super(2);
            this.f48326a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(obj2, "");
            this.f48326a.mo33775c().invoke(obj, obj2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static C20442b m38614a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f48382a) {
            return listState.isEmpty();
        }
        return new C20442b(isEmpty);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$a */
    public static final class C20396a extends AbstractC89220m implements AbstractC89183m<S, ListState<T, P>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f48293a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48294b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f48295c;

        static {
            Covode.recordClassIndex(23912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20396a(ListMiddleware listMiddleware, AbstractC89172b bVar, AbstractC89183m mVar) {
            super(2);
            this.f48293a = listMiddleware;
            this.f48294b = bVar;
            this.f48295c = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            ListState listState = (ListState) obj2;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(listState, "");
            if (listState.getHasMore().f48382a && !(listState.getLoadMore() instanceof C20535w)) {
                this.f48293a.mo33806a((AbstractC88979t) this.f48294b.invoke(obj), new AbstractC89183m<ListState<T, P>, AbstractC20362a<? extends C89378p<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.C20396a.C203971 */

                    /* renamed from: a */
                    final /* synthetic */ C20396a f48296a;

                    static {
                        Covode.recordClassIndex(23913);
                    }

                    {
                        this.f48296a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        ListState copy$default;
                        ListState listState = (ListState) obj;
                        AbstractC20362a aVar = (AbstractC20362a) obj2;
                        C89219l.m154719c(listState, "");
                        C89219l.m154719c(aVar, "");
                        C89378p pVar = (C89378p) aVar.mo33695a();
                        if (pVar != null) {
                            List list = (List) pVar.component1();
                            C20465o oVar = (C20465o) pVar.component2();
                            this.f48296a.f48293a.mo33731a(list.size(), (Throwable) null);
                            List list2 = (List) this.f48296a.f48295c.invoke(listState.getList(), list);
                            C20442b a = ListMiddleware.m38614a(listState, list2);
                            if (oVar != null && (copy$default = ListState.copy$default(listState, oVar, list2, null, new C20372aj(list), a, 4, null)) != null) {
                                return copy$default;
                            }
                            ListState copy$default2 = ListState.copy$default(listState, null, list2, null, new C20372aj(list), a, 5, null);
                            if (copy$default2 != null) {
                                return copy$default2;
                            }
                        }
                        if (!(aVar instanceof C20466f)) {
                            return ListState.copy$default(listState, null, null, null, new C20535w(), null, 23, null);
                        }
                        C20466f fVar = (C20466f) aVar;
                        this.f48296a.f48293a.mo33731a(0, fVar.f48408a);
                        return ListState.copy$default(listState, null, null, null, new C20466f(fVar.f48408a), null, 23, null);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$b */
    static final class C20398b extends AbstractC89220m implements AbstractC89183m<S, ListState<T, P>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f48297a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48298b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f48299c;

        static {
            Covode.recordClassIndex(23914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20398b(ListMiddleware listMiddleware, AbstractC89172b bVar, AbstractC89183m mVar) {
            super(2);
            this.f48297a = listMiddleware;
            this.f48298b = bVar;
            this.f48299c = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            ListState listState = (ListState) obj2;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(listState, "");
            if (!(listState.getRefresh() instanceof C20535w)) {
                this.f48297a.mo33806a((AbstractC88979t) this.f48298b.invoke(obj), new AbstractC89183m<ListState<T, P>, AbstractC20362a<? extends C89378p<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListMiddleware.C20398b.C203991 */

                    /* renamed from: a */
                    final /* synthetic */ C20398b f48300a;

                    static {
                        Covode.recordClassIndex(23915);
                    }

                    {
                        this.f48300a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        ListState copy$default;
                        ListState listState = (ListState) obj;
                        AbstractC20362a aVar = (AbstractC20362a) obj2;
                        C89219l.m154719c(listState, "");
                        C89219l.m154719c(aVar, "");
                        C89378p pVar = (C89378p) aVar.mo33695a();
                        if (pVar != null) {
                            Object component1 = pVar.component1();
                            C20465o oVar = (C20465o) pVar.component2();
                            List list = (List) this.f48300a.f48299c.invoke(listState.getList(), component1);
                            C20442b a = ListMiddleware.m38614a(listState, list);
                            if (oVar != null && (copy$default = ListState.copy$default(listState, oVar, list, new C20372aj(component1), null, a, 8, null)) != null) {
                                return copy$default;
                            }
                            ListState copy$default2 = ListState.copy$default(listState, null, list, new C20372aj(component1), null, a, 9, null);
                            if (copy$default2 != null) {
                                return copy$default2;
                            }
                        }
                        if (aVar instanceof C20466f) {
                            return ListState.copy$default(listState, null, null, new C20466f(((C20466f) aVar).f48408a), null, null, 27, null);
                        }
                        return ListState.copy$default(listState, null, null, new C20535w(), null, null, 27, null);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo33730a(int i, T t) {
        mo33807a(new C20400c(this, i, t));
    }

    /* renamed from: a */
    public final void mo33731a(int i, Throwable th) {
        AbstractC89244h<C20402e.C204031> hVar = this.f48288e;
        if (hVar.isInitialized()) {
            hVar.getValue().mo33764a(i, th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super S extends com.bytedance.jedi.arch.af, ? extends f.a.t<h.p<java.util.List<T>, P extends com.bytedance.jedi.arch.ext.list.o>>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super S extends com.bytedance.jedi.arch.af, ? extends f.a.t<h.p<java.util.List<T>, P extends com.bytedance.jedi.arch.ext.list.o>>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.util.List<? extends T>, ? super java.util.List<? extends T>, ? extends java.util.List<? extends T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.util.List<? extends T>, ? super java.util.List<? extends T>, ? extends java.util.List<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ListMiddleware(AbstractC89172b<? super S, ? extends AbstractC88979t<C89378p<List<T>, P>>> bVar, AbstractC89172b<? super S, ? extends AbstractC88979t<C89378p<List<T>, P>>> bVar2, AbstractC89183m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, AbstractC89183m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(mVar2, "");
        this.f48289f = bVar;
        this.f48290g = bVar2;
        this.f48291h = mVar;
        this.f48292i = mVar2;
        this.f48288e = C89250i.m154773a((AbstractC89171a) new C20402e(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListMiddleware(AbstractC89172b bVar, AbstractC89172b bVar2, AbstractC89183m mVar, AbstractC89183m mVar2, int i) {
        this(bVar, (i & 2) != 0 ? null : bVar2, (i & 4) != 0 ? C20462n.C20464b.f48405a : mVar, (i & 8) != 0 ? C20462n.C20463a.f48404a : mVar2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m38615a(ListMiddleware listMiddleware, AbstractC20468h hVar, AbstractC20427a aVar, boolean z, AbstractC20443c cVar, AbstractC20443c cVar2, AbstractC89183m mVar, AbstractC89183m mVar2, int i) {
        AbstractC89183m mVar3 = mVar;
        AbstractC20427a aVar2 = aVar;
        boolean z2 = z;
        AbstractC20443c cVar3 = cVar;
        AbstractC20443c cVar4 = cVar2;
        AbstractC89183m mVar4 = null;
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        if ((i & 8) != 0) {
            z2 = hVar.getUniqueOnlyGlobal();
        }
        if ((i & 16) != 0) {
            cVar3 = null;
        }
        if ((i & 32) != 0) {
            cVar4 = null;
        }
        if ((i & 64) != 0) {
            mVar3 = null;
        }
        if ((i & 128) == 0) {
            mVar4 = mVar2;
        }
        listMiddleware.subscribe(hVar, aVar2, false, z2, cVar3, cVar4, mVar3, mVar4, null, null);
    }

    public final <RECEIVER extends AbstractC20467g> void subscribe(AbstractC20468h<? extends RECEIVER> hVar, AbstractC20427a<T> aVar, boolean z, boolean z2, AbstractC20443c<T, RECEIVER> cVar, AbstractC20443c<T, RECEIVER> cVar2, AbstractC89183m<? super RECEIVER, ? super Boolean, C89391z> mVar, AbstractC89183m<? super RECEIVER, ? super Boolean, C89391z> mVar2, AbstractC89172b<? super RECEIVER, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super P, C89391z> mVar3) {
        C89219l.m154719c(hVar, "");
        if (mVar3 != null) {
            mo33804a(hVar, C20444d.f48383a, z2, z, new C20407g(mVar3));
        }
        if (mVar != null) {
            mo33804a(hVar, C20445e.f48384a, z2, z, new C20408h(mVar));
        }
        if (mVar2 != null) {
            mo33804a(hVar, C20446f.f48385a, z2, z, new C20409i(mVar2));
        }
        if (cVar != null) {
            mo33805a(hVar, C20447g.f48386a, z2, z, new C20410j(cVar), new C20411k(cVar), new C20412l(cVar));
        }
        if (cVar2 != null) {
            mo33805a(hVar, C20448h.f48387a, z2, z, new C20413m(cVar2), new C20414n(cVar2), new C20415o(cVar2));
        }
        if (aVar != null) {
            mo33804a(hVar, C20449i.f48388a, z2, z, new C20405f(aVar, this, hVar, z2, z, bVar));
        }
    }
}
