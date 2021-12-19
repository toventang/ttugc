package p077b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: b.b */
final class C1722b {

    /* renamed from: a */
    static final C1722b f5541a = new C1722b();

    /* renamed from: c */
    static final int f5542c;

    /* renamed from: d */
    static final int f5543d;

    /* renamed from: e */
    private static final int f5544e;

    /* renamed from: b */
    final Executor f5545b = new ExecutorC1723a((byte) 0);

    /* renamed from: b.b$a */
    static class ExecutorC1723a implements Executor {
        static {
            Covode.recordClassIndex(1892);
        }

        private ExecutorC1723a() {
        }

        /* synthetic */ ExecutorC1723a(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private C1722b() {
    }

    static {
        Covode.recordClassIndex(1891);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f5544e = availableProcessors;
        f5542c = availableProcessors + 1;
        f5543d = (availableProcessors * 2) + 1;
    }
}
