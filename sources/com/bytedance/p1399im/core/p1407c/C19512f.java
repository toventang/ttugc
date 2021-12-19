package com.bytedance.p1399im.core.p1407c;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.c.f */
public final class C19512f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    static boolean f46310a = true;

    /* renamed from: b */
    public static Context f46311b;

    /* renamed from: c */
    public static boolean f46312c;

    /* renamed from: d */
    public static final C19512f f46313d = new C19512f();

    /* renamed from: e */
    private static AbstractC19508c f46314e;

    /* renamed from: f */
    private static final LinkedList<Activity> f46315f = new LinkedList<>();

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C89219l.m154719c(activity, "");
    }

    public final void onActivityPaused(Activity activity) {
        C89219l.m154719c(activity, "");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C89219l.m154719c(activity, "");
    }

    public final void onActivityStarted(Activity activity) {
        C89219l.m154719c(activity, "");
    }

    private C19512f() {
    }

    /* renamed from: a */
    private static boolean m36454a(String str) {
        C89219l.m154719c(str, "");
        return Math.random() < C19738a.m36931a(str);
    }

    /* renamed from: a */
    public static boolean m36453a(Context context) {
        C89219l.m154719c(context, "");
        try {
            Object a = m36448a(context, "connectivity");
            if (a != null) {
                NetworkInfo a2 = m36447a((ConnectivityManager) a);
                if (a2 == null || !a2.isConnected()) {
                    return false;
                }
                return true;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.bytedance.im.core.c.f$a */
    public static final class C19513a extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(22357);
        }

        public final void onUnavailable() {
            C20002j.m37778a("monitorNetChange onUnavailable");
            super.onUnavailable();
            C19512f.f46312c = false;
        }

        public final void onLost(Network network) {
            C20002j.m37778a("monitorNetChange onLost");
            super.onLost(network);
            C19512f.f46312c = false;
        }

        public final void onAvailable(Network network) {
            super.onAvailable(network);
            C20002j.m37778a("monitorNetChange onAvailable");
            boolean a = C19512f.m36453a(C19512f.m36445a());
            if (a != C19512f.f46312c && C19738a.m36945k()) {
                C19483d a2 = C19483d.m36365a();
                C89219l.m154709a((Object) a2, "");
                if (a2.f46159d) {
                    C19483d.m36365a().mo31137a(3);
                }
            }
            C19512f.f46312c = a;
        }
    }

    /* renamed from: a */
    public static Context m36445a() {
        Context context = f46311b;
        if (context == null) {
            C89219l.m154710a("appContext");
        }
        return context;
    }

    static {
        Covode.recordClassIndex(22356);
    }

    /* renamed from: b */
    private static Context m36455b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public final void onActivityDestroyed(Activity activity) {
        C89219l.m154719c(activity, "");
        f46315f.remove(activity);
    }

    /* renamed from: a */
    private static NetworkInfo m36447a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    public final void onActivityStopped(Activity activity) {
        C89219l.m154719c(activity, "");
        LinkedList<Activity> linkedList = f46315f;
        linkedList.remove(activity);
        if (linkedList.isEmpty()) {
            f46310a = true;
            C20002j.m37780b("switchToBackground");
        }
    }

    public final void onActivityResumed(Activity activity) {
        C89219l.m154719c(activity, "");
        LinkedList<Activity> linkedList = f46315f;
        if (linkedList.isEmpty()) {
            f46310a = false;
            C20002j.m37780b("switchToForeground");
            if (C19738a.m36944j()) {
                C19483d a = C19483d.m36365a();
                C89219l.m154709a((Object) a, "");
                if (a.f46159d) {
                    C19483d.m36365a().mo31137a(10);
                }
            }
        }
        linkedList.remove(activity);
        linkedList.add(activity);
    }

    /* renamed from: com.bytedance.im.core.c.f$b */
    public static final class C19514b extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(22358);
        }

        public final void onReceive(Context context, Intent intent) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(intent, "");
            try {
                boolean a = C19512f.m36453a(C19512f.m36445a());
                C20002j.m37778a("monitorNetChange dataNetworkInfo.isConnected  = ".concat(String.valueOf(a)));
                if (a != C19512f.f46312c && a && C19738a.m36945k()) {
                    C19483d a2 = C19483d.m36365a();
                    C89219l.m154709a((Object) a2, "");
                    if (a2.f46159d) {
                        C19483d.m36365a().mo31137a(3);
                    }
                }
                C19512f.f46312c = a;
            } catch (Exception e) {
                e.printStackTrace();
                C19510e.m36439a(e);
            }
        }
    }

    /* renamed from: a */
    public static Object m36448a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10172);
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
                    MethodCollector.m26664o(10172);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m36449a(Context context, AbstractC19508c cVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cVar, "");
        Context b = m36455b(context);
        if (b != null) {
            f46311b = (Application) b;
            f46314e = cVar;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public static void m36451a(String str, JSONObject jSONObject) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jSONObject, "");
        m36452a(str, jSONObject, false);
    }

    /* renamed from: b */
    private static Intent m36456b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m36446a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m36456b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1407c.C19512f.m36446a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: b */
    public static void m36457b(String str, String str2, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        AbstractC19508c cVar = f46314e;
        if (cVar != null) {
            cVar.mo27952b(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m36450a(String str, String str2, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        AbstractC19508c cVar = f46314e;
        if (cVar != null) {
            cVar.mo27950a(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m36452a(String str, JSONObject jSONObject, boolean z) {
        AbstractC19508c cVar;
        C89219l.m154719c(str, "");
        C89219l.m154719c(jSONObject, "");
        if ((z || m36454a(str)) && (cVar = f46314e) != null) {
            cVar.mo27951a(str, jSONObject);
        }
        if (C19738a.m36943i()) {
            m36457b("imsdk", "monitorTeaEvent() called with: event = " + str + ", data = " + jSONObject, (Throwable) null);
        }
    }
}
