package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ttnet.org.chromium.base.C87445c;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public class X509Util {

    /* renamed from: a */
    static KeyStore f198603a;

    /* renamed from: b */
    static final Object f198604b = new Object();

    /* renamed from: c */
    static final /* synthetic */ boolean f198605c = true;

    /* renamed from: d */
    private static CertificateFactory f198606d;

    /* renamed from: e */
    private static AbstractC87525c f198607e;

    /* renamed from: f */
    private static C87523a f198608f;

    /* renamed from: g */
    private static AbstractC87525c f198609g;

    /* renamed from: h */
    private static KeyStore f198610h;

    /* renamed from: i */
    private static File f198611i;

    /* renamed from: j */
    private static Set<Pair<X500Principal, PublicKey>> f198612j;

    /* renamed from: k */
    private static boolean f198613k;

    /* renamed from: l */
    private static final char[] f198614l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.X509Util$c */
    public interface AbstractC87525c {
        static {
            Covode.recordClassIndex(103490);
        }

        /* renamed from: a */
        List<X509Certificate> mo141682a(X509Certificate[] x509CertificateArr, String str, String str2);
    }

    private static native void nativeNotifyKeyChainChanged();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.X509Util$a */
    public static final class C87523a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(103488);
        }

        private C87523a() {
        }

        /* synthetic */ C87523a(byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                    return;
                }
            } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                return;
            }
            try {
                X509Util.m151941c();
            } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            }
        }
    }

    /* renamed from: b */
    static void m151939b() {
        if (f198605c || Thread.holdsLock(f198604b)) {
            f198609g = m151933a(f198603a);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public static void m151941c() {
        MethodCollector.m26663i(3953);
        synchronized (f198604b) {
            try {
                f198607e = null;
                f198612j = null;
                m151942d();
            } catch (Throwable th) {
                MethodCollector.m26664o(3953);
                throw th;
            }
        }
        nativeNotifyKeyChainChanged();
        MethodCollector.m26664o(3953);
    }

    static {
        Covode.recordClassIndex(103487);
    }

    /* renamed from: d */
    private static void m151942d() {
        if (f198605c || Thread.holdsLock(f198604b)) {
            if (f198606d == null) {
                f198606d = CertificateFactory.getInstance("X.509");
            }
            if (f198607e == null) {
                f198607e = m151933a((KeyStore) null);
            }
            if (!f198613k) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidCAStore");
                    f198610h = instance;
                    try {
                        instance.load(null);
                    } catch (IOException unused) {
                    }
                    f198611i = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
                } catch (KeyStoreException unused2) {
                }
                f198613k = true;
            }
            if (f198612j == null) {
                f198612j = new HashSet();
            }
            if (f198603a == null) {
                KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
                f198603a = instance2;
                try {
                    instance2.load(null);
                } catch (IOException unused3) {
                }
            }
            if (f198609g == null) {
                f198609g = m151933a(f198603a);
            }
            if (f198608f == null) {
                f198608f = new C87523a((byte) 0);
                IntentFilter intentFilter = new IntentFilter();
                if (Build.VERSION.SDK_INT >= 26) {
                    intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                    intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                    intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
                } else {
                    intentFilter.addAction("android.security.STORAGE_CHANGED");
                }
                m151938b(C87445c.f198342a, f198608f, intentFilter);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    static void m151936a() {
        MethodCollector.m26663i(3894);
        synchronized (f198604b) {
            try {
                m151942d();
            } finally {
                MethodCollector.m26664o(3894);
            }
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.X509Util$b */
    static final class C87524b implements AbstractC87525c {

        /* renamed from: a */
        private final X509TrustManager f198615a;

        static {
            Covode.recordClassIndex(103489);
        }

        public C87524b(X509TrustManager x509TrustManager) {
            this.f198615a = x509TrustManager;
        }

        @Override // com.ttnet.org.chromium.net.X509Util.AbstractC87525c
        /* renamed from: a */
        public final List<X509Certificate> mo141682a(X509Certificate[] x509CertificateArr, String str, String str2) {
            this.f198615a.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.X509Util$d */
    public static final class C87526d implements AbstractC87525c {

        /* renamed from: a */
        private final X509TrustManagerExtensions f198616a;

        static {
            Covode.recordClassIndex(103491);
        }

        public C87526d(X509TrustManager x509TrustManager) {
            this.f198616a = new X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.ttnet.org.chromium.net.X509Util.AbstractC87525c
        /* renamed from: a */
        public final List<X509Certificate> mo141682a(X509Certificate[] x509CertificateArr, String str, String str2) {
            return this.f198616a.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    /* renamed from: a */
    private static AbstractC87525c m151933a(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    return new C87526d((X509TrustManager) trustManager);
                } catch (IllegalArgumentException unused) {
                    trustManager.getClass().getName();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m151934a(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        int i = 0;
        do {
            int i2 = i * 2;
            char[] cArr2 = f198614l;
            int i3 = 3 - i;
            cArr[i2] = cArr2[(digest[i3] >> 4) & 15];
            cArr[i2 + 1] = cArr2[digest[i3] & 15];
            i++;
        } while (i < 4);
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m151940b(java.security.cert.X509Certificate r5) {
        /*
            r4 = 0
            java.util.List r0 = r5.getExtendedKeyUsage()     // Catch:{ NullPointerException -> 0x003a }
            r3 = 1
            if (r0 != 0) goto L_0x0009
            return r3
        L_0x0009:
            java.util.Iterator r2 = r0.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "1.3.6.1.5.5.7.3.1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "2.5.29.37.0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "2.16.840.1.113730.4.1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "1.3.6.1.4.1.311.10.3.3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
        L_0x0039:
            return r3
        L_0x003a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.m151940b(java.security.cert.X509Certificate):boolean");
    }

    /* renamed from: a */
    public static X509Certificate m151935a(byte[] bArr) {
        MethodCollector.m26663i(3954);
        m151936a();
        X509Certificate x509Certificate = (X509Certificate) f198606d.generateCertificate(new ByteArrayInputStream(bArr));
        MethodCollector.m26664o(3954);
        return x509Certificate;
    }

    /* renamed from: a */
    private static boolean m151937a(X509Certificate x509Certificate) {
        if (!f198605c && !Thread.holdsLock(f198604b)) {
            throw new AssertionError();
        } else if (f198610h == null) {
            return false;
        } else {
            Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
            if (f198612j.contains(pair)) {
                return true;
            }
            String a = m151934a(x509Certificate.getSubjectX500Principal());
            int i = 0;
            while (true) {
                String str = a + '.' + i;
                if (!new File(f198611i, str).exists()) {
                    return false;
                }
                Certificate certificate = f198610h.getCertificate("system:".concat(String.valueOf(str)));
                if (certificate != null) {
                    if (!(certificate instanceof X509Certificate)) {
                        certificate.getClass().getName();
                    } else {
                        X509Certificate x509Certificate2 = (X509Certificate) certificate;
                        if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                            f198612j.add(pair);
                            return true;
                        }
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private static Intent m151931a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m151938b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m151931a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.m151938b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: a */
    public static AndroidCertVerifyResult m151932a(byte[][] bArr, String str, String str2) {
        List<X509Certificate> list;
        MethodCollector.m26663i(4015);
        if (!(bArr == null || bArr.length == 0)) {
            boolean z = false;
            if (bArr[0] != null) {
                try {
                    m151936a();
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(m151935a(bArr[0]));
                        for (int i = 1; i < bArr.length; i++) {
                            try {
                                arrayList.add(m151935a(bArr[i]));
                            } catch (CertificateException unused) {
                            }
                        }
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            x509CertificateArr[0].checkValidity();
                            if (!m151940b(x509CertificateArr[0])) {
                                AndroidCertVerifyResult androidCertVerifyResult = new AndroidCertVerifyResult(-6);
                                MethodCollector.m26664o(4015);
                                return androidCertVerifyResult;
                            }
                            synchronized (f198604b) {
                                try {
                                    AbstractC87525c cVar = f198607e;
                                    if (cVar == null) {
                                        return new AndroidCertVerifyResult(-1);
                                    }
                                    try {
                                        list = cVar.mo141682a(x509CertificateArr, str, str2);
                                    } catch (CertificateException e) {
                                        try {
                                            list = f198609g.mo141682a(x509CertificateArr, str, str2);
                                        } catch (CertificateException unused2) {
                                            e.getMessage();
                                            AndroidCertVerifyResult androidCertVerifyResult2 = new AndroidCertVerifyResult(-2);
                                            MethodCollector.m26664o(4015);
                                            return androidCertVerifyResult2;
                                        }
                                    }
                                    if (list.size() > 0) {
                                        z = m151937a(list.get(list.size() - 1));
                                    }
                                    AndroidCertVerifyResult androidCertVerifyResult3 = new AndroidCertVerifyResult(z, list);
                                    MethodCollector.m26664o(4015);
                                    return androidCertVerifyResult3;
                                } finally {
                                    MethodCollector.m26664o(4015);
                                }
                            }
                        } catch (CertificateExpiredException unused3) {
                            AndroidCertVerifyResult androidCertVerifyResult4 = new AndroidCertVerifyResult(-3);
                            MethodCollector.m26664o(4015);
                            return androidCertVerifyResult4;
                        } catch (CertificateNotYetValidException unused4) {
                            AndroidCertVerifyResult androidCertVerifyResult5 = new AndroidCertVerifyResult(-4);
                            MethodCollector.m26664o(4015);
                            return androidCertVerifyResult5;
                        } catch (CertificateException unused5) {
                            AndroidCertVerifyResult androidCertVerifyResult6 = new AndroidCertVerifyResult(-1);
                            MethodCollector.m26664o(4015);
                            return androidCertVerifyResult6;
                        }
                    } catch (CertificateException unused6) {
                        AndroidCertVerifyResult androidCertVerifyResult7 = new AndroidCertVerifyResult(-5);
                        MethodCollector.m26664o(4015);
                        return androidCertVerifyResult7;
                    }
                } catch (CertificateException unused7) {
                    AndroidCertVerifyResult androidCertVerifyResult8 = new AndroidCertVerifyResult(-1);
                    MethodCollector.m26664o(4015);
                    return androidCertVerifyResult8;
                }
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        MethodCollector.m26664o(4015);
        throw illegalArgumentException;
    }
}
