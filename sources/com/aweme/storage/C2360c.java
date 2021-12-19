package com.aweme.storage;

import android.content.Context;
import android.os.Build;
import com.aweme.storage.C2364d;
import com.aweme.storage.p108a.C2355a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1733u.AbstractC23430a;
import com.bytedance.p1733u.C23431b;
import com.bytedance.p1733u.C23435d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.aweme.storage.c */
public final class C2360c {

    /* renamed from: a */
    public static volatile boolean f7177a;

    /* renamed from: b */
    public static volatile boolean f7178b;

    /* renamed from: c */
    static boolean f7179c;

    /* renamed from: d */
    public static C2354a f7180d;

    /* renamed from: e */
    public static AbstractC2369g f7181e;

    /* renamed from: f */
    public static List<C2371i> f7182f;

    /* renamed from: g */
    public static AbstractC2368f f7183g;

    /* renamed from: h */
    public static C2370h f7184h;

    /* renamed from: i */
    private static long f7185i;

    static {
        Covode.recordClassIndex(2638);
    }

    /* renamed from: a */
    private static void m7177a() {
        List<C2371i> list = f7182f;
        if (!(list == null || list.isEmpty())) {
            for (C2371i iVar : f7182f) {
                if (iVar != null) {
                    iVar.mo6535a();
                }
            }
        }
    }

