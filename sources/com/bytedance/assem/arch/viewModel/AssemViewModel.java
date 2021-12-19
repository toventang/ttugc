package com.bytedance.assem.arch.viewModel;

import android.os.Looper;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.AbstractC12649d;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89622g;
import kotlinx.coroutines.android.C89523c;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

public abstract class AssemViewModel<S extends AbstractC12853j> extends AbstractC1174ac implements AbstractC1204m {

    /* renamed from: a */
    public WeakReference<AbstractC1196i> f31147a;

    /* renamed from: b */
    public volatile boolean f31148b;

    /* renamed from: c */
    public boolean f31149c;

    /* renamed from: d */
    public C12752d f31150d;

    /* renamed from: e */
    public C12753e f31151e;

    /* renamed from: f */
    public AbstractC12840g<S> f31152f;

    /* renamed from: g */
    public AbstractC89183m<Object, ? super S, ? extends Object> f31153g;

    /* renamed from: h */
    public Object f31154h;

    /* renamed from: i */
    public Object f31155i;

    /* renamed from: j */
    private S f31156j;

    /* renamed from: k */
    private final C12817e f31157k = new C12817e();

    /* renamed from: l */
    private final boolean f31158l;

    /* renamed from: m */
    private final AbstractC89244h f31159m = C89250i.m154774a(EnumC89331m.NONE, C12809c.f31164a);

    /* renamed from: n */
    private final AbstractC89244h f31160n = C89250i.m154773a((AbstractC89171a) C12808b.f31163a);

    /* renamed from: o */
    private final SparseArray<AbstractC12644a<?>> f31161o = new SparseArray<>();

    static {
        Covode.recordClassIndex(14638);
    }

    /* renamed from: g */
    private final AbstractC89516am mo23342g() {
        return (AbstractC89516am) this.f31159m.getValue();
    }

    /* renamed from: h */
    private final C88411a mo23343h() {
        return (C88411a) this.f31160n.getValue();
    }

    public final AbstractC89516am aP_() {
        return (AbstractC89516am) this.f31157k.getValue();
    }

    /* renamed from: c */
    public void mo20669c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract S mo20674f();

