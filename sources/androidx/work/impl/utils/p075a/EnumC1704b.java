package androidx.work.impl.utils.p075a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: androidx.work.impl.utils.a.b */
public enum EnumC1704b implements Executor {
    INSTANCE;

    public final String toString() {
        return "DirectExecutor";
    }

    static {
        Covode.recordClassIndex(1871);
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
