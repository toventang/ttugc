package com.bytedance.crash.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;

/* renamed from: com.bytedance.crash.util.r */
public final class C14069r {

    /* renamed from: a */
    private static String f34248a;

    /* renamed from: b */
    private static File f34249b;

    /* renamed from: c */
    private static File f34250c;

    /* renamed from: d */
    private static File f34251d;

    /* renamed from: e */
    private static File f34252e;

    /* renamed from: f */
    private static File f34253f;

    static {
        Covode.recordClassIndex(16136);
    }

    /* renamed from: a */
    public static File m25618a() {
        File file = f34250c;
        if (file == null) {
            return m25636f(C13933m.f33936a);
        }
        return file;
    }

    /* renamed from: b */
    public static File m25623b() {
        if (f34253f == null) {
            File file = new File(new File(m25640h(C13933m.f33936a), m25630c()), "trace");
            f34253f = file;
            file.getParentFile().mkdirs();
        }
        return f34253f;
    }

    /* renamed from: c */
    private static String m25630c() {
        return "anr_" + C13933m.m25228d();
    }

    /* renamed from: a */
    public static File m25621a(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: b */
    public static File m25625b(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: c */
    public static File m25628c(File file) {
        return new File(file, "malloc.txt");
    }

    /* renamed from: d */
    public static File m25632d(File file) {
        return new File(file, "pthreads.txt");
    }

    /* renamed from: b */
    public static File m25624b(Context context) {
        if (context == null) {
            context = C13933m.f33936a;
        }
        return new File(m25642j(context), "npth/GwpReport");
    }

    /* renamed from: c */
    public static File m25627c(Context context) {
        return new File(m25642j(context), "npth/availableCheck");
    }

    /* renamed from: d */
    public static File m25631d(Context context) {
        return new File(m25642j(context), "npth");
    }

    /* renamed from: e */
    public static File m25635e(String str) {
        return new File(m25620a(C13933m.f33936a, str), "pthreads.txt");
    }

    /* renamed from: f */
    public static File m25637f(String str) {
        return new File(m25620a(C13933m.f33936a, str), "rountines.txt");
    }

    /* renamed from: g */
    public static File m25639g(String str) {
        return new File(m25620a(C13933m.f33936a, str), "leakd_threads.txt");
    }

    /* renamed from: h */
    public static File m25640h(Context context) {
        return new File(m25642j(context), "npth/CrashCommonLog");
    }

    /* renamed from: a */
    public static File m25619a(Context context) {
        return new File(m25642j(context), "npth/CrashLogJava");
    }

    /* renamed from: b */
    public static File m25626b(String str) {
        return new File(m25620a(C13933m.f33936a, str), "fds.txt");
    }

    /* renamed from: c */
    public static File m25629c(String str) {
        return new File(m25620a(C13933m.f33936a, str), "threads.txt");
    }

    /* renamed from: d */
    public static File m25633d(String str) {
        return new File(m25620a(C13933m.f33936a, str), "meminfo.txt");
    }

    /* renamed from: e */
    public static File m25634e(Context context) {
        if (f34249b == null) {
            if (context == null) {
                context = C13933m.f33936a;
            }
            f34249b = new File(m25642j(context), "npth/asan");
        }
        return f34249b;
    }

    /* renamed from: f */
    public static File m25636f(Context context) {
        if (f34250c == null) {
            if (context == null) {
                context = C13933m.f33936a;
            }
            f34250c = new File(m25642j(context), "npth/CrashLogNative");
        }
        return f34250c;
    }

    /* renamed from: k */
    private static File m25643k(Context context) {
        if (f34252e == null) {
            f34252e = new File(m25640h(context), "asdawd");
        }
        return f34252e;
    }

    /* renamed from: g */
    public static File m25638g(Context context) {
        if (f34251d == null) {
            f34251d = new File(m25642j(context) + '/' + "npth/CrashCommonLog/" + C13933m.m25229e());
        }
        return f34251d;
    }

    /* renamed from: i */
    public static File m25641i(Context context) {
        return new File(m25642j(context) + '/' + "issueCrashTimes/current.times");
    }

    /* renamed from: j */
    public static String m25642j(Context context) {
        if (context == null) {
            C13933m.f33942g.isDebugMode();
            return "";
        }
        if (TextUtils.isEmpty(f34248a)) {
            try {
                if (C58016d.f132222c == null || !C58016d.f132224e) {
                    C58016d.f132222c = context.getFilesDir();
                }
                f34248a = C58016d.f132222c.getAbsolutePath();
            } catch (Exception e) {
                f34248a = "";
                e.printStackTrace();
            }
        }
        return f34248a;
    }

    /* renamed from: a */
    public static File m25622a(String str) {
        return new File(m25643k(C13933m.f33936a), str);
    }

    /* renamed from: a */
    public static File m25620a(Context context, String str) {
        return new File(m25642j(context) + '/' + "npth/CrashCommonLog/" + str);
    }
}
