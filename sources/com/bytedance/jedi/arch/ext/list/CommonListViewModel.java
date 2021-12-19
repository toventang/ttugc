package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.IListState;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public abstract class CommonListViewModel<T, S extends IListState<T, C20465o>> extends ListViewModel<T, C20465o, S> {

    /* renamed from: a */
    private final AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, C20465o>>> f48285a;

    static {
        Covode.recordClassIndex(23906);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, C20465o>>> mo33725a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, C20465o>>> mo33726b() {
        return this.f48285a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: g */
    public final AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, C20465o>>> mo33727g() {
        return new C20395b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: h */
    public final AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, C20465o>>> mo33728h() {
        AbstractC89172b<S, AbstractC88979t<C89378p<List<T>, C20465o>>> b = mo33726b();
        if (b != null) {
            return new C20394a(b);
        }
        return null;
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.CommonListViewModel$a */
    static final class C20394a extends AbstractC89220m implements AbstractC89172b<S, AbstractC88979t<C89378p<? extends List<? extends T>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48286a;

        static {
            Covode.recordClassIndex(23907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20394a(AbstractC89172b bVar) {
            super(1);
            this.f48286a = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return this.f48286a.invoke(obj);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.CommonListViewModel$b */
    static final class C20395b extends AbstractC89220m implements AbstractC89172b<S, AbstractC88979t<C89378p<? extends List<? extends T>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ CommonListViewModel f48287a;

        static {
            Covode.recordClassIndex(23908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20395b(CommonListViewModel commonListViewModel) {
            super(1);
            this.f48287a = commonListViewModel;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return this.f48287a.mo33725a().invoke(obj);
        }
    }
}
