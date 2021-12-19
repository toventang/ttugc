package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {

    /* renamed from: ı */
    final Object f6836 = new Object();

    /* renamed from: ǃ */
    private Context f6837;

    /* renamed from: ɩ */
    int f6838;

    /* renamed from: Ι */
    KeyStore f6839;

    /* renamed from: ι */
    String f6840;

    static {
        Covode.recordClassIndex(2489);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final String mo6264() {
        String str;
        MethodCollector.m26663i(459);
        synchronized (this.f6836) {
            try {
                str = this.f6840;
            } finally {
                MethodCollector.m26664o(459);
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final int mo6268() {
        int i;
        MethodCollector.m26663i(462);
        synchronized (this.f6836) {
            try {
                i = this.f6838;
            } finally {
                MethodCollector.m26664o(462);
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ */
    public final String mo6266() {
        MethodCollector.m26663i(458);
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.f6836) {
            try {
                sb.append("KSAppsFlyerId=").append(this.f6840).append(",");
                sb.append("KSAppsFlyerRICounter=").append(this.f6838);
            } catch (Throwable th) {
                MethodCollector.m26664o(458);
                throw th;
            }
        }
        String obj = sb.toString();
        MethodCollector.m26664o(458);
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r5 = r2.split(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r5.length != 3) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4 = r5[1].trim().split("=");
        r1 = r5[2].trim().split("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r4.length != 2) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r1.length != 2) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r8.f6840 = r4[1].trim();
        r8.f6838 = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r2 = th;
     */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6265() {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.mo6265():boolean");
    }

    /* renamed from: Ι */
    private static boolean m6909(String str) {
        return str.startsWith("com.appsflyer");
    }

    public AFKeystoreWrapper(Context context) {
        this.f6837 = context;
        this.f6840 = "";
        this.f6838 = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f6839 = instance;
            instance.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ */
    public final void mo6267(String str) {
        MethodCollector.m26663i(442);
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f6836) {
                try {
                    if (!this.f6839.containsAlias(str)) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            if (!AndroidUtils.m6938()) {
                                algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f6837).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                            }
                        }
                        KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        instance3.initialize(algorithmParameterSpec);
                        instance3.generateKeyPair();
                    } else {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    }
                } finally {
                    MethodCollector.m26664o(442);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Exception ").append(th.getMessage()).append(" occurred").toString(), th);
            MethodCollector.m26664o(442);
        }
    }
}
