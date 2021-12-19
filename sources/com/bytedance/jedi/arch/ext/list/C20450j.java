package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20468h;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ext.list.j */
public final class C20450j {
    static {
        Covode.recordClassIndex(23971);
    }

    /* renamed from: a */
    public static final <T, P extends C20465o> List<T> m38659a(IListState<T, P> iListState) {
        C89219l.m154719c(iListState, "");
        return ((ListState) iListState.getSubstate()).getList();
    }

    /* renamed from: b */
    public static final <T, P extends C20465o> AbstractC20362a<List<T>> m38660b(IListState<T, P> iListState) {
        C89219l.m154719c(iListState, "");
        return ((ListState) iListState.getSubstate()).getRefresh();
    }

    /* renamed from: c */
    public static final <T, P extends C20465o> AbstractC20362a<List<T>> m38661c(IListState<T, P> iListState) {
        C89219l.m154719c(iListState, "");
        return ((ListState) iListState.getSubstate()).getLoadMore();
    }

    /* renamed from: d */
    public static final <T, P extends C20465o> C20442b m38662d(IListState<T, P> iListState) {
        C89219l.m154719c(iListState, "");
        return ((ListState) iListState.getSubstate()).getHasMore();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.j$c */
    public static final class C20454c extends AbstractC89220m implements AbstractC89172b<RECEIVER, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48396a;

        static {
            Covode.recordClassIndex(23975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20454c(AbstractC20443c cVar) {
            super(1);
            this.f48396a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            this.f48396a.mo33773a().invoke(obj);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.j$f */
    public static final class C20457f extends AbstractC89220m implements AbstractC89172b<RECEIVER, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48399a;

        static {
            Covode.recordClassIndex(23978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20457f(AbstractC20443c cVar) {
            super(1);
            this.f48399a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            this.f48399a.mo33773a().invoke(obj);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.j$a */
    public static final class C20451a extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20427a f48389a;

        /* renamed from: b */
        final /* synthetic */ AbstractC20468h f48390b;

        /* renamed from: c */
        final /* synthetic */ ListViewModel f48391c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f48392d = null;

        static {
            Covode.recordClassIndex(23972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20451a(AbstractC20427a aVar, AbstractC20468h hVar, ListViewModel listViewModel) {
            super(2);
            this.f48389a = aVar;
            this.f48390b = hVar;
            this.f48391c = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C204521 r0;
            final AbstractC20467g gVar = (AbstractC20467g) obj;
            List list = (List) obj2;
            C89219l.m154719c(gVar, "");
            C89219l.m154719c(list, "");
            AbstractC20427a aVar = this.f48389a;
            final AbstractC89172b bVar = this.f48392d;
            if (bVar != null) {
                r0 = new AbstractC89171a<C89391z>() {
                    /* class com.bytedance.jedi.arch.ext.list.C20450j.C20451a.C204521 */

                    static {
                        Covode.recordClassIndex(23973);
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
    /* renamed from: com.bytedance.jedi.arch.ext.list.j$b */
    public static final class C20453b extends AbstractC89220m implements AbstractC89183m<RECEIVER, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48395a;

        static {
            Covode.recordClassIndex(23974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20453b(AbstractC20443c cVar) {
            super(2);
            this.f48395a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(th, "");
            this.f48395a.mo33774b().invoke(obj, th);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.j$d */
    public static final class C20455d extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48397a;

        static {
            Covode.recordClassIndex(23976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20455d(AbstractC20443c cVar) {
            super(2);
            this.f48397a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(obj2, "");
            this.f48397a.mo33775c().invoke(obj, obj2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.j$e */
    public static final class C20456e extends AbstractC89220m implements AbstractC89183m<RECEIVER, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48398a;

        static {
            Covode.recordClassIndex(23977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20456e(AbstractC20443c cVar) {
            super(2);
            this.f48398a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(th, "");
            this.f48398a.mo33774b().invoke(obj, th);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.j$g */
    public static final class C20458g extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20443c f48400a;

        static {
            Covode.recordClassIndex(23979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20458g(AbstractC20443c cVar) {
            super(2);
            this.f48400a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(obj2, "");
            this.f48400a.mo33775c().invoke(obj, obj2);
            return C89391z.f203057a;
        }
    }
}