    public boolean bR_() {
        return this.f31158l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.viewModel.AssemViewModel$a */
    public static final class C12807a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C12807a f31162a = new C12807a();

        static {
            Covode.recordClassIndex(14639);
        }

        C12807a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    /* renamed from: com.bytedance.assem.arch.viewModel.AssemViewModel$b */
    static final class C12808b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C12808b f31163a = new C12808b();

        static {
            Covode.recordClassIndex(14640);
        }

        C12808b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: d */
    public final AbstractC12840g<S> mo20671d() {
        AbstractC12840g<S> gVar = this.f31152f;
        if (gVar == null) {
            C89219l.m154710a("vmDispatcher");
        }
        return gVar;
    }

    /* renamed from: e */
    public final S mo20673e() {
        AbstractC12840g<S> gVar = this.f31152f;
        if (gVar == null) {
            C89219l.m154710a("vmDispatcher");
        }
        return gVar.mo20680a();
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        WeakReference<AbstractC1196i> weakReference = this.f31147a;
        if (weakReference == null) {
            C89219l.m154710a("lifecycleRef");
        }
        AbstractC1196i iVar = weakReference.get();
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: com.bytedance.assem.arch.viewModel.AssemViewModel$c */
    static final class C12809c extends AbstractC89220m implements AbstractC89171a<C12816d> {

        /* renamed from: a */
        public static final C12809c f31164a = new C12809c();

        static {
            Covode.recordClassIndex(14641);
        }

        C12809c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12816d invoke() {
            AbstractC89703z a = C89599cu.m155531a();
            Looper mainLooper = Looper.getMainLooper();
            C89219l.m154709a((Object) mainLooper, "");
            return new C12816d(a.plus(C89523c.m155452a(C12813a.m23048a(mainLooper), "fast-main")));
        }
    }

    public AssemViewModel() {
        C89219l.m154719c(this, "");
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        C12752d dVar = this.f31150d;
        if (dVar != null) {
            dVar.mo20604a();
        }
        C12753e eVar = this.f31151e;
        if (eVar != null) {
            eVar.mo20609a();
        }
        int size = this.f31161o.size();
        for (int i = 0; i < size; i++) {
            this.f31161o.get(i);
        }
        AbstractC89516am aP_ = aP_();
        AbstractC89568bz bzVar = (AbstractC89568bz) aP_.mo20678a().get(AbstractC89568bz.f203287c);
        if (bzVar != null) {
            bzVar.mo144011o();
            AbstractC89516am g = mo23342g();
            AbstractC89568bz bzVar2 = (AbstractC89568bz) g.mo20678a().get(AbstractC89568bz.f203287c);
            if (bzVar2 != null) {
                bzVar2.mo144011o();
                mo23343h().mo142944a();
                AbstractC12840g<S> gVar = this.f31152f;
                if (gVar == null) {
                    C89219l.m154710a("vmDispatcher");
                }
                gVar.mo20690b();
                super.onCleared();
                WeakReference<AbstractC1196i> weakReference = this.f31147a;
                if (weakReference == null) {
                    C89219l.m154710a("lifecycleRef");
                }
                weakReference.clear();
                return;
            }
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(g)).toString());
        }
        throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(aP_)).toString());
    }

    /* renamed from: a */
    public final AbstractC88412b mo20659a(AbstractC88412b bVar) {
        C89219l.m154719c(bVar, "");
        mo23343h().mo142945a(bVar);
        return bVar;
    }

    /* renamed from: com.bytedance.assem.arch.viewModel.AssemViewModel$d */
    static final class C12810d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f31165a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f31166b;

        /* renamed from: c */
        private AbstractC89516am f31167c;

        static {
            Covode.recordClassIndex(14642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12810d(AbstractC89172b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f31166b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C12810d dVar2 = new C12810d(this.f31166b, dVar);
            dVar2.f31167c = (AbstractC89516am) obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C12810d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f31165a == 0) {
                C89382r.m154942a(obj);
                this.f31166b.invoke(this.f31167c);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final <OPT extends AbstractC12649d> void mo20660a(AbstractC12644a<OPT> aVar) {
        C89219l.m154719c(aVar, "");
        SparseArray<AbstractC12644a<?>> sparseArray = this.f31161o;
        sparseArray.put(sparseArray.size(), aVar);
    }

    /* renamed from: b */
    public final void mo20667b(AbstractC89172b<? super S, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        AbstractC12840g<S> gVar = this.f31152f;
        if (gVar == null) {
            C89219l.m154710a("vmDispatcher");
        }
        gVar.mo20691b(bVar);
    }

    /* renamed from: c */
    public final void mo20670c(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        AbstractC12840g<S> gVar = this.f31152f;
        if (gVar == null) {
            C89219l.m154710a("vmDispatcher");
        }
        gVar.mo20692c(bVar);
    }

    /* renamed from: d */
    public final void mo20672d(AbstractC89172b<? super AbstractC89516am, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        C89622g.m155550b(mo23342g(), (AbstractC89127f) null, new C12810d(bVar, null), 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.viewModel.AssemViewModel$f */
    public static final class C12812f extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        final /* synthetic */ Object f31170a;

        /* renamed from: b */
        final /* synthetic */ Object f31171b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f31172c;

        /* renamed from: d */
        final /* synthetic */ List f31173d;

        static {
            Covode.recordClassIndex(14644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12812f(Object obj, Object obj2, AbstractC89183m mVar, List list) {
            super(1);
            this.f31170a = obj;
            this.f31171b = obj2;
            this.f31172c = mVar;
            this.f31173d = list;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            Object obj2 = this.f31170a;
            if (obj2 != null) {
                Object invoke = ((AbstractC89183m) C89206ad.m154679b(obj2, 2)).invoke(obj, this.f31171b);
                AbstractC89183m mVar = this.f31172c;
                if (mVar != null) {
                    mVar.invoke(this.f31171b, this.f31173d);
                }
                return invoke;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.assem.arch.viewModel.AssemViewModel$e */
    static final class C12811e extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f31168a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f31169b;

        static {
            Covode.recordClassIndex(14643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12811e(AssemViewModel assemViewModel, AbstractC89172b bVar) {
            super(1);
            this.f31168a = assemViewModel;
            this.f31169b = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            Object invoke = this.f31169b.invoke(obj);
            if (!(this.f31168a.f31153g == null || this.f31168a.f31154h == null || this.f31168a.f31155i == null)) {
                AssemViewModel assemViewModel = this.f31168a;
                AbstractC89183m<Object, ? super S, ? extends Object> mVar = assemViewModel.f31153g;
                if (mVar == null) {
                    C89219l.m154707a();
                }
                Object obj2 = this.f31168a.f31154h;
                if (obj2 == null) {
                    C89219l.m154707a();
                }
                assemViewModel.f31154h = mVar.invoke(obj2, invoke);
                Object obj3 = this.f31168a.f31155i;
                if (obj3 != null) {
                    AbstractC89172b bVar = (AbstractC89172b) C89206ad.m154679b(obj3, 1);
                    Object obj4 = this.f31168a.f31154h;
                    if (obj4 == null) {
                        C89219l.m154707a();
                    }
                    bVar.invoke(obj4);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            return invoke;
        }
    }

    /* renamed from: a */
    public final void mo20662a(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        AbstractC12840g<S> gVar = this.f31152f;
        if (gVar == null) {
            C89219l.m154710a("vmDispatcher");
        }
        gVar.mo20687a(new C12811e(this, bVar));
    }

    /* renamed from: a */
    public final void mo20665a(WeakReference<AbstractC1196i> weakReference) {
        C89219l.m154719c(weakReference, "");
        this.f31147a = weakReference;
    }

    /* renamed from: a */
    public final void mo20661a(AbstractC12840g<S> gVar, AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(bVar, "");
        if (this.f31156j == null) {
            this.f31156j = (S) ((AbstractC12853j) bVar.invoke(mo20674f()));
            gVar.mo20689a(aP_());
            S s = this.f31156j;
            if (s != null) {
                gVar.mo20686a(s);
                this.f31152f = gVar;
                mo20669c();
                this.f31148b = true;
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: a */
    public final void mo20664a(Object obj, List<? extends Object> list, Object obj2, AbstractC89183m<Object, ? super List<? extends Object>, C89391z> mVar) {
        C89219l.m154719c(obj2, "");
        AbstractC12840g<S> gVar = this.f31152f;
        if (gVar == null) {
            C89219l.m154710a("vmDispatcher");
        }
        gVar.mo20687a(new C12812f(obj2, obj, mVar, list));
    }

    /* renamed from: a */
    public final <T> void mo20663a(AbstractC89290k<S, ? extends AbstractC12783f<? extends T>> kVar, C12854k<C12793o<AbstractC12783f<T>>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89171a<C89391z> aVar, AbstractC89172b<? super T, C89391z> bVar2) {
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        AbstractC12840g<S> gVar = this.f31152f;
        if (gVar == null) {
            C89219l.m154710a("vmDispatcher");
        }
        gVar.mo20688a(kVar, kVar2, C12807a.f31162a, bVar, aVar, bVar2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m23030a(AssemViewModel assemViewModel, AbstractC89290k kVar, C12854k kVar2, AbstractC89172b bVar, AbstractC89171a aVar, AbstractC89172b bVar2, int i) {
        C12854k kVar3 = kVar2;
        AbstractC89172b bVar3 = bVar;
        AbstractC89171a aVar2 = aVar;
        if ((i & 2) != 0) {
            kVar3 = C12856l.m23102a(false);
        }
        AbstractC89172b bVar4 = null;
        if ((i & 4) != 0) {
            bVar3 = null;
        }
        if ((i & 8) != 0) {
            aVar2 = null;
        }
        if ((i & 16) == 0) {
            bVar4 = bVar2;
        }
        assemViewModel.mo20663a(kVar, kVar3, bVar3, aVar2, bVar4);
    }
}
