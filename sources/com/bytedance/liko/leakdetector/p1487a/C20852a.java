package com.bytedance.liko.leakdetector.p1487a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.liko.leakdetector.a.a */
public final class C20852a {

    /* renamed from: a */
    private static boolean f49309a;

    static {
        Covode.recordClassIndex(24431);
    }

    /* renamed from: b */
    private static File m39202b(Context context) {
        File file = new File(m39203c(context), "leakcanary");
        if (m39201a(file)) {
            return file;
        }
        C89219l.m154719c("Could not create heap dump directory in app storage: [${storageDirectory.absolutePath}]", "");
        return null;
    }

    /* renamed from: c */
    private static File m39203c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: d */
    private static boolean m39204d(Context context) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23 || f49309a) {
            return true;
        }
        if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        f49309a = z;
        return z;
    }

    /* renamed from: a */
    private static File m39198a(Context context) {
        File file = new File(m39199a(context, "liko"), "leakcanary-" + context.getPackageName());
        if (m39201a(file)) {
            return file;
        }
        C89219l.m154719c("Could not create heap dump directory in externalStorageDirectory: [${externalStorageDirectory.absolutePath}]", "");
        return null;
    }

    /* renamed from: a */
    private static boolean m39201a(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static File m39199a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: a */
    public static File m39200a(boolean z, Context context) {
        File file;
        if (z || !m39204d(context)) {
            file = m39202b(context);
        } else {
            file = m39198a(context);
        }
        if (file != null) {
            return new File(file, ".dump.hporf");
        }
        return null;
    }
}
