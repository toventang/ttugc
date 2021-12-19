package p077b;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: b.f */
public final class C1728f implements Closeable {

    /* renamed from: a */
    public final Object f5556a = new Object();

    /* renamed from: b */
    final List<C1727e> f5557b = new ArrayList();

    /* renamed from: c */
    public ScheduledFuture<?> f5558c;

    /* renamed from: d */
    private final ScheduledExecutorService f5559d = C40780g.m82247d();

    /* renamed from: e */
    private boolean f5560e;

    /* renamed from: f */
    private boolean f5561f;

    static {
        Covode.recordClassIndex(1897);
    }

    /* renamed from: e */
    private void m5626e() {
        ScheduledFuture<?> scheduledFuture = this.f5558c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f5558c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5529d() {
        if (this.f5561f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* renamed from: a */
    public final boolean mo5525a() {
        boolean z;
        MethodCollector.m26663i(2600);
        synchronized (this.f5556a) {
            try {
                mo5529d();
                z = this.f5560e;
            } finally {
                MethodCollector.m26664o(2600);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final C1726d mo5526b() {
        C1726d dVar;
        MethodCollector.m26663i(2606);
        synchronized (this.f5556a) {
            try {
                mo5529d();
                dVar = new C1726d(this);
            } finally {
                MethodCollector.m26664o(2606);
            }
        }
        return dVar;
    }

    /* renamed from: c */
    public final void mo5527c() {
        MethodCollector.m26663i(2611);
        synchronized (this.f5556a) {
            try {
                mo5529d();
                if (!this.f5560e) {
                    m5626e();
                    this.f5560e = true;
                    m5625a(new ArrayList(this.f5557b));
                    MethodCollector.m26664o(2611);
                }
            } finally {
                MethodCollector.m26664o(2611);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.m26663i(2629);
        synchronized (this.f5556a) {
            try {
                if (!this.f5561f) {
                    m5626e();
                    for (C1727e eVar : this.f5557b) {
                        eVar.close();
                    }
                    this.f5557b.clear();
                    this.f5561f = true;
                    MethodCollector.m26664o(2629);
                }
            } finally {
                MethodCollector.m26664o(2629);
            }
        }
    }

    public final String toString() {
        return C1764a.m5929a(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(mo5525a())});
    }

    /* renamed from: a */
    private static void m5625a(List<C1727e> list) {
        MethodCollector.m26663i(2631);
        for (C1727e eVar : list) {
            synchronized (eVar.f5552a) {
                try {
                    if (!eVar.f5554c) {
                        eVar.f5553b.run();
                        eVar.close();
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Object already closed");
                        MethodCollector.m26664o(2631);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2631);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(2631);
    }
}
