package com.p2082ss.android.ugc.aweme.p2690cr;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.cr.e */
public final class C40353e {

    /* renamed from: a */
    private static final String f94530a = File.separator;

    static {
        Covode.recordClassIndex(48154);
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.e$c */
    public static class C40356c {
        @AbstractC27891c(mo46611a = "enabled")

        /* renamed from: a */
        public boolean f94539a;
        @AbstractC27891c(mo46611a = "enable_exception_path")

        /* renamed from: b */
        boolean f94540b;
        @AbstractC27891c(mo46611a = "watch")

        /* renamed from: c */
        List<C40357d> f94541c;
        @AbstractC27891c(mo46611a = "downgrade")

        /* renamed from: d */
        List<C40357d> f94542d;

        static {
            Covode.recordClassIndex(48157);
        }

        public C40356c() {
            this.f94539a = false;
            this.f94540b = false;
            this.f94541c = new ArrayList();
            this.f94542d = null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("enabled=").append(this.f94539a);
            List<C40357d> list = this.f94541c;
            if (list != null && list.size() > 0) {
                for (C40357d dVar : this.f94541c) {
                    sb.append(dVar.toString());
                }
            }
            List<C40357d> list2 = this.f94542d;
            if (list2 != null && list2.size() > 0) {
                for (C40357d dVar2 : this.f94542d) {
                    sb.append(dVar2.toString());
                }
            }
            return sb.toString();
        }

        public C40356c(byte b) {
            this.f94539a = false;
            this.f94540b = false;
            ArrayList arrayList = new ArrayList();
            this.f94541c = arrayList;
            this.f94542d = null;
            arrayList.add(new C40357d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cr.e$a */
    public enum EnumC40354a {
        INTERNAL,
        EXTERNAL,
        ROOT;

        static {
            Covode.recordClassIndex(48155);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cr.e$b */
    public enum EnumC40355b {
        BELONG,
        EXACT,
        REGEXP;

        static {
            Covode.recordClassIndex(48156);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.e$d */
    public static class C40357d {
        @AbstractC27891c(mo46611a = "path")

        /* renamed from: a */
        String f94543a = "/(sdcard|storage)/.+.(jpg|jpeg|png|webp|gif|bmp|mp4|flv|mpg|mpeg|mov|webm|avi|wmv)";
        @AbstractC27891c(mo46611a = "mounted")

        /* renamed from: b */
        int f94544b = EnumC40354a.ROOT.ordinal();
        @AbstractC27891c(mo46611a = "operate")

        /* renamed from: c */
        int f94545c = 4;
        @AbstractC27891c(mo46611a = "rule")

        /* renamed from: d */
        int f94546d = EnumC40355b.REGEXP.ordinal();
        @AbstractC27891c(mo46611a = "pass_reg_exp")

        /* renamed from: e */
        String f94547e = "/.*(/aweme|/tt_video|com.ss.android.ugc.aweme|com.bytedance.realx).*";

        static {
            Covode.recordClassIndex(48158);
        }

        public final String toString() {
            return "[path=" + this.f94543a + " mounted=" + this.f94544b + " operate=" + this.f94545c + " rule=" + this.f94546d + " passRegExp=" + this.f94547e + "]";
        }
    }

    /* renamed from: a */
    public static boolean m81542a(C40356c cVar) {
        if (cVar == null) {
            return false;
        }
        return cVar.f94540b;
    }

    /* renamed from: a */
    private static File m81538a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: b */
    private static File m81547b(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: a */
    public static String m81539a(Throwable th) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!(stackTraceElement == null || stackTraceElement.getClassName() == null || stackTraceElement.getMethodName() == null)) {
                    sb.append(stackTraceElement.getClassName()).append('.').append(stackTraceElement.getMethodName()).append(':').append(stackTraceElement.getLineNumber()).append('#');
                }
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m81548b(String str, C40356c cVar) {
        return m81545a(str, cVar);
    }

    /* renamed from: c */
    public static boolean m81549c(String str, C40356c cVar) {
        return m81550d(str, cVar);
    }

    /* renamed from: d */
    private static boolean m81550d(String str, C40356c cVar) {
        if (cVar == null || !cVar.f94539a) {
            return false;
        }
        return m81546a(str, cVar.f94542d);
    }

    /* renamed from: a */
    private static boolean m81543a(C40357d dVar, String str) {
        if (str == null || dVar == null || (dVar.f94547e != null && Pattern.compile(dVar.f94547e).matcher(str).matches())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m81544a(File file, File file2) {
        try {
            String canonicalPath = file.getCanonicalPath();
            if (canonicalPath != null) {
                return canonicalPath.contains(file2.getCanonicalPath());
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m81545a(String str, C40356c cVar) {
        if (cVar == null || !cVar.f94539a) {
            return false;
        }
        return m81546a(str, cVar.f94541c);
    }

    /* renamed from: a */
    private static boolean m81546a(String str, List<C40357d> list) {
        Context a = C17867d.m33078a();
        if (!(a == null || str == null || m81538a(a) == null || m81538a(a).getParentFile() == null || list == null || list.size() <= 0)) {
            for (C40357d dVar : list) {
                if (!(dVar == null || (dVar.f94545c & 4) == 0 || dVar.f94543a == null)) {
                    if (dVar.f94546d != EnumC40355b.REGEXP.ordinal()) {
                        if (dVar.f94544b == EnumC40354a.INTERNAL.ordinal()) {
                            if (m81538a(a) == null || m81538a(a).getParent() == null) {
                                return false;
                            }
                            if (!dVar.f94543a.startsWith(m81538a(a).getParent())) {
                                dVar.f94543a = m81538a(a).getParent() + dVar.f94543a;
                            }
                        } else if (dVar.f94544b == EnumC40354a.EXTERNAL.ordinal()) {
                            if (m81547b(a) == null || m81547b(a).getParent() == null) {
                                return false;
                            }
                            if (!dVar.f94543a.startsWith(m81547b(a).getParent())) {
                                dVar.f94543a = m81547b(a).getParent() + dVar.f94543a;
                            }
                        }
                    }
                    if (dVar.f94546d == EnumC40355b.BELONG.ordinal()) {
                        if (f94530a.equals(dVar.f94543a) && (str.startsWith("/system/") || str.startsWith("/sys/") || str.startsWith("/data/") || str.startsWith("/vendor/") || str.startsWith("/product/") || (a.getPackageName() != null && str.contains(File.separator + a.getPackageName() + File.separator)))) {
                            return false;
                        }
                        if (m81544a(new File(str), new File(dVar.f94543a))) {
                            return m81543a(dVar, str);
                        }
                    }
                    if (dVar.f94546d == EnumC40355b.EXACT.ordinal() && str.equals(dVar.f94543a)) {
                        return m81543a(dVar, str);
                    }
                    if (dVar.f94546d == EnumC40355b.REGEXP.ordinal() && Pattern.compile(dVar.f94543a).matcher(str).matches()) {
                        return m81543a(dVar, str);
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m81540a(File file, Throwable th, String str, boolean z) {
        m81541a(file, th, str, z, null);
    }

    /* renamed from: a */
    public static void m81541a(File file, Throwable th, String str, boolean z, String str2) {
        if (file != null && file.getAbsolutePath() != null) {
            C1731i.m5640b(new CallableC40378f(th, str2, file, str, z), C1731i.f5562a);
        }
    }
}
