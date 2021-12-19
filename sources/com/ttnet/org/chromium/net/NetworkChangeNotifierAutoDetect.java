package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.C87444b;
import com.ttnet.org.chromium.base.C87445c;
import com.ttnet.org.chromium.base.p4497a.C87442a;
import java.lang.reflect.Field;
import java.util.Arrays;

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {

    /* renamed from: h */
    private static final String f198510h = NetworkChangeNotifierAutoDetect.class.getSimpleName();

    /* renamed from: a */
    public final AbstractC87519e f198511a;

    /* renamed from: b */
    public final AbstractC87520f f198512b;

    /* renamed from: c */
    public C87510a f198513c = new C87510a(C87445c.f198342a);

    /* renamed from: d */
    public C87521g f198514d;

    /* renamed from: e */
    public boolean f198515e;

    /* renamed from: f */
    public boolean f198516f;

    /* renamed from: g */
    public boolean f198517g;

    /* renamed from: i */
    private final Looper f198518i;

    /* renamed from: j */
    private final Handler f198519j;

    /* renamed from: k */
    private final NetworkConnectivityIntentFilter f198520k;

    /* renamed from: l */
    private C87511b f198521l;

    /* renamed from: m */
    private C87512c f198522m;

    /* renamed from: n */
    private NetworkRequest f198523n;

    /* renamed from: o */
    private C87518d f198524o;

    /* renamed from: p */
    private boolean f198525p;

    /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$e */
    public interface AbstractC87519e {
        static {
            Covode.recordClassIndex(103477);
        }

        /* renamed from: a */
        void mo141603a(int i);

        /* renamed from: a */
        void mo141604a(long j);

        /* renamed from: a */
        void mo141605a(long j, int i);

        /* renamed from: a */
        void mo141606a(long[] jArr);

        /* renamed from: b */
        void mo141607b(int i);

        /* renamed from: b */
        void mo141608b(long j);
    }

    /* renamed from: a */
    public static int m151881a(int i, int i2) {
        int i3 = 5;
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return 3;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    return 4;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return 5;
                default:
                    return 0;
            }
        } else if (i == 1) {
            return 2;
        } else {
            if (i != 6) {
                i3 = 7;
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
            }
            return i3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$a */
    public static class C87510a {

        /* renamed from: b */
        static final /* synthetic */ boolean f198527b = true;

        /* renamed from: a */
        final ConnectivityManager f198528a;

        C87510a() {
        }

        static {
            Covode.recordClassIndex(103468);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Network[] mo141619b() {
            Network[] networkArr;
            try {
                networkArr = this.f198528a.getAllNetworks();
            } catch (Throwable unused) {
                networkArr = null;
            }
            if (networkArr == null) {
                return new Network[0];
            }
            return networkArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final Network mo141620c() {
            Network network;
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    network = C87442a.m151772b(this.f198528a);
                } catch (Throwable unused) {
                    network = null;
                }
                if (network != null) {
                    return network;
                }
            } else {
                network = null;
            }
            try {
                NetworkInfo a = m151893a(this.f198528a);
                if (a == null) {
                    return null;
                }
                Network[] a2 = NetworkChangeNotifierAutoDetect.m151884a(this, (Network) null);
                for (Network network2 : a2) {
                    NetworkInfo d = m151897d(network2);
                    if (d != null && (d.getType() == a.getType() || d.getType() == 17)) {
                        if (f198527b || network == null) {
                            network = network2;
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                return network;
            } catch (Throwable unused2) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C87518d mo141617a() {
            NetworkInfo networkInfo;
            Network network;
            boolean z;
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    network = mo141620c();
                    networkInfo = C87442a.m151771a(this.f198528a, network);
                } else {
                    networkInfo = m151893a(this.f198528a);
                    network = null;
                }
                if (networkInfo != null && (networkInfo.isConnected() || (Build.VERSION.SDK_INT >= 21 && networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1))) {
                    if (network != null) {
                        try {
                            int type = networkInfo.getType();
                            int subtype = networkInfo.getSubtype();
                            String valueOf = String.valueOf(NetworkChangeNotifierAutoDetect.m151882a(network));
                            if (Build.VERSION.SDK_INT < 28 || !AndroidNetworkLibrary.m151855a(this.f198528a.getLinkProperties(network))) {
                                z = false;
                            } else {
                                z = true;
                            }
                            return new C87518d(true, type, subtype, valueOf, z);
                        } catch (Throwable unused) {
                            return new C87518d(false, -1, -1, null, false);
                        }
                    } else if (!f198527b && Build.VERSION.SDK_INT >= 23) {
                        throw new AssertionError();
                    } else if (networkInfo.getType() != 1) {
                        return new C87518d(true, networkInfo.getType(), networkInfo.getSubtype(), null, false);
                    } else {
                        if (networkInfo.getExtraInfo() == null || "".equals(networkInfo.getExtraInfo())) {
                            return new C87518d(true, networkInfo.getType(), networkInfo.getSubtype(), "", false);
                        }
                        return new C87518d(true, networkInfo.getType(), networkInfo.getSubtype(), networkInfo.getExtraInfo(), false);
                    }
                }
            } catch (Throwable unused2) {
            }
            return new C87518d(false, -1, -1, null, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141618a(ConnectivityManager.NetworkCallback networkCallback) {
            try {
                this.f198528a.unregisterNetworkCallback(networkCallback);
            } catch (Throwable unused) {
            }
        }

        C87510a(Context context) {
            this.f198528a = (ConnectivityManager) m151895a(context, "connectivity");
        }

        /* renamed from: a */
        private static NetworkInfo m151893a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                return C61338a.m111034a();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            return m151894a(r1.f198528a, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.net.NetworkInfo m151897d(android.net.Network r2) {
            /*
                r1 = this;
                android.net.ConnectivityManager r0 = r1.f198528a     // Catch:{ all -> 0x0007 }
                android.net.NetworkInfo r0 = m151894a(r0, r2)     // Catch:{ all -> 0x0007 }
                return r0
            L_0x0007:
                android.net.ConnectivityManager r0 = r1.f198528a     // Catch:{ all -> 0x000e }
                android.net.NetworkInfo r0 = m151894a(r0, r2)     // Catch:{ all -> 0x000e }
                return r0
            L_0x000e:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.C87510a.m151897d(android.net.Network):android.net.NetworkInfo");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final NetworkCapabilities mo141621c(Network network) {
            try {
                return this.f198528a.getNetworkCapabilities(network);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
            r2.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            throw r1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002f */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected static boolean m151896b(android.net.Network r4) {
            /*
                java.net.Socket r3 = new java.net.Socket
                r3.<init>()
                android.os.StrictMode$VmPolicy r1 = android.os.StrictMode.getVmPolicy()     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                android.os.StrictMode$VmPolicy r0 = android.os.StrictMode.VmPolicy.LAX     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                android.os.StrictMode.setVmPolicy(r0)     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                com.ttnet.org.chromium.base.m r0 = new com.ttnet.org.chromium.base.m     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                r0.<init>(r1)     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                r4.bindSocket(r3)     // Catch:{ all -> 0x001e }
                r0.close()
                r3.close()     // Catch:{ IOException -> 0x001c }
            L_0x001c:
                r0 = 1
                return r0
            L_0x001e:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                r0.close()     // Catch:{ all -> 0x0025 }
                goto L_0x0029
            L_0x0025:
                r0 = move-exception
                r2.addSuppressed(r0)
            L_0x0029:
                throw r1
            L_0x002a:
                r0 = move-exception
                r3.close()     // Catch:{ IOException -> 0x002e }
            L_0x002e:
                throw r0
            L_0x002f:
                r3.close()     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.C87510a.m151896b(android.net.Network):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo141616a(Network network) {
            NetworkInfo d = m151897d(network);
            if (d == null) {
                return 6;
            }
            if (d.getType() == 17) {
                try {
                    d = m151893a(this.f198528a);
                    if (d == null) {
                        return 6;
                    }
                } catch (Throwable unused) {
                    return 6;
                }
            }
            if (d.isConnected()) {
                return NetworkChangeNotifierAutoDetect.m151881a(d.getType(), d.getSubtype());
            }
            return 6;
        }

        /* renamed from: a */
        private static NetworkInfo m151894a(ConnectivityManager connectivityManager, Network network) {
            try {
                return connectivityManager.getNetworkInfo(network);
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                return C61338a.m111034a();
            }
        }

        /* renamed from: a */
        private static Object m151895a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(4899);
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
                        MethodCollector.m26664o(4899);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    public static class NetworkConnectivityIntentFilter extends IntentFilter {
        static {
            Covode.recordClassIndex(103467);
        }

        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$c */
    public class C87512c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        static final /* synthetic */ boolean f198530a = true;

        /* renamed from: c */
        private Network f198532c;

        static {
            Covode.recordClassIndex(103470);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141625a() {
            NetworkCapabilities c;
            Network[] a = NetworkChangeNotifierAutoDetect.m151884a(NetworkChangeNotifierAutoDetect.this.f198513c, (Network) null);
            this.f198532c = null;
            if (a.length == 1 && (c = NetworkChangeNotifierAutoDetect.this.f198513c.mo141621c(a[0])) != null && c.hasTransport(4)) {
                this.f198532c = a[0];
            }
        }

        private C87512c() {
        }

        /* renamed from: a */
        private boolean m151904a(Network network) {
            Network network2 = this.f198532c;
            if (network2 == null || network2.equals(network)) {
                return false;
            }
            return true;
        }

        public final void onAvailable(Network network) {
            try {
                NetworkCapabilities c = NetworkChangeNotifierAutoDetect.this.f198513c.mo141621c(network);
                if (!m151905a(network, c)) {
                    final boolean hasTransport = c.hasTransport(4);
                    if (hasTransport) {
                        this.f198532c = network;
                    }
                    final long a = NetworkChangeNotifierAutoDetect.m151882a(network);
                    final int a2 = NetworkChangeNotifierAutoDetect.this.f198513c.mo141616a(network);
                    NetworkChangeNotifierAutoDetect.this.mo141610a(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.C87512c.RunnableC875131 */

                        static {
                            Covode.recordClassIndex(103471);
                        }

                        public final void run() {
                            NetworkChangeNotifierAutoDetect.this.f198511a.mo141605a(a, a2);
                            if (hasTransport) {
                                NetworkChangeNotifierAutoDetect.this.f198511a.mo141603a(a2);
                                NetworkChangeNotifierAutoDetect.this.f198511a.mo141606a(new long[]{a});
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }

        public final void onLost(final Network network) {
            if (!m151904a(network)) {
                NetworkChangeNotifierAutoDetect.this.mo141610a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.C87512c.RunnableC875164 */

                    static {
                        Covode.recordClassIndex(103474);
                    }

                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.f198511a.mo141608b(NetworkChangeNotifierAutoDetect.m151882a(network));
                    }
                });
                Network network2 = this.f198532c;
                if (network2 == null) {
                    return;
                }
                if (f198530a || network.equals(network2)) {
                    this.f198532c = null;
                    for (Network network3 : NetworkChangeNotifierAutoDetect.m151884a(NetworkChangeNotifierAutoDetect.this.f198513c, network)) {
                        onAvailable(network3);
                    }
                    final int a = NetworkChangeNotifierAutoDetect.this.f198513c.mo141617a().mo141635a();
                    NetworkChangeNotifierAutoDetect.this.mo141610a(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.C87512c.RunnableC875175 */

                        static {
                            Covode.recordClassIndex(103475);
                        }

                        public final void run() {
                            NetworkChangeNotifierAutoDetect.this.f198511a.mo141603a(a);
                        }
                    });
                    return;
                }
                throw new AssertionError();
            }
        }

        /* synthetic */ C87512c(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, byte b) {
            this();
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            try {
                if (!m151905a(network, networkCapabilities)) {
                    final long a = NetworkChangeNotifierAutoDetect.m151882a(network);
                    final int a2 = NetworkChangeNotifierAutoDetect.this.f198513c.mo141616a(network);
                    NetworkChangeNotifierAutoDetect.this.mo141610a(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.C87512c.RunnableC875142 */

                        static {
                            Covode.recordClassIndex(103472);
                        }

                        public final void run() {
                            NetworkChangeNotifierAutoDetect.this.f198511a.mo141605a(a, a2);
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }

        public final void onLosing(Network network, int i) {
            if (!m151905a(network, null)) {
                final long a = NetworkChangeNotifierAutoDetect.m151882a(network);
                NetworkChangeNotifierAutoDetect.this.mo141610a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.C87512c.RunnableC875153 */

                    static {
                        Covode.recordClassIndex(103473);
                    }

                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.f198511a.mo141604a(a);
                    }
                });
            }
        }

        /* renamed from: a */
        private boolean m151905a(Network network, NetworkCapabilities networkCapabilities) {
            if (!m151904a(network)) {
                if (networkCapabilities == null) {
                    networkCapabilities = NetworkChangeNotifierAutoDetect.this.f198513c.mo141621c(network);
                }
                if (networkCapabilities == null || (networkCapabilities.hasTransport(4) && !C87510a.m151896b(network))) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$d */
    public static class C87518d {

        /* renamed from: a */
        public final boolean f198546a;

        /* renamed from: b */
        public final int f198547b;

        /* renamed from: c */
        public final int f198548c;

        /* renamed from: d */
        public final String f198549d;

        /* renamed from: e */
        public final boolean f198550e;

        static {
            Covode.recordClassIndex(103476);
        }

        /* renamed from: a */
        public final int mo141635a() {
            if (!this.f198546a) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.m151881a(this.f198547b, this.f198548c);
        }

        /* renamed from: b */
        public final int mo141636b() {
            if (!this.f198546a) {
                return 1;
            }
            if (this.f198547b != 0) {
                return 0;
            }
            switch (this.f198548c) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return 10;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return 11;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return 6;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return 14;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return 15;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return 12;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return 4;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return 13;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return 18;
                case ABRConfig.ABR_SELECT_SCENE:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public C87518d(boolean z, int i, int i2, String str, boolean z2) {
            this.f198546a = z;
            this.f198547b = i;
            this.f198548c = i2;
            this.f198549d = str == null ? "" : str;
            this.f198550e = z2;
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f */
    public static abstract class AbstractC87520f {

        /* renamed from: a */
        static final /* synthetic */ boolean f198551a = true;

        /* renamed from: b */
        private NetworkChangeNotifierAutoDetect f198552b;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo141640c();

        static {
            Covode.recordClassIndex(103478);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo141637a() {
            if (f198551a || this.f198552b != null) {
                this.f198552b.mo141611b();
                return;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo141639b() {
            if (f198551a || this.f198552b != null) {
                this.f198552b.mo141612c();
                return;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo141638a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.f198552b = networkChangeNotifierAutoDetect;
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$g */
    static class C87521g {

        /* renamed from: a */
        static final /* synthetic */ boolean f198553a = true;

        /* renamed from: b */
        private final Context f198554b;

        /* renamed from: c */
        private final Object f198555c;

        static {
            Covode.recordClassIndex(103479);
        }

        C87521g() {
            this.f198555c = new Object();
            this.f198554b = null;
        }

        C87521g(Context context) {
            this.f198555c = new Object();
            if (f198553a || Build.VERSION.SDK_INT < 23) {
                this.f198554b = context;
                return;
            }
            throw new AssertionError();
        }
    }

    static {
        Covode.recordClassIndex(103465);
    }

    /* renamed from: e */
    private boolean m151886e() {
        if (this.f198518i == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo141609a() {
        m151887f();
        this.f198512b.mo141640c();
        mo141612c();
    }

    /* renamed from: f */
    private void m151887f() {
        if (C87444b.f198337a && !m151886e()) {
            throw new IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    /* renamed from: c */
    public final void mo141612c() {
        m151887f();
        if (this.f198515e) {
            this.f198515e = false;
            C87512c cVar = this.f198522m;
            if (cVar != null) {
                this.f198513c.mo141618a(cVar);
            }
            C87511b bVar = this.f198521l;
            if (bVar != null) {
                this.f198513c.mo141618a(bVar);
            } else {
                C87445c.f198342a.unregisterReceiver(this);
            }
        }
    }

    /* renamed from: d */
    public final void mo141613d() {
        C87518d a = this.f198513c.mo141617a();
        if (!(a.mo141635a() == this.f198524o.mo141635a() && a.f198549d.equals(this.f198524o.f198549d) && a.f198550e == this.f198524o.f198550e)) {
            this.f198511a.mo141603a(a.mo141635a());
        }
        if (!(a.mo141635a() == this.f198524o.mo141635a() && a.mo141636b() == this.f198524o.mo141636b())) {
            this.f198511a.mo141607b(a.mo141636b());
        }
        this.f198524o = a;
    }

    /* renamed from: b */
    public final void mo141611b() {
        boolean z;
        m151887f();
        if (!this.f198515e) {
            if (this.f198525p) {
                mo141613d();
            }
            C87511b bVar = this.f198521l;
            if (bVar != null) {
                try {
                    C87510a aVar = this.f198513c;
                    try {
                        aVar.f198528a.registerDefaultNetworkCallback(bVar, this.f198519j);
                    } catch (Throwable unused) {
                    }
                } catch (RuntimeException unused2) {
                    this.f198521l = null;
                }
            }
            if (this.f198521l == null) {
                try {
                    if (m151885b(C87445c.f198342a, this, this.f198520k) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f198516f = z;
                } catch (RuntimeException unused3) {
                    this.f198516f = false;
                }
            }
            this.f198515e = true;
            C87512c cVar = this.f198522m;
            if (cVar != null) {
                cVar.mo141625a();
                try {
                    C87510a aVar2 = this.f198513c;
                    NetworkRequest networkRequest = this.f198523n;
                    C87512c cVar2 = this.f198522m;
                    Handler handler = this.f198519j;
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            aVar2.f198528a.registerNetworkCallback(networkRequest, cVar2, handler);
                        } else {
                            aVar2.f198528a.registerNetworkCallback(networkRequest, cVar2);
                        }
                    } catch (Throwable unused4) {
                    }
                } catch (RuntimeException unused5) {
                    this.f198517g = true;
                    this.f198522m = null;
                }
                if (!this.f198517g && this.f198525p) {
                    Network[] a = m151884a(this.f198513c, (Network) null);
                    long[] jArr = new long[a.length];
                    for (int i = 0; i < a.length; i++) {
                        jArr[i] = m151882a(a[i]);
                    }
                    this.f198511a.mo141606a(jArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$b */
    public class C87511b extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(103469);
        }

        private C87511b() {
        }

        public final void onLost(Network network) {
            onAvailable(null);
        }

        public final void onAvailable(Network network) {
            if (NetworkChangeNotifierAutoDetect.this.f198515e) {
                NetworkChangeNotifierAutoDetect.this.mo141613d();
            }
        }

        /* synthetic */ C87511b(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, byte b) {
            this();
        }

        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
        }
    }

    /* renamed from: a */
    static long m151882a(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C87442a.m151769a(network);
        }
        return (long) Integer.parseInt(network.toString());
    }

    /* renamed from: a */
    public final void mo141610a(Runnable runnable) {
        if (m151886e()) {
            runnable.run();
        } else {
            this.f198519j.post(runnable);
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo141610a(new Runnable() {
            /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.RunnableC875091 */

            static {
                Covode.recordClassIndex(103466);
            }

            public final void run() {
                if (NetworkChangeNotifierAutoDetect.this.f198515e) {
                    if (NetworkChangeNotifierAutoDetect.this.f198516f) {
                        NetworkChangeNotifierAutoDetect.this.f198516f = false;
                    } else {
                        NetworkChangeNotifierAutoDetect.this.mo141613d();
                    }
                }
            }
        });
    }

    public NetworkChangeNotifierAutoDetect(AbstractC87519e eVar, AbstractC87520f fVar) {
        Looper myLooper = Looper.myLooper();
        this.f198518i = myLooper;
        this.f198519j = new Handler(myLooper);
        this.f198511a = eVar;
        if (Build.VERSION.SDK_INT < 23) {
            this.f198514d = new C87521g(C87445c.f198342a);
        }
        C87511b bVar = null;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f198522m = new C87512c(this, (byte) 0);
            this.f198523n = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.f198522m = null;
            this.f198523n = null;
        }
        this.f198521l = Build.VERSION.SDK_INT >= 28 ? new C87511b(this, (byte) 0) : bVar;
        this.f198524o = this.f198513c.mo141617a();
        this.f198520k = new NetworkConnectivityIntentFilter();
        this.f198516f = false;
        this.f198525p = false;
        this.f198512b = fVar;
        fVar.mo141638a(this);
        this.f198525p = true;
    }

    /* renamed from: a */
    public static Network[] m151884a(C87510a aVar, Network network) {
        NetworkCapabilities c;
        Network[] b = aVar.mo141619b();
        int i = 0;
        for (Network network2 : b) {
            if (!network2.equals(network) && (c = aVar.mo141621c(network2)) != null && c.hasCapability(12)) {
                if (!c.hasTransport(4)) {
                    b[i] = network2;
                    i++;
                } else if (C87510a.m151896b(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(b, i);
    }

    /* renamed from: a */
    private static Intent m151883a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m151885b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m151883a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.m151885b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
