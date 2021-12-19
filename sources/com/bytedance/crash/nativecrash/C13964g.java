package com.bytedance.crash.nativecrash;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.p924b.C13823b;
import com.bytedance.crash.p924b.C13833g;
import com.bytedance.crash.p932j.C13892b;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.C14022p;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14047d;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14075v;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.g */
public final class C13964g {

    /* renamed from: a */
    public static boolean f34019a;

    /* renamed from: b */
    public static File f34020b;

    /* renamed from: c */
    public static File f34021c;

    /* renamed from: d */
    public static boolean f34022d;

    /* renamed from: e */
    public static boolean f34023e;

    /* renamed from: f */
    private static File f34024f;

    /* renamed from: g */
    private static boolean f34025g;

    /* renamed from: h */
    private static volatile boolean f34026h;

    /* renamed from: i */
    private static final Object f34027i = new Object();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.g$a */
    public static class C13971a {

        /* renamed from: a */
        long f34031a;

        /* renamed from: b */
        String f34032b;

        /* renamed from: c */
        ArrayList<C13972a> f34033c = new ArrayList<>();

        /* renamed from: d */
        long f34034d;

        /* renamed from: e */
        long f34035e;

        /* renamed from: f */
        long f34036f;

        /* renamed from: g */
        String f34037g;

        /* renamed from: h */
        String f34038h = null;

