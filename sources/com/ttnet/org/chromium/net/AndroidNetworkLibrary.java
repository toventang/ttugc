package com.ttnet.org.chromium.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.ttnet.org.chromium.base.C87441a;
import com.ttnet.org.chromium.base.C87445c;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import com.ttnet.org.chromium.base.p4497a.C87442a;
import com.ttnet.org.chromium.base.p4497a.C87443b;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* access modifiers changed from: package-private */
public class AndroidNetworkLibrary {

    /* renamed from: a */
    private static Boolean f198481a;

    /* renamed from: b */
    private static Boolean f198482b;

    /* renamed from: c */
    private static final Set<InetAddress> f198483c;

    /* renamed from: d */
    private static final Set<String> f198484d;

    public static String getWifiSSID() {
        return "";
    }

    public static native void nativeOnCellularAlwaysUp(boolean z);

    AndroidNetworkLibrary() {
    }

    /* renamed from: com.ttnet.org.chromium.net.AndroidNetworkLibrary$c */
    static class C87502c extends Socket {
        static {
            Covode.recordClassIndex(103452);
        }

        /* renamed from: com.ttnet.org.chromium.net.AndroidNetworkLibrary$c$a */
        static class C87503a extends SocketImpl {
            static {
                Covode.recordClassIndex(103453);
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void close() {
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void create(boolean z) {
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final int available() {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            C87503a(FileDescriptor fileDescriptor) {
                this.fd = fileDescriptor;
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketOptions
            public final Object getOption(int i) {
                throw new RuntimeException("getOption not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void listen(int i) {
                throw new RuntimeException("listen not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void sendUrgentData(int i) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void bind(InetAddress inetAddress, int i) {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void connect(String str, int i) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketOptions
            public final void setOption(int i, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void connect(InetAddress inetAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void connect(SocketAddress socketAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }
        }

        C87502c(FileDescriptor fileDescriptor) {
            super(new C87503a(fileDescriptor));
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.AndroidNetworkLibrary$a */
    public static class C87500a {

        /* renamed from: a */
        static C87500a f198486a = new C87500a();

        static {
            Covode.recordClassIndex(103450);
        }

        /* renamed from: a */
        public static boolean m151857a() {
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearTestRootCertificates() {
        /*
            r3 = 6946(0x1b22, float:9.733E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            com.ttnet.org.chromium.net.X509Util.m151936a()
            java.lang.Object r2 = com.ttnet.org.chromium.net.X509Util.f198604b
            monitor-enter(r2)
            java.security.KeyStore r1 = com.ttnet.org.chromium.net.X509Util.f198603a     // Catch:{ IOException -> 0x0014 }
            r0 = 0
            r1.load(r0)     // Catch:{ IOException -> 0x0014 }
            com.ttnet.org.chromium.net.X509Util.m151939b()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.AndroidNetworkLibrary.clearTestRootCertificates():void");
    }

    /* renamed from: com.ttnet.org.chromium.net.AndroidNetworkLibrary$b */
    static class C87501b {

        /* renamed from: a */
        private static final Method f198487a;

        static {
            Covode.recordClassIndex(103451);
            try {
                f198487a = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
            } catch (NoSuchMethodException | SecurityException e) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
            }
        }

        /* renamed from: a */
        public static FileDescriptor m151858a(int i) {
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                Method method = f198487a;
                Object[] objArr = {Integer.valueOf(i)};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{fileDescriptor, objArr}, 110000, "java.lang.Object", true, "com_ttnet_org_chromium_net_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                } else {
                    C15346a.m28242a(method.invoke(fileDescriptor, objArr), method, new Object[]{fileDescriptor, objArr}, "com_ttnet_org_chromium_net_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                return fileDescriptor;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = (android.net.ConnectivityManager) m151854a(com.ttnet.org.chromium.base.C87445c.f198342a, "connectivity");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean alwayUpCellular() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 21
            if (r1 >= r0) goto L_0x0008
            return r3
        L_0x0008:
            android.content.Context r1 = com.ttnet.org.chromium.base.C87445c.f198342a
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = m151854a(r1, r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto L_0x0015
            return r3
        L_0x0015:
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r0 = 12
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)
            android.net.NetworkRequest$Builder r0 = r0.addTransportType(r3)
            android.net.NetworkRequest r1 = r0.build()
            com.ttnet.org.chromium.net.AndroidNetworkLibrary$1 r0 = new com.ttnet.org.chromium.net.AndroidNetworkLibrary$1     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            r2.requestNetwork(r1, r0)     // Catch:{ Exception -> 0x0032 }
            r0 = 1
            return r0
        L_0x0032:
            r0 = move-exception
            r0.printStackTrace()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.AndroidNetworkLibrary.alwayUpCellular():boolean");
    }

    private static boolean checkIsVpnOn() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < 21 || (connectivityManager = (ConnectivityManager) m151854a(C87445c.f198342a, "connectivity")) == null) {
            return false;
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        for (int i = 0; i < allNetworks.length; i++) {
            if (m151853a(connectivityManager, allNetworks[i]).isConnected() && connectivityManager.getNetworkCapabilities(allNetworks[i]).hasTransport(4)) {
                return true;
            }
        }
        return false;
    }

    private static boolean getIsCaptivePortal() {
        ConnectivityManager connectivityManager;
        Network b;
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT < 23 || (connectivityManager = (ConnectivityManager) m151854a(C87445c.f198342a, "connectivity")) == null || (b = C87442a.m151772b(connectivityManager)) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(b)) == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    public static int[] getRouteInfo() {
        DhcpInfo dhcpInfo;
        try {
            WifiManager wifiManager = (WifiManager) m151854a(C87445c.f198342a, "wifi");
            if (!(wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null)) {
                return new int[]{dhcpInfo.ipAddress, dhcpInfo.netmask};
            }
        } catch (Throwable unused) {
        }
        return new int[0];
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(103448);
        HashSet hashSet = new HashSet();
        f198483c = hashSet;
        HashSet hashSet2 = new HashSet();
        f198484d = hashSet2;
        try {
            hashSet.add(InetAddress.getByName("8.8.8.8"));
            hashSet.add(InetAddress.getByName("8.8.4.4"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8888"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8844"));
            hashSet.add(InetAddress.getByName("1.1.1.1"));
            hashSet.add(InetAddress.getByName("1.0.0.1"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1111"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1001"));
            hashSet.add(InetAddress.getByName("9.9.9.9"));
            hashSet.add(InetAddress.getByName("149.112.112.112"));
            hashSet.add(InetAddress.getByName("2620:fe::fe"));
            hashSet.add(InetAddress.getByName("2620:fe::9"));
            hashSet2.add("dns.google");
            hashSet2.add("1dot1dot1dot1.cloudflare-dns.com");
            hashSet2.add("cloudflare-dns.com");
            hashSet2.add("dns.quad9.net");
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to parse IP addresses", e);
        }
    }

    private static byte[][] getDnsServers() {
        boolean z;
        String b;
        boolean z2;
        boolean z3 = true;
        if (f198481a == null) {
            if (C87441a.m151768a(C87445c.f198342a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            f198481a = Boolean.valueOf(z2);
        }
        if (!f198481a.booleanValue()) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) m151854a(C87445c.f198342a, "connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        Network b2 = C87442a.m151772b(connectivityManager);
        if (b2 == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(b2);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        Iterator<InetAddress> it = dnsServers.iterator();
        while (true) {
            if (it.hasNext()) {
                if (f198483c.contains(it.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (m151855a(linkProperties)) {
            if (Build.VERSION.SDK_INT < 28 || (b = C87443b.m151776b(linkProperties)) == null) {
                z3 = false;
            } else {
                z = f198484d.contains(b.toLowerCase(Locale.US));
            }
            RecordHistogram.m151816a("Net.DNS.Android.DotExplicit", z3);
            RecordHistogram.m151816a("Net.DNS.Android.AutoDohPrivate", z);
            return (byte[][]) Array.newInstance(byte.class, 1, 1);
        }
        RecordHistogram.m151816a("Net.DNS.Android.AutoDohPublic", z);
        byte[][] bArr = new byte[dnsServers.size()][];
        for (int i = 0; i < dnsServers.size(); i++) {
            bArr[i] = dnsServers.get(i).getAddress();
        }
        return bArr;
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return C87500a.m151857a();
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return C87500a.m151857a();
        }
    }

    /* renamed from: a */
    static boolean m151855a(LinkProperties linkProperties) {
        if (Build.VERSION.SDK_INT < 28 || linkProperties == null) {
            return false;
        }
        return C87443b.m151775a(linkProperties);
    }

    public static void addTestRootCertificate(byte[] bArr) {
        MethodCollector.m26663i(6796);
        X509Util.m151936a();
        X509Certificate a = X509Util.m151935a(bArr);
        synchronized (X509Util.f198604b) {
            try {
                X509Util.f198603a.setCertificateEntry("root_cert_" + Integer.toString(X509Util.f198603a.size()), a);
                X509Util.m151939b();
            } finally {
                MethodCollector.m26664o(6796);
            }
        }
    }

    public static int getWifiSignalLevel(int i) {
        int i2;
        int calculateSignalLevel;
        boolean z;
        try {
            if (C87445c.f198342a == null || C87445c.f198342a.getContentResolver() == null) {
                return -1;
            }
            if (f198482b == null) {
                if (C87441a.m151768a(C87445c.f198342a, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                f198482b = Boolean.valueOf(z);
            }
            if (f198482b.booleanValue()) {
                WifiInfo connectionInfo = ((WifiManager) m151854a(C87445c.f198342a, "wifi")).getConnectionInfo();
                if (connectionInfo == null) {
                    return -1;
                }
                i2 = connectionInfo.getRssi();
            } else {
                try {
                    Intent b = m151856b(C87445c.f198342a, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                    if (b == null) {
                        return -1;
                    }
                    i2 = b.getIntExtra("newRssi", Integer.MIN_VALUE);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (i2 != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(i2, i)) >= 0 && calculateSignalLevel < i) {
                return calculateSignalLevel;
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    private static NetworkInfo m151853a(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static Intent m151852a(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static Intent m151856b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m151852a(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Object m151854a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7098);
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
                    MethodCollector.m26664o(7098);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.m151932a(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    private static void tagSocket(int i, int i2, int i3) {
        ParcelFileDescriptor adoptFd;
        FileDescriptor fileDescriptor;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            C87677y.m152574a(i2);
        }
        if (Build.VERSION.SDK_INT < 23) {
            adoptFd = null;
            fileDescriptor = C87501b.m151858a(i);
        } else {
            adoptFd = ParcelFileDescriptor.adoptFd(i);
            fileDescriptor = adoptFd.getFileDescriptor();
        }
        C87502c cVar = new C87502c(fileDescriptor);
        TrafficStats.tagSocket(cVar);
        cVar.close();
        if (adoptFd != null) {
            adoptFd.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            C87677y.m152573a();
        }
    }
}
