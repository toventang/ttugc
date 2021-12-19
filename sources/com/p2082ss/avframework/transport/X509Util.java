package com.p2082ss.avframework.transport;

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
import com.p2082ss.avframework.utils.LibraryLoader;
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

/* renamed from: com.ss.avframework.transport.X509Util */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerImplementation sDefaultTrustManager;
    private static boolean sDisableNativeCodeForTest;
    private static boolean sLoadedSystemKeyStore;
    private static final Object sLock = new Object();
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerImplementation sTestTrustManager;
    private static TrustStorageListener sTrustStorageListener;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.transport.X509Util$1 */
    public static /* synthetic */ class C860411 {
        static {
            Covode.recordClassIndex(100715);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.transport.X509Util$X509TrustManagerImplementation */
    public interface X509TrustManagerImplementation {
        static {
            Covode.recordClassIndex(100718);
        }

        List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2);
    }

    /* renamed from: com_ss_avframework_transport_X509Util_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147795x763f054a(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_avframework_transport_X509Util_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m147796x763f054e(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_avframework_transport_X509Util_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m147797x763f055c(String str, String str2) {
        return 0;
    }

    private static native void nativeNotifyKeyChainChanged();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.transport.X509Util$TrustStorageListener */
    public static final class TrustStorageListener extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(100716);
        }

        /* renamed from: com_ss_avframework_transport_X509Util$TrustStorageListener_com_ss_android_ugc_aweme_lancet_LogLancet_e */
        public static int m147799x31ad5b9b(String str, String str2, Throwable th) {
            return 0;
        }

        private TrustStorageListener() {
        }

        /* synthetic */ TrustStorageListener(C860411 r1) {
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
                X509Util.reloadDefaultTrustManager();
            } catch (CertificateException e) {
                m147799x31ad5b9b("X509Util", "Unable to reload the default TrustManager", e);
            } catch (KeyStoreException e2) {
                m147799x31ad5b9b("X509Util", "Unable to reload the default TrustManager", e2);
            } catch (NoSuchAlgorithmException e3) {
                m147799x31ad5b9b("X509Util", "Unable to reload the default TrustManager", e3);
            }
        }
    }

    private static void reloadTestTrustManager() {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearTestRootCertificates() {
        /*
            r3 = 2437(0x985, float:3.415E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            ensureInitialized()
            java.lang.Object r2 = com.p2082ss.avframework.transport.X509Util.sLock
            monitor-enter(r2)
            java.security.KeyStore r1 = com.p2082ss.avframework.transport.X509Util.sTestKeyStore     // Catch:{ IOException -> 0x0014 }
            r0 = 0
            r1.load(r0)     // Catch:{ IOException -> 0x0014 }
            reloadTestTrustManager()     // Catch:{ IOException -> 0x0014 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.transport.X509Util.clearTestRootCertificates():void");
    }

    private static void ensureInitialized() {
        MethodCollector.m26663i(2382);
        synchronized (sLock) {
            try {
                ensureInitializedLocked();
            } finally {
                MethodCollector.m26664o(2382);
            }
        }
    }

    static {
        Covode.recordClassIndex(100714);
    }

    public static void reloadDefaultTrustManager() {
        MethodCollector.m26663i(2430);
        synchronized (sLock) {
            try {
                sDefaultTrustManager = null;
                sSystemTrustAnchorCache = null;
                ensureInitializedLocked();
            } finally {
                MethodCollector.m26664o(2430);
            }
        }
        try {
            if (LibraryLoader.loadLibrary("ttquic")) {
                nativeNotifyKeyChainChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(2430);
        }
    }

    private static void ensureInitializedLocked() {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = instance;
                try {
                    instance.load(null);
                } catch (IOException unused) {
                }
                sSystemCertificateDirectory = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTestKeyStore == null) {
            KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = instance2;
            try {
                instance2.load(null);
            } catch (IOException unused3) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new TrustStorageListener(null);
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            m147798x32589caf(ContextUtils.getApplicationContext(), sTrustStorageListener, intentFilter);
        }
    }

    public static void setDisableNativeCodeForTest(boolean z) {
        sDisableNativeCodeForTest = z;
    }

    /* renamed from: com.ss.avframework.transport.X509Util$X509TrustManagerIceCreamSandwich */
    static final class X509TrustManagerIceCreamSandwich implements X509TrustManagerImplementation {
        private final X509TrustManager mTrustManager;

        static {
            Covode.recordClassIndex(100717);
        }

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509TrustManager) {
            this.mTrustManager = x509TrustManager;
        }

        @Override // com.p2082ss.avframework.transport.X509Util.X509TrustManagerImplementation
        public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
            this.mTrustManager.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.transport.X509Util$X509TrustManagerJellyBean */
    public static final class X509TrustManagerJellyBean implements X509TrustManagerImplementation {
        private final X509TrustManagerExtensions mTrustManagerExtensions;

        static {
            Covode.recordClassIndex(100719);
        }

        public X509TrustManagerJellyBean(X509TrustManager x509TrustManager) {
            this.mTrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.p2082ss.avframework.transport.X509Util.X509TrustManagerImplementation
        public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
            return this.mTrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        MethodCollector.m26663i(2432);
        ensureInitialized();
        X509Certificate x509Certificate = (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        MethodCollector.m26664o(2432);
        return x509Certificate;
    }

    public static void addTestRootCertificate(byte[] bArr) {
        MethodCollector.m26663i(2435);
        ensureInitialized();
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            try {
                sTestKeyStore.setCertificateEntry("root_cert_" + Integer.toString(sTestKeyStore.size()), createCertificateFromBytes);
                reloadTestTrustManager();
            } finally {
                MethodCollector.m26664o(2435);
            }
        }
    }

    private static String hashPrincipal(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        int i = 0;
        do {
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            int i3 = 3 - i;
            cArr[i2] = cArr2[(digest[i3] >> 4) & 15];
            cArr[i2 + 1] = cArr2[digest[i3] & 15];
            i++;
        } while (i < 4);
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean verifyKeyUsage(java.security.cert.X509Certificate r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.transport.X509Util.verifyKeyUsage(java.security.cert.X509Certificate):boolean");
    }

    private static X509TrustManagerImplementation createTrustManager(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    return new X509TrustManagerJellyBean((X509TrustManager) trustManager);
                } catch (IllegalArgumentException e) {
                    m147795x763f054a("X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e);
                }
            }
        }
        m147795x763f054a("X509Util", "Could not find suitable trust manager");
        return null;
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = hashPrincipal + '.' + i;
            if (!new File(sSystemCertificateDirectory, str).exists()) {
                return false;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:".concat(String.valueOf(str)));
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    m147795x763f054a("X509Util", "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: com_ss_avframework_transport_X509Util_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m147794x8109258b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    /* renamed from: com_ss_avframework_transport_X509Util_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m147798x32589caf(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m147794x8109258b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.transport.X509Util.m147798x32589caf(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        List<X509Certificate> list;
        MethodCollector.m26663i(2486);
        if (!(bArr == null || bArr.length == 0)) {
            boolean z = false;
            if (bArr[0] != null) {
                try {
                    ensureInitialized();
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(createCertificateFromBytes(bArr[0]));
                        for (int i = 1; i < bArr.length; i++) {
                            try {
                                arrayList.add(createCertificateFromBytes(bArr[i]));
                            } catch (CertificateException unused) {
                                m147797x763f055c("X509Util", "intermediate " + i + " failed parsing");
                            }
                        }
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            x509CertificateArr[0].checkValidity();
                            if (!verifyKeyUsage(x509CertificateArr[0])) {
                                AndroidCertVerifyResult androidCertVerifyResult = new AndroidCertVerifyResult(CertVerifyStatusAndroid.INCORRECT_KEY_USAGE);
                                MethodCollector.m26664o(2486);
                                return androidCertVerifyResult;
                            }
                            synchronized (sLock) {
                                try {
                                    X509TrustManagerImplementation x509TrustManagerImplementation = sDefaultTrustManager;
                                    if (x509TrustManagerImplementation == null) {
                                        return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
                                    }
                                    try {
                                        list = x509TrustManagerImplementation.checkServerTrusted(x509CertificateArr, str, str2);
                                    } catch (CertificateException e) {
                                        try {
                                            list = sTestTrustManager.checkServerTrusted(x509CertificateArr, str, str2);
                                        } catch (CertificateException unused2) {
                                            m147796x763f054e("X509Util", "Failed to validate the certificate chain, error: " + e.getMessage());
                                            AndroidCertVerifyResult androidCertVerifyResult2 = new AndroidCertVerifyResult(CertVerifyStatusAndroid.NO_TRUSTED_ROOT);
                                            MethodCollector.m26664o(2486);
                                            return androidCertVerifyResult2;
                                        }
                                    }
                                    if (list.size() > 0) {
                                        z = isKnownRoot(list.get(list.size() - 1));
                                    }
                                    AndroidCertVerifyResult androidCertVerifyResult3 = new AndroidCertVerifyResult(CertVerifyStatusAndroid.f191998OK, z, list);
                                    MethodCollector.m26664o(2486);
                                    return androidCertVerifyResult3;
                                } finally {
                                    MethodCollector.m26664o(2486);
                                }
                            }
                        } catch (CertificateExpiredException unused3) {
                            AndroidCertVerifyResult androidCertVerifyResult4 = new AndroidCertVerifyResult(CertVerifyStatusAndroid.EXPIRED);
                            MethodCollector.m26664o(2486);
                            return androidCertVerifyResult4;
                        } catch (CertificateNotYetValidException unused4) {
                            AndroidCertVerifyResult androidCertVerifyResult5 = new AndroidCertVerifyResult(CertVerifyStatusAndroid.NOT_YET_VALID);
                            MethodCollector.m26664o(2486);
                            return androidCertVerifyResult5;
                        } catch (CertificateException unused5) {
                            AndroidCertVerifyResult androidCertVerifyResult6 = new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
                            MethodCollector.m26664o(2486);
                            return androidCertVerifyResult6;
                        }
                    } catch (CertificateException unused6) {
                        AndroidCertVerifyResult androidCertVerifyResult7 = new AndroidCertVerifyResult(CertVerifyStatusAndroid.UNABLE_TO_PARSE);
                        MethodCollector.m26664o(2486);
                        return androidCertVerifyResult7;
                    }
                } catch (CertificateException unused7) {
                    AndroidCertVerifyResult androidCertVerifyResult8 = new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
                    MethodCollector.m26664o(2486);
                    return androidCertVerifyResult8;
                }
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        MethodCollector.m26664o(2486);
        throw illegalArgumentException;
    }
}
