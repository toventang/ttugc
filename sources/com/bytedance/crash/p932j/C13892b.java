package com.bytedance.crash.p932j;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.entity.C13870g;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.C13947a;
import com.bytedance.crash.nativecrash.C13949c;
import com.bytedance.crash.nativecrash.C13953e;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p923a.C13815a;
import com.bytedance.crash.p927e.C13853a;
import com.bytedance.crash.p929g.C13876a;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14007g;
import com.bytedance.crash.runtime.C14013j;
import com.bytedance.crash.runtime.C14018m;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.C14020o;
import com.bytedance.crash.util.C14043ac;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14061m;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14073u;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.b */
public final class C13892b {

    /* renamed from: d */
    private static volatile C13892b f33820d;

    /* renamed from: j */
    private static File f33821j;

    /* renamed from: a */
    public final Context f33822a;

    /* renamed from: b */
    public HashMap<String, C13899b> f33823b;

    /* renamed from: c */
    public volatile boolean f33824c;

    /* renamed from: e */
    private final List<File> f33825e = new ArrayList();

    /* renamed from: f */
    private int f33826f = -1;

    /* renamed from: g */
    private final Runnable f33827g = new Runnable() {
        /* class com.bytedance.crash.p932j.C13892b.RunnableC138931 */

        static {
            Covode.recordClassIndex(15953);
        }

        public final void run() {
            C13892b.this.mo22378e();
        }
    };

    /* renamed from: h */
    private final Runnable f33828h = new Runnable() {
        /* class com.bytedance.crash.p932j.C13892b.RunnableC138942 */

        static {
            Covode.recordClassIndex(15954);
        }

        public final void run() {
            C13892b.this.mo22376c();
        }
    };

    /* renamed from: i */
    private final Runnable f33829i = new Runnable() {
        /* class com.bytedance.crash.p932j.C13892b.RunnableC138953 */

        /* renamed from: b */
        private int f33833b = 100;

        static {
            Covode.recordClassIndex(15955);
        }

        public final void run() {
            String valueOf;
            if (!C13815a.m24932a().mo22257b() || !C14073u.m25649b(C13892b.this.f33822a)) {
                int i = this.f33833b - 1;
                this.f33833b = i;
                if (i > 0) {
                    C14019n.m25421b().mo22552a(this, 1000);
                    return;
                }
                return;
            }
            for (C13899b bVar : C13892b.this.f33823b.values()) {
                bVar.f33862n = true;
                if (bVar.f33859k == null && bVar.f33857i != -1 && ((!bVar.f33850b.isEmpty() || !bVar.f33851c.isEmpty()) && !bVar.f33863o)) {
                    bVar.f33859k = new ArrayList<>();
                    String str = "null";
                    for (C13898a aVar : bVar.f33850b) {
                        List<String> a = C13815a.m24932a().mo22256a(aVar.f33845b, bVar.f33860l);
                        if (a != null) {
                            bVar.f33859k.addAll(a);
                        }
                        if (!CrashType.LAUNCH.getName().equals(str)) {
                            str = aVar.f33847d.getName();
                        }
                    }
                    for (C13898a aVar2 : bVar.f33851c) {
                        List<String> a2 = C13815a.m24932a().mo22256a(aVar2.f33845b, bVar.f33860l);
                        if (a2 != null) {
                            bVar.f33859k.addAll(a2);
                        }
                        if (!CrashType.LAUNCH.getName().equals(str)) {
                            str = aVar2.f33847d.getName();
                        }
                    }
                    if (!bVar.f33863o && bVar.f33862n) {
                        String a3 = C13815a.m24933a(bVar.f33859k, bVar.f33860l);
                        String[] strArr = new String[6];
                        boolean z = false;
                        strArr[0] = "check_result";
                        strArr[1] = a3;
                        strArr[2] = "crash_type";
                        strArr[3] = str;
                        strArr[4] = "alog_inited";
                        if (bVar.f33856h == 0) {
                            valueOf = "uncertain";
                        } else {
                            if (bVar.f33856h == 1) {
                                z = true;
                            }
                            valueOf = String.valueOf(z);
                        }
                        strArr[5] = valueOf;
                        C14018m.m25418a("alog_check", strArr);
                    }
                }
                C13892b.this.mo22371a(bVar);
            }
            C13892b.this.f33823b = null;
        }
    };

