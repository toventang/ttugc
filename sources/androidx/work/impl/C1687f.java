package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.room.AbstractC1533j;
import androidx.room.C1532i;
import androidx.work.AbstractC1717j;
import androidx.work.C1591b;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.C1679b;
import androidx.work.impl.utils.C1711c;
import androidx.work.impl.utils.RunnableC1712d;
import androidx.work.impl.utils.RunnableC1713e;
import androidx.work.impl.utils.p076b.AbstractC1707a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58005c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: androidx.work.impl.f */
public final class C1687f extends AbstractC1717j {

    /* renamed from: j */
    public static C1687f f5427j;

    /* renamed from: k */
    public static C1687f f5428k;

    /* renamed from: l */
    public static final Object f5429l = new Object();

    /* renamed from: a */
    public Context f5430a;

    /* renamed from: b */
    public C1591b f5431b;

    /* renamed from: c */
    public WorkDatabase f5432c;

    /* renamed from: d */
    public AbstractC1707a f5433d;

    /* renamed from: e */
    public List<AbstractC1680c> f5434e;

    /* renamed from: f */
    public C1631b f5435f;

    /* renamed from: g */
    public C1711c f5436g;

    /* renamed from: h */
    public boolean f5437h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f5438i;

    /* renamed from: m */
    private final C1688g f5439m;

    /* renamed from: b */
    public static C1687f m5535b() {
        C58005c.m104826a();
        return m5536e();
    }

    static {
        Covode.recordClassIndex(1852);
    }

    /* renamed from: e */
    private static C1687f m5536e() {
        synchronized (f5429l) {
            C1687f fVar = f5427j;
            if (fVar != null) {
                return fVar;
            }
            return f5428k;
        }
    }

    /* renamed from: d */
    public final void mo5471d() {
        synchronized (f5429l) {
            this.f5437h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f5438i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f5438i = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo5470c() {
        JobScheduler jobScheduler;
        List<JobInfo> allPendingJobs;
        if (!(Build.VERSION.SDK_INT < 23 || (jobScheduler = (JobScheduler) C1679b.m5522a(this.f5430a, "jobscheduler")) == null || (allPendingJobs = jobScheduler.getAllPendingJobs()) == null)) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (jobInfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                    jobScheduler.cancel(jobInfo.getId());
                }
            }
        }
        this.f5432c.mo5366i().mo5434b();
        C1681d.m5529a(this.f5431b, this.f5432c, this.f5434e);
    }

    /* renamed from: a */
    public static Context m5534a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final void mo5468a(String str) {
        this.f5433d.mo5503a(new RunnableC1713e(this, str));
    }

    /* renamed from: a */
    public final void mo5469a(String str, WorkerParameters.C1589a aVar) {
        this.f5433d.mo5503a(new RunnableC1712d(this, str, aVar));
    }

    public C1687f(Context context, C1591b bVar, AbstractC1707a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(R.bool.n));
    }

    private C1687f(Context context, C1591b bVar, AbstractC1707a aVar, boolean z) {
        AbstractC1533j.C1534a a;
        this.f5439m = new C1688g();
        Context a2 = m5534a(context);
        if (z) {
            a = new AbstractC1533j.C1534a(a2, WorkDatabase.class, null);
            a.f5046b = true;
        } else {
            a = C1532i.m5166a(a2, WorkDatabase.class, "androidx.work.workdb");
        }
        WorkDatabase.C16051 r1 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: CONSTRUCTOR  (r1v1 'r1' androidx.work.impl.WorkDatabase$1) =  call: androidx.work.impl.WorkDatabase.1.<init>():void type: CONSTRUCTOR in method: androidx.work.impl.f.<init>(android.content.Context, androidx.work.b, androidx.work.impl.utils.b.a, boolean):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.work.impl.WorkDatabase, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C1687f.<init>(android.content.Context, androidx.work.b, androidx.work.impl.utils.b.a, boolean):void");
    }
}
