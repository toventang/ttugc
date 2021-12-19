package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26915bf;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ac */
public final class C26769ac {

    /* renamed from: a */
    static final C26909b f63426a = new C26909b("AssetPackStorage");

    /* renamed from: c */
    private static final long f63427c = TimeUnit.DAYS.toMillis(14);

    /* renamed from: d */
    private static final long f63428d = TimeUnit.DAYS.toMillis(28);

    /* renamed from: b */
    final C26827cg f63429b;

    /* renamed from: e */
    private final Context f63430e;

    static {
        Covode.recordClassIndex(32244);
    }

    C26769ac(Context context, C26827cg cgVar) {
        this.f63430e = context;
        this.f63429b = cgVar;
    }

    /* renamed from: a */
    private final File m53175a(String str, int i) {
        return new File(mo44441a(str), String.valueOf(i));
    }

    /* renamed from: a */
    static void m53176a(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b = m53177b(file);
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(String.valueOf(b)) && !file2.getName().equals("stale.tmp")) {
                    m53178c(file2);
                }
            }
        }
    }

    /* renamed from: b */
    static long m53177b(File file) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException unused) {
            f63426a.mo44597c("Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: c */
    static boolean m53178c(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= m53178c(file2);
            }
        } else {
            z = true;
        }
        return m53180d(file) && true == z;
    }

    /* renamed from: d */
    private final File m53179d() {
        return new File(mo44450c(), "_tmp");
    }

    /* renamed from: h */
    private final File m53181h(String str, int i, long j) {
        return new File(new File(new File(m53179d(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo44441a(String str) {
        return new File(mo44450c(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo44442a(String str, int i, long j) {
        return new File(m53175a(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo44443a(String str, int i, long j, String str2) {
        return new File(new File(new File(m53181h(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo44445b(String str) {
        return (int) m53177b(mo44441a(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo44446b(String str, int i, long j) {
        return new File(mo44442a(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo44447b(String str, int i, long j, String str2) {
        return new File(new File(new File(m53181h(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<File> mo44448b() {
        ArrayList arrayList = new ArrayList();
        try {
            if (mo44450c().exists()) {
                if (mo44450c().listFiles() != null) {
                    File[] listFiles = mo44450c().listFiles();
                    for (File file : listFiles) {
                        if (!file.getCanonicalPath().equals(m53179d().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f63426a.mo44596b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo44449c(String str) {
        return m53177b(m53175a(str, mo44445b(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo44450c() {
        return new File(m53174a(this.f63430e), "assetpacks");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo44451c(String str, int i, long j) {
        return new File(m53181h(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo44452c(String str, int i, long j, String str2) {
        return new File(mo44456e(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final File mo44453d(String str, int i, long j) {
        return new File(mo44451c(str, i, j), "merge.tmp");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final File mo44454d(String str, int i, long j, String str2) {
        return new File(mo44456e(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo44455e(String str, int i, long j) {
        MethodCollector.m26663i(12945);
        File d = mo44453d(str, i, j);
        if (!d.exists()) {
            MethodCollector.m26664o(12945);
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(d);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("numberOfMerges"));
                    MethodCollector.m26664o(12945);
                    return parseInt;
                } catch (NumberFormatException e) {
                    C26787au auVar = new C26787au("Merge checkpoint file corrupt.", e);
                    MethodCollector.m26664o(12945);
                    throw auVar;
                }
            } else {
                C26787au auVar2 = new C26787au("Merge checkpoint file corrupt.");
                MethodCollector.m26664o(12945);
                throw auVar2;
            }
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        MethodCollector.m26664o(12945);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final File mo44456e(String str, int i, long j, String str2) {
        return new File(mo44457f(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final File mo44457f(String str, int i, long j) {
        return new File(new File(m53181h(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo44458g(String str, int i, long j) {
        if (m53181h(str, i, j).exists()) {
            m53178c(m53181h(str, i, j));
        }
    }

    /* renamed from: d */
    private static boolean m53180d(File file) {
        MethodCollector.m26663i(13037);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13037);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13037);
        return delete;
    }

    /* renamed from: a */
    private static File m53174a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0 A[Catch:{ IOException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1 A[Catch:{ IOException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x000f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AbstractC26793b> mo44444a() {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C26769ac.mo44444a():java.util.Map");
    }
}
