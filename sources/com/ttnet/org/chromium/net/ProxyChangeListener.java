package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.ttnet.org.chromium.base.C87444b;
import com.ttnet.org.chromium.base.C87445c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyChangeListener {

    /* renamed from: a */
    static final /* synthetic */ boolean f198556a = true;

    /* renamed from: b */
    private static boolean f198557b = true;

    /* renamed from: c */
    private final Looper f198558c;

    /* renamed from: d */
    private final Handler f198559d;

    /* renamed from: e */
    private long f198560e;

    /* renamed from: f */
    private ProxyReceiver f198561f;

    /* renamed from: g */
    private BroadcastReceiver f198562g;

    private native void nativeProxySettingsChanged(long j);

    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    static {
        Covode.recordClassIndex(103480);
    }

    /* renamed from: a */
    private boolean m151921a() {
        if (this.f198558c == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.ProxyChangeListener$a */
    public static class C87522a {

        /* renamed from: e */
        public static final C87522a f198564e = new C87522a("", 0, "", new String[0]);

        /* renamed from: a */
        public final String f198565a;

        /* renamed from: b */
        public final int f198566b;

        /* renamed from: c */
        public final String f198567c;

        /* renamed from: d */
        public final String[] f198568d;

        static {
            Covode.recordClassIndex(103482);
        }

        /* renamed from: a */
        public static C87522a m151929a(ProxyInfo proxyInfo) {
            String str = null;
            if (proxyInfo == null) {
                return null;
            }
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            String host = proxyInfo.getHost();
            int port = proxyInfo.getPort();
            if (!Uri.EMPTY.equals(pacFileUrl)) {
                str = pacFileUrl.toString();
            }
            return new C87522a(host, port, str, proxyInfo.getExclusionList());
        }

        public C87522a(String str, int i, String str2, String[] strArr) {
            this.f198565a = str;
            this.f198566b = i;
            this.f198567c = str2;
            this.f198568d = strArr;
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.f198558c = myLooper;
        this.f198559d = new Handler(myLooper);
    }

    /* renamed from: b */
    private void m151923b() {
        if (C87444b.f198337a && !m151921a()) {
            throw new IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    public void stop() {
        m151923b();
        this.f198560e = 0;
        m151923b();
        if (f198556a || this.f198561f != null) {
            C87445c.f198342a.unregisterReceiver(this.f198561f);
            if (this.f198562g != null) {
                C87445c.f198342a.unregisterReceiver(this.f198562g);
            }
            this.f198561f = null;
            this.f198562g = null;
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public class ProxyReceiver extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(103481);
        }

        private ProxyReceiver() {
        }

        /* renamed from: b */
        private static Bundle m151928b(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        static C87522a m151926a(Intent intent) {
            Bundle b = m151928b(intent);
            if (b == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return C87522a.m151929a((ProxyInfo) m151927a(b, "android.intent.extra.PROXY_INFO"));
            }
            try {
                Object a = m151927a(b, "proxy");
                if (a == null) {
                    return null;
                }
                Class<?> cls = Class.forName("android.net.ProxyProperties");
                Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
                Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
                String str = (String) declaredMethod.invoke(a, new Object[0]);
                int intValue = ((Integer) declaredMethod2.invoke(a, new Object[0])).intValue();
                String[] split = ((String) declaredMethod3.invoke(a, new Object[0])).split(",");
                int i = Build.VERSION.SDK_INT;
                String str2 = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(a, new Object[0]);
                if (!TextUtils.isEmpty(str2)) {
                    return new C87522a(str, intValue, str2, split);
                }
                return new C87522a(str, intValue, null, split);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
                return null;
            }
        }

        /* synthetic */ ProxyReceiver(ProxyChangeListener proxyChangeListener, byte b) {
            this();
        }

        /* renamed from: a */
        private static Object m151927a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.mo141642a(new RunnableC87651p(this, intent));
            }
        }
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    /* renamed from: a */
    public final void mo141641a(C87522a aVar) {
        MethodCollector.m26663i(7574);
        m151923b();
        if (!f198557b) {
            MethodCollector.m26664o(7574);
            return;
        }
        long j = this.f198560e;
        if (j == 0) {
            MethodCollector.m26664o(7574);
        } else if (aVar != null) {
            nativeProxySettingsChangedTo(j, aVar.f198565a, aVar.f198566b, aVar.f198567c, aVar.f198568d);
            MethodCollector.m26664o(7574);
        } else {
            nativeProxySettingsChanged(j);
            MethodCollector.m26664o(7574);
        }
    }

    public void start(long j) {
        m151923b();
        boolean z = f198556a;
        if (z || this.f198560e == 0) {
            this.f198560e = j;
            m151923b();
            if (!z) {
                if (this.f198561f != null) {
                    throw new AssertionError();
                } else if (this.f198562g != null) {
                    throw new AssertionError();
                }
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            this.f198561f = new ProxyReceiver(this, (byte) 0);
            if (Build.VERSION.SDK_INT < 23) {
                m151922b(C87445c.f198342a, this.f198561f, intentFilter);
                return;
            }
            m151922b(C87445c.f198342a, this.f198561f, new IntentFilter());
            this.f198562g = new C87649n(this);
            m151922b(C87445c.f198342a, this.f198562g, intentFilter);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo141642a(Runnable runnable) {
        if (m151921a()) {
            runnable.run();
        } else {
            this.f198559d.post(runnable);
        }
    }

    /* renamed from: a */
    public static Object m151920a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7576);
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
                    MethodCollector.m26664o(7576);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static Intent m151919a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m151922b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m151919a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.ProxyChangeListener.m151922b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
