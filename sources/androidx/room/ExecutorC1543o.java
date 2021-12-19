package androidx.room;

import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: androidx.room.o */
public final class ExecutorC1543o implements Executor {

    /* renamed from: a */
    private final Executor f5079a;

    /* renamed from: b */
    private final ArrayDeque<Runnable> f5080b = new ArrayDeque<>();

    /* renamed from: c */
    private Runnable f5081c;

    static {
        Covode.recordClassIndex(1682);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo5110a() {
        Runnable poll = this.f5080b.poll();
        this.f5081c = poll;
        if (poll != null) {
            this.f5079a.execute(poll);
        }
    }

    ExecutorC1543o(Executor executor) {
        this.f5079a = executor;
    }

    public final synchronized void execute(final Runnable runnable) {
        this.f5080b.offer(new Runnable() {
            /* class androidx.room.ExecutorC1543o.RunnableC15441 */

            static {
                Covode.recordClassIndex(1683);
            }

            public final void run() {
                try {
                    runnable.run();
                } finally {
                    ExecutorC1543o.this.mo5110a();
                }
            }
        });
        if (this.f5081c == null) {
            mo5110a();
        }
    }
}
