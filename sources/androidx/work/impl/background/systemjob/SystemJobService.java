package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.AbstractC1600g;
import androidx.work.impl.AbstractC1607a;
import androidx.work.impl.C1687f;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements AbstractC1607a {

    /* renamed from: a */
    private static final String f5411a = AbstractC1600g.m5318a("SystemJobService");

    /* renamed from: b */
    private C1687f f5412b;

    /* renamed from: c */
    private final Map<String, JobParameters> f5413c = new HashMap();

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    static {
        Covode.recordClassIndex(1841);
    }

    public void onDestroy() {
        super.onDestroy();
        C1687f fVar = this.f5412b;
        if (fVar != null) {
            fVar.f5435f.mo5408b(this);
        }
    }

    public void onCreate() {
        super.onCreate();
        C1687f b = C1687f.m5535b();
        this.f5412b = b;
        if (b != null) {
            b.f5435f.mo5405a(this);
        } else if (Application.class.equals(getApplication().getClass())) {
            AbstractC1600g.m5317a();
        } else {
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f5412b == null) {
            AbstractC1600g.m5317a();
            return true;
        }
        String string = jobParameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            AbstractC1600g.m5317a();
            return false;
        }
        AbstractC1600g.m5317a();
        C1764a.m5928a("onStopJob for %s", new Object[]{string});
        synchronized (this.f5413c) {
            this.f5413c.remove(string);
        }
        this.f5412b.mo5468a(string);
        if (!this.f5412b.f5435f.mo5409b(string)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r2 = new androidx.work.WorkerParameters.C1589a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r7.getTriggeredContentUris() == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r2.f5188b = java.util.Arrays.asList(r7.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        if (r7.getTriggeredContentAuthorities() == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r2.f5187a = java.util.Arrays.asList(r7.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        r2.f5189c = r7.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r6.f5412b.mo5469a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r7) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    @Override // androidx.work.impl.AbstractC1607a
    /* renamed from: a */
    public final void mo5376a(String str, boolean z) {
        JobParameters remove;
        AbstractC1600g.m5317a();
        C1764a.m5928a("%s executed on JobScheduler", new Object[]{str});
        synchronized (this.f5413c) {
            remove = this.f5413c.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }
}
