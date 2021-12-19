package p077b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;

/* renamed from: b.e */
public final class C1727e implements Closeable {

    /* renamed from: a */
    final Object f5552a;

    /* renamed from: b */
    Runnable f5553b;

    /* renamed from: c */
    boolean f5554c;

    /* renamed from: d */
    private C1728f f5555d;

    static {
        Covode.recordClassIndex(1896);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.m26663i(2691);
        synchronized (this.f5552a) {
            try {
                if (!this.f5554c) {
                    this.f5554c = true;
                    C1728f fVar = this.f5555d;
                    synchronized (fVar.f5556a) {
                        try {
                            fVar.mo5529d();
                            fVar.f5557b.remove(this);
                        } finally {
                            MethodCollector.m26664o(2691);
                        }
                    }
                    this.f5555d = null;
                    this.f5553b = null;
                }
            } finally {
                MethodCollector.m26664o(2691);
            }
        }
    }
}
