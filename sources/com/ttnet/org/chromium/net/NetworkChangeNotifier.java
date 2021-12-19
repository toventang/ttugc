package com.ttnet.org.chromium.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.ttnet.org.chromium.base.C87445c;
import com.ttnet.org.chromium.base.C87459h;
import com.ttnet.org.chromium.base.p4497a.C87442a;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class NetworkChangeNotifier {

    /* renamed from: a */
    static final /* synthetic */ boolean f198502a = true;

    /* renamed from: g */
    private static NetworkChangeNotifier f198503g;

    /* renamed from: b */
    private final ArrayList<Long> f198504b = new ArrayList<>();

    /* renamed from: c */
    private final C87459h<Object> f198505c = new C87459h<>();

    /* renamed from: d */
    private final ConnectivityManager f198506d = ((ConnectivityManager) m151863a(C87445c.f198342a, "connectivity"));

    /* renamed from: e */
    private NetworkChangeNotifierAutoDetect f198507e;

    /* renamed from: f */
    private int f198508f;

    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    private native void nativeNotifyMaxBandwidthChanged(long j, int i);

    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    public int getCurrentConnectionType() {
        return this.f198508f;
    }

    static {
        Covode.recordClassIndex(103463);
    }

    /* renamed from: b */
    private static void m151865b() {
        m151862a().mo141592a(false, (NetworkChangeNotifierAutoDetect.AbstractC87520f) new C87654s());
    }

    /* renamed from: c */
    private void m151866c() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f198507e;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.mo141609a();
            this.f198507e = null;
        }
    }

    public static NetworkChangeNotifier init() {
        if (f198503g == null) {
            f198503g = new NetworkChangeNotifier();
        }
        return f198503g;
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f198507e;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.f198517g;
    }

    protected NetworkChangeNotifier() {
    }

    /* renamed from: a */
    public static NetworkChangeNotifier m151862a() {
        if (f198502a || f198503g != null) {
            return f198503g;
        }
        throw new AssertionError();
    }

    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f198507e;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.f198513c.mo141617a().mo141636b();
    }

    public long getCurrentDefaultNetId() {
        Network c;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f198507e;
        if (networkChangeNotifierAutoDetect == null || Build.VERSION.SDK_INT < 21 || (c = networkChangeNotifierAutoDetect.f198513c.mo141620c()) == null) {
            return -1;
        }
        return NetworkChangeNotifierAutoDetect.m151882a(c);
    }

    public static boolean isProcessBoundToNetwork() {
        NetworkChangeNotifier a = m151862a();
        if (Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT < 23) {
                if (ConnectivityManager.getProcessDefaultNetwork() != null) {
                    return true;
                }
                return false;
            } else if (C87442a.m151770a(a.f198506d) != null) {
                return true;
            }
        }
        return false;
    }

    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f198507e;
        if (networkChangeNotifierAutoDetect == null) {
            return new long[0];
        }
        if (Build.VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] a = NetworkChangeNotifierAutoDetect.m151884a(networkChangeNotifierAutoDetect.f198513c, (Network) null);
        long[] jArr = new long[(a.length * 2)];
        int i = 0;
        for (Network network : a) {
            int i2 = i + 1;
            jArr[i] = NetworkChangeNotifierAutoDetect.m151882a(network);
            i = i2 + 1;
            jArr[i2] = (long) networkChangeNotifierAutoDetect.f198513c.mo141616a(network);
        }
        return jArr;
    }

    /* renamed from: c */
    private void m151867c(int i) {
        m151864a(i, getCurrentDefaultNetId());
    }

    /* renamed from: a */
    public final void mo141589a(int i) {
        this.f198508f = i;
        m151867c(i);
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        m151865b();
        m151862a().mo141595b(i);
    }

    public static void fakeNetworkDisconnected(long j) {
        m151865b();
        m151862a().mo141596b(j);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        m151865b();
        m151862a().mo141590a(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        m151865b();
        m151862a().mo141593a(jArr);
    }

    public void addNativeObserver(long j) {
        this.f198504b.add(Long.valueOf(j));
    }

    public void removeNativeObserver(long j) {
        this.f198504b.remove(Long.valueOf(j));
    }

    public static void forceConnectivityState(boolean z) {
        boolean z2;
        m151865b();
        NetworkChangeNotifier a = m151862a();
        int i = 0;
        if (a.f198508f != 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 6;
            }
            a.mo141589a(i);
            a.mo141595b(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo141595b(int i) {
        MethodCollector.m26663i(8014);
        Iterator<Long> it = this.f198504b.iterator();
        while (it.hasNext()) {
            nativeNotifyMaxBandwidthChanged(it.next().longValue(), i);
        }
        MethodCollector.m26664o(8014);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo141596b(long j) {
        MethodCollector.m26663i(8017);
        Iterator<Long> it = this.f198504b.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkDisconnect(it.next().longValue(), j);
        }
        MethodCollector.m26664o(8017);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141590a(long j) {
        MethodCollector.m26663i(8016);
        Iterator<Long> it = this.f198504b.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkSoonToDisconnect(it.next().longValue(), j);
        }
        MethodCollector.m26664o(8016);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141593a(long[] jArr) {
        MethodCollector.m26663i(8161);
        Iterator<Long> it = this.f198504b.iterator();
        while (it.hasNext()) {
            nativeNotifyPurgeActiveNetworkList(it.next().longValue(), jArr);
        }
        MethodCollector.m26664o(8161);
    }

    public static void fakeDefaultNetwork(long j, int i) {
        m151865b();
        m151862a().m151864a(i, j);
    }

    public static void fakeNetworkConnected(long j, int i) {
        m151865b();
        m151862a().mo141591a(j, i);
    }

    /* renamed from: a */
    private void m151864a(int i, long j) {
        MethodCollector.m26663i(7868);
        Iterator<Long> it = this.f198504b.iterator();
        while (it.hasNext()) {
            nativeNotifyConnectionTypeChanged(it.next().longValue(), i, j);
        }
        Iterator<Object> it2 = this.f198505c.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        MethodCollector.m26664o(7868);
    }

    /* renamed from: a */
    private static Object m151863a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7717);
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
                    MethodCollector.m26664o(7717);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141591a(long j, int i) {
        MethodCollector.m26663i(8015);
        Iterator<Long> it = this.f198504b.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkConnect(it.next().longValue(), j, i);
        }
        MethodCollector.m26664o(8015);
    }

    /* renamed from: a */
    public final void mo141592a(boolean z, NetworkChangeNotifierAutoDetect.AbstractC87520f fVar) {
        if (!z) {
            m151866c();
        } else if (this.f198507e == null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifierAutoDetect.AbstractC87519e() {
                /* class com.ttnet.org.chromium.net.NetworkChangeNotifier.C875081 */

                static {
                    Covode.recordClassIndex(103464);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87519e
                /* renamed from: a */
                public final void mo141603a(int i) {
                    NetworkChangeNotifier.this.mo141589a(i);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87519e
                /* renamed from: b */
                public final void mo141607b(int i) {
                    NetworkChangeNotifier.this.mo141595b(i);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87519e
                /* renamed from: a */
                public final void mo141604a(long j) {
                    NetworkChangeNotifier.this.mo141590a(j);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87519e
                /* renamed from: b */
                public final void mo141608b(long j) {
                    NetworkChangeNotifier.this.mo141596b(j);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87519e
                /* renamed from: a */
                public final void mo141606a(long[] jArr) {
                    NetworkChangeNotifier.this.mo141593a(jArr);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AbstractC87519e
                /* renamed from: a */
                public final void mo141605a(long j, int i) {
                    NetworkChangeNotifier.this.mo141591a(j, i);
                }
            }, fVar);
            this.f198507e = networkChangeNotifierAutoDetect;
            NetworkChangeNotifierAutoDetect.C87518d a = networkChangeNotifierAutoDetect.f198513c.mo141617a();
            mo141589a(a.mo141635a());
            mo141595b(a.mo141636b());
        }
    }
}
