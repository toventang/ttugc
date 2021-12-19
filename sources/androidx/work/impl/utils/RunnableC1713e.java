package androidx.work.impl.utils;

import androidx.work.AbstractC1600g;
import androidx.work.C1603i;
import androidx.work.impl.C1687f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p073b.AbstractC1645h;
import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.utils.e */
public final class RunnableC1713e implements Runnable {

    /* renamed from: a */
    private static final String f5524a = AbstractC1600g.m5318a("StopWorkRunnable");

    /* renamed from: b */
    private C1687f f5525b;

    /* renamed from: c */
    private String f5526c;

    static {
        Covode.recordClassIndex(1880);
    }

    public final void run() {
        WorkDatabase workDatabase = this.f5525b.f5432c;
        AbstractC1645h i = workDatabase.mo5366i();
        workDatabase.mo5091e();
        try {
            if (i.mo5439d(this.f5526c) == C1603i.EnumC1604a.RUNNING) {
                i.mo5428a(C1603i.EnumC1604a.ENQUEUED, this.f5526c);
            }
            boolean a = this.f5525b.f5435f.mo5406a(this.f5526c);
            AbstractC1600g.m5317a();
            C1764a.m5928a("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f5526c, Boolean.valueOf(a)});
            workDatabase.mo5093g();
        } finally {
            workDatabase.mo5092f();
        }
    }

    public RunnableC1713e(C1687f fVar, String str) {
        this.f5525b = fVar;
        this.f5526c = str;
    }
}
