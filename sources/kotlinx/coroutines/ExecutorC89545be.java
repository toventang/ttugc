package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import p4600h.p4603c.C89133g;

/* renamed from: kotlinx.coroutines.be */
public final class ExecutorC89545be implements Executor {

    /* renamed from: a */
    public final AbstractC89507ah f203265a;

    static {
        Covode.recordClassIndex(105636);
    }

    public final String toString() {
        return this.f203265a.toString();
    }

    public final void execute(Runnable runnable) {
        this.f203265a.dispatch(C89133g.INSTANCE, runnable);
    }
}
