package com.bytedance.android.livesdk.p441ah;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.AbstractC11624b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ah.e */
public final class C6693e extends BroadcastReceiver implements AbstractC11624b {

    /* renamed from: d */
    public static final C6694a f16599d = new C6694a((byte) 0);

    /* renamed from: a */
    public boolean f16600a;

    /* renamed from: b */
    public Context f16601b;

    /* renamed from: c */
    public AbstractC6683b f16602c;

    /* renamed from: e */
    private WeakReference<Context> f16603e;

    static {
        Covode.recordClassIndex(7431);
    }

    /* renamed from: com.bytedance.android.livesdk.ah.e$a */
    public static final class C6694a {
        static {
            Covode.recordClassIndex(7432);
        }

        private C6694a() {
        }

        public /* synthetic */ C6694a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.AbstractC11624b
    /* renamed from: a */
    public final void mo12840a(boolean z) {
        this.f16600a = z;
    }

    public final void onActivityDestroyed(Activity activity) {
        C89219l.m154721d(activity, "");
        AbstractC6683b bVar = this.f16602c;
        if (bVar != null) {
            bVar.mo12831f(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        C89219l.m154721d(activity, "");
        AbstractC6683b bVar = this.f16602c;
        if (bVar != null) {
            bVar.mo12829d(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        C89219l.m154721d(activity, "");
        AbstractC6683b bVar = this.f16602c;
        if (bVar != null) {
            bVar.mo12828c(activity);
        }
    }

    public final void onActivityStarted(Activity activity) {
        C89219l.m154721d(activity, "");
        AbstractC6683b bVar = this.f16602c;
        if (bVar != null) {
            bVar.mo12827b(activity);
        }
    }

    public final void onActivityStopped(Activity activity) {
        AbstractC6683b bVar;
        C89219l.m154721d(activity, "");
        if (this.f16600a && (bVar = this.f16602c) != null) {
            Intent intent = activity.getIntent();
            C89219l.m154716b(intent, "");
            bVar.mo12826a(activity, intent);
        }
        AbstractC6683b bVar2 = this.f16602c;
        if (bVar2 != null) {
            bVar2.mo12830e(activity);
        }
    }

    /* renamed from: a */
    private static String m14225a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        AbstractC6683b bVar = this.f16602c;
        if (bVar != null) {
            bVar.mo12824a(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        AbstractC6683b bVar = this.f16602c;
        if (bVar != null) {
            bVar.mo12825a(activity, bundle);
        }
    }

    public C6693e(Context context, AbstractC6683b bVar) {
        C89219l.m154721d(context, "");
        this.f16601b = context;
        this.f16602c = bVar;
        Context applicationContext = this.f16601b.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        WeakReference<Context> weakReference = new WeakReference<>(applicationContext);
        this.f16603e = weakReference;
        Context context2 = weakReference.get();
        if (context2 != null) {
            m14226b(context2, this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    public final void onReceive(Context context, Intent intent) {
        AbstractC6683b bVar;
        C89219l.m154721d(intent, "");
        String action = intent.getAction();
        if (action != null && C89219l.m154714a((Object) action, (Object) "android.intent.action.CLOSE_SYSTEM_DIALOGS") && C13627m.m24499a(m14225a(intent, "reason"), "homekey") && (bVar = this.f16602c) != null) {
            bVar.mo12826a(context, intent);
        }
    }

    /* renamed from: a */
    private static Intent m14224a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m14226b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m14224a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p441ah.C6693e.m14226b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
