package com.bytedance.crash.p924b;

import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.C13949c;
import com.bytedance.crash.nativecrash.C13964g;
import com.bytedance.crash.p923a.C13815a;
import com.bytedance.crash.p932j.C13907f;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14013j;
import com.bytedance.crash.runtime.C14020o;
import com.bytedance.crash.runtime.C14022p;
import com.bytedance.crash.runtime.p933a.C13978a;
import com.bytedance.crash.runtime.p933a.C13989e;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14054h;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14076w;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.g */
public class C13833g {

    /* renamed from: a */
    public static File f33674a;

    /* renamed from: b */
    static File f33675b;

    /* renamed from: c */
    public static FileObserver f33676c;

    /* renamed from: d */
    public static boolean f33677d;

    /* renamed from: e */
    public static long f33678e = -1;

    /* renamed from: f */
    public static File f33679f;

    /* renamed from: g */
    public static volatile boolean f33680g;

    /* renamed from: h */
    public static int f33681h;

    /* renamed from: i */
    public static C13864b f33682i;

    /* renamed from: j */
    public static Runnable f33683j = new Runnable() {
        /* class com.bytedance.crash.p924b.C13833g.RunnableC138373 */

        static {
            Covode.recordClassIndex(15894);
        }

        public final void run() {
            MethodCollector.m26663i(3329);
            File file = C13833g.f33674a;
            synchronized (C13833g.class) {
                try {
                    C13833g.f33674a = null;
                    C13833g.f33682i = null;
                    C13833g.f33675b = null;
                } catch (Throwable th) {
                    MethodCollector.m26664o(3329);
                    throw th;
                }
            }
            C14056j.m25574a(file);
            MethodCollector.m26664o(3329);
        }
    };

    /* renamed from: k */
    private static File f33684k;

    /* renamed from: l */
    private static long f33685l = -1;

    static {
        Covode.recordClassIndex(15890);
    }

