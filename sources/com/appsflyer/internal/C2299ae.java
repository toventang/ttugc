package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* renamed from: com.appsflyer.internal.ae */
public final class C2299ae {

    /* renamed from: ǃ */
    private static String f6974;

    static {
        Covode.recordClassIndex(2551);
    }

    C2299ae() {
    }

    /* renamed from: com_appsflyer_internal_ae_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m7058x1ca4bd3e(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: com_appsflyer_internal_ae_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m7059xd76b2562(File file) {
        MethodCollector.m26663i(139);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(139);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(139);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A[SYNTHETIC, Splitter:B:19:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[SYNTHETIC, Splitter:B:31:0x0048] */
    /* renamed from: Ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m7060(java.io.File r6) {
        /*
            java.lang.String r5 = "Exception while trying to close the InstallationFile"
            r4 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0027 }
            java.lang.String r0 = "r"
            r3.<init>(r6, r0)     // Catch:{ IOException -> 0x0027 }
            long r1 = r3.length()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            int r0 = (int) r1     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.readFully(r4)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.close()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x0039
        L_0x001b:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r5, r0)
            goto L_0x0039
        L_0x0020:
            r1 = move-exception
            r4 = r3
            goto L_0x0046
        L_0x0023:
            r1 = move-exception
            r2 = r4
            r4 = r3
            goto L_0x0029
        L_0x0027:
            r1 = move-exception
            r2 = r4
        L_0x0029:
            java.lang.String r0 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.afErrorLog(r0, r1)     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0038
            r4.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r5, r0)
        L_0x0038:
            r4 = r2
        L_0x0039:
            java.lang.String r1 = new java.lang.String
            if (r4 == 0) goto L_0x0041
        L_0x003d:
            r1.<init>(r4)
            return r1
        L_0x0041:
            r0 = 0
            byte[] r4 = new byte[r0]
            goto L_0x003d
        L_0x0045:
            r1 = move-exception
        L_0x0046:
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r5, r0)
        L_0x0050:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2299ae.m7060(java.io.File):java.lang.String");
    }

    /* renamed from: Ι */
    public static synchronized String m7061(WeakReference<Context> weakReference) {
        synchronized (C2299ae.class) {
            MethodCollector.m26663i(4930);
            if (weakReference.get() == null) {
                String str = f6974;
                MethodCollector.m26664o(4930);
                return str;
            }
            if (f6974 == null) {
                String str2 = null;
                if (weakReference.get() != null) {
                    str2 = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str2 != null) {
                    f6974 = str2;
                } else {
                    try {
                        File file = new File(m7058x1ca4bd3e(weakReference.get()), "AF_INSTALLATION");
                        if (!file.exists()) {
                            f6974 = new StringBuilder().append(System.currentTimeMillis()).append("-").append(Math.abs(new SecureRandom().nextLong())).toString();
                        } else {
                            f6974 = m7060(file);
                            m7059xd76b2562(file);
                        }
                        String str3 = f6974;
                        SharedPreferences.Editor edit = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str3);
                        edit.apply();
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (f6974 != null) {
                    AppsFlyerProperties.getInstance().set("uid", f6974);
                }
            }
            String str4 = f6974;
            MethodCollector.m26664o(4930);
            return str4;
        }
    }
}
