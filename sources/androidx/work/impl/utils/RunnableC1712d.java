package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.C1687f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.utils.d */
public final class RunnableC1712d implements Runnable {

    /* renamed from: a */
    private C1687f f5521a;

    /* renamed from: b */
    private String f5522b;

    /* renamed from: c */
    private WorkerParameters.C1589a f5523c;

    static {
        Covode.recordClassIndex(1879);
    }

    public final void run() {
        this.f5521a.f5435f.mo5407a(this.f5522b, this.f5523c);
    }

    public RunnableC1712d(C1687f fVar, String str, WorkerParameters.C1589a aVar) {
        this.f5521a = fVar;
        this.f5522b = str;
        this.f5523c = aVar;
    }
}
