package com.bytedance.crash.p924b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.p933a.C13978a;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.a */
public class C13820a {

    /* renamed from: d */
    public static long f33587d;

    /* renamed from: e */
    public static long f33588e;

    /* renamed from: h */
    static Pattern f33589h;

    /* renamed from: p */
    private static volatile boolean f33590p;

    /* renamed from: a */
    public C13823b f33591a;

    /* renamed from: b */
    public volatile boolean f33592b;

    /* renamed from: c */
    public boolean f33593c = true;

    /* renamed from: f */
    public C13822a f33594f;

    /* renamed from: g */
    public int f33595g;

    /* renamed from: i */
    private final Context f33596i;

    /* renamed from: j */
    private long f33597j = -1;

    /* renamed from: k */
    private File f33598k;

    /* renamed from: l */
    private final Object f33599l = new Object();

    /* renamed from: m */
    private final C13831f f33600m;

    /* renamed from: n */
    private long f33601n;

    /* renamed from: o */
    private File f33602o;

    static {
        Covode.recordClassIndex(15877);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|53|51|4|3) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(286);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0009 A[LOOP:0: B:3:0x0009->B:51:0x0009, LOOP_START, SYNTHETIC, Splitter:B:3:0x0009] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22263a(org.json.JSONArray r6, long r7) {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.crash.b.a> r4 = com.bytedance.crash.p924b.C13820a.class
            r3 = 286(0x11e, float:4.01E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            r2 = 0
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
        L_0x0009:
            boolean r0 = com.bytedance.crash.p924b.C13820a.f33590p     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0011
            r4.wait()     // Catch:{ all -> 0x0009 }
            goto L_0x0009
        L_0x0011:
            r0 = 1
            com.bytedance.crash.p924b.C13820a.f33590p = r0
            monitor-exit(r4)
            r5.m24950b(r6, r7)
            monitor-enter(r4)
            com.bytedance.crash.p924b.C13820a.f33590p = r2     // Catch:{ all -> 0x0023 }
            r4.notifyAll()     // Catch:{ all -> 0x0023 }
            monitor-exit(r4)     // Catch:{ all -> 0x0023 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "NPTH_CATCH"
            com.bytedance.crash.C13849d.m25014a(r0, r1)     // Catch:{ all -> 0x0046 }
            monitor-enter(r4)
            com.bytedance.crash.p924b.C13820a.f33590p = r2     // Catch:{ all -> 0x0040 }
            r4.notifyAll()     // Catch:{ all -> 0x0040 }
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0046:
            r0 = move-exception
            monitor-enter(r4)
            com.bytedance.crash.p924b.C13820a.f33590p = r2     // Catch:{ all -> 0x0052 }
            r4.notifyAll()     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13820a.mo22263a(org.json.JSONArray, long):void");
    }

    /* renamed from: a */
    public final void mo22262a(long j) {
        if (this.f33594f.f33612g == null) {
            this.f33594f.f33607b = C13840i.m25006e();
            this.f33594f.f33612g = C13840i.m25003b();
            this.f33594f.f33611f = C13840i.m25000a(j);
        }
    }

    /* renamed from: a */
    public static long[] m24947a(JSONArray jSONArray) {
        long[] jArr = {0, 0};
        if (jSONArray == null) {
            return jArr;
        }
        long j = 0;
        long j2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                if (jSONArray.getJSONObject(i2).getInt(StringSet.type) == 8) {
                    j += (long) jSONArray.getJSONObject(i2).getInt("cpuDuration");
                    j2 += (long) jSONArray.getJSONObject(i2).getInt("duration");
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
        if (i > 0) {
            long j3 = (long) i;
            jArr[0] = j / j3;
            jArr[1] = j2 / j3;
        }
        return jArr;
    }

    /* renamed from: d */
    private void m24952d() {
        File file = this.f33598k;
        if (file != null) {
            C14056j.m25574a(file);
            this.f33598k = null;
        }
    }

    /* renamed from: com.bytedance.crash.b.a$a */
    public class C13822a {

        /* renamed from: a */
        JSONObject f33606a;

        /* renamed from: b */
        JSONObject f33607b;

        /* renamed from: c */
        JSONArray f33608c;

        /* renamed from: d */
        JSONObject f33609d;

        /* renamed from: e */
        long f33610e = -1;

        /* renamed from: f */
        JSONArray f33611f;

        /* renamed from: g */
        JSONArray f33612g;

        /* renamed from: h */
        JSONObject f33613h;

        /* renamed from: i */
        boolean f33614i;

        /* renamed from: j */
        long f33615j = -1;

        /* renamed from: k */
        boolean f33616k;

        /* renamed from: l */
        boolean f33617l;

        static {
            Covode.recordClassIndex(15879);
        }

        /* renamed from: a */
        public final void mo22266a() {
            this.f33606a = null;
            this.f33607b = null;
            this.f33608c = null;
            this.f33609d = null;
            this.f33610e = -1;
            this.f33611f = null;
            this.f33612g = null;
            this.f33613h = null;
            this.f33616k = false;
        }

        C13822a() {
        }
    }

    /* renamed from: b */
    public static boolean m24949b() {
        boolean a = C14044b.m25515a(C13933m.f33936a);
        if (!a || C13978a.m25303a().mo22492b() > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            return a;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo22261a() {
        if (!this.f33592b) {
            this.f33591a = new C13823b(this);
            if (!C13840i.f33692a) {
                C13840i.f33692a = true;
            }
            this.f33597j = C13933m.f33938c;
            this.f33592b = true;
        }
    }

    /* renamed from: c */
    public final File mo22264c() {
        File file;
        if (this.f33602o == null) {
            Context context = this.f33596i;
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                file = context.getFilesDir();
                C58016d.f132222c = file;
            } else {
                file = C58016d.f132222c;
            }
            this.f33602o = new File(file, "has_anr_signal_" + C14044b.m25520c(this.f33596i).replaceAll(":", "_"));
        }
        return this.f33602o;
    }

    /* renamed from: a */
    private static void m24944a(String str) {
        for (ICrashCallback iCrashCallback : C13934n.f33960f.f34131a.getList(CrashType.ANR)) {
            try {
                iCrashCallback.onCrash(CrashType.ANR, str, null);
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
    }

    public C13820a(Context context) {
        C13831f fVar = new C13831f();
        this.f33600m = fVar;
        this.f33601n = -1;
        this.f33594f = new C13822a();
        this.f33596i = context;
        String c = C14044b.m25520c(context);
        context.getPackageName();
        fVar.mo22287c(c);
        if (!C13840i.f33692a) {
            C13840i.f33692a = true;
            C13840i.f33693b = 100;
            C13840i.f33696e = 300;
            C13840i.f33694c = new ArrayList();
            C13994b.m25332a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: INVOKE  
                  (wrap: com.bytedance.crash.b.i$1 : 0x0044: CONSTRUCTOR  (r0v7 com.bytedance.crash.b.i$1) =  call: com.bytedance.crash.b.i.1.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.crash.runtime.b.a(com.bytedance.crash.runtime.b$a):void in method: com.bytedance.crash.b.a.<init>(android.content.Context):void, file: classes.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: CONSTRUCTOR  (r0v7 com.bytedance.crash.b.i$1) =  call: com.bytedance.crash.b.i.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.crash.b.a.<init>(android.content.Context):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.b.i, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                r5.<init>()
                r3 = -1
                r5.f33597j = r3
                r2 = 1
                r5.f33593c = r2
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r5.f33599l = r0
                com.bytedance.crash.b.f r1 = new com.bytedance.crash.b.f
                r1.<init>()
                r5.f33600m = r1
                r5.f33601n = r3
                com.bytedance.crash.b.a$a r0 = new com.bytedance.crash.b.a$a
                r0.<init>()
                r5.f33594f = r0
                r5.f33596i = r6
                java.lang.String r0 = com.bytedance.crash.util.C14044b.m25520c(r6)
                r6.getPackageName()
                r1.mo22287c(r0)
                boolean r0 = com.bytedance.crash.p924b.C13840i.f33692a
                if (r0 != 0) goto L_0x0051
                com.bytedance.crash.p924b.C13840i.f33692a = r2
                r0 = 100
                com.bytedance.crash.p924b.C13840i.f33693b = r0
                r0 = 300(0x12c, double:1.48E-321)
                com.bytedance.crash.p924b.C13840i.f33696e = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.bytedance.crash.p924b.C13840i.f33694c = r0
                com.bytedance.crash.b.i$1 r0 = new com.bytedance.crash.b.i$1
                r0.<init>()
                com.bytedance.crash.runtime.C13994b.m25332a(r0)
                android.os.MessageQueue r0 = com.bytedance.crash.p924b.C13840i.m25004c()
                com.bytedance.crash.p924b.C13840i.m24998a(r0)
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13820a.<init>(android.content.Context):void");
        }

        /* renamed from: b */
        public static String m24948b(long j) {
            long j2 = j - C13933m.f33938c;
            if (j2 < 30000) {
                return "0 - 30s";
            }
            if (j2 < 60000) {
                return "30s - 1min";
            }
            if (j2 < 120000) {
                return "1min - 2min";
            }
            if (j2 < 300000) {
                return "2min - 5min";
            }
            if (j2 < 600000) {
                return "5min - 10min";
            }
            if (j2 < 1800000) {
                return "10min - 30min";
            }
            if (j2 < 3600000) {
                return "30min - 1h";
            }
            return "1h - ";
        }

        /* renamed from: b */
        private static int[] m24951b(JSONArray jSONArray) {
            int i;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String optString = jSONArray.optString(i2);
                if (optString == null || optString.isEmpty()) {
                    i = -1;
                } else {
                    i = optString.indexOf("utm=");
                }
                if (i > 0) {
                    if (f33589h == null) {
                        f33589h = Pattern.compile("[^0-9]+");
                    }
                    String[] split = f33589h.split(optString.substring(i));
                    if (split == null || split.length < 2) {
                        return null;
                    }
                    try {
                        int intValue = Integer.decode(split[1]).intValue();
                        int intValue2 = Integer.decode(split[2]).intValue();
                        return new int[]{intValue, intValue2, intValue + intValue2};
                    } catch (Throwable unused) {
                        throw new IllegalArgumentException("Err stack line: ".concat(String.valueOf(optString)));
                    }
                }
            }
            return null;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:18|19|(1:21)(1:22)|23|24|25|26|(1:29)|30|(1:32)|33|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a8 */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m24943a(long r7, org.json.JSONArray r9) {
            /*
            // Method dump skipped, instructions count: 227
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13820a.m24943a(long, org.json.JSONArray):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:110:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x02d1  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m24945a(java.lang.String r34, com.bytedance.crash.p924b.C13831f r35) {
            /*
            // Method dump skipped, instructions count: 1886
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13820a.m24945a(java.lang.String, com.bytedance.crash.b.f):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
            if (r19 == false) goto L_0x0069;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x04d7 */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x04fe A[Catch:{ all -> 0x0509 }] */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0543  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0550  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1 A[SYNTHETIC, Splitter:B:50:0x00f1] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m24950b(org.json.JSONArray r21, long r22) {
            /*
            // Method dump skipped, instructions count: 1389
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13820a.m24950b(org.json.JSONArray, long):boolean");
        }

        /* renamed from: a */
        private boolean m24946a(long j, JSONArray jSONArray, long j2) {
            if (jSONArray != null) {
                this.f33594f.f33617l = true;
                if (j2 >= 0) {
                    this.f33594f.f33615j = j2;
                }
                m24943a(j, jSONArray);
                if (C13994b.m25329a("custom_event_settings", "npth_simple_setting", "enable_background_killed_anr") != 1 && (!C13978a.m25303a().f34085v) && C13978a.m25303a().mo22492b() > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static Pair<JSONObject, JSONObject> m24941a(JSONArray jSONArray, C13831f fVar, boolean z) {
            JSONObject jSONObject;
            String str = null;
            if (jSONArray == null) {
                return new Pair<>(null, null);
            }
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            String str2 = null;
            JSONObject jSONObject2 = null;
            int i = 0;
            boolean z2 = false;
            while (i < jSONArray.length()) {
                String optString = jSONArray.optString(i);
                if (TextUtils.isEmpty(optString)) {
                    JSONObject a = m24942a(jSONArray4, str2, jSONArray2, fVar, z);
                    if (a != null) {
                        jSONObject2 = a;
                    }
                    if (jSONArray4.length() > 0) {
                        jSONArray4 = new JSONArray();
                    }
                    str2 = str;
                } else {
                    if (z2) {
                        if (!z2) {
                        }
                    } else if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                        z2 = true;
                    } else {
                        jSONArray3.put(optString);
                    }
                    if (optString.contains(" prio=")) {
                        JSONObject a2 = m24942a(jSONArray4, str2, jSONArray2, fVar, z);
                        if (a2 != null) {
                            jSONObject2 = a2;
                        }
                        str2 = optString.substring(1, optString.indexOf(34, 1));
                        if (!z || !"main".equals(str2)) {
                            str2 = str2 + "  (" + optString.substring(optString.indexOf(34, 2) + 1) + " )";
                        }
                        if (jSONArray4.length() > 0) {
                            jSONArray4 = new JSONArray();
                        }
                        jSONArray4.put(optString);
                    } else if (TextUtils.isEmpty(str2)) {
                        jSONArray3.put(optString);
                    } else {
                        jSONArray4.put(optString);
                    }
                }
                i++;
                str = null;
            }
            if (fVar != null) {
                fVar.f33667g.mo22281a("max_utm_thread", fVar.f33669i);
                fVar.f33667g.mo22281a("max_stm_thread", fVar.f33670j);
                fVar.f33667g.mo22281a("max_utm_stm_thread", fVar.f33671k);
                C13933m.f33942g.isDebugMode();
                int[] iArr = fVar.f33668h;
                int[] iArr2 = fVar.f33668h;
                fVar.f33668h[2] = 0;
                iArr2[1] = 0;
                iArr[0] = 0;
                fVar.f33669i = "unknown";
                fVar.f33670j = "unknown";
                fVar.f33671k = "unknown";
            }
            if (jSONArray2.length() > 0) {
                jSONObject = new JSONObject();
                C14062n.m25593a(jSONObject, "thread_all_count", Integer.valueOf(jSONArray2.length()));
                C14062n.m25593a(jSONObject, "thread_stacks", jSONArray2);
                f33587d = (long) jSONArray2.length();
            } else {
                jSONObject = null;
            }
            return new Pair<>(jSONObject2, jSONObject);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x014f A[Catch:{ all -> 0x015d }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00cd A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static org.json.JSONObject m24942a(org.json.JSONArray r23, java.lang.String r24, org.json.JSONArray r25, com.bytedance.crash.p924b.C13831f r26, boolean r27) {
            /*
            // Method dump skipped, instructions count: 406
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13820a.m24942a(org.json.JSONArray, java.lang.String, org.json.JSONArray, com.bytedance.crash.b.f, boolean):org.json.JSONObject");
        }
    }
