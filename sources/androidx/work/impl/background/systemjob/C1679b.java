package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.AbstractC1600g;
import androidx.work.C1603i;
import androidx.work.impl.AbstractC1680c;
import androidx.work.impl.C1687f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p073b.C1637d;
import androidx.work.impl.p073b.C1642g;
import androidx.work.impl.utils.C1693a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemjob.b */
public final class C1679b implements AbstractC1680c {

    /* renamed from: a */
    private static final String f5417a = AbstractC1600g.m5318a("SystemJobScheduler");

    /* renamed from: b */
    private final JobScheduler f5418b;

    /* renamed from: c */
    private final C1687f f5419c;

    /* renamed from: d */
    private final C1693a f5420d;

    /* renamed from: e */
    private final C1677a f5421e;

    static {
        Covode.recordClassIndex(1844);
    }

    @Override // androidx.work.impl.AbstractC1680c
    /* renamed from: a */
    public final void mo5443a(String str) {
        List<JobInfo> allPendingJobs = this.f5418b.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (str.equals(jobInfo.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.f5419c.f5432c.mo5369l().mo5418b(str);
                    this.f5418b.cancel(jobInfo.getId());
                    if (Build.VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.work.impl.AbstractC1680c
    /* renamed from: a */
    public final void mo5444a(C1642g... gVarArr) {
        int i;
        WorkDatabase workDatabase = this.f5419c.f5432c;
        for (C1642g gVar : gVarArr) {
            workDatabase.mo5091e();
            try {
                C1642g a = workDatabase.mo5366i().mo5429a(gVar.f5306a);
                if (a == null) {
                    AbstractC1600g.m5317a();
                } else if (a.f5307b != C1603i.EnumC1604a.ENQUEUED) {
                    AbstractC1600g.m5317a();
                } else {
                    C1637d a2 = workDatabase.mo5369l().mo5416a(gVar.f5306a);
                    if (a2 != null) {
                        JobScheduler jobScheduler = this.f5418b;
                        String str = gVar.f5306a;
                        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                        if (allPendingJobs != null) {
                            for (JobInfo jobInfo : allPendingJobs) {
                                PersistableBundle extras = jobInfo.getExtras();
                                if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                                    AbstractC1600g.m5317a();
                                    C1764a.m5928a("Skipping scheduling %s because JobScheduler is aware of it already.", new Object[]{gVar.f5306a});
                                    break;
                                }
                            }
                        }
                        i = a2.f5298b;
                    } else {
                        i = this.f5420d.mo5480a(this.f5419c.f5431b.f5194d, this.f5419c.f5431b.f5195e);
                        this.f5419c.f5432c.mo5369l().mo5417a(new C1637d(gVar.f5306a, i));
                    }
                    m5523a(gVar, i);
                    if (Build.VERSION.SDK_INT == 23) {
                        m5523a(gVar, this.f5420d.mo5480a(this.f5419c.f5431b.f5194d, this.f5419c.f5431b.f5195e));
                    }
                    workDatabase.mo5093g();
                }
                workDatabase.mo5092f();
            } catch (Throwable th) {
                workDatabase.mo5092f();
                throw th;
            }
        }
    }

    public C1679b(Context context, C1687f fVar) {
        this(context, fVar, (JobScheduler) m5522a(context, "jobscheduler"), new C1677a(context));
    }

    /* renamed from: a */
    private void m5523a(C1642g gVar, int i) {
        JobInfo a = this.f5421e.mo5467a(gVar, i);
        AbstractC1600g.m5317a();
        C1764a.m5928a("Scheduling work ID %s Job ID %s", new Object[]{gVar.f5306a, Integer.valueOf(i)});
        this.f5418b.schedule(a);
    }

    /* renamed from: a */
    public static Object m5522a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    private C1679b(Context context, C1687f fVar, JobScheduler jobScheduler, C1677a aVar) {
        this.f5419c = fVar;
        this.f5418b = jobScheduler;
        this.f5420d = new C1693a(context);
        this.f5421e = aVar;
    }
}
