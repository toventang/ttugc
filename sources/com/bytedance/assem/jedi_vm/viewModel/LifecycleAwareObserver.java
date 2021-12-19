package com.bytedance.assem.jedi_vm.viewModel;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.jedi_vm.p798a.C12865d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22879g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88425e;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4572d.C88491o;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class LifecycleAwareObserver<T> extends AtomicReference<AbstractC88412b> implements AbstractC1202k, AbstractC88412b, AbstractC88986z<T> {

    /* renamed from: a */
    private T f31308a;

    /* renamed from: b */
    private T f31309b;

    /* renamed from: c */
    private final AtomicBoolean f31310c;

    /* renamed from: d */
    private final boolean f31311d;

    /* renamed from: e */
    private final boolean f31312e;

    /* renamed from: f */
    private final boolean f31313f;
    public AbstractC1204m owner;
    public AbstractC88986z<T> sourceObserver;

    static {
        Covode.recordClassIndex(14699);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        requireSourceObserver().onComplete();
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == C12872a.f31321a) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver$b */
    static final class RunnableC12868b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifecycleAwareObserver f31315a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31316b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1196i.EnumC1198a f31317c;

        static {
            Covode.recordClassIndex(14701);
        }

        RunnableC12868b(LifecycleAwareObserver lifecycleAwareObserver, AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            this.f31315a = lifecycleAwareObserver;
            this.f31316b = mVar;
            this.f31317c = aVar;
        }

        public final void run() {
            this.f31315a.onLifecycleEvent(this.f31316b);
            if (this.f31317c == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                this.f31315a.onDestroy();
            }
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver$c */
    public static final class RunnableC12869c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifecycleAwareObserver f31318a;

        static {
            Covode.recordClassIndex(14702);
        }

        public RunnableC12869c(LifecycleAwareObserver lifecycleAwareObserver) {
            this.f31318a = lifecycleAwareObserver;
        }

        public final void run() {
            this.f31318a.requireOwner().getLifecycle().mo4012a(this.f31318a);
            this.f31318a.requireSourceObserver().onSubscribe(this.f31318a);
        }
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        AbstractC88412b bVar;
        Object obj = get();
        AbstractC88412b bVar2 = C12872a.f31321a;
        if (obj != bVar2 && (bVar = (AbstractC88412b) getAndSet(bVar2)) != bVar2 && bVar != null) {
            bVar.dispose();
        }
    }

    public final AbstractC1204m requireOwner() {
        AbstractC1204m mVar = this.owner;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("cannot access owner after destroy".toString());
    }

    public final AbstractC88986z<T> requireSourceObserver() {
        AbstractC88986z<T> zVar = this.sourceObserver;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("cannot access observer after destroy".toString());
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver$a */
    public static final class RunnableC12867a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifecycleAwareObserver f31314a;

        static {
            Covode.recordClassIndex(14700);
        }

        public RunnableC12867a(LifecycleAwareObserver lifecycleAwareObserver) {
            this.f31314a = lifecycleAwareObserver;
        }

        public final void run() {
            this.f31314a.requireOwner().getLifecycle().mo4013b(this.f31314a);
            if (!this.f31314a.isDisposed()) {
                this.f31314a.dispose();
            }
            this.f31314a.owner = null;
            this.f31314a.sourceObserver = null;
        }
    }

    public final void onDestroy() {
        if (C12865d.m23117a()) {
            requireOwner().getLifecycle().mo4013b(this);
            if (!isDisposed()) {
                dispose();
            }
            this.owner = null;
            this.sourceObserver = null;
            return;
        }
        C12865d.f31306a.post(new RunnableC12867a(this));
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver$d */
    static final class C12870d<T> implements AbstractC88433f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f31319a;

        static {
            Covode.recordClassIndex(14703);
        }

        C12870d(AbstractC89172b bVar) {
            this.f31319a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(T t) {
            this.f31319a.invoke(t);
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver$e */
    static final class C12871e<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f31320a;

        static {
            Covode.recordClassIndex(14704);
        }

        C12871e(AbstractC89172b bVar) {
            this.f31320a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            AbstractC89172b bVar = this.f31320a;
            if (bVar != null) {
                bVar.invoke(th2);
            } else {
                C88925a.m154178a(th2);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        C89219l.m154719c(th, "");
        if (!isDisposed()) {
            lazySet(C12872a.f31321a);
            requireSourceObserver().onError(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        if (this.f31312e) {
            requireSourceObserver().onNext(t);
        } else if (this.f31310c.get()) {
            requireSourceObserver().onNext(t);
        } else {
            this.f31308a = t;
        }
        this.f31309b = t;
    }

    public final void onLifecycleEvent(AbstractC1204m mVar) {
        boolean z;
        T t;
        AbstractC1196i lifecycle = mVar.getLifecycle();
        C89219l.m154709a((Object) lifecycle, "");
        if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
            if (mVar instanceof AbstractC22879g) {
                z = ((AbstractC22879g) mVar).mo20487h();
            } else {
                z = true;
            }
            if (!this.f31310c.getAndSet(true) && !isDisposed()) {
                if (z || !this.f31311d) {
                    t = this.f31308a;
                } else {
                    t = this.f31308a;
                    if (t == null) {
                        t = this.f31309b;
                    }
                }
                this.f31308a = null;
                if (t != null) {
                    onNext(t);
                    return;
                }
                return;
            }
            return;
        }
        this.f31310c.set(false);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        C89219l.m154719c(bVar, "");
        if (!compareAndSet(null, bVar)) {
            bVar.dispose();
            if (get() != C12872a.f31321a) {
                C88925a.m154178a(new C88425e("Disposable already set!"));
            }
        } else if (C12865d.m23117a()) {
            requireOwner().getLifecycle().mo4012a(this);
            requireSourceObserver().onSubscribe(this);
        } else {
            C12865d.f31306a.post(new RunnableC12869c(this));
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (!C12787j.f31110d || !this.f31313f) {
            onLifecycleEvent(mVar);
            if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                onDestroy();
                return;
            }
            return;
        }
        C12787j.m23009a().execute(new RunnableC12868b(this, mVar, aVar));
    }

    public LifecycleAwareObserver(AbstractC1204m mVar, boolean z, boolean z2, boolean z3, AbstractC89172b<? super T, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(bVar, "");
        this.f31311d = z;
        this.f31312e = z2;
        this.f31313f = z3;
        this.owner = mVar;
        this.sourceObserver = new C88491o(new C12870d(bVar), new C12871e(bVar2), C88446a.f200697c, C88446a.f200698d);
        this.f31310c = new AtomicBoolean(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifecycleAwareObserver(AbstractC1204m mVar, boolean z, boolean z2, boolean z3, AbstractC89172b bVar, AbstractC89172b bVar2, int i, C89214g gVar) {
        this(mVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, bVar, (i & 32) != 0 ? null : bVar2);
    }
}