        static {
            Covode.recordClassIndex(16034);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.crash.nativecrash.g$a$a */
        public static class C13972a {

            /* renamed from: a */
            long f34039a;

            /* renamed from: b */
            long f34040b;

            /* renamed from: c */
            long f34041c;

            /* renamed from: d */
            String f34042d;

            static {
                Covode.recordClassIndex(16035);
            }

            private C13972a() {
            }

            /* synthetic */ C13972a(byte b) {
                this();
            }
        }

        C13971a(File file, File file2, long j) {
            this.f34031a = j;
            JSONArray a = C14056j.m25562a(file2, -1);
            for (int i = 0; i < a.length(); i++) {
                String optString = a.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    String[] split = optString.split("\\s+");
                    if (split.length == 4) {
                        C13972a aVar = new C13972a((byte) 0);
                        this.f34033c.add(aVar);
                        aVar.f34039a = C13964g.m25283a(split[0], -1);
                        aVar.f34040b = C13964g.m25283a(split[1], -1);
                        aVar.f34041c = C13964g.m25283a(split[2], -1);
                        String str = split[3];
                        aVar.f34042d = str;
                        if (i == 0 || C14044b.m25519b(C13933m.f33936a, str)) {
                            if (C14044b.m25519b(C13933m.f33936a, str)) {
                                this.f34032b = str;
                            }
                            this.f34034d = aVar.f34039a;
                            this.f34035e = aVar.f34040b;
                            this.f34036f = aVar.f34041c;
                            this.f34037g = aVar.f34042d;
                        }
                    }
                }
            }
            if (file != null) {
                if (new File(file, "hasJavaCrash").exists()) {
                    this.f34038h = "java";
                }
                if (new File(file, "hasNativeCrash").exists()) {
                    String str2 = "native";
                    this.f34038h = this.f34038h != null ? this.f34038h + str2 : str2;
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(16027);
    }

    /* renamed from: b */
    public static File m25290b() {
        if (f34024f == null) {
            m25285a();
        }
        return f34024f;
    }

    /* renamed from: g */
    private static File[] m25295g() {
        return new File(f34020b, "proc/").listFiles();
    }

    /* renamed from: c */
    public static synchronized void m25291c() {
        synchronized (C13964g.class) {
            MethodCollector.m26663i(2853);
            C14075v.m25650a("start child monitor");
            new Thread(new Runnable() {
                /* class com.bytedance.crash.nativecrash.C13964g.RunnableC139651 */

                static {
                    Covode.recordClassIndex(16028);
                }

                public final void run() {
                    File file = C13964g.f34020b;
                    file.mkdirs();
                    if (C13994b.m25329a("custom_event_settings", "npth_simple_setting", "enable_all_worker") == 1) {
                        C13964g.m25292d();
                        C13964g.f34023e = true;
                    }
                    if (TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.contains("aries")) {
                        NativeTools.m25458a().mo22559a(System.currentTimeMillis(), file.getAbsolutePath(), new File(C13964g.f34020b, "pid_tid").getAbsolutePath());
                    } else if (!C13964g.f34023e) {
                        C13964g.m25292d();
                        C13964g.f34023e = true;
                    }
                }
            }, "monitor-terminal").start();
            MethodCollector.m26664o(2853);
        }
    }

    /* renamed from: d */
    public static void m25292d() {
        if (!f34022d) {
            f34022d = true;
            if (C13823b.f33620d) {
                File file = f34020b;
                C14075v.m25650a("start new anrInfo Monitor");
                new Thread(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
                      (wrap: java.lang.Thread : 0x001c: CONSTRUCTOR  (r2v0 java.lang.Thread) = 
                      (wrap: com.bytedance.crash.b.g$2 : 0x0017: CONSTRUCTOR  (r1v0 com.bytedance.crash.b.g$2) = (r3v0 'file' java.io.File) call: com.bytedance.crash.b.g.2.<init>(java.io.File):void type: CONSTRUCTOR)
                      ("worker_anr_monitor")
                     call: java.lang.Thread.<init>(java.lang.Runnable, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: java.lang.Thread.start():void in method: com.bytedance.crash.nativecrash.g.d():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r2v0 java.lang.Thread) = 
                      (wrap: com.bytedance.crash.b.g$2 : 0x0017: CONSTRUCTOR  (r1v0 com.bytedance.crash.b.g$2) = (r3v0 'file' java.io.File) call: com.bytedance.crash.b.g.2.<init>(java.io.File):void type: CONSTRUCTOR)
                      ("worker_anr_monitor")
                     call: java.lang.Thread.<init>(java.lang.Runnable, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.crash.nativecrash.g.d():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: CONSTRUCTOR  (r1v0 com.bytedance.crash.b.g$2) = (r3v0 'file' java.io.File) call: com.bytedance.crash.b.g.2.<init>(java.io.File):void type: CONSTRUCTOR in method: com.bytedance.crash.nativecrash.g.d():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.b.g, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 40 more
                    */
                /*
                    boolean r0 = com.bytedance.crash.nativecrash.C13964g.f34022d
                    if (r0 == 0) goto L_0x0005
                    return
                L_0x0005:
                    r0 = 1
                    com.bytedance.crash.nativecrash.C13964g.f34022d = r0
                    boolean r0 = com.bytedance.crash.p924b.C13823b.f33620d
                    if (r0 == 0) goto L_0x0022
                    java.io.File r3 = com.bytedance.crash.nativecrash.C13964g.f34020b
                    java.lang.String r0 = "start new anrInfo Monitor"
                    com.bytedance.crash.util.C14075v.m25650a(r0)
                    java.lang.Thread r2 = new java.lang.Thread
                    com.bytedance.crash.b.g$2 r1 = new com.bytedance.crash.b.g$2
                    r1.<init>(r3)
                    java.lang.String r0 = "worker_anr_monitor"
                    r2.<init>(r1, r0)
                    r2.start()
                L_0x0022:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C13964g.m25292d():void");
            }

            /* renamed from: a */
            public static void m25285a() {
                File file = new File(C14069r.m25642j(C13933m.f33936a), "npth/killHistory");
                f34020b = file;
                file.mkdirs();
                f34021c = new File(f34020b, "kill_info");
                File file2 = new File(f34020b, "proc/" + Process.myPid());
                f34024f = file2;
                file2.mkdirs();
                try {
                    C14056j.m25566a(new File(file2, "cmd"), C14044b.m25520c(C13933m.f33936a), false);
                    C14056j.m25566a(new File(file2, "app_start_time"), String.valueOf(C13933m.f33938c), false);
                } catch (IOException unused) {
                    C13933m.f33942g.isDebugMode();
                } catch (Throwable unused2) {
                }
            }

            /* renamed from: e */
            public static void m25293e() {
                MethodCollector.m26663i(3073);
                if (f34026h) {
                    MethodCollector.m26664o(3073);
                    return;
                }
                synchronized (f34027i) {
                    try {
                        if (!f34026h) {
                            f34026h = true;
                            C13933m.f33942g.isDebugMode();
                            File[] g = m25295g();
                            if (g == null) {
                                MethodCollector.m26664o(3073);
                                return;
                            }
                            for (File file : g) {
                                long a = m25283a(file.getName(), -1);
                                if (!(a == -1 || a == ((long) Process.myPid()))) {
                                    int i = (int) a;
                                    if (!NativeTools.m25458a().mo22574d(i)) {
                                        m25287a(i, (String) null);
                                    }
                                }
                            }
                            C14019n.m25421b().mo22551a(new Runnable() {
                                /* class com.bytedance.crash.nativecrash.C13964g.RunnableC139706 */

                                static {
                                    Covode.recordClassIndex(16033);
                                }

                                public final void run() {
                                    C13833g.m24992b();
                                }
                            });
                            MethodCollector.m26664o(3073);
                        }
                    } finally {
                        MethodCollector.m26664o(3073);
                    }
                }
            }

            /* renamed from: f */
            public static JSONArray m25294f() {
                File[] g = m25295g();
                if (g == null || g.length == 0) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                for (File file : g) {
                    long a = m25283a(file.getName(), -1);
                    if (a >= 0 && NativeTools.m25458a().mo22574d((int) a)) {
                        JSONObject jSONObject = new JSONObject();
                        C14062n.m25593a(jSONObject, "pid", Long.valueOf(a));
                        C14062n.m25593a(jSONObject, "start_time", Long.valueOf(m25282a(file)));
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }

            /* renamed from: a */
            private static long m25282a(File file) {
                try {
                    return m25283a(C14056j.m25557a(new File(file, "app_start_time"), "\n"), System.currentTimeMillis());
                } catch (IOException unused) {
                    return System.currentTimeMillis();
                }
            }

            /* renamed from: a */
            public static void m25289a(final boolean z) {
                if (!C13934n.f33962h && !C13934n.f33963i) {
                    if (!f34025g || z) {
                        f34025g = true;
                        C14019n.m25421b().mo22551a(new Runnable() {
                            /* class com.bytedance.crash.nativecrash.C13964g.RunnableC139662 */

                            static {
                                Covode.recordClassIndex(16029);
                            }

                            public final void run() {
                                String[] list;
                                int a;
                                C13964g.m25285a();
                                long currentTimeMillis = System.currentTimeMillis();
                                File file = C13964g.f34021c;
                                if (file.exists() && (list = file.list()) != null && list.length != 0) {
                                    Arrays.sort(list);
                                    int i = 0;
                                    if (list.length != 0 && list.length > (a = C13994b.m25328a(25, "custom_event_settings", "npth_simple_setting", "kill_history_limit"))) {
                                        Arrays.sort(list);
                                        while (i < list.length - a) {
                                            C14056j.m25574a(new File(C13964g.f34021c, list[i]));
                                            i++;
                                        }
                                        i = list.length - a;
                                    }
                                    if (C13994b.m25345k() || z) {
                                        int i2 = i;
                                        while (i2 < list.length && i2 < i + 5) {
                                            String str = list[i2];
                                            try {
                                                long longValue = Long.decode(str).longValue();
                                                if (currentTimeMillis - longValue >= 1000) {
                                                    File file2 = new File(file, str);
                                                    try {
                                                        C13964g.m25288a(new C13971a(file2, new File(file2, "info.txt"), longValue), file2, longValue, (File) null);
                                                    } catch (Throwable unused) {
                                                        C14056j.m25574a(file2);
                                                    }
                                                }
                                            } catch (Throwable unused2) {
                                                C14056j.m25574a(new File(file, str));
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }

            /* renamed from: a */
            public static C14056j.C14058b m25284a(JSONArray jSONArray) {
                File file;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(jSONArray.length());
                m25293e();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        int optInt = optJSONObject.optInt("pid");
                        long optLong = optJSONObject.optLong("start_time");
                        if (optInt > 0 && optLong > 0) {
                            File a = C14022p.m25426a(optLong);
                            String[] list = a.list(new FilenameFilter(C14047d.m25529a().format(new Date(optLong)) + "_" + optInt) {
                                /* class com.bytedance.crash.runtime.C14022p.C140253 */

                                /* renamed from: a */
                                final /* synthetic */ String f34174a;

                                static {
                                    Covode.recordClassIndex(16090);
                                }

                                {
                                    this.f34174a = r1;
                                }

                                public final boolean accept(File file, String str) {
                                    return str.equals(this.f34174a);
                                }
                            });
                            if (list == null || list.length == 0) {
                                file = new File(f34020b, "proc/".concat(String.valueOf(optInt)));
                                if (!file.exists()) {
                                }
                            } else {
                                file = new File(a, list[0]);
                            }
                            arrayList.add(file);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                File[] fileArr = new File[arrayList.size()];
                arrayList.toArray(fileArr);
                return new C14056j.C14058b(fileArr, false);
            }

            /* renamed from: a */
            public static long m25283a(String str, long j) {
                try {
                    return Long.decode(str).longValue();
                } catch (Throwable unused) {
                    return j;
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
            /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void m25287a(int r12, java.lang.String r13) {
                /*
                // Method dump skipped, instructions count: 197
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C13964g.m25287a(int, java.lang.String):void");
            }

            /* renamed from: a */
            private static void m25286a(int i, File file, C13971a aVar, File file2) {
                HashMap hashMap = new HashMap();
                final String concat = "-".concat(String.valueOf(i));
                C13892b.m25138b(hashMap, new FilenameFilter() {
                    /* class com.bytedance.crash.nativecrash.C13964g.C139673 */

                    static {
                        Covode.recordClassIndex(16030);
                    }

                    public final boolean accept(File file, String str) {
                        return str.contains(concat);
                    }
                });
                C13892b.m25133a(hashMap, new FilenameFilter() {
                    /* class com.bytedance.crash.nativecrash.C13964g.C139684 */

                    static {
                        Covode.recordClassIndex(16031);
                    }

                    public final boolean accept(File file, String str) {
                        return str.contains(concat);
                    }
                });
                for (C13892b.C13899b bVar : hashMap.values()) {
                    if (bVar.f33858j == i) {
                        if (!bVar.f33850b.isEmpty()) {
                            C14056j.m25583f(new File(file, "hasJavaCrash"));
                            if (aVar != null) {
                                C14056j.m25583f(new File(file2.getParent(), "hasJavaCrash"));
                                for (C13892b.C13898a aVar2 : bVar.f33850b) {
                                    C14056j.m25583f(new File(aVar2.f33844a, "hasKillInfo"));
                                }
                            }
                        }
                        if (!bVar.f33851c.isEmpty()) {
                            C14056j.m25583f(new File(file, "hasNativeCrash"));
                            if (aVar != null) {
                                C14056j.m25583f(new File(file2.getParent(), "hasNativeCrash"));
                                for (C13892b.C13898a aVar3 : bVar.f33851c) {
                                    C14056j.m25583f(new File(aVar3.f33844a, "hasKillInfo"));
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x011f  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0155 A[Catch:{ all -> 0x015a }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            static void m25288a(com.bytedance.crash.nativecrash.C13964g.C13971a r14, java.io.File r15, long r16, java.io.File r18) {
                /*
                // Method dump skipped, instructions count: 350
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C13964g.m25288a(com.bytedance.crash.nativecrash.g$a, java.io.File, long, java.io.File):void");
            }
        }
