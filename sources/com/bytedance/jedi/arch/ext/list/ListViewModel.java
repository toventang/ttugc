package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.C20466f;
import com.bytedance.jedi.arch.C20535w;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.C20450j;
import com.bytedance.jedi.arch.ext.list.C20462n;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.p1464a.AbstractC20429a;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public abstract class ListViewModel<T, P extends C20465o, S extends IListState<T, P>> extends JediViewModel<S> implements C20438e.AbstractC20440b {

    /* renamed from: a */
    private final AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> f48329a;

    /* renamed from: b */
    private final AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> f48330b = C20462n.C20464b.f48405a;

    /* renamed from: c */
    private final AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> f48331c = C20462n.C20463a.f48404a;

    /* renamed from: d */
    private final AbstractC89244h<C20422d.C204231> f48332d = C89250i.m154773a((AbstractC89171a) new C20422d(this));

    static {
        Covode.recordClassIndex(23934);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> mo33727g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> mo33728h() {
        return this.f48329a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> mo33755i() {
        return this.f48330b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> mo33756j() {
        return this.f48331c;
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$d */
    static final class C20422d extends AbstractC89220m implements AbstractC89171a<C204231> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f48344a;

        static {
            Covode.recordClassIndex(23940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20422d(ListViewModel listViewModel) {
            super(0);
            this.f48344a = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C204231 invoke() {
            return new AbstractC20429a(this) {
                /* class com.bytedance.jedi.arch.ext.list.ListViewModel.C20422d.C204231 */

                /* renamed from: a */
                final /* synthetic */ C20422d f48345a;

                static {
                    Covode.recordClassIndex(23941);
                }

                @Override // com.bytedance.jedi.arch.ext.list.p1464a.AbstractC20429a
                /* renamed from: a */
                public final void mo33736a() {
                    this.f48345a.f48344a.mo33758l();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f48345a = r1;
                }

                @Override // com.bytedance.jedi.arch.ext.list.p1464a.AbstractC20429a
                /* renamed from: a */
                public final void mo33737a(AbstractC89172b<? super Integer, C89391z> bVar) {
                    C89219l.m154719c(bVar, "");
                    this.f48345a.f48344a.mo33687b_(new C20424a(bVar));
                }

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$d$1$a */
                static final class C20424a extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC89172b f48346a;

                    static {
                        Covode.recordClassIndex(23942);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C20424a(AbstractC89172b bVar) {
                        super(1);
                        this.f48346a = bVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Object obj) {
                        IListState iListState = (IListState) obj;
                        C89219l.m154719c(iListState, "");
                        if (((ListState) iListState.getSubstate()).getHasMore().f48382a) {
                            this.f48346a.invoke(Integer.valueOf(((ListState) iListState.getSubstate()).getList().size()));
                        }
                        return C89391z.f203057a;
                    }
                }
            };
        }
    }

    /* renamed from: k */
    public final void mo33757k() {
        AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> i = mo33755i();
        AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> g = mo33727g();
        C89219l.m154719c(i, "");
        C89219l.m154719c(g, "");
        mo33687b_(new C20419b(this, g, i));
    }

    /* renamed from: l */
    public final void mo33758l() {
        AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, P>>> h = mo33728h();
        if (h != null) {
            AbstractC89183m<List<? extends T>, List<? extends T>, List<T>> j = mo33756j();
            C89219l.m154719c(j, "");
            C89219l.m154719c(h, "");
            mo33687b_(new C20417a(this, h, j));
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.p1464a.C20438e.AbstractC20440b
    /* renamed from: a */
    public final void mo33729a(int i) {
        this.f48332d.getValue().mo33729a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$a */
    public static final class C20417a extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f48333a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48334b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f48335c;

        static {
            Covode.recordClassIndex(23935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20417a(ListViewModel listViewModel, AbstractC89172b bVar, AbstractC89183m mVar) {
            super(1);
            this.f48333a = listViewModel;
            this.f48334b = bVar;
            this.f48335c = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            IListState iListState = (IListState) obj;
            C89219l.m154719c(iListState, "");
            ListState listState = (ListState) iListState.getSubstate();
            if (listState.getHasMore().f48382a && !(listState.getLoadMore() instanceof C20535w)) {
                this.f48333a.mo33682a((AbstractC88979t) this.f48334b.invoke(iListState), new AbstractC89183m<S, AbstractC20362a<? extends C89378p<? extends List<? extends T>, ? extends P>>, S>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListViewModel.C20417a.C204181 */

                    /* renamed from: a */
                    final /* synthetic */ C20417a f48336a;

                    static {
                        Covode.recordClassIndex(23936);
                    }

                    {
                        this.f48336a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        NestedState newSubstate;
                        IListState iListState = (IListState) obj;
                        AbstractC20362a aVar = (AbstractC20362a) obj2;
                        C89219l.m154719c(iListState, "");
                        C89219l.m154719c(aVar, "");
                        C89378p pVar = (C89378p) aVar.mo33695a();
                        if (pVar != null) {
                            List list = (List) pVar.component1();
                            C20465o oVar = (C20465o) pVar.component2();
                            this.f48336a.f48333a.mo33753a(list.size(), (Throwable) null);
                            List list2 = (List) this.f48336a.f48335c.invoke(((ListState) iListState.getSubstate()).getList(), list);
                            C20442b a = ListViewModel.m38622a((ListState) iListState.getSubstate(), list2);
                            if ((oVar == null || (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), oVar, list2, null, new C20372aj(list), a, 4, null))) == null) && (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, list2, null, new C20372aj(list), a, 5, null))) == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        } else {
                            if (aVar instanceof C20466f) {
                                C20466f fVar = (C20466f) aVar;
                                this.f48336a.f48333a.mo33753a(0, fVar.f48408a);
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, null, new C20466f(fVar.f48408a), null, 23, null));
                            } else {
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, null, new C20535w(), null, 23, null));
                            }
                            if (newSubstate == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        }
                        return newSubstate;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$b */
    static final class C20419b extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f48337a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48338b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f48339c;

        static {
            Covode.recordClassIndex(23937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20419b(ListViewModel listViewModel, AbstractC89172b bVar, AbstractC89183m mVar) {
            super(1);
            this.f48337a = listViewModel;
            this.f48338b = bVar;
            this.f48339c = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            IListState iListState = (IListState) obj;
            C89219l.m154719c(iListState, "");
            if (!(((ListState) iListState.getSubstate()).getRefresh() instanceof C20535w)) {
                this.f48337a.mo33682a((AbstractC88979t) this.f48338b.invoke(iListState), new AbstractC89183m<S, AbstractC20362a<? extends C89378p<? extends List<? extends T>, ? extends P>>, S>(this) {
                    /* class com.bytedance.jedi.arch.ext.list.ListViewModel.C20419b.C204201 */

                    /* renamed from: a */
                    final /* synthetic */ C20419b f48340a;

                    static {
                        Covode.recordClassIndex(23938);
                    }

                    {
                        this.f48340a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        NestedState newSubstate;
                        IListState iListState = (IListState) obj;
                        AbstractC20362a aVar = (AbstractC20362a) obj2;
                        C89219l.m154719c(iListState, "");
                        C89219l.m154719c(aVar, "");
                        C89378p pVar = (C89378p) aVar.mo33695a();
                        if (pVar != null) {
                            Object component1 = pVar.component1();
                            C20465o oVar = (C20465o) pVar.component2();
                            List list = (List) this.f48340a.f48339c.invoke(((ListState) iListState.getSubstate()).getList(), component1);
                            C20442b a = ListViewModel.m38622a((ListState) iListState.getSubstate(), list);
                            if ((oVar == null || (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), oVar, list, new C20372aj(component1), null, a, 8, null))) == null) && (newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, list, new C20372aj(component1), null, a, 9, null))) == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        } else {
                            if (aVar instanceof C20466f) {
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, new C20466f(((C20466f) aVar).f48408a), null, null, 27, null));
                            } else {
                                newSubstate = iListState.newSubstate(ListState.copy$default((ListState) iListState.getSubstate(), null, null, new C20535w(), null, null, 27, null));
                            }
                            if (newSubstate == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        }
                        return newSubstate;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$e */
    public static final class C20425e extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f48347a;

        /* renamed from: b */
        final /* synthetic */ List f48348b;

        static {
            Covode.recordClassIndex(23943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20425e(ListViewModel listViewModel, List list) {
            super(1);
            this.f48347a = listViewModel;
            this.f48348b = list;
        }

        public final S invoke(S s) {
            C89219l.m154719c(s, "");
            ((ListState) s.getSubstate()).getList();
            List list = this.f48348b;
            NestedState newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, list, null, null, ListViewModel.m38622a((ListState) s.getSubstate(), list), 13, null));
            if (newSubstate != null) {
                return (S) ((IListState) newSubstate);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$c */
    static final class C20421c extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f48341a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48342b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f48343c;

        static {
            Covode.recordClassIndex(23939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20421c(ListViewModel listViewModel, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f48341a = listViewModel;
            this.f48342b = bVar;
            this.f48343c = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            IListState iListState = (IListState) obj;
            C89219l.m154719c(iListState, "");
            List<T> list = ((ListState) iListState.getSubstate()).getList();
            AbstractC89172b bVar = this.f48342b;
            Iterator<T> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((Boolean) bVar.invoke(it.next())).booleanValue()) {
                    i++;
                } else if (i != -1) {
                    List g = C89070n.m154585g((Collection) ((ListState) iListState.getSubstate()).getList());
                    g.set(i, this.f48343c.invoke(g.get(i)));
                    ListViewModel listViewModel = this.f48341a;
                    C89219l.m154719c(g, "");
                    listViewModel.mo33689c(new C20425e(listViewModel, g));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$f */
    public static final class C20426f extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f48349a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48350b;

        static {
            Covode.recordClassIndex(23944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20426f(ListViewModel listViewModel, AbstractC89172b bVar) {
            super(1);
            this.f48349a = listViewModel;
            this.f48350b = bVar;
        }

        public final S invoke(S s) {
            C89219l.m154719c(s, "");
            List list = (List) this.f48350b.invoke(((ListState) s.getSubstate()).getList());
            NestedState newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, list, null, null, ListViewModel.m38622a((ListState) s.getSubstate(), list), 13, null));
            if (newSubstate != null) {
                return (S) ((IListState) newSubstate);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: a */
    public static C20442b m38622a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f48382a) {
            return listState.isEmpty();
        }
        return new C20442b(isEmpty);
    }

    /* renamed from: a */
    public final void mo33753a(int i, Throwable th) {
        AbstractC89244h<C20422d.C204231> hVar = this.f48332d;
        if (hVar.isInitialized()) {
            hVar.getValue().mo33764a(i, th);
        }
    }

    /* renamed from: a */
    public final void mo33754a(AbstractC89172b<? super T, Boolean> bVar, AbstractC89172b<? super T, ? extends T> bVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        mo33687b_(new C20421c(this, bVar, bVar2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m38623a(ListViewModel listViewModel, AbstractC20468h hVar, AbstractC20427a aVar, AbstractC20443c cVar, AbstractC20443c cVar2, int i) {
        AbstractC20443c cVar3 = null;
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        if ((i & 8) == 0) {
            cVar3 = cVar2;
        }
        C89219l.m154719c(hVar, "");
        if (listViewModel != null) {
            if (cVar != null) {
                AbstractC20468h.C20469a.m38667a(hVar, listViewModel, C20459k.f48401a, (C20370ah) null, new C20450j.C20453b(cVar), new C20450j.C20454c(cVar), new C20450j.C20455d(cVar), 2);
            }
            if (cVar3 != null) {
                AbstractC20468h.C20469a.m38667a(hVar, listViewModel, C20460l.f48402a, (C20370ah) null, new C20450j.C20456e(cVar3), new C20450j.C20457f(cVar3), new C20450j.C20458g(cVar3), 2);
            }
            if (aVar != null) {
                AbstractC88412b unused = hVar.selectSubscribe(listViewModel, C20461m.f48403a, new C20370ah(), new C20450j.C20451a(aVar, hVar, listViewModel));
                return;
            }
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
