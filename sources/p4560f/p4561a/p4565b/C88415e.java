package p4560f.p4561a.p4565b;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: f.a.b.e */
public final class C88415e extends AbstractC88414d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    static {
        Covode.recordClassIndex(104457);
    }

    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    C88415e(Runnable runnable) {
        super(runnable);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // p4560f.p4561a.p4565b.AbstractC88414d
    /* renamed from: a */
    public final /* synthetic */ void mo142948a(Runnable runnable) {
        runnable.run();
    }
}
