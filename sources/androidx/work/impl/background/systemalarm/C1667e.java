package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.AbstractC1600g;
import androidx.work.impl.AbstractC1607a;
import androidx.work.impl.C1631b;
import androidx.work.impl.C1687f;
import androidx.work.impl.utils.C1714f;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.e */
public final class C1667e implements AbstractC1607a {

    /* renamed from: a */
    static final String f5384a = AbstractC1600g.m5318a("SystemAlarmDispatcher");

    /* renamed from: b */
    final Context f5385b;

    /* renamed from: c */
    public final C1673g f5386c;

    /* renamed from: d */
    public final C1631b f5387d;

    /* renamed from: e */
    public final C1687f f5388e;

    /* renamed from: f */
    final C1664b f5389f;

    /* renamed from: g */
    final List<Intent> f5390g;

    /* renamed from: h */
    Intent f5391h;

    /* renamed from: i */
    AbstractC1670b f5392i;

    /* renamed from: j */
    private final Handler f5393j;

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    interface AbstractC1670b {
        static {
            Covode.recordClassIndex(1834);
        }

        /* renamed from: a */
        void mo5448a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    public static class RunnableC1669a implements Runnable {

        /* renamed from: a */
        private final C1667e f5395a;

        /* renamed from: b */
        private final Intent f5396b;

        /* renamed from: c */
        private final int f5397c;

        static {
            Covode.recordClassIndex(1833);
        }

        public final void run() {
            this.f5395a.mo5454a(this.f5396b, this.f5397c);
        }

        RunnableC1669a(C1667e eVar, Intent intent, int i) {
            this.f5395a = eVar;
            this.f5396b = intent;
            this.f5397c = i;
        }
    }

    static {
        Covode.recordClassIndex(1831);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5455b() {
        if (this.f5393j.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    static class RunnableC1671c implements Runnable {

        /* renamed from: a */
        private final C1667e f5398a;

        static {
            Covode.recordClassIndex(1835);
        }

        public final void run() {
            C1667e eVar = this.f5398a;
            AbstractC1600g.m5317a();
            eVar.mo5455b();
            synchronized (eVar.f5390g) {
                if (eVar.f5391h != null) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Removing command %s", new Object[]{eVar.f5391h});
                    if (eVar.f5390g.remove(0).equals(eVar.f5391h)) {
                        eVar.f5391h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                if (!eVar.f5389f.mo5449a() && eVar.f5390g.isEmpty()) {
                    AbstractC1600g.m5317a();
                    if (eVar.f5392i != null) {
                        eVar.f5392i.mo5448a();
                    }
                } else if (!eVar.f5390g.isEmpty()) {
                    eVar.mo5452a();
                }
            }
        }

        RunnableC1671c(C1667e eVar) {
            this.f5398a = eVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5452a() {
        mo5455b();
        PowerManager.WakeLock a = C1714f.m5611a(this.f5385b, "ProcessCommand");
        try {
            a.acquire();
            this.f5388e.f5433d.mo5503a(new Runnable() {
                /* class androidx.work.impl.background.systemalarm.C1667e.RunnableC16681 */

                static {
                    Covode.recordClassIndex(1832);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:101:0x03d4, code lost:
                    r3 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:102:0x03d5, code lost:
                    androidx.work.AbstractC1600g.m5317a();
                    com.C1764a.m5928a("Releasing operation wake lock (%s) %s", new java.lang.Object[]{r14, r13});
                    r13.release();
                    r15.f5394a.mo5453a(new androidx.work.impl.background.systemalarm.C1667e.RunnableC1671c(r15.f5394a));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:103:0x03f2, code lost:
                    throw r3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
                    androidx.work.AbstractC1600g.m5317a();
                    r0 = new java.lang.Throwable[1];
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:98:0x03b6, code lost:
                    androidx.work.AbstractC1600g.m5317a();
                    com.C1764a.m5928a("Releasing operation wake lock (%s) %s", new java.lang.Object[]{r14, r13});
                    r13.release();
                    r2 = r15.f5394a;
                    r1 = new androidx.work.impl.background.systemalarm.C1667e.RunnableC1671c(r15.f5394a);
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x03b1 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 1015
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.C1667e.RunnableC16681.run():void");
                }
            });
        } finally {
            a.release();
        }
    }

    C1667e(Context context) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5453a(Runnable runnable) {
        this.f5393j.post(runnable);
    }

    /* renamed from: a */
    private boolean m5508a(String str) {
        mo5455b();
        synchronized (this.f5390g) {
            for (Intent intent : this.f5390g) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private C1667e(Context context, byte b) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f5385b = applicationContext;
        this.f5389f = new C1664b(applicationContext);
        this.f5386c = new C1673g();
        C1687f b2 = C1687f.m5535b();
        this.f5388e = b2;
        C1631b bVar = b2.f5435f;
        this.f5387d = bVar;
        bVar.mo5405a(this);
        this.f5390g = new ArrayList();
        this.f5391h = null;
        this.f5393j = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.work.impl.AbstractC1607a
    /* renamed from: a */
    public final void mo5376a(String str, boolean z) {
        Intent intent = new Intent(this.f5385b, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        mo5453a(new RunnableC1669a(this, intent, 0));
    }

    /* renamed from: a */
    public final boolean mo5454a(Intent intent, int i) {
        AbstractC1600g.m5317a();
        boolean z = false;
        C1764a.m5928a("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)});
        mo5455b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC1600g.m5317a();
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m5508a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f5390g) {
                if (!this.f5390g.isEmpty()) {
                    z = true;
                }
                this.f5390g.add(intent);
                if (!z) {
                    mo5452a();
                }
            }
            return true;
        }
    }
}
