package androidx.work.impl.p070a.p072b;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.p031c.C0623a;
import androidx.work.AbstractC1600g;
import androidx.work.impl.p070a.C1618b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: androidx.work.impl.a.b.e */
public final class C1624e extends AbstractC1623d<C1618b> {

    /* renamed from: b */
    static final String f5263b = AbstractC1600g.m5318a("NetworkStateTracker");

    /* renamed from: c */
    private final ConnectivityManager f5264c = ((ConnectivityManager) m5384a(this.f5259a, "connectivity"));

    /* renamed from: d */
    private C1626b f5265d;

    /* renamed from: e */
    private C1625a f5266e;

    static {
        Covode.recordClassIndex(1780);
    }

    /* renamed from: e */
    private static boolean m5386e() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1623d
    /* renamed from: c */
    public final void mo5390c() {
        if (m5386e()) {
            AbstractC1600g.m5317a();
            this.f5264c.registerDefaultNetworkCallback(this.f5265d);
            return;
        }
        AbstractC1600g.m5317a();
        m5385b(this.f5259a, this.f5266e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1623d
    /* renamed from: d */
    public final void mo5391d() {
        if (m5386e()) {
            try {
                AbstractC1600g.m5317a();
                this.f5264c.unregisterNetworkCallback(this.f5265d);
            } catch (IllegalArgumentException e) {
                AbstractC1600g.m5317a();
                new Throwable[1][0] = e;
            }
        } else {
            AbstractC1600g.m5317a();
            this.f5259a.unregisterReceiver(this.f5266e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1618b mo5389b() {
        boolean z;
        boolean z2;
        NetworkCapabilities networkCapabilities;
        NetworkInfo a = m5383a(this.f5264c);
        boolean z3 = true;
        if (a == null || !a.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23 || (networkCapabilities = this.f5264c.getNetworkCapabilities(this.f5264c.getActiveNetwork())) == null || !networkCapabilities.hasCapability(16)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean a2 = C0623a.m2313a(this.f5264c);
        if (a == null || a.isRoaming()) {
            z3 = false;
        }
        return new C1618b(z, z2, a2, z3);
    }

    /* renamed from: androidx.work.impl.a.b.e$a */
    class C1625a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(1781);
        }

        C1625a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                AbstractC1600g.m5317a();
                C1624e eVar = C1624e.this;
                eVar.mo5394a(eVar.mo5389b());
            }
        }
    }

    /* renamed from: androidx.work.impl.a.b.e$b */
    class C1626b extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(1782);
        }

        C1626b() {
        }

        public final void onLost(Network network) {
            AbstractC1600g.m5317a();
            C1624e eVar = C1624e.this;
            eVar.mo5394a(eVar.mo5389b());
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Network capabilities changed: %s", new Object[]{networkCapabilities});
            C1624e eVar = C1624e.this;
            eVar.mo5394a(eVar.mo5389b());
        }
    }

    /* renamed from: a */
    private static NetworkInfo m5383a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    public C1624e(Context context) {
        super(context);
        if (m5386e()) {
            this.f5265d = new C1626b();
        } else {
            this.f5266e = new C1625a();
        }
    }

    /* renamed from: a */
    private static Object m5384a(Context context, String str) {
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

    /* renamed from: a */
    private static Intent m5382a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m5385b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m5382a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p070a.p072b.C1624e.m5385b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
