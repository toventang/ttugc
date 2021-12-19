package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14068q;
import com.bytedance.crash.util.C14069r;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.e */
public final class C13953e {
    static {
        Covode.recordClassIndex(16016);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.e$e */
    public static class C13958e {

        /* renamed from: a */
        File f34012a;

        /* renamed from: b */
        String f34013b;

        /* renamed from: c */
        String f34014c;

        /* renamed from: d */
        int f34015d;

        static {
            Covode.recordClassIndex(16021);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo22430a() {
            /*
                r6 = this;
                r5 = 1354(0x54a, float:1.897E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
                java.io.File r0 = r6.f34012a
                boolean r0 = r0.exists()
                r4 = -1
                if (r0 == 0) goto L_0x0016
                java.io.File r0 = r6.f34012a
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x001a
            L_0x0016:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                return r4
            L_0x001a:
                r3 = 0
                java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x003c }
                java.io.File r0 = r6.f34012a     // Catch:{ all -> 0x003c }
                r1.<init>(r0)     // Catch:{ all -> 0x003c }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x003c }
                r2.<init>(r1)     // Catch:{ all -> 0x003c }
                r1 = -1
            L_0x0028:
                java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0038 }
                if (r0 == 0) goto L_0x0034
                int r1 = r6.m25273a(r0)     // Catch:{ all -> 0x0038 }
                if (r1 == r4) goto L_0x0028
            L_0x0034:
                com.bytedance.crash.util.C14061m.m25588a(r2)
                goto L_0x0049
            L_0x0038:
                r1 = move-exception
                r0 = -1
                r3 = r2
                goto L_0x003e
            L_0x003c:
                r1 = move-exception
                r0 = -1
            L_0x003e:
                java.lang.String r0 = "NPTH_CATCH"
                com.bytedance.crash.C13849d.m25014a(r0, r1)     // Catch:{ all -> 0x004d }
                if (r3 == 0) goto L_0x0048
                com.bytedance.crash.util.C14061m.m25588a(r3)
            L_0x0048:
                r1 = -1
            L_0x0049:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                return r1
            L_0x004d:
                r0 = move-exception
                if (r3 == 0) goto L_0x0053
                com.bytedance.crash.util.C14061m.m25588a(r3)
            L_0x0053:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C13953e.C13958e.mo22430a():int");
        }

        C13958e(File file) {
            this.f34012a = file;
        }

        /* renamed from: a */
        private int m25273a(String str) {
            int i = this.f34015d;
            if (!str.startsWith(this.f34013b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f34014c)[1].trim());
            } catch (NumberFormatException e) {
                C13849d.m25014a("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.e$f */
    public static class C13959f extends C13958e {
        static {
            Covode.recordClassIndex(16022);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final HashMap<String, List<String>> mo22431b() {
            String str;
            C14068q qVar = new C14068q();
            try {
                JSONArray a = C14056j.m25563a(this.f34012a.getAbsolutePath());
                if (a == null) {
                    return qVar;
                }
                for (int i = 0; i < a.length(); i++) {
                    String optString = a.optString(i);
                    if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                        int indexOf = optString.indexOf("[routine:0x");
                        int i2 = indexOf + 11;
                        int indexOf2 = optString.indexOf(93, i2);
                        if (indexOf > 0) {
                            str = optString.substring(i2, indexOf2);
                        } else {
                            str = "unknown addr";
                        }
                        qVar.getList(str).add(optString);
                    }
                }
                return qVar;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }

        C13959f(File file) {
            super(file);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.e$g */
    public static class C13960g extends C13958e {
        static {
            Covode.recordClassIndex(16023);
        }

        C13960g(File file) {
            super(file);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONArray mo22432a(HashMap<String, List<String>> hashMap) {
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray a = C14056j.m25563a(this.f34012a.getAbsolutePath());
                if (a == null) {
                    return jSONArray;
                }
                for (int i = 0; i < a.length(); i++) {
                    String optString = a.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        String substring = optString.substring(2, optString.indexOf(":"));
                        if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next() + " " + optString);
                            }
                            hashMap.remove(substring);
                        }
                    }
                }
                for (List<String> list2 : hashMap.values()) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next() + "  0x000000:unknown");
                    }
                }
                return jSONArray;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.e$a */
    public static class C13954a extends C13958e {
        static {
            Covode.recordClassIndex(16017);
        }

        C13954a(File file) {
            super(file);
            this.f34013b = "Total FD Count:";
            this.f34014c = ":";
            this.f34015d = -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.e$b */
    public static class C13955b extends C13958e {
        static {
            Covode.recordClassIndex(16018);
        }

        C13955b(File file) {
            super(file);
            this.f34013b = "VmSize:";
            this.f34014c = "\\s+";
            this.f34015d = -1;
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.e$d */
    static class C13957d extends C13958e {
        static {
            Covode.recordClassIndex(16020);
        }

        C13957d(File file) {
            super(file);
            this.f34013b = "VmRSS:";
            this.f34014c = "\\s+";
            this.f34015d = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.e$h */
    public static class C13961h extends C13958e {
        static {
            Covode.recordClassIndex(16024);
        }

        C13961h(File file) {
            super(file);
            this.f34013b = "Total Threads Count:";
            this.f34014c = ":";
            this.f34015d = -2;
        }
    }

    /* renamed from: a */
    public static int m25267a(String str) {
        return new C13954a(C14069r.m25626b(str)).mo22430a();
    }

    /* renamed from: b */
    public static int m25270b(String str) {
        return new C13961h(C14069r.m25629c(str)).mo22430a();
    }

    /* renamed from: c */
    public static int m25271c(String str) {
        return new C13955b(C14069r.m25633d(str)).mo22430a();
    }

    /* renamed from: com.bytedance.crash.nativecrash.e$c */
    public static class C13956c {

        /* renamed from: a */
        public int f34003a;

        /* renamed from: b */
        public int f34004b;

        /* renamed from: c */
        public int f34005c;

        /* renamed from: d */
        public int f34006d;

        /* renamed from: e */
        public int f34007e;

        /* renamed from: f */
        public String f34008f;

        /* renamed from: g */
        public String f34009g;

        /* renamed from: h */
        public JSONArray f34010h = new JSONArray();

        /* renamed from: i */
        public final Map<String, String> f34011i = new HashMap();

        static {
            Covode.recordClassIndex(16019);
        }

        /* renamed from: a */
        public final void mo22429a(JSONObject jSONObject) {
            boolean z;
            boolean z2;
            C13864b.m25056a(jSONObject, "filters", "has_dump", "true");
            boolean z3 = true;
            if (((long) this.f34003a) > C13949c.m25255c()) {
                z = true;
            } else {
                z = false;
            }
            C13864b.m25056a(jSONObject, "filters", "memory_leak", String.valueOf(z));
            if (this.f34005c > 960) {
                z2 = true;
            } else {
                z2 = false;
            }
            C13864b.m25056a(jSONObject, "filters", "fd_leak", String.valueOf(z2));
            if (this.f34006d <= 350) {
                z3 = false;
            }
            C13864b.m25056a(jSONObject, "filters", "threads_leak", String.valueOf(z3));
            C13864b.m25056a(jSONObject, "filters", "leak_threads_count", String.valueOf(this.f34007e));
            try {
                jSONObject.putOpt("memory_size", Integer.valueOf(this.f34003a));
                jSONObject.putOpt("rss", Integer.valueOf(this.f34004b));
            } catch (Throwable unused) {
            }
            C13864b.m25056a(jSONObject, "filters", "native_oom_reason", this.f34008f);
            C13864b.m25056a(jSONObject, "custom_long", "maps_size", this.f34010h);
            for (Map.Entry<String, String> entry : this.f34011i.entrySet()) {
                C13864b.m25056a(jSONObject, "filters", entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public static JSONArray m25269a(File file, File file2) {
        return new C13960g(file2).mo22432a(new C13959f(file).mo22431b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fa A[SYNTHETIC, Splitter:B:103:0x01fa] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.crash.nativecrash.C13953e.C13956c m25268a(java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C13953e.m25268a(java.lang.String, java.lang.String):com.bytedance.crash.nativecrash.e$c");
    }
}
