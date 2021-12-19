package com.bytedance.crash.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.p933a.C13978a;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14075v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.q */
public final class C14026q {

    /* renamed from: e */
    private static C14026q f34175e;

    /* renamed from: a */
    public final File f34176a;

    /* renamed from: b */
    final File f34177b;

    /* renamed from: c */
    public final File f34178c;

    /* renamed from: d */
    public int f34179d = -1;

    /* renamed from: f */
    private final Context f34180f;

    /* renamed from: g */
    private C14030a f34181g;

    /* renamed from: h */
    private File[] f34182h;

    static {
        Covode.recordClassIndex(16091);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo22539a(java.lang.String r10, long r11, long r13) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.C14026q.mo22539a(java.lang.String, long, long):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[Catch:{ all -> 0x00bb }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ all -> 0x00bb }, LOOP:0: B:28:0x00a4->B:30:0x00ac, LOOP_START, PHI: r2 
      PHI: (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:26:0x00a1, B:30:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22540a(java.util.Map<java.lang.String, java.lang.Object> r15, org.json.JSONArray r16) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.C14026q.mo22540a(java.util.Map, org.json.JSONArray):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.q$a */
    public static class C14030a {

        /* renamed from: a */
        public final long f34187a;

        /* renamed from: b */
        public long f34188b;

        /* renamed from: c */
        public final File f34189c;

        /* renamed from: d */
        long f34190d;

        /* renamed from: e */
        private JSONObject f34191e;

        static {
            Covode.recordClassIndex(16095);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo22547a() {
            return mo22548b().optJSONObject("header");
        }

        /* renamed from: b */
        public final JSONObject mo22548b() {
            if (this.f34191e == null) {
                try {
                    this.f34191e = new JSONObject(C14056j.m25561a(this.f34189c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f34191e == null) {
                    this.f34191e = new JSONObject();
                }
            }
            return this.f34191e;
        }

        private C14030a(File file) {
            this.f34189c = file;
            String[] split = file.getName().split("-|\\.");
            this.f34187a = Long.parseLong(split[0]);
            this.f34188b = Long.parseLong(split[1]);
        }

        /* renamed from: a */
        public static boolean m25443a(File file) {
            MethodCollector.m26663i(3153);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(3153);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(3153);
            return delete;
        }

        /* synthetic */ C14030a(File file, byte b) {
            this(file);
        }
    }

    /* renamed from: a */
    public static C14026q m25432a() {
        if (f34175e == null) {
            f34175e = new C14026q(C13933m.f33936a);
        }
        return f34175e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo22542b() {
        try {
            return C14056j.m25561a(this.f34177b.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: c */
    public final String mo22543c() {
        try {
            return C14056j.m25561a(this.f34178c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final File[] mo22541a(File file) {
        if (this.f34182h == null) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                /* class com.bytedance.crash.runtime.C14026q.C140271 */

                static {
                    Covode.recordClassIndex(16092);
                }

                public final boolean accept(File file, String str) {
                    if (!str.contains(".ctx") || !Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
                        return false;
                    }
                    return true;
                }
            });
            this.f34182h = listFiles;
            if (listFiles == null) {
                this.f34182h = new File[0];
            }
        }
        return this.f34182h;
    }

    private C14026q(Context context) {
        String c;
        String j = C14069r.m25642j(context);
        StringBuilder sb = new StringBuilder("npth/RuntimeContext/");
        if (C14044b.m25518b(context)) {
            c = "main";
        } else {
            c = C14044b.m25520c(context);
        }
        File file = new File(j, sb.append(c.replaceAll(":", "@")).toString());
        if (!file.exists() || (!file.isDirectory() && m25435b(file))) {
            file.mkdirs();
            C13978a.f34067e = true;
        }
        this.f34176a = file;
        this.f34177b = new File(file.getParent(), "did");
        this.f34178c = new File(file.getParent(), "device_uuid");
        this.f34180f = context;
    }

    /* renamed from: b */
    private static boolean m25435b(File file) {
        MethodCollector.m26663i(922);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(922);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(922);
        return delete;
    }

    /* renamed from: a */
    public final int mo22537a(String str) {
        Object opt;
        int i = this.f34179d;
        if (i != -1) {
            return i;
        }
        File[] a = mo22541a(this.f34176a);
        if (a == null || a.length == 0) {
            this.f34179d = 2;
            return 2;
        }
        long j = -1;
        String str2 = null;
        File file = null;
        for (File file2 : a) {
            try {
                long parseLong = Long.parseLong(file2.getName().split("-|\\.")[1]);
                if (parseLong > j) {
                    file = file2;
                    j = parseLong;
                }
            } catch (Throwable unused) {
                if (file == null) {
                    file = file2;
                }
            }
        }
        if (file == null) {
            this.f34179d = 2;
            return 2;
        }
        try {
            C14030a aVar = new C14030a(file, (byte) 0);
            if (!(aVar.mo22547a() == null || (opt = aVar.mo22547a().opt("update_version_code")) == null)) {
                str2 = String.valueOf(opt);
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
                this.f34179d = 1;
                return 1;
            }
        } catch (Throwable unused2) {
            C13933m.f33942g.isDebugMode();
        }
        this.f34179d = 0;
        return 0;
    }

    /* renamed from: a */
    public final JSONArray mo22538a(long j) {
        JSONArray jSONArray;
        C14030a aVar;
        Throwable th;
        String str;
        Iterator<C14030a> it = m25433a(this.f34176a, ".allData").iterator();
        while (true) {
            jSONArray = null;
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (j >= aVar.f34187a && j <= aVar.f34188b) {
                break;
            }
        }
        if (aVar == null) {
            aVar = m25431a(this.f34176a, j, ".allData");
        }
        if (aVar == null) {
            return null;
        }
        try {
            str = C14056j.m25561a(aVar.f34189c.getAbsolutePath(), "\n");
            try {
                jSONArray = new JSONArray(str);
                return jSONArray;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            C13849d.m25014a("NPTH_CATCH", new IOException("content :".concat(String.valueOf(str)), th));
            return jSONArray;
        }
    }

    /* renamed from: a */
    private ArrayList<C14030a> m25433a(File file, final String str) {
        File[] listFiles = file.listFiles(new FilenameFilter() {
            /* class com.bytedance.crash.runtime.C14026q.C140282 */

            static {
                Covode.recordClassIndex(16093);
            }

            public final boolean accept(File file, String str) {
                if (!str.endsWith(str) || !Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
                    return false;
                }
                return true;
            }
        });
        ArrayList<C14030a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        C14075v.m25650a("foundRuntimeContextFiles " + listFiles.length);
        C14030a aVar = null;
        for (File file2 : listFiles) {
            try {
                C14030a aVar2 = new C14030a(file2, (byte) 0);
                arrayList.add(aVar2);
                if (this.f34181g == null && ".ctx2".equals(str)) {
                    if (aVar != null) {
                        if (aVar2.f34188b >= aVar.f34188b) {
                        }
                    }
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
        if (this.f34181g == null && aVar != null) {
            this.f34181g = aVar;
        }
        Collections.sort(arrayList, new Comparator<C14030a>() {
            /* class com.bytedance.crash.runtime.C14026q.C140293 */

            static {
                Covode.recordClassIndex(16094);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C14030a aVar, C14030a aVar2) {
                return (int) (aVar.f34188b - aVar2.f34188b);
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private C14030a m25430a(File file, long j, long j2) {
        Iterator<C14030a> it = m25433a(file, ".ctx2").iterator();
        C14030a aVar = null;
        while (it.hasNext()) {
            C14030a next = it.next();
            if (j == next.f34187a) {
                if (aVar == null) {
                    aVar = next;
                }
                if (j2 >= next.f34188b) {
                    aVar = next;
                }
            } else if (aVar != null) {
                break;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private C14030a m25431a(File file, long j, String str) {
        Iterator<C14030a> it = m25433a(file, str).iterator();
        C14030a aVar = null;
        while (it.hasNext()) {
            C14030a next = it.next();
            if (j > next.f34188b) {
                next.f34190d = next.f34188b;
                aVar = next;
            } else if (aVar != null) {
                return aVar;
            } else {
                next.f34190d = next.f34188b;
                return next;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private void m25434a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f34176a, j + "-" + j2 + ".ctx2");
        File file2 = new File(this.f34176a, j + "-" + j2 + ".allData");
        try {
            C14056j.m25569a(file, jSONObject);
            C14056j.m25568a(file2, jSONArray);
            this.f34181g = new C14030a(file, (byte) 0);
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
        }
    }
}
