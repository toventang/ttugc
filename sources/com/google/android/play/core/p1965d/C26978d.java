package com.google.android.play.core.p1965d;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.p1963b.C26958r;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.d.d */
public final class C26978d {

    /* renamed from: a */
    private final long f63865a;

    /* renamed from: b */
    private final Context f63866b;

    /* renamed from: c */
    private File f63867c;

    static {
        Covode.recordClassIndex(32454);
    }

    public C26978d(Context context) {
        this.f63866b = context;
        this.f63865a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: a */
    public static File m53601a(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: b */
    static void m53602b(File file) {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: c */
    private static void m53603c(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m53603c(file2);
            }
        }
        if (file.exists() && !m53605d(file)) {
            throw new IOException(C1764a.m5928a("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: d */
    public static String m53604d(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: f */
    private final File m53606f(String str) {
        File a = m53601a(mo44686e(), str);
        m53602b(a);
        return a;
    }

    /* renamed from: g */
    private final File m53607g() {
        if (this.f63867c == null) {
            Context context = this.f63866b;
            if (context != null) {
                this.f63867c = m53600a(context);
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f63867c, "splitcompat");
        m53602b(file);
        return file;
    }

    /* renamed from: a */
    public final File mo44677a(String str) {
        return m53601a(mo44683c(), m53604d(str));
    }

    /* renamed from: a */
    public final File mo44678a(String str, String str2) {
        return m53601a(m53606f(str), str2);
    }

    /* renamed from: a */
    public final void mo44679a() {
        File g = m53607g();
        String[] list = g.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f63865a))) {
                    File file = new File(g, str);
                    String.valueOf(String.valueOf(file)).length();
                    m53603c(file);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44680a(File file) {
        C26958r.m53563a(file.getParentFile().getParentFile().equals(mo44686e()), "File to remove is not a native library");
        m53603c(file);
    }

    /* renamed from: b */
    public final File mo44681b() {
        File file = new File(mo44685d(), "unverified-splits");
        m53602b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44682b(String str) {
        m53603c(m53606f(str));
    }

    /* renamed from: c */
    public final File mo44683c() {
        File file = new File(mo44685d(), "verified-splits");
        m53602b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Set<File> mo44684c(String str) {
        HashSet hashSet = new HashSet();
        File[] listFiles = m53606f(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    public final File mo44685d() {
        File file = new File(m53607g(), Long.toString(this.f63865a));
        m53602b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final File mo44686e() {
        File file = new File(mo44685d(), "native-libraries");
        m53602b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo44687e(String str) {
        m53603c(mo44677a(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Set<C26992r> mo44688f() {
        File c = mo44683c();
        HashSet hashSet = new HashSet();
        File[] listFiles = c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new C26992r(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    private static boolean m53605d(File file) {
        MethodCollector.m26663i(13918);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13918);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13918);
        return delete;
    }

    /* renamed from: a */
    private static File m53600a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }
}