    /* renamed from: a */
    public static Context m7176a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    static boolean m7182b(Context context) {
        C2370h hVar = f7184h;
        if (hVar != null && hVar.f7207g && C2367e.m7207c(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static void m7184d(Context context) {
        if (context != null) {
            final Context a = m7176a(context);
            C1731i.m5640b(new Callable<Object>() {
                /* class com.aweme.storage.C2360c.CallableC23622 */

                static {
                    Covode.recordClassIndex(2640);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context = a;
                    if (context == null) {
                        return null;
                    }
                    C34822d.m71158a(context, "clean_storage_pref", 0).edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
                    C2360c.f7177a = false;
                    return null;
                }
            }, C40780g.m82241a());
        }
    }

    /* renamed from: g */
    private static File m7187g(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: h */
    private static File m7188h(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: c */
    static void m7183c(Context context) {
        if (C2355a.f7165a) {
            for (AbstractC23430a aVar : C23435d.m44118b()) {
                aVar.mo38201d();
            }
        }
        AbstractC2369g gVar = f7181e;
        if (gVar != null) {
            gVar.mo6533a(m7182b(context));
        }
        m7186f(context);
        AbstractC2369g gVar2 = f7181e;
        if (gVar2 != null && gVar2.mo6534b()) {
            m7185e(context);
        }
    }

    /* renamed from: i */
    private static long m7189i(Context context) {
        String[] strArr;
        long j = 0;
        try {
            String str = context.getApplicationInfo().publicSourceDir;
            if (str != null) {
                File file = new File(str);
                if (file.exists()) {
                    j = file.length();
                }
            }
            if (Build.VERSION.SDK_INT >= 21 && (strArr = context.getApplicationInfo().splitPublicSourceDirs) != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        j += file2.length();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return j;
    }

    /* renamed from: e */
    static void m7185e(Context context) {
        boolean z;
        if (f7183g != null) {
            try {
                m7191k(context);
                m7177a();
                JSONObject jSONObject = new JSONObject();
                long a = C2367e.m7202a(m7187g(context).getParent());
                long a2 = C2367e.m7202a(m7188h(context).getParent());
                long j = 0;
                File b = C23435d.m44116b(context);
                if (b != null) {
                    j = C2367e.m7202a(b.getParent());
                }
                jSONObject.put("private_size", a);
                jSONObject.put("external_size", a2);
                jSONObject.put("sdcard_size", j);
                jSONObject.put("total_size", a + a2);
                jSONObject.put("device_size", C2367e.m7200a(context));
                jSONObject.put("available_size", C2367e.m7204b(context));
                jSONObject.put("apk_size", m7189i(context));
                if (!C23435d.m44115a() || C23431b.m44101a(context) == null || !C23431b.m44101a(context).mo38203a()) {
                    z = false;
                } else {
                    z = true;
                }
                jSONObject.put("strategy_enabled", z);
                C2359b.m7172a(context, jSONObject);
                f7183g.mo6530a("disk_usage", jSONObject);
                m7190j(context);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    private static void m7186f(Context context) {
        C2354a aVar;
        Set<String> a;
        if (!(context == null || m7187g(context) == null || m7187g(context).getParentFile() == null || m7188h(context) == null || m7188h(context).getParentFile() == null || (aVar = f7180d) == null || aVar.f7157b == null || aVar.f7157b.length <= 0)) {
            AbstractC2369g gVar = f7181e;
            if (gVar == null) {
                a = null;
            } else {
                a = gVar.mo6532a();
            }
            String[] strArr = aVar.f7157b;
            for (String str : strArr) {
                if (a != null && !a.contains(str)) {
                    File file = new File(str);
                    if ((m7181a(file, m7187g(context).getParentFile()) || m7181a(file, m7188h(context).getParentFile())) && file.exists()) {
                        if (file.isFile()) {
                            m7180a(file);
                        } else {
                            C2367e.m7205b(file);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private static void m7190j(Context context) {
        if (!(context == null || f7183g == null)) {
            ArrayList<File> arrayList = new ArrayList();
            File g = m7187g(context);
            if (g != null) {
                m7179a(g.getParentFile(), arrayList);
            }
            File h = m7188h(context);
            if (h != null) {
                h = h.getParentFile();
                m7179a(h, arrayList);
            }
            if (arrayList.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    StringBuilder sb = new StringBuilder();
                    for (File file : arrayList) {
                        if (!h.getName().endsWith(".so")) {
                            sb.append(file.getAbsolutePath() + ":" + ((file.length() / 1024) / 1024) + "#");
                        }
                    }
                    jSONObject.put("files", sb.toString());
                } catch (Exception unused) {
                }
                f7183g.mo6530a("large_files_v2", jSONObject);
            }
        }
    }

    /* renamed from: k */
    private static void m7191k(Context context) {
        f7185i = 0;
        if (f7179c && context != null) {
            ArrayList<C2364d.C2365a> arrayList = new ArrayList();
            File g = m7187g(context);
            if (g != null) {
                m7178a(g.getParentFile(), g.getAbsolutePath() + File.separator + "ptree.txt", C2364d.EnumC2366b.p, arrayList);
            }
            File h = m7188h(context);
            if (h != null) {
                m7178a(h.getParentFile(), h.getAbsolutePath() + File.separator + "etree.txt", C2364d.EnumC2366b.e, arrayList);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (C2364d.C2365a aVar : arrayList) {
                    aVar.mo6528b();
                    f7185i += aVar.f7192a;
                    String b = aVar.mo6528b();
                    if (b != null) {
                        jSONObject.put(b.replace("/", "_"), (aVar.f7192a / 1024) / 1024);
                    }
                }
            } catch (Exception unused) {
            }
            AbstractC2368f fVar = f7183g;
            if (fVar != null) {
                fVar.mo6531b("mark_storage", jSONObject);
            }
        }
    }

    /* renamed from: a */
    private static boolean m7180a(File file) {
        MethodCollector.m26663i(3846);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3846);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3846);
        return delete;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m7175a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C2360c.m7175a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    private static void m7179a(File file, List<File> list) {
        if (!(file == null || !file.exists() || list == null)) {
            if (file.isFile()) {
                long j = 50;
                C2354a aVar = f7180d;
                if (aVar != null && aVar.f7163h > 0) {
                    j = (long) f7180d.f7163h;
                }
                if (file.length() > j * 1024 * 1024) {
                    list.add(file);
                    return;
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    m7179a(file2, list);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m7181a(File file, File file2) {
        if (file2 == null) {
            return false;
        }
        try {
            if (file2.getCanonicalPath() == null) {
                return false;
            }
            while (file != null && file.getCanonicalPath() != null) {
                if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                    return true;
                }
                file = file.getParentFile();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m7178a(File file, String str, C2364d.EnumC2366b bVar, List<C2364d.C2365a> list) {
        Throwable th;
        FileNotFoundException e;
        IOException e2;
        Exception e3;
        MethodCollector.m26663i(4016);
        if (str == null) {
            MethodCollector.m26664o(4016);
            return;
        }
        File file2 = new File(str);
        FileOutputStream fileOutputStream = null;
        C2364d.C2365a a = C2364d.m7192a(file, (C2364d.C2365a) null, bVar);
        if (a == null) {
            MethodCollector.m26664o(4016);
            return;
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } else {
            C2364d.C2365a a2 = C2364d.m7193a(str);
            if (a2 == null) {
                MethodCollector.m26664o(4016);
                return;
            }
            C2364d.m7194a(a2, a, list);
        }
        JSONObject c = a.mo6529c();
        try {
            File file3 = new File(str);
            if (!file3.exists()) {
                file3.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileOutputStream2.write(c.toString().getBytes());
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                    MethodCollector.m26664o(4016);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    MethodCollector.m26664o(4016);
                }
            } catch (FileNotFoundException e6) {
                e = e6;
                fileOutputStream = fileOutputStream2;
                e.printStackTrace();
                fileOutputStream.close();
                MethodCollector.m26664o(4016);
            } catch (IOException e7) {
                e2 = e7;
                fileOutputStream = fileOutputStream2;
                e2.printStackTrace();
                fileOutputStream.close();
                MethodCollector.m26664o(4016);
            } catch (Exception e8) {
                e3 = e8;
                fileOutputStream = fileOutputStream2;
                try {
                    e3.printStackTrace();
                    fileOutputStream.close();
                    MethodCollector.m26664o(4016);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileOutputStream.close();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    MethodCollector.m26664o(4016);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                fileOutputStream.close();
                MethodCollector.m26664o(4016);
                throw th;
            }
        } catch (FileNotFoundException e10) {
            e = e10;
            e.printStackTrace();
            fileOutputStream.close();
            MethodCollector.m26664o(4016);
        } catch (IOException e11) {
            e2 = e11;
            e2.printStackTrace();
            fileOutputStream.close();
            MethodCollector.m26664o(4016);
        } catch (Exception e12) {
            e3 = e12;
            e3.printStackTrace();
            fileOutputStream.close();
            MethodCollector.m26664o(4016);
        }
    }
}
