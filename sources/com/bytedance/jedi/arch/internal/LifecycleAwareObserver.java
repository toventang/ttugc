package com.bytedance.jedi.arch.internal;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20366ad;
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

public final class LifecycleAwareObserver<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88986z<T>, AbstractC88986z {

    /* renamed from: a */
    private AbstractC1204m f48462a;

    /* renamed from: b */
    private AbstractC88986z<T> f48463b;

    /* renamed from: c */
    private T f48464c;

    /* renamed from: d */
    private T f48465d;

    /* renamed from: e */
    private final AtomicBoolean f48466e;

    /* renamed from: f */
    private final boolean f48467f;

    /* renamed from: g */
    private final boolean f48468g;

    static {
        Covode.recordClassIndex(24000);
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        onLifecycleEvent(mVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        requireSourceObserver().onComplete();
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == C20483b.f48477a) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.jedi.arch.internal.LifecycleAwareObserver$a */
    public static final class RunnableC20479a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifecycleAwareObserver f48469a;

        static {
            Covode.recordClassIndex(24001);
        }

        public RunnableC20479a(LifecycleAwareObserver lifecycleAwareObserver) {
            this.f48469a = lifecycleAwareObserver;
        }

        public final void run() {
            this.f48469a.requireOwner().getLifecycle().mo4012a(this.f48469a);
            this.f48469a.requireSourceObserver().onSubscribe(this.f48469a);
        }
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        AbstractC88412b bVar;
        Object obj = get();
        AbstractC88412b bVar2 = C20483b.f48477a;
        if (obj != bVar2 && (bVar = (AbstractC88412b) getAndSet(bVar2)) != bVar2 && bVar != null) {
            bVar.dispose();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        requireOwner().getLifecycle().mo4013b(this);
        if (!isDisposed()) {
            dispose();
        }
        this.f48462a = null;
        this.f48463b = null;
    }

    public final AbstractC1204m requireOwner() {
        AbstractC1204m mVar = this.f48462a;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("cannot access owner after destroy".toString());
    }

    public final AbstractC88986z<T> requireSourceObserver() {
        AbstractC88986z<T> zVar = this.f48463b;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("cannot access observer after destroy".toString());
    }

    /* renamed from: com.bytedance.jedi.arch.internal.LifecycleAwareObserver$b */
    static final class C20480b<T> implements AbstractC88433f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48470a;

        static {
            Covode.recordClassIndex(24002);
        }

        C20480b(AbstractC89172b bVar) {
            this.f48470a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(T t) {
            this.f48470a.invoke(t);
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        C89219l.m154719c(th, "");
        if (!isDisposed()) {
            lazySet(C20483b.f48477a);
            requireSourceObserver().onError(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        if (this.f48468g) {
            requireSourceObserver().onNext(t);
        } else if (this.f48466e.get()) {
            requireSourceObserver().onNext(t);
        } else {
            this.f48464c = t;
        }
        this.f48465d = t;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_ANY)
    public final void onLifecycleEvent(AbstractC1204m mVar) {
        boolean z;
        T t;
        C89219l.m154719c(mVar, "");
        AbstractC1196i lifecycle = mVar.getLifecycle();
        C89219l.m154709a((Object) lifecycle, "");
        if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
            if (mVar instanceof AbstractC20366ad) {
                z = ((AbstractC20366ad) mVar).mo33697a();
            } else {
                z = true;
            }
            if (!this.f48466e.getAndSet(true) && !isDisposed()) {
                if (z || !this.f48467f || (t = this.f48465d) == null) {
                    t = this.f48464c;
                }
                this.f48464c = null;
                if (t != null) {
                    onNext(t);
                    return;
                }
                return;
            }
            return;
        }
        this.f48466e.set(false);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        C89219l.m154719c(bVar, "");
        if (!compareAndSet(null, bVar)) {
            bVar.dispose();
            if (get() != C20483b.f48477a) {
                C88925a.m154178a(new C88425e("Disposable already set!"));
            }
        } else if (C20498g.m38698a()) {
            requireOwner().getLifecycle().mo4012a(this);
            requireSourceObserver().onSubscribe(this);
        } else {
            C20498g.f48506a.post(new RunnableC20479a(this));
        }
    }

    public LifecycleAwareObserver(AbstractC1204m mVar, boolean z, boolean z2, AbstractC89172b<? super T, C89391z> bVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(bVar, "");
        this.f48467f = z;
        this.f48468g = z2;
        this.f48462a = mVar;
        this.f48463b = new C88491o(new C20480b(bVar), C88446a.f200700f, C88446a.f200697c, C88446a.f200698d);
        this.f48466e = new AtomicBoolean(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifecycleAwareObserver(AbstractC1204m mVar, boolean z, boolean z2, AbstractC89172b bVar, int i, C89214g gVar) {
        this(mVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, bVar);
    }
}
