package com.bytedance.crash.p928f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.f.b */
public final class C13874b {

    /* renamed from: a */
    private static final List<String> f33788a = new ArrayList();

    static {
        Covode.recordClassIndex(15933);
    }

    /* renamed from: a */
    public static String m25098a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String a = m25099a(applicationInfo.sourceDir, str, file);
        if (a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 21) {
            return a;
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            a = m25099a(str2, str, file);
            if (a == null) {
                return null;
            }
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m25099a(java.lang.String r12, java.lang.String r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p928f.C13874b.m25099a(java.lang.String, java.lang.String, java.io.File):java.lang.String");
    }
}
