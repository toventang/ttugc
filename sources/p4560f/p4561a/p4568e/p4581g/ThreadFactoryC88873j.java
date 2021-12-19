package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: f.a.e.g.j */
public final class ThreadFactoryC88873j extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a */
    final String f201838a;

    /* renamed from: b */
    final int f201839b;

    /* renamed from: c */
    final boolean f201840c;

    static {
        Covode.recordClassIndex(104915);
    }

    public final String toString() {
        return "RxThreadFactory[" + this.f201838a + "]";
    }

    public ThreadFactoryC88873j(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        MethodCollector.m26663i(1370);
        String str = this.f201838a + '-' + incrementAndGet();
        if (this.f201840c) {
            thread = new C88874a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f201839b);
        thread.setDaemon(true);
        MethodCollector.m26664o(1370);
        return thread;
    }

    /* renamed from: f.a.e.g.j$a */
    static final class C88874a extends Thread implements AbstractC88872i {
        static {
            Covode.recordClassIndex(104916);
        }

        C88874a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public ThreadFactoryC88873j(String str, int i) {
        this(str, i, false);
    }

    public ThreadFactoryC88873j(String str, int i, boolean z) {
        this.f201838a = str;
        this.f201839b = i;
        this.f201840c = z;
    }
}
