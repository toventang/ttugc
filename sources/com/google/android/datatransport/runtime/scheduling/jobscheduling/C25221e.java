package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.datatransport.EnumC25111d;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.p1924a.C25118a;
import com.google.android.datatransport.runtime.p1928e.C25154a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
public final class C25221e implements AbstractC25239s {

    /* renamed from: a */
    private final Context f59718a;

    /* renamed from: b */
    private final AbstractC25182c f59719b;

    /* renamed from: c */
    private final AbstractC25223g f59720c;

    static {
        Covode.recordClassIndex(30589);
    }

    /* renamed from: a */
    private static Object m48371a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(599);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(599);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25239s
    /* renamed from: a */
    public final void mo41192a(AbstractC25162k kVar, int i) {
        try {
            ComponentName componentName = new ComponentName(this.f59718a, JobInfoSchedulerService.class);
            JobScheduler jobScheduler = (JobScheduler) m48371a(this.f59718a, "jobscheduler");
            Adler32 adler32 = new Adler32();
            adler32.update(this.f59718a.getPackageName().getBytes(Charset.forName("UTF-8")));
            adler32.update(kVar.mo41119a().getBytes(Charset.forName("UTF-8")));
            adler32.update(ByteBuffer.allocate(4).putInt(C25154a.m48224a(kVar.mo41121c())).array());
            if (kVar.mo41120b() != null) {
                adler32.update(kVar.mo41120b());
            }
            int value = (int) adler32.getValue();
            if (m48372a(jobScheduler, value, i)) {
                C25118a.m48159a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", kVar);
                return;
            }
            long a = this.f59719b.mo41174a(kVar);
            AbstractC25223g gVar = this.f59720c;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            EnumC25111d c = kVar.mo41121c();
            builder.setMinimumLatency(gVar.mo41210a(c, a, i));
            Set<AbstractC25223g.EnumC25227c> c2 = gVar.mo41195b().get(c).mo41201c();
            if (c2.contains(AbstractC25223g.EnumC25227c.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (c2.contains(AbstractC25223g.EnumC25227c.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (c2.contains(AbstractC25223g.EnumC25227c.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", kVar.mo41119a());
            persistableBundle.putInt("priority", C25154a.m48224a(kVar.mo41121c()));
            if (kVar.mo41120b() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(kVar.mo41120b(), 0));
            }
            builder.setExtras(persistableBundle);
            C25118a.m48160a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", kVar, Integer.valueOf(value), Long.valueOf(this.f59720c.mo41210a(kVar.mo41121c(), a, i)), Long.valueOf(a), Integer.valueOf(i));
            jobScheduler.schedule(builder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C25221e(Context context, AbstractC25182c cVar, AbstractC25223g gVar) {
        this.f59718a = context;
        this.f59719b = cVar;
        this.f59720c = gVar;
    }

    /* renamed from: a */
    private static boolean m48372a(JobScheduler jobScheduler, int i, int i2) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
            }
        }
        return false;
    }
}
