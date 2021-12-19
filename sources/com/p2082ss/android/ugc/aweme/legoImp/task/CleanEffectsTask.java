package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34506c;
import com.p2082ss.android.ugc.aweme.effect.EffectCompatJobService;
import com.p2082ss.android.ugc.aweme.effect.EffectJobService;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.main.AbstractC59040ay;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask */
public class CleanEffectsTask implements AbstractC58264w {

    /* renamed from: a */
    public static volatile boolean f132824a;

    /* renamed from: b */
    private static volatile boolean f132825b;

    static {
        Covode.recordClassIndex(68429);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        try {
            AVExternalServiceImpl.m113114a().configService().cacheConfig().draftEffectList();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Object m105549b(Context context) {
        MethodCollector.m26663i(6367);
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (!f132824a && applicationContext != null && !f132825b) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                f132825b = true;
                AbstractC59040ay ayVar = (AbstractC59040ay) C34506c.m70491a(applicationContext, AbstractC59040ay.class);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - ayVar.mo60976c() >= 259200000) {
                    String effectCacheDir = AVExternalServiceImpl.m113114a().configService().cacheConfig().effectCacheDir();
                    if (!(TextUtils.isEmpty(effectCacheDir) || new File(effectCacheDir).list() == null || new File(effectCacheDir).list().length == 0)) {
                        File file = new File(effectCacheDir, "journal");
                        if (!file.exists() || file.isDirectory() ? !ayVar.mo60973a() : currentTimeMillis - file.lastModified() <= 259200000) {
                            ayVar.mo60971a(currentTimeMillis);
                        } else {
                            f132824a = true;
                            if (Build.VERSION.SDK_INT >= 26) {
                                try {
                                    if (!EffectCompatJobService.f107803b) {
                                        EffectCompatJobService.f107803b = true;
                                        JobInfo.Builder builder = new JobInfo.Builder(EffectCompatJobService.f107802a, new ComponentName(applicationContext, EffectCompatJobService.class));
                                        builder.setMinimumLatency(0);
                                        builder.setOverrideDeadline(3000);
                                        ((JobScheduler) EffectCompatJobService.m89249a(applicationContext, "jobscheduler")).schedule(builder.build());
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                m105548a(applicationContext, new Intent(applicationContext, EffectJobService.class));
                            }
                        }
                    }
                }
            }
        }
        MethodCollector.m26664o(6367);
        return null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m105548a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.CleanEffectsTask.m105548a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