    static {
        Covode.recordClassIndex(15952);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22372a(HashMap<String, C13899b> hashMap) {
        File[] listFiles = new File(C14069r.m25640h(this.f33822a), "asdawd").listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (!file.isDirectory()) {
                        C14056j.m25574a(file);
                    } else if (file.getName().endsWith("G")) {
                        String name = file.getName();
                        if (hashMap.get(name) == null) {
                            hashMap.put(name, new C13899b(name));
                        }
                    } else {
                        C14056j.m25574a(file);
                    }
                } catch (Throwable th) {
                    C13849d.m25014a("NPTH_CATCH", th);
                    C14056j.m25574a(file);
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private static boolean m25136a(HashMap<String, C13899b> hashMap, File file, String str) {
        if (str.endsWith("G")) {
            String[] split = str.split("_");
            if (split.length < 5) {
                C14056j.m25574a(file);
                return false;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                long parseLong2 = Long.parseLong(split[4]);
                CrashType crashType = null;
                String str2 = split[2];
                String str3 = split[1];
                str3.hashCode();
                switch (str3.hashCode()) {
                    case -1109843021:
                        if (str3.equals("launch")) {
                            crashType = CrashType.LAUNCH;
                            break;
                        }
                        break;
                    case 96741:
                        if (str3.equals("anr")) {
                            crashType = CrashType.ANR;
                            break;
                        }
                        break;
                    case 3254818:
                        if (str3.equals("java")) {
                            crashType = CrashType.JAVA;
                            break;
                        }
                        break;
                }
                C13899b bVar = hashMap.get(str2);
                if (bVar == null) {
                    bVar = new C13899b(str2);
                    hashMap.put(str2, bVar);
                }
                C13898a aVar = new C13898a(file, parseLong, crashType);
                aVar.f33846c = parseLong2;
                if ((bVar.f33852d == null || bVar.f33852d.f33845b > aVar.f33845b) && crashType != null && crashType != CrashType.ANR && !str.contains("ignore")) {
                    bVar.f33852d = aVar;
                }
                bVar.f33850b.add(aVar);
                return true;
            } catch (Throwable unused) {
                C14056j.m25574a(file);
                C13849d.m25014a("NPTH_CATCH", new RuntimeException("err format crashTime:".concat(String.valueOf(str))));
                return false;
            }
        } else {
            C14056j.m25574a(file);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m25135a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().startsWith(str) && file2.length() > 0) {
                    f33821j = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m25134a(C13949c cVar, File file, File file2, boolean z) {
        if (!file.exists()) {
            return false;
        }
        if (!file2.exists()) {
            return true;
        }
        File file3 = new File(file2, C13933m.m25228d());
        if (!file3.exists()) {
            file3.mkdir();
        }
        String path = file.getPath();
        cVar.f33996c = new C13947a(path);
        cVar.f33995b = path;
        cVar.mo22423a(file3);
        if (C14069r.m25636f(this.f33822a).listFiles() == null) {
            throw new NullPointerException("array-length");
        }
        C14056j.m25564a(file, new File(file3, file.getName()));
        JSONObject d = cVar.mo22426d();
        if (d == null || d.length() == 0) {
            cVar.mo22428f();
            return true;
        } else if (!z || d.length() == 0) {
            return true;
        } else {
            File file4 = new File(file3, "dump.zip");
            C13905e.m25158a();
            if (!C13905e.m25160a(d, file4, file3)) {
                return true;
            }
            C14056j.m25574a(file);
            if (cVar.mo22428f()) {
                return true;
            }
            C14007g.m25392b(file3);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22373a(boolean z) {
        File[] listFiles = C14069r.m25634e(this.f33822a).listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            C13949c cVar = new C13949c(this.f33822a);
            ArrayList arrayList = new ArrayList();
            m25131a(cVar, C14069r.m25634e(this.f33822a), arrayList);
            File[] listFiles2 = C14069r.m25636f(this.f33822a).listFiles();
            if (listFiles2.length != 0) {
                int i = 0;
                while (i < listFiles2.length && i < 5) {
                    this.f33825e.addAll(arrayList);
                    if (!this.f33825e.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        m25137b(cVar, C14069r.m25636f(this.f33822a), arrayList2);
                        if (arrayList2.size() == 0) {
                            for (int i2 = 0; i2 < this.f33825e.size(); i2++) {
                                m25134a(cVar, this.f33825e.get(i2), C14069r.m25636f(this.f33822a), z);
                            }
                        } else if (arrayList2.size() > 0) {
                            for (int i3 = 0; i3 < this.f33825e.size(); i3++) {
                                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                    if (arrayList2.get(i4).equals(this.f33825e.get(i3).getName())) {
                                        this.f33825e.remove(i3);
                                    }
                                }
                            }
                            if (this.f33825e.size() > 0) {
                                for (int i5 = 0; i5 < this.f33825e.size(); i5++) {
                                    m25134a(cVar, this.f33825e.get(i5), C14069r.m25636f(this.f33822a), z);
                                }
                            }
                        }
                    }
                    i++;
                }
                return;
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                m25134a(cVar, arrayList.get(i6), C14069r.m25636f(this.f33822a), z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo22377d() {
        this.f33824c = true;
        NativeImpl.m25249c();
        AbstractC13901d.m25155b();
    }

    /* renamed from: com.bytedance.crash.j.b$b */
    public static class C13899b {

        /* renamed from: a */
        String f33849a;

        /* renamed from: b */
        public List<C13898a> f33850b = new ArrayList();

        /* renamed from: c */
        public List<C13898a> f33851c = new ArrayList();

        /* renamed from: d */
        C13898a f33852d;

        /* renamed from: e */
        C13898a f33853e;

        /* renamed from: f */
        boolean f33854f;

        /* renamed from: g */
        int f33855g;

        /* renamed from: h */
        int f33856h = 0;

        /* renamed from: i */
        public long f33857i = -1;

        /* renamed from: j */
        public int f33858j = -1;

        /* renamed from: k */
        ArrayList<String> f33859k;

        /* renamed from: l */
        String f33860l;

        /* renamed from: m */
        boolean f33861m;

        /* renamed from: n */
        boolean f33862n = false;

        /* renamed from: o */
        boolean f33863o = false;

        /* renamed from: p */
        C13953e.C13956c f33864p;

        /* renamed from: q */
        String f33865q;

        /* renamed from: r */
        String f33866r;

        /* renamed from: s */
        String f33867s;

        /* renamed from: t */
        Long f33868t = 0L;

        /* renamed from: u */
        int f33869u = -1;

        static {
            Covode.recordClassIndex(15959);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo22382a() {
            if (!C14069r.m25620a(C13933m.f33936a, this.f33849a).exists()) {
                this.f33863o = true;
            }
        }

        /* renamed from: a */
        public final void mo22383a(JSONObject jSONObject) {
            C13953e.C13956c cVar = this.f33864p;
            if (cVar != null) {
                cVar.mo22429a(jSONObject);
            }
        }

        C13899b(String str) {
            this.f33849a = str;
            String[] split = str.substring(0, str.length() - 1).split("-");
            if (split.length >= 2) {
                try {
                    this.f33857i = Long.decode(split[1]).longValue();
                } catch (Throwable unused) {
                }
            }
            if (split.length >= 3) {
                try {
                    this.f33858j = Integer.decode(split[2]).intValue();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo22374b() {
        try {
            if (this.f33824c) {
                return;
            }
            if (C14044b.m25518b(C13933m.f33936a)) {
                C14019n.m25421b().mo22551a(this.f33828h);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C13892b m25129a() {
        MethodCollector.m26663i(3463);
        if (f33820d == null) {
            synchronized (C13892b.class) {
                try {
                    if (f33820d == null) {
                        f33820d = new C13892b(C13933m.f33936a);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3463);
                    throw th;
                }
            }
        }
        C13892b bVar = f33820d;
        MethodCollector.m26664o(3463);
        return bVar;
    }

    /* renamed from: e */
    public final void mo22378e() {
        if (this.f33824c || C13934n.f33962h) {
            return;
        }
        if (C14073u.m25649b(this.f33822a)) {
            mo22376c();
        } else {
            C14019n.m25421b().mo22552a(this.f33827g, 5000);
        }
    }

    /* renamed from: f */
    private static boolean m25140f() {
        if (C13868e.m25089a()) {
            return true;
        }
        File d = C14069r.m25631d(C13933m.f33936a);
        if (!d.exists() || !d.isDirectory()) {
            d.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (m25135a(d, "record")) {
            try {
                long parseLong = Long.parseLong(C14056j.m25557a(f33821j, "\n"));
                if (currentTimeMillis > parseLong && currentTimeMillis - parseLong < 604800) {
                    return false;
                }
                if (currentTimeMillis > parseLong && currentTimeMillis - parseLong >= 604800) {
                    C14056j.m25574a(f33821j);
                    return true;
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        } else if (!C13933m.m25227c()) {
            File file = new File(d, "record");
            f33821j = file;
            try {
                C14056j.m25566a(file, Long.toString(currentTimeMillis), false);
            } catch (Throwable th2) {
                C13849d.m25014a("NPTH_CATCH", th2);
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v90, resolved type: org.json.JSONObject */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:140|141|142|(7:149|150|(1:152)|153|154|155|(2:157|(2:159|(2:161|(2:163|(2:165|(3:167|168|169))(1:170))(4:171|(1:173)(1:176)|177|178))(1:179))(1:180))(1:181))(3:146|147|148)|182|183|184|(1:186)(1:187)|188|(1:192)|193|(1:195)(2:196|(1:198)(2:199|(1:201)(2:202|(2:207|(1:209)(2:210|(1:215)(1:214)))(1:206))))|216|(2:217|218)|221) */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04a6, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x033e */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0474  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22376c() {
        /*
        // Method dump skipped, instructions count: 1301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p932j.C13892b.mo22376c():void");
    }

    /* renamed from: a */
    public final void mo22371a(C13899b bVar) {
        if (!bVar.f33861m) {
            C14056j.m25574a(C14069r.m25620a(this.f33822a, bVar.f33849a));
            C14056j.m25574a(C14069r.m25622a(bVar.f33849a));
        }
    }

    private C13892b(Context context) {
        this.f33822a = context;
    }

    /* renamed from: a */
    static void m25132a(File file) {
        String[] list = file.list();
        if (list != null && list.length > 10) {
            try {
                Arrays.sort(list);
                int i = 0;
                for (String str : list) {
                    i++;
                    if (i > 10) {
                        C14056j.m25574a(new File(file, str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22375b(HashMap<String, C13899b> hashMap) {
        File[] listFiles = C14069r.m25640h(this.f33822a).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (!file.getName().equals("asdawd")) {
                        if (!file.isDirectory()) {
                            C14056j.m25574a(file);
                        } else if (file.getName().endsWith("G")) {
                            String name = file.getName();
                            if (hashMap.get(name) == null) {
                                hashMap.put(name, new C13899b(name));
                            }
                        } else {
                            C14056j.m25574a(file);
                        }
                    }
                } catch (Throwable th) {
                    C13849d.m25014a("NPTH_CATCH", th);
                    C14056j.m25574a(file);
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    private static boolean m25139b(C13899b bVar) {
        ZipOutputStream zipOutputStream;
        Throwable th;
        MethodCollector.m26663i(374);
        if (bVar.f33866r == null) {
            MethodCollector.m26664o(374);
            return false;
        }
        File a = C14069r.m25622a(bVar.f33849a);
        if (C13994b.m25329a("custom_event_settings", "npth_simple_setting", "upload_core_dump") == 1) {
            File[] listFiles = a.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                bVar.f33869u = 0;
                MethodCollector.m26664o(374);
                return false;
            }
            boolean z = false;
            for (File file : listFiles) {
                try {
                    if (file.getName().startsWith("core-") && file.length() > 0) {
                        if (Long.valueOf(Long.parseLong(bVar.f33867s.trim())).longValue() == file.length()) {
                            z = true;
                        } else {
                            bVar.f33868t = Long.valueOf(file.length());
                        }
                    }
                } catch (Throwable th2) {
                    C13849d.m25014a("NPTH_CATCH", th2);
                    C14056j.m25574a(file);
                }
            }
            if (!z) {
                bVar.f33869u = 3;
                C14056j.m25574a(a);
                MethodCollector.m26664o(374);
                return false;
            } else if (!m25140f()) {
                bVar.f33869u = 2;
                C14056j.m25574a(a);
                MethodCollector.m26664o(374);
                return false;
            } else if (C13888a.m25124c()) {
                File file2 = new File(C14069r.m25640h(C13933m.f33936a).getAbsolutePath() + "/coredump.zip");
                try {
                    String absolutePath = a.getAbsolutePath();
                    String absolutePath2 = file2.getAbsolutePath();
                    File file3 = new File(absolutePath);
                    try {
                        new File(absolutePath2).getParentFile().mkdirs();
                        zipOutputStream = new ZipOutputStream(new FileOutputStream(absolutePath2));
                        try {
                            C14056j.m25572a(zipOutputStream, file3, "");
                            C14061m.m25588a(zipOutputStream);
                            if ("wifi".equals(bVar.f33865q) || file2.length() <= 36700160) {
                                boolean a2 = C13907f.m25170a(file2, bVar.f33866r);
                                MethodCollector.m26664o(374);
                                return a2;
                            }
                            bVar.f33869u = 4;
                            MethodCollector.m26664o(374);
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            C14061m.m25588a(zipOutputStream);
                            MethodCollector.m26664o(374);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        zipOutputStream = null;
                        C14061m.m25588a(zipOutputStream);
                        MethodCollector.m26664o(374);
                        throw th;
                    }
                } catch (Throwable th5) {
                    C13849d.m25014a("NPTH_CATCH", th5);
                }
            } else {
                bVar.f33869u = 5;
                C14056j.m25574a(a);
                MethodCollector.m26664o(374);
                return false;
            }
        } else {
            bVar.f33869u = 1;
            C14056j.m25574a(a);
            MethodCollector.m26664o(374);
            return false;
        }
    }

    /* renamed from: com.bytedance.crash.j.b$a */
    public static class C13898a {

        /* renamed from: a */
        public File f33844a;

        /* renamed from: b */
        long f33845b = -1;

        /* renamed from: c */
        long f33846c = -1;

        /* renamed from: d */
        CrashType f33847d;

        /* renamed from: e */
        String f33848e;

        static {
            Covode.recordClassIndex(15958);
        }

        C13898a(File file, CrashType crashType) {
            this.f33844a = file;
            this.f33847d = crashType;
            this.f33848e = file.getName();
        }

        C13898a(File file, long j, CrashType crashType) {
            this.f33844a = file;
            this.f33845b = j;
            this.f33847d = crashType;
            this.f33848e = file.getName();
        }
    }

    /* renamed from: b */
    public static void m25138b(HashMap<String, C13899b> hashMap, FilenameFilter filenameFilter) {
        File[] listFiles;
        if (filenameFilter == null) {
            listFiles = C14069r.m25619a(C13933m.f33936a).listFiles();
        } else {
            listFiles = C14069r.m25619a(C13933m.f33936a).listFiles(filenameFilter);
        }
        if (listFiles != null) {
            Arrays.sort(listFiles, Collections.reverseOrder());
            int i = 0;
            for (int i2 = 0; i2 < listFiles.length && i < 5; i2++) {
                File file = listFiles[i2];
                try {
                    if (C14007g.m25389a(file)) {
                        C14056j.m25574a(file);
                    } else if (!C14056j.m25582e(file)) {
                        C13853a a = C13853a.m25018a();
                        if (!a.f33728c.containsKey(file.getName())) {
                            if (file.isFile()) {
                                C14056j.m25574a(file);
                            } else if (m25136a(hashMap, file, file.getName())) {
                                i++;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C13849d.m25014a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25133a(HashMap<String, C13899b> hashMap, FilenameFilter filenameFilter) {
        File[] listFiles;
        if (filenameFilter == null) {
            listFiles = C14069r.m25636f(C13933m.f33936a).listFiles();
        } else {
            listFiles = C14069r.m25636f(C13933m.f33936a).listFiles(filenameFilter);
        }
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (!file.isDirectory() || C14007g.m25389a(file)) {
                        C14056j.m25574a(file);
                        i++;
                    } else {
                        if (file.getName().endsWith("G")) {
                            String name = file.getName();
                            C13899b bVar = hashMap.get(name);
                            if (bVar == null) {
                                bVar = new C13899b(name);
                                hashMap.put(name, bVar);
                            }
                            bVar.f33851c.add(new C13898a(file, CrashType.NATIVE));
                        } else {
                            C14056j.m25574a(file);
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    C13849d.m25014a("NPTH_CATCH", th);
                    C14056j.m25574a(file);
                }
            }
        }
    }

    /* renamed from: b */
    private void m25137b(C13949c cVar, File file, List<String> list) {
        File[] listFiles = file.listFiles();
        int i = 0;
        while (i < listFiles.length && i < 5) {
            File file2 = listFiles[i];
            try {
                if (file2.isDirectory()) {
                    m25137b(cVar, file2, list);
                } else if (file2.getName().contains("asan_report.")) {
                    list.add(file2.getName());
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
                C14056j.m25574a(file2);
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m25131a(C13949c cVar, File file, List<File> list) {
        File[] listFiles = file.listFiles();
        int i = 0;
        while (i < listFiles.length && i < 5) {
            File file2 = listFiles[i];
            try {
                if (file2.isDirectory()) {
                    m25131a(cVar, file2, list);
                } else {
                    list.add(file2);
                }
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
                C14056j.m25574a(file2);
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016d, code lost:
        if (r31.f33853e.f33845b >= r10.f33845b) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0175, code lost:
        if (r10.f33848e.contains("ignore") != false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        com.bytedance.crash.entity.C13864b.m25056a(r4, "filters", "aid", java.lang.String.valueOf(r5.opt("aid")));
        com.bytedance.crash.entity.C13864b.m25056a(r4, "filters", "has_ignore", java.lang.String.valueOf(r10.f33848e.contains("ignore")));
        r5.put("aid", 2010);
        r0 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0199, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        com.bytedance.crash.C13849d.m25014a("NPTH_CATCH", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d2, code lost:
        r0 = th;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25130a(final com.bytedance.crash.p932j.C13892b.C13899b r31, boolean r32, com.bytedance.crash.runtime.C14007g r33) {
        /*
        // Method dump skipped, instructions count: 498
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p932j.C13892b.m25130a(com.bytedance.crash.j.b$b, boolean, com.bytedance.crash.runtime.g):void");
    }

    /* renamed from: a */
    private C13870g m25128a(File file, CrashType crashType, String str, long j, long j2) {
        Throwable th;
        boolean z;
        C13870g gVar = null;
        try {
            if (file.isFile()) {
                C14056j.m25574a(file);
                return null;
            }
            if (crashType == CrashType.LAUNCH) {
                z = true;
            } else {
                z = false;
            }
            if (crashType != null && !new File(file, file.getName()).exists()) {
                if (crashType != CrashType.ANR) {
                    C13870g a = C14056j.m25556a(file, crashType);
                    try {
                        JSONObject jSONObject = a.f33778b;
                        if (a.f33778b != null) {
                            jSONObject.put("crash_time", j);
                            jSONObject.put("app_start_time", j2);
                            JSONObject optJSONObject = jSONObject.optJSONObject("header");
                            if (optJSONObject != null && z) {
                                try {
                                    jSONObject.remove("header");
                                } catch (Throwable th2) {
                                    th = th2;
                                    gVar = a;
                                    C14056j.m25574a(file);
                                    C13849d.m25014a("NPTH_CATCH", th);
                                    return gVar;
                                }
                            }
                            String optString = optJSONObject.optString("sdk_version_name", null);
                            if (optString == null) {
                                optString = "3.1.6-rc.13-ttp";
                            }
                            C13864b.m25056a(jSONObject, "filters", "sdk_version", optString);
                            if (C14056j.m25575a(jSONObject.optJSONArray("logcat"))) {
                                jSONObject.put("logcat", C14013j.m25406a(str));
                            }
                            C13864b.m25056a(jSONObject, "filters", "has_dump", "true");
                            C13864b.m25056a(jSONObject, "filters", "is_64_devices", String.valueOf(Header.m25040a()));
                            C13864b.m25056a(jSONObject, "filters", "is_64_runtime", String.valueOf(NativeTools.m25458a().mo22570c()));
                            C13864b.m25056a(jSONObject, "filters", "is_x86_devices", String.valueOf(Header.m25042b()));
                            C13864b.m25056a(jSONObject, "filters", "is_root", String.valueOf(C13949c.m25256g()));
                            try {
                                jSONObject.put("launch_did", C13876a.m25101a(this.f33822a));
                                jSONObject.put("crash_uuid", file.getName());
                                try {
                                    jSONObject.put("jiffy", C14020o.C14021a.m25422a());
                                    jSONObject.put("has_dump", "true");
                                    if (jSONObject.opt("storage") == null) {
                                        try {
                                            C13864b.m25059a(jSONObject, C14043ac.m25507a());
                                        } catch (Throwable th3) {
                                            th = th3;
                                            gVar = a;
                                            C14056j.m25574a(file);
                                            C13849d.m25014a("NPTH_CATCH", th);
                                            return gVar;
                                        }
                                    }
                                    if (optJSONObject.has("params_err")) {
                                        C13864b.m25056a(jSONObject, "filters", "params_err", optJSONObject.optString("params_err"));
                                    }
                                    C13868e.m25088a(jSONObject);
                                    if (z) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject.put("event_type", "start_crash");
                                        jSONObject.put("stack", jSONObject.remove("data"));
                                        jSONObject2.put("data", new JSONArray().put(jSONObject));
                                        jSONObject2.put("header", optJSONObject);
                                        try {
                                            a.f33778b = jSONObject2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            gVar = a;
                                            C14056j.m25574a(file);
                                            C13849d.m25014a("NPTH_CATCH", th);
                                            return gVar;
                                        }
                                    } else {
                                        jSONObject.put("isJava", 1);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    gVar = a;
                                    C14056j.m25574a(file);
                                    C13849d.m25014a("NPTH_CATCH", th);
                                    return gVar;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                gVar = a;
                                C14056j.m25574a(file);
                                C13849d.m25014a("NPTH_CATCH", th);
                                return gVar;
                            }
                        } else {
                            C14056j.m25574a(file);
                        }
                        return a;
                    } catch (Throwable th7) {
                        th = th7;
                        gVar = a;
                        C14056j.m25574a(file);
                        C13849d.m25014a("NPTH_CATCH", th);
                        return gVar;
                    }
                }
            }
            try {
                return C14056j.m25576b(new File(file, file.getName()).getAbsolutePath());
            } catch (Throwable th8) {
                th = th8;
                C14056j.m25574a(file);
                C13849d.m25014a("NPTH_CATCH", th);
                return gVar;
            }
        } catch (Throwable th9) {
            th = th9;
            C14056j.m25574a(file);
            C13849d.m25014a("NPTH_CATCH", th);
            return gVar;
        }
    }
}
