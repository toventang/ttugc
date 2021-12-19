package com.p2082ss.android.ugc.aweme.kids.setting.wellbeing;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsVideoPlaytimeReminder;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3351a.C57618d;
import com.p2082ss.android.ugc.aweme.kids.setting.wellbeing.C57989a;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.b */
public final class C57993b {

    /* renamed from: a */
    KidsWellbeingSetting f132173a;

    /* renamed from: b */
    final Application f132174b = C17879g.m33104a();

    /* renamed from: c */
    boolean f132175c;

    /* renamed from: d */
    final C57994a f132176d = new C57994a(this);

    /* renamed from: e */
    private final AbstractC89244h f132177e = C89250i.m154773a((AbstractC89171a) C57995b.f132181a);

    /* renamed from: f */
    private final AbstractC89244h f132178f = C89250i.m154773a((AbstractC89171a) C57997d.f132184a);

    /* renamed from: g */
    private Runnable f132179g;

    static {
        Covode.recordClassIndex(68020);
    }

    /* renamed from: c */
    private final Handler m104810c() {
        return (Handler) this.f132177e.getValue();
    }

    /* renamed from: a */
    public final C57998c mo95316a() {
        return (C57998c) this.f132178f.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.b$c */
    public static final class RunnableC57996c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57993b f132182a;

        /* renamed from: b */
        final /* synthetic */ long f132183b;

        static {
            Covode.recordClassIndex(68023);
        }

        RunnableC57996c(C57993b bVar, long j) {
            this.f132182a = bVar;
            this.f132183b = j;
        }

        public final void run() {
            C57618d.C57619a.m104342a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.b$d */
    static final class C57997d extends AbstractC89220m implements AbstractC89171a<C57998c> {

        /* renamed from: a */
        public static final C57997d f132184a = new C57997d();

        static {
            Covode.recordClassIndex(68024);
        }

        C57997d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C57998c invoke() {
            return new C57998c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.b$b */
    static final class C57995b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C57995b f132181a = new C57995b();

        static {
            Covode.recordClassIndex(68022);
        }

        C57995b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo95318b() {
        Runnable runnable = this.f132179g;
        if (runnable != null) {
            m104810c().removeCallbacks(runnable);
        }
        this.f132179g = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.b$a */
    public static final class C57994a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C57993b f132180a;

        static {
            Covode.recordClassIndex(68021);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57994a(C57993b bVar) {
            this.f132180a = bVar;
        }

        public final void onReceive(Context context, Intent intent) {
            C57998c a = this.f132180a.mo95316a();
            Long l = a.f132186b;
            if (l != null) {
                a.f132185a += (System.currentTimeMillis() - l.longValue()) / 1000;
                C57989a.C57990a.m104806a(a.f132185a);
            }
            a.f132186b = Long.valueOf(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo95317a(List<KidsVideoPlaytimeReminder> list) {
        long j = mo95316a().f132185a;
        for (KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder : list) {
            Integer threshold = kidsVideoPlaytimeReminder.getThreshold();
            if (threshold != null) {
                long intValue = (long) (threshold.intValue() * 60);
                if (j < intValue) {
                    RunnableC57996c cVar = new RunnableC57996c(this, j);
                    m104810c().postDelayed(cVar, (intValue - j) * 1000);
                    this.f132179g = cVar;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private static Intent m104809b(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m104808a(android.app.Application r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m104809b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.setting.wellbeing.C57993b.m104808a(android.app.Application, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