    /* renamed from: a */
    public static File m24986a() {
        if (f33684k == null) {
            Context context = C13933m.f33936a;
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = context.getFilesDir();
            }
            f33684k = new File(C58016d.f132222c, "has_anr_signal_" + C14044b.m25520c(C13933m.f33936a).replaceAll(":", "_"));
        }
        return f33684k;
    }

    /* renamed from: b */
    public static void m24992b() {
        File[] listFiles;
        File file = new File(C14069r.m25642j(C13933m.f33936a), "npth/procanr/");
        if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                m24993b(file2);
                C14056j.m25574a(file2);
            }
        }
    }

    /* renamed from: d */
    private static C13864b m24995d() {
        String str;
        C13864b bVar = new C13864b(new JSONObject());
        bVar.mo22346a("is_anr", (Object) 1);
        bVar.mo22346a("has_dump", (Object) "true");
        bVar.mo22346a("jiffy", Long.valueOf(C14020o.C14021a.m25422a()));
        C13868e.m25088a(bVar.f33757a);
        bVar.mo22340a("sdk_version", "3.1.6-rc.13-ttp");
        bVar.mo22340a("is_64_devices", String.valueOf(Header.m25040a()));
        bVar.mo22340a("is_64_runtime", String.valueOf(NativeTools.m25458a().mo22570c()));
        bVar.mo22340a("is_x86_devices", String.valueOf(Header.m25042b()));
        if (C13949c.m25256g()) {
            str = "true";
        } else {
            str = "false";
        }
        bVar.mo22340a("is_root", str);
        bVar.mo22340a("has_dump", "true");
        return bVar;
    }

    /* renamed from: c */
    public static void m24994c() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        f33685l = currentTimeMillis;
        long uptimeMillis = SystemClock.uptimeMillis();
        Context context = C13933m.f33936a;
        JSONObject jSONObject = new JSONObject();
        C14062n.m25593a(jSONObject, "current_message", C13840i.m25006e());
        C14062n.m25593a(jSONObject, "history_message", C13840i.m25003b());
        C14062n.m25593a(jSONObject, "pending_messages", C13840i.m25000a(uptimeMillis));
        File file = new File(C14069r.m25642j(C13933m.f33936a), "npth/killHistory/proc/" + Process.myPid() + "/trace_" + currentTimeMillis + "/");
        f33674a = file;
        file.mkdirs();
        C14056j.m25569a(new File(f33674a, "looper_message.txt"), jSONObject);
        File file2 = new File(f33674a, "main_stack.txt");
        try {
            file2.createNewFile();
        } catch (IOException unused) {
        }
        String a = C14042ab.m25491a(Looper.getMainLooper().getThread().getStackTrace());
        try {
            C14056j.m25566a(file2, a, false);
        } catch (IOException unused2) {
        }
        File file3 = new File(f33674a, "trace.txt");
        f33675b = file3;
        C14022p.m25428a("anr_trace", file3.getAbsolutePath());
        if (NativeTools.m25462h()) {
            NativeTools.m25458a().mo22577e(file3.getAbsolutePath());
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C14022p.m25428a("after_trace", file3.getAbsolutePath());
        C14054h.m25543a(f33674a);
        try {
            C13864b d = m24995d();
            C14062n.m25594a(d.f33757a, jSONObject);
            C14044b.m25512a(context, d.f33757a);
            d.mo22346a("is_background", Boolean.valueOf(C13820a.m24949b()));
            d.mo22350c("npth_trace_cost", String.valueOf(currentTimeMillis2 - currentTimeMillis));
            JSONObject a2 = C13826c.m24961a(a);
            JSONObject jSONObject2 = null;
            m24987a(a2, null, true);
            if (file3.length() < 500) {
                jSONObject2 = C14042ab.m25501b((String) null);
            }
            d.mo22346a("all_thread_stacks", jSONObject2);
            d.mo22346a("crash_time", Long.valueOf(currentTimeMillis));
            d.mo22346a("data", (Object) a2.toString());
            C13864b a3 = C13989e.m25320a().mo22510a(CrashType.ANR, d);
            a3.mo22346a("logcat", (Object) C14013j.m25406a(C13933m.m25229e()));
            long j = f33678e;
            if (j > 0) {
                a3.mo22350c("last_anr_interval", String.valueOf(currentTimeMillis - j));
            } else {
                a3.mo22350c("last_anr_interval", "none");
            }
            a3.mo22346a("alive_pids", (Object) C13964g.m25294f());
            a3.mo22346a("crash_uuid", (Object) C13933m.m25222a(currentTimeMillis, CrashType.ANR, false, false));
            JSONObject optJSONObject = a3.f33757a.optJSONObject("filters");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                a3.mo22346a("filters", optJSONObject);
            }
            try {
                optJSONObject.put("crash_length", C13820a.m24948b(currentTimeMillis));
                optJSONObject.put("disable_looper_monitor", String.valueOf(C13994b.m25337c()));
                optJSONObject.put("memory_leak", String.valueOf(C13864b.m25060a(C13933m.m25229e())));
                optJSONObject.put("fd_leak", String.valueOf(C13864b.m25062b(C13933m.m25229e())));
                optJSONObject.put("threads_leak", String.valueOf(C13864b.m25063c(C13933m.m25229e())));
                optJSONObject.put("is_64_runtime", String.valueOf(NativeTools.m25458a().mo22570c()));
                if (C13934n.m25236a()) {
                    str = "true";
                } else {
                    str = "false";
                }
                optJSONObject.put("crash_after_crash", str);
                optJSONObject.put("from_file", String.valueOf(C13826c.f33627b));
                optJSONObject.put("last_resume_activity", String.valueOf(C13978a.m25303a().f34079p));
                optJSONObject.put("start_uuid", C13933m.m25229e());
            } catch (Throwable unused3) {
            }
            f33682i = a3;
            C14056j.m25569a(new File(f33674a, "origin_json.txt"), a3.f33757a);
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public static void m24988a(File file) {
        String[] list = file.list();
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("anr_info_") || str.startsWith("trace_")) {
                    File file2 = new File(C14069r.m25642j(C13933m.f33936a), "npth/procanr/" + file.getName());
                    file2.mkdirs();
                    C14056j.m25578b(file, file2);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:4:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:82:0x0186] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m24993b(java.io.File r46) {
        /*
        // Method dump skipped, instructions count: 689
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13833g.m24993b(java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[Catch:{ JSONException -> 0x006f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m24987a(org.json.JSONObject r5, java.lang.String r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13833g.m24987a(org.json.JSONObject, java.lang.String, boolean):org.json.JSONObject");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:6|(1:28)|39|40|41|(1:43)|44|45|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a2, code lost:
        com.bytedance.crash.C13849d.m25014a("NPTH_CATCH", r1);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2620);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0070 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24990a(java.io.File r22, java.lang.String r23, long r24, boolean r26) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13833g.m24990a(java.io.File, java.lang.String, long, boolean):void");
    }

    /* renamed from: a */
    private static boolean m24991a(File file, File file2, long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(C14056j.m25557a(file2, "\n"));
            C14076w.m25659a(jSONObject, file);
            List<String> a = C13815a.m24932a().mo22256a(j, str);
            if (C13907f.m25167a(C13933m.f33942g.getJavaCrashUploadUrl(), jSONObject.toString(), new C14056j.C14058b(file), C14022p.m25429b(j), C13964g.m25284a(jSONObject.optJSONArray("alive_pids"))).mo22410a()) {
                C13815a.m24933a(a, str);
                C14056j.m25574a(file);
                if (!C13934n.m25236a()) {
                    C14056j.m25574a(C14069r.m25638g(C13933m.f33936a));
                }
            }
            return true;
        } catch (IOException | JSONException unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd A[SYNTHETIC, Splitter:B:33:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m24989a(java.io.File r15, java.io.File r16, java.lang.String r17, boolean r18, long r19, long r21, long r23, org.json.JSONObject r25, java.lang.String r26, org.json.JSONArray r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 576
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p924b.C13833g.m24989a(java.io.File, java.io.File, java.lang.String, boolean, long, long, long, org.json.JSONObject, java.lang.String, org.json.JSONArray, boolean):void");
    }
}
