package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.az */
public final class C34397az {

    /* renamed from: a */
    private static final String[] f81316a = {"files/offlineX", "app_assets", "cache/gift_assets", "cache/feedcache"};

    static {
        Covode.recordClassIndex(41341);
    }

    /* renamed from: a */
    public static C34398a m70386a() {
        try {
            Context a = C17867d.m33078a();
            if (a == null) {
                return new C34398a(Long.MAX_VALUE, Long.MAX_VALUE, 1.0d);
            }
            File a2 = m70387a(a);
            if (a2 == null || !a2.exists()) {
                return new C34398a(Long.MAX_VALUE, Long.MAX_VALUE, 1.0d);
            }
            int i = Build.VERSION.SDK_INT;
            StatFs statFs = new StatFs(a2.getPath());
            long availableBytes = statFs.getAvailableBytes();
            long totalBytes = statFs.getTotalBytes();
            double d = (double) availableBytes;
            Double.isNaN(d);
            double d2 = (double) totalBytes;
            Double.isNaN(d2);
            return new C34398a(availableBytes, totalBytes, (d * 1.0d) / d2);
        } catch (Throwable unused) {
            return new C34398a(Long.MAX_VALUE, Long.MAX_VALUE, 1.0d);
        }
    }

    /* renamed from: b */
    public static boolean m70389b() {
        File a;
        Context a2 = C17867d.m33078a();
        if (a2 == null || (a = m70387a(a2)) == null) {
            return false;
        }
        String parent = a.getParent();
        if (TextUtils.isEmpty(parent)) {
            return false;
        }
        String str = parent + "/";
        String[] strArr = f81316a;
        int length = strArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            File file = new File(str + strArr[i]);
            if (file.exists()) {
                z |= m70388a(file);
            }
        }
        return z;
    }

    /* renamed from: a */
    private static File m70387a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    private static boolean m70388a(File file) {
        if (file.isFile()) {
            return m70390b(file);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        for (File file2 : listFiles) {
            m70388a(file2);
        }
        return m70390b(file);
    }

    /* renamed from: b */
    private static boolean m70390b(File file) {
        MethodCollector.m26663i(4931);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4931);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4931);
        return delete;
    }

    /* renamed from: com.ss.android.ugc.aweme.az$a */
    public static class C34398a {

        /* renamed from: a */
        public final long f81317a;

        /* renamed from: b */
        public final long f81318b;

        /* renamed from: c */
        public final double f81319c;

        static {
            Covode.recordClassIndex(41342);
        }

        public C34398a(long j, long j2, double d) {
            this.f81317a = j;
            this.f81318b = j2;
            this.f81319c = d;
        }
    }
}
