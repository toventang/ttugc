package com.bytedance.crash.nativecrash;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.runtime.C14013j;
import com.bytedance.crash.runtime.C14020o;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14043ac;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14061m;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14077x;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.c */
public final class C13949c {

    /* renamed from: f */
    private static Boolean f33993f;

    /* renamed from: a */
    public C13951b f33994a;

    /* renamed from: b */
    public String f33995b;

    /* renamed from: c */
    public C13947a f33996c;

    /* renamed from: d */
    private final Context f33997d;

    /* renamed from: e */
    private String f33998e;

    static {
        Covode.recordClassIndex(16012);
    }

    /* renamed from: f */
    public final boolean mo22428f() {
        return C14056j.m25574a(this.f33994a.f34001c);
    }

    /* renamed from: c */
    public static long m25255c() {
        if (NativeTools.m25458a().mo22570c()) {
            return Long.MAX_VALUE;
        }
        if (Header.m25040a()) {
            return 3891200;
        }
        return 2867200;
    }

    /* renamed from: a */
    public final boolean mo22424a() {
        ICrashFilter crashFilter = C13933m.f33943h.getCrashFilter();
        if (crashFilter == null) {
            return true;
        }
        try {
            if (!crashFilter.onNativeCrashFilter(m25257h(), "")) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
            return true;
        }
    }

    /* renamed from: h */
    private String m25257h() {
        C13951b bVar = this.f33994a;
        if (bVar == null) {
            return null;
        }
        String a = bVar.f33999a.mo22440a();
        if (a == null || a.isEmpty()) {
            return this.f33994a.f34000b.f33992a.get("signal_line");
        }
        return a;
    }

    /* renamed from: g */
    public static boolean m25256g() {
        Boolean bool = f33993f;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i = 0;
        do {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean bool2 = true;
                    f33993f = bool2;
                    return bool2.booleanValue();
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
            i++;
        } while (i < 11);
        Boolean bool3 = false;
        f33993f = bool3;
        return bool3.booleanValue();
    }

