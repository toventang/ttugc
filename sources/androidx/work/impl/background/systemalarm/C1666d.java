package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.AbstractC1600g;
import androidx.work.WorkerParameters;
import androidx.work.impl.AbstractC1607a;
import androidx.work.impl.background.systemalarm.C1667e;
import androidx.work.impl.background.systemalarm.C1673g;
import androidx.work.impl.p070a.AbstractC1629c;
import androidx.work.impl.p070a.C1630d;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.impl.background.systemalarm.d */
public final class C1666d implements AbstractC1607a, AbstractC1629c, C1673g.AbstractC1675a {

    /* renamed from: h */
    private static final String f5374h = AbstractC1600g.m5318a("DelayMetCommandHandler");

    /* renamed from: a */
    final Context f5375a;

    /* renamed from: b */
    final int f5376b;

    /* renamed from: c */
    final String f5377c;

    /* renamed from: d */
    final C1667e f5378d;

    /* renamed from: e */
    final C1630d f5379e;

    /* renamed from: f */
    PowerManager.WakeLock f5380f;

    /* renamed from: g */
    boolean f5381g = false;

    /* renamed from: i */
    private final Object f5382i = new Object();

    /* renamed from: j */
    private boolean f5383j = false;

    static {
        Covode.recordClassIndex(1830);
    }

    /* renamed from: b */
    private void m5502b() {
        synchronized (this.f5382i) {
            this.f5378d.f5386c.mo5459a(this.f5377c);
            PowerManager.WakeLock wakeLock = this.f5380f;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC1600g.m5317a();
                C1764a.m5928a("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f5380f, this.f5377c});
                this.f5380f.release();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5450a() {
        synchronized (this.f5382i) {
            if (!this.f5383j) {
                AbstractC1600g.m5317a();
                C1764a.m5928a("Stopping work for workspec %s", new Object[]{this.f5377c});
                this.f5378d.mo5453a(new C1667e.RunnableC1669a(this.f5378d, C1664b.m5499c(this.f5375a, this.f5377c), this.f5376b));
                if (this.f5378d.f5387d.mo5410c(this.f5377c)) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("WorkSpec %s needs to be rescheduled", new Object[]{this.f5377c});
                    this.f5378d.mo5453a(new C1667e.RunnableC1669a(this.f5378d, C1664b.m5494a(this.f5375a, this.f5377c), this.f5376b));
                } else {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f5377c});
                }
                this.f5383j = true;
            } else {
                AbstractC1600g.m5317a();
                C1764a.m5928a("Already stopped work for %s", new Object[]{this.f5377c});
            }
        }
    }

    @Override // androidx.work.impl.p070a.AbstractC1629c
    /* renamed from: b */
    public final void mo5401b(List<String> list) {
        mo5450a();
    }

    @Override // androidx.work.impl.background.systemalarm.C1673g.AbstractC1675a
    /* renamed from: a */
    public final void mo5451a(String str) {
        AbstractC1600g.m5317a();
        C1764a.m5928a("Exceeded time limits on execution for %s", new Object[]{str});
        mo5450a();
    }

    @Override // androidx.work.impl.p070a.AbstractC1629c
    /* renamed from: a */
    public final void mo5400a(List<String> list) {
        if (list.contains(this.f5377c)) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("onAllConstraintsMet for %s", new Object[]{this.f5377c});
            if (this.f5378d.f5387d.mo5407a(this.f5377c, (WorkerParameters.C1589a) null)) {
                C1673g gVar = this.f5378d.f5386c;
                String str = this.f5377c;
                synchronized (gVar.f5405d) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Starting timer for %s", new Object[]{str});
                    gVar.mo5459a(str);
                    C1673g.RunnableC1676b bVar = new C1673g.RunnableC1676b(gVar, str);
                    gVar.f5403b.put(str, bVar);
                    gVar.f5404c.put(str, this);
                    gVar.f5402a.schedule(bVar, 600000, TimeUnit.MILLISECONDS);
                }
                return;
            }
            m5502b();
        }
    }

    @Override // androidx.work.impl.AbstractC1607a
    /* renamed from: a */
    public final void mo5376a(String str, boolean z) {
        AbstractC1600g.m5317a();
        C1764a.m5928a("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        m5502b();
        if (z) {
            this.f5378d.mo5453a(new C1667e.RunnableC1669a(this.f5378d, C1664b.m5494a(this.f5375a, this.f5377c), this.f5376b));
        }
        if (this.f5381g) {
            this.f5378d.mo5453a(new C1667e.RunnableC1669a(this.f5378d, C1664b.m5493a(this.f5375a), this.f5376b));
        }
    }

    C1666d(Context context, int i, String str, C1667e eVar) {
        this.f5375a = context;
        this.f5376b = i;
        this.f5378d = eVar;
        this.f5377c = str;
        this.f5379e = new C1630d(context, this);
    }
}
