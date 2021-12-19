package com.bytedance.apm.p789q;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.apm.q.a */
public final class C12575a {

    /* renamed from: a */
    public static String f30582a;

    /* renamed from: b */
    private static Boolean f30583b;

    static {
        Covode.recordClassIndex(14392);
    }

    /* renamed from: c */
    private static Context m22625c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static Application m22622a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        return (Application) m22625c(context);
    }

    /* renamed from: b */
    public static boolean m22624b(Context context) {
        boolean z;
        Boolean bool = f30583b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f30583b = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC, Splitter:B:21:0x0047] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22623a(int r5) {
        /*
            java.lang.String r0 = com.bytedance.apm.p789q.C12575a.f30582a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = com.bytedance.apm.p789q.C12575a.f30582a
            return r0
        L_0x000b:
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0044 }
            r2.<init>(r0)     // Catch:{ all -> 0x0044 }
            r3.<init>(r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0045 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0045 }
        L_0x0039:
            com.bytedance.apm.p789q.C12575a.f30582a = r1     // Catch:{ all -> 0x0045 }
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0043:
            return r1
        L_0x0044:
            r3 = r4
        L_0x0045:
            if (r3 == 0) goto L_0x004f
            r3.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p789q.C12575a.m22623a(int):java.lang.String");
    }
}
