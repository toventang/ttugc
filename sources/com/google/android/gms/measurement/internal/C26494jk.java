package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.C25950fi;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.measurement.internal.jk */
public final class C26494jk extends AbstractC26500jp {

    /* renamed from: a */
    private final AlarmManager f62345a = ((AlarmManager) m52238a(mo43012m(), "alarm"));

    /* renamed from: b */
    private final AbstractC26429h f62346b;

    /* renamed from: c */
    private Integer f62347c;

    static {
        Covode.recordClassIndex(31916);
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: I_ */
    public final /* bridge */ /* synthetic */ C26373ey mo43173I_() {
        return super.mo43173I_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: J_ */
    public final /* bridge */ /* synthetic */ C26348e mo43174J_() {
        return super.mo43174J_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: K_ */
    public final /* bridge */ /* synthetic */ C26515kd mo43175K_() {
        return super.mo43175K_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: L_ */
    public final /* bridge */ /* synthetic */ C26506jv mo43176L_() {
        return super.mo43176L_();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    /* renamed from: j */
    private final void m52239j() {
        ((JobScheduler) m52238a(mo43012m(), "jobscheduler")).cancel(m52240u());
    }

    /* renamed from: v */
    private final PendingIntent m52241v() {
        Context m = mo43012m();
        return PendingIntent.getBroadcast(m, 0, new Intent().setClassName(m, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26500jp
    /* renamed from: d */
    public final boolean mo43092d() {
        this.f62345a.cancel(m52241v());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m52239j();
        return false;
    }

    /* renamed from: u */
    private final int m52240u() {
        String str;
        if (this.f62347c == null) {
            String valueOf = String.valueOf(mo43012m().getPackageName());
            if (valueOf.length() != 0) {
                str = "measurement".concat(valueOf);
            } else {
                str = new String("measurement");
            }
            this.f62347c = Integer.valueOf(str.hashCode());
        }
        return this.f62347c.intValue();
    }

    /* renamed from: e */
    public final void mo43459e() {
        mo43486B();
        mo43016q().f61835k.mo43169a("Unscheduling upload");
        this.f62345a.cancel(m52241v());
        this.f62346b.mo43338c();
        if (Build.VERSION.SDK_INT >= 24) {
            m52239j();
        }
    }

    protected C26494jk(C26498jo joVar) {
        super(joVar);
        this.f62346b = new C26497jn(this, joVar.f62355b, joVar);
    }

    /* renamed from: a */
    public final void mo43458a(long j) {
        mo43486B();
        mo43019t();
        Context m = mo43012m();
        if (!C26371ew.m51831a(m)) {
            mo43016q().f61834j.mo43169a("Receiver not registered/enabled");
        }
        if (!C26510jz.m52391a(m)) {
            mo43016q().f61834j.mo43169a("Service not registered/enabled");
        }
        mo43459e();
        mo43016q().f61835k.mo43170a("Scheduling upload, millis", Long.valueOf(j));
        long b = mo43011l().mo41858b() + j;
        if (j < Math.max(0L, C26530p.f62563x.mo43024a(null).longValue()) && !this.f62346b.mo43337b()) {
            this.f62346b.mo43336a(j);
        }
        mo43019t();
        if (Build.VERSION.SDK_INT >= 24) {
            Context m2 = mo43012m();
            ComponentName componentName = new ComponentName(m2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int u = m52240u();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new JobInfo.Builder(u, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            JobScheduler jobScheduler = (JobScheduler) C25950fi.m50240a(m2, "jobscheduler");
            if (C25950fi.f61117a == null || m2.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                jobScheduler.schedule(build);
            } else {
                new C25950fi(jobScheduler).mo42424a(build, "com.google.android.gms", C25950fi.m50239a(), "UploadAlarm");
            }
        } else {
            this.f62345a.setInexactRepeating(2, b, Math.max(C26530p.f62558s.mo43024a(null).longValue(), j), m52241v());
        }
    }

    /* renamed from: a */
    private static Object m52238a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6114);
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
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6114);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
