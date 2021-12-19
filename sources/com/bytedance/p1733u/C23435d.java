package com.bytedance.p1733u;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.u.d */
public final class C23435d {

    /* renamed from: a */
    public static volatile AbstractC23439g<C23437e> f55578a;

    /* renamed from: b */
    static List<AbstractC23430a> f55579b = new ArrayList();

    /* renamed from: c */
    public static AbstractC23434c f55580c;

    /* renamed from: d */
    private static long f55581d = 1024;

    static {
        Covode.recordClassIndex(27395);
    }

    /* renamed from: b */
    public static List<AbstractC23430a> m44118b() {
        AbstractC23434c cVar = f55580c;
        if (cVar == null) {
            return f55579b;
        }
        f55579b.addAll(cVar.mo38206a());
        return f55579b;
    }

    /* renamed from: com.bytedance.u.d$1 */
    static /* synthetic */ class C234361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55582a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 27396(0x6b04, float:3.839E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.u.f[] r0 = com.bytedance.p1733u.EnumC23438f.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.p1733u.C23435d.C234361.f55582a = r2
                com.bytedance.u.f r0 = com.bytedance.p1733u.EnumC23438f.PREFER_SD_CARD     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.p1733u.C23435d.C234361.f55582a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.u.f r0 = com.bytedance.p1733u.EnumC23438f.PREFER_EXTERNAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.p1733u.C23435d.C234361.f55582a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.u.f r0 = com.bytedance.p1733u.EnumC23438f.PREFER_PRIVATE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1733u.C23435d.C234361.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m44115a() {
        if (f55578a == null || f55578a.mo38207a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m44114a(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public static void m44113a(AbstractC23430a aVar) {
        MethodCollector.m26663i(7592);
        synchronized (f55579b) {
            try {
                f55579b.add(aVar);
            } finally {
                MethodCollector.m26664o(7592);
            }
        }
    }

    /* renamed from: c */
    private static File m44119c(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: d */
    private static File m44120d(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: e */
    private static File m44121e(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: f */
    private static File m44122f(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: l */
    private static File m44128l(Context context) {
        try {
            File c = m44119c(context);
            if (c == null || c.getFreeSpace() < f55578a.mo38207a().f55583a) {
                return null;
            }
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static File m44111a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        parentFile.getFreeSpace();
        if (parentFile.getFreeSpace() < f55581d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    /* renamed from: g */
    private static File m44123g(Context context) {
        File a = m44109a(context);
        if (a == null || !a.exists() || a.getFreeSpace() < f55578a.mo38207a().f55585c) {
            return null;
        }
        return a;
    }

    /* renamed from: h */
    private static File m44124h(Context context) {
        File f;
        try {
            if (!"mounted".equals(Environment.getExternalStorageState()) || (f = m44122f(context)) == null || !f.exists() || f.getFreeSpace() < f55578a.mo38207a().f55584b) {
                return null;
            }
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    private static File m44125i(Context context) {
        try {
            File d = m44120d(context);
            if (d == null || !d.exists() || d.getFreeSpace() < f55578a.mo38207a().f55583a) {
                return null;
            }
            return d;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    private static File m44126j(Context context) {
        File b = m44116b(context);
        if (b == null || !b.exists() || b.getFreeSpace() < f55578a.mo38207a().f55585c) {
            return null;
        }
        return b;
    }

    /* renamed from: k */
    private static File m44127k(Context context) {
        File e;
        try {
            if (!"mounted".equals(Environment.getExternalStorageState()) || (e = m44121e(context)) == null || e.getFreeSpace() < f55578a.mo38207a().f55584b) {
                return null;
            }
            return e;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static File m44109a(Context context) {
        File[] fileArr;
        C23431b a = C23431b.m44101a(context);
        if (a != null && a.mo38203a() && !TextUtils.isEmpty(a.f55572c)) {
            int i = Build.VERSION.SDK_INT;
            try {
                fileArr = context.getExternalFilesDirs(null);
            } catch (Exception e) {
                e.printStackTrace();
                fileArr = null;
            }
            File a2 = m44112a(fileArr, context);
            if (a2 != null) {
                return a2;
            }
            try {
                m44122f(context);
                File file = new File(a.f55572c + "/Android/data/" + context.getPackageName() + "/files");
                m44114a(file);
                if (file.exists()) {
                    return file;
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static File m44116b(Context context) {
        File[] fileArr;
        C23431b a = C23431b.m44101a(context);
        if (a != null && a.mo38203a()) {
            int i = Build.VERSION.SDK_INT;
            try {
                fileArr = context.getExternalCacheDirs();
            } catch (Exception e) {
                e.printStackTrace();
                fileArr = null;
            }
            File a2 = m44112a(fileArr, context);
            if (a2 != null) {
                return a2;
            }
            try {
                m44121e(context);
                File file = new File(a.f55572c + "/Android/data/" + context.getPackageName() + "/cache");
                m44114a(file);
                if (file.exists()) {
                    return file;
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static File m44110a(Context context, EnumC23438f fVar) {
        File i;
        if (!m44115a()) {
            return null;
        }
        int i2 = C234361.f55582a[fVar.ordinal()];
        if (i2 == 1) {
            File g = m44123g(context);
            if (!(g == null && (g = m44124h(context)) == null)) {
                return g;
            }
        } else if (i2 == 2) {
            File h = m44124h(context);
            if (!(h == null && (h = m44123g(context)) == null)) {
                return h;
            }
        } else if (i2 == 3 && !((i = m44125i(context)) == null && (i = m44124h(context)) == null)) {
            return i;
        }
        return m44120d(context);
    }

    /* renamed from: b */
    public static File m44117b(Context context, EnumC23438f fVar) {
        File l;
        if (!m44115a()) {
            return null;
        }
        int i = C234361.f55582a[fVar.ordinal()];
        if (i == 1) {
            File j = m44126j(context);
            if (!(j == null && (j = m44127k(context)) == null)) {
                return j;
            }
        } else if (i == 2) {
            File k = m44127k(context);
            if (!(k == null && (k = m44126j(context)) == null)) {
                return k;
            }
        } else if (i == 3 && !((l = m44128l(context)) == null && (l = m44127k(context)) == null)) {
            return l;
        }
        return m44119c(context);
    }

    /* renamed from: a */
    private static File m44112a(File[] fileArr, Context context) {
        C23431b a;
        if (fileArr != null && (a = C23431b.m44101a(context)) != null && a.mo38203a() && !TextUtils.isEmpty(a.f55572c)) {
            for (File file : fileArr) {
                if (!(file == null || file.getPath() == null || !file.getPath().contains(a.f55572c))) {
                    m44114a(file);
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }
}