    /* renamed from: b */
    public final String mo22425b() {
        Throwable th;
        MethodCollector.m26663i(3795);
        File a = C14069r.m25621a(this.f33994a.f34001c);
        StringBuilder sb = new StringBuilder();
        if (a.exists() && a.length() > 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(a));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (readLine.startsWith("coresize:")) {
                                sb.append(readLine.substring(9)).append('\n');
                                this.f33998e = sb.toString();
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        try {
                            C13849d.m25014a("NPTH_CATCH", th);
                            C14061m.m25588a(bufferedReader);
                            String str = this.f33998e;
                            MethodCollector.m26664o(3795);
                            return str;
                        } catch (Throwable th3) {
                            C14061m.m25588a(bufferedReader);
                            MethodCollector.m26664o(3795);
                            throw th3;
                        }
                    }
                }
                C14061m.m25588a(bufferedReader2);
            } catch (Throwable th4) {
                th = th4;
                C13849d.m25014a("NPTH_CATCH", th);
                C14061m.m25588a(bufferedReader);
                String str2 = this.f33998e;
                MethodCollector.m26664o(3795);
                return str2;
            }
        }
        String str22 = this.f33998e;
        MethodCollector.m26664o(3795);
        return str22;
    }

    /* renamed from: d */
    public final JSONObject mo22426d() {
        try {
            C13864b bVar = new C13864b();
            m25251a(bVar);
            C13947a aVar = this.f33996c;
            if (aVar != null) {
                try {
                    String str = aVar.f33986a;
                    if (str != null) {
                        bVar.mo22346a("pid", (Object) str);
                    }
                    String str2 = this.f33996c.f33987b;
                    if (str2 != null) {
                        bVar.mo22346a("crash_thread_name", (Object) str2);
                    }
                    long j = this.f33996c.f33989d;
                    if (j != 0) {
                        bVar.mo22346a("crash_time", Long.valueOf(j));
                    }
                    if (this.f33996c.f33988c != null) {
                        bVar.mo22346a("data", (Object) this.f33996c.f33988c);
                    } else {
                        bVar.mo22346a("data", "AsanReport is Null\n");
                    }
                    bVar.mo22346a("crash_type", (Object) CrashType.ASAN.toString());
                    bVar.mo22346a("commit_id", "1");
                    bVar.mo22346a("jenkins_job_id", "1");
                } catch (Throwable th) {
                    C13849d.m25014a("NPTH_CATCH", th);
                }
            }
            m25252a(bVar, this.f33996c.f33990e);
            m25254b(bVar);
            File file = new File(this.f33994a.f34001c, "upload.json");
            JSONObject jSONObject = bVar.f33757a;
            C14056j.m25569a(file, jSONObject);
            return jSONObject;
        } catch (Throwable th2) {
            C13849d.m25014a("NPTH_CATCH", th2);
            return null;
        }
    }

    /* renamed from: e */
    public final JSONObject mo22427e() {
        Map<String, String> map;
        boolean z;
        try {
            C13864b bVar = new C13864b();
            C13951b bVar2 = this.f33994a;
            if (bVar2 != null) {
                map = bVar2.f34000b.f33992a;
            } else {
                map = null;
            }
            if (map != null) {
                Object obj = (String) map.get("process_name");
                if (obj != null) {
                    bVar.mo22346a("process_name", obj);
                }
                String str = map.get("start_time");
                if (str != null) {
                    try {
                        bVar.mo22336a(Long.decode(str).longValue(), 0);
                    } catch (Throwable th) {
                        C13849d.m25014a("NPTH_CATCH", th);
                    }
                }
                String str2 = map.get("pid");
                if (str2 != null) {
                    try {
                        bVar.mo22346a("pid", Long.decode(str2));
                    } catch (Throwable th2) {
                        C13849d.m25014a("NPTH_CATCH", th2);
                    }
                }
                String str3 = map.get("start_pid");
                if (str3 != null) {
                    try {
                        bVar.mo22346a("start_pid", Long.decode(str3));
                    } catch (Throwable th3) {
                        C13849d.m25014a("NPTH_CATCH", th3);
                    }
                }
                Object obj2 = (String) map.get("crash_thread_name");
                if (obj2 != null) {
                    bVar.mo22346a("crash_thread_name", obj2);
                }
                String str4 = map.get("crash_time");
                if (str4 != null) {
                    try {
                        bVar.mo22346a("crash_time", Long.decode(str4));
                    } catch (Throwable th4) {
                        C13849d.m25014a("NPTH_CATCH", th4);
                    }
                }
                bVar.mo22346a("data", (Object) m25257h());
            }
            m25251a(bVar);
            m25252a(bVar, this.f33994a.f33999a.f34056i);
            if (C14056j.m25554a(bVar, this.f33994a.f34001c) != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bVar.mo22348b(C14043ac.m25507a());
                bVar.mo22340a("has_callback", "false");
            } else {
                bVar.mo22340a("has_callback", "true");
            }
            if (bVar.f33757a.opt("storage") == null) {
                bVar.mo22348b(C14043ac.m25507a());
            }
            Header header = new Header(this.f33997d);
            header.mo22331a(bVar.f33757a.optJSONObject("header"));
            bVar.mo22338a(header);
            Header.m25039a(header);
            C13864b a = Header.m25038a(bVar.f33757a.optString("process_name"), C13933m.f33936a, bVar.f33757a.optLong("app_start_time", 0), bVar.f33757a.optLong("crash_time", 0));
            if (C14062n.m25597a(header.f33753a)) {
                bVar.mo22345a(a.mo22335a().f33753a);
            } else {
                C14062n.m25594a(header.f33753a, a.mo22335a().f33753a);
            }
            C14062n.m25594a(bVar.mo22349b(), a.mo22349b());
            if (header.f33753a.has("params_err")) {
                C13864b.m25056a(bVar.f33757a, "filters", "params_err", header.f33753a.optString("params_err"));
            }
            C14077x.m25670a(bVar, header, CrashType.NATIVE);
            File file = new File(this.f33994a.f34001c, "javastack.txt");
            String str5 = "";
            if (file.exists()) {
                try {
                    str5 = C14042ab.m25487a(file.getAbsolutePath());
                } catch (Throwable th5) {
                    C13849d.m25014a("NPTH_CATCH", th5);
                }
            }
            File file2 = new File(this.f33994a.f34001c, "abortmsg.txt");
            if (file2.exists()) {
                String a2 = C13950a.m25264a(file2);
                if (!str5.isEmpty()) {
                    str5 = str5 + "\n" + a2;
                } else {
                    str5 = a2;
                }
            }
            try {
                if (!str5.isEmpty()) {
                    bVar.mo22346a("java_data", (Object) str5);
                }
            } catch (Throwable th6) {
                C13849d.m25014a("NPTH_CATCH", th6);
            }
            bVar.mo22346a("logcat", C14013j.m25406a(this.f33994a.f34001c.getName()));
            File file3 = new File(this.f33994a.f34001c, "flog.txt");
            if (file3.exists()) {
                try {
                    bVar.mo22346a("native_log", C14056j.m25577b(C14056j.m25561a(file3.getAbsolutePath(), "\n"), "\n"));
                } catch (Throwable th7) {
                    C13849d.m25014a("NPTH_CATCH", th7);
                }
            }
            m25254b(bVar);
            return bVar.f33757a;
        } catch (Throwable th8) {
            C13849d.m25014a("NPTH_CATCH", th8);
            return null;
        }
    }

    public C13949c(Context context) {
        this.f33997d = context;
    }

    /* renamed from: a */
    public final void mo22423a(File file) {
        this.f33994a = new C13951b(file);
        this.f33995b = file.getName();
    }

    /* renamed from: a */
    private void m25251a(C13864b bVar) {
        bVar.mo22346a("is_native_crash", (Object) 1);
        bVar.mo22346a("repack_time", Long.valueOf(System.currentTimeMillis()));
        bVar.mo22346a("crash_uuid", (Object) this.f33994a.f34001c.getName());
        bVar.mo22346a("jiffy", Long.valueOf(C14020o.C14021a.m25422a()));
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$a */
    static class C13950a {
        static {
            Covode.recordClassIndex(16013);
        }

        /* renamed from: a */
        public static String m25264a(File file) {
            Throwable th;
            MethodCollector.m26663i(1449);
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        C14061m.m25588a(bufferedReader2);
                        MethodCollector.m26664o(1449);
                        return "";
                    } else if (!readLine.startsWith("[FATAL:") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        C14061m.m25588a(bufferedReader2);
                        MethodCollector.m26664o(1449);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        sb.append("\n");
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                                sb.append("\n");
                            } else {
                                String sb2 = sb.toString();
                                C14061m.m25588a(bufferedReader2);
                                MethodCollector.m26664o(1449);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        C13849d.m25014a("NPTH_CATCH", th);
                        C14061m.m25588a(bufferedReader);
                        MethodCollector.m26664o(1449);
                        return "";
                    } catch (Throwable th3) {
                        C14061m.m25588a(bufferedReader);
                        MethodCollector.m26664o(1449);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                C13849d.m25014a("NPTH_CATCH", th);
                C14061m.m25588a(bufferedReader);
                MethodCollector.m26664o(1449);
                return "";
            }
        }
    }

    /* renamed from: b */
    private void m25254b(C13864b bVar) {
        boolean z;
        C13868e.m25088a(bVar.f33757a);
        HashMap hashMap = new HashMap();
        if (m25256g()) {
            hashMap.put("is_root", "true");
            bVar.mo22346a("is_root", "true");
        } else {
            hashMap.put("is_root", "false");
            bVar.mo22346a("is_root", "false");
        }
        if (m25253a(this.f33994a.f34001c, "asan_report")) {
            hashMap.put("has_asan", "true");
            if (this.f33996c != null) {
                hashMap.put("has_asan_file", "true");
            }
        }
        hashMap.put("sdk_version", "3.1.6-rc.13-ttp");
        if (bVar.f33757a.opt("java_data") != null) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("has_java_stack", String.valueOf(z));
        bVar.mo22340a("is_64_devices", String.valueOf(Header.m25040a()));
        bVar.mo22340a("is_64_runtime", String.valueOf(NativeTools.m25458a().mo22570c()));
        bVar.mo22340a("is_x86_devices", String.valueOf(Header.m25042b()));
        bVar.mo22344a(hashMap);
    }

    /* renamed from: a */
    private static void m25252a(C13864b bVar, Map<String, String> map) {
        if (!map.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                String f = NativeTools.m25460f(map.get(str));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", str);
                    jSONObject.put("lib_uuid", f);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C13849d.m25014a("NPTH_CATCH", e);
                }
            }
            bVar.mo22346a("crash_lib_uuid", (Object) jSONArray);
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$b */
    public class C13951b {

        /* renamed from: a */
        public final C13973h f33999a;

        /* renamed from: b */
        public final C13948b f34000b;

        /* renamed from: c */
        public final File f34001c;

        static {
            Covode.recordClassIndex(16014);
        }

        public C13951b(File file) {
            MethodCollector.m26663i(2770);
            this.f34001c = file;
            C13948b bVar = new C13948b(file);
            this.f34000b = bVar;
            C13973h hVar = new C13973h(file);
            this.f33999a = hVar;
            if (bVar.mo22422a() && hVar.f34054g == null) {
                File a = C14069r.m25621a(file);
                if (a.exists()) {
                    a.renameTo(new File(a.getAbsoluteFile() + ".old"));
                }
                if (NativeImpl.f33976a) {
                    NativeImpl.doRebuildTombstone(C14069r.m25625b(file).getAbsolutePath(), C14069r.m25621a(file).getAbsolutePath(), new File(C14069r.m25620a(C13933m.f33936a, file.getName()), "maps.txt").getAbsolutePath());
                }
                hVar.mo22442b(C14069r.m25621a(file));
            }
            MethodCollector.m26664o(2770);
        }
    }

    /* renamed from: a */
    private static boolean m25253a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().contains(str)) {
                    return true;
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
                C14056j.m25574a(file2);
            }
        }
        return false;
    }
}
