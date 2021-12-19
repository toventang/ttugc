package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.scheduling.j */
public final class C89690j extends AbstractRunnableC89688h {

    /* renamed from: a */
    public final Runnable f203455a;

    static {
        Covode.recordClassIndex(105784);
    }

    public final void run() {
        try {
            this.f203455a.run();
        } finally {
            this.f203454h.mo144246b();
        }
    }

    public final String toString() {
        return "Task[" + this.f203455a.getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this.f203455a)) + ", " + this.f203453g + ", " + this.f203454h + ']';
    }

    public C89690j(Runnable runnable, long j, AbstractC89689i iVar) {
        super(j, iVar);
        this.f203455a = runnable;
    }
}
