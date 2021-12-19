package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.C13870g;
import com.bytedance.crash.entity.Header;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.j */
public final class C14056j {
    static {
        Covode.recordClassIndex(16123);
    }

    /* renamed from: a */
    public static void m25566a(File file, String str, boolean z) {
        Throwable th;
        MethodCollector.m26663i(3164);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(3164);
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                C14061m.m25588a(fileOutputStream2);
                MethodCollector.m26664o(3164);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                C14061m.m25588a(fileOutputStream);
                MethodCollector.m26664o(3164);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C14061m.m25588a(fileOutputStream);
            MethodCollector.m26664o(3164);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m25569a(File file, JSONObject jSONObject) {
        if (jSONObject != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, false));
                try {
                    C14063o.m25610a(jSONObject, bufferedWriter2);
                    C14061m.m25588a(bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    C14061m.m25588a(bufferedWriter);
                }
            } catch (Throwable unused2) {
                C14061m.m25588a(bufferedWriter);
            }
        }
    }

    /* renamed from: a */
    public static void m25568a(File file, JSONArray jSONArray) {
        if (jSONArray != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, false));
                try {
                    C14063o.m25608a(jSONArray, bufferedWriter2);
                    C14061m.m25588a(bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    C14061m.m25588a(bufferedWriter);
                }
            } catch (Throwable unused2) {
                C14061m.m25588a(bufferedWriter);
            }
        }
    }

    /* renamed from: a */
    public static boolean m25574a(File file) {
        boolean a;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return m25584g(file);
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (!listFiles[i].isFile()) {
                    a = m25574a(listFiles[i]);
                } else if (listFiles[i].canWrite()) {
                    a = m25584g(listFiles[i]);
                } else {
                    z = false;
                }
                z &= a;
            }
        }
        return z & m25584g(file);
    }

    /* renamed from: a */
    public static JSONArray m25563a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m25562a(new File(str), -1);
    }

    /* renamed from: a */
    public static boolean m25575a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|18|20|21|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m25567a(java.io.File r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = 3650(0xe42, float:5.115E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            if (r7 == 0) goto L_0x000d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0011
        L_0x000d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0011:
            r1 = 0
            java.util.Properties r4 = new java.util.Properties     // Catch:{ IOException -> 0x004d }
            r4.<init>()     // Catch:{ IOException -> 0x004d }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004d }
            r3.<init>(r6)     // Catch:{ IOException -> 0x004d }
            java.util.Set r0 = r7.entrySet()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
        L_0x0024:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            r4.setProperty(r1, r0)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            goto L_0x0024
        L_0x0040:
            java.lang.String r0 = "no"
            r4.store(r3, r0)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            com.bytedance.crash.util.C14061m.m25588a(r3)
            goto L_0x0055
        L_0x0049:
            r0 = move-exception
            r1 = r3
            goto L_0x005a
        L_0x004c:
            r1 = r3
        L_0x004d:
            com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.C13933m.f33942g     // Catch:{ all -> 0x0059 }
            r0.isDebugMode()     // Catch:{ all -> 0x0059 }
            com.bytedance.crash.util.C14061m.m25588a(r1)
        L_0x0055:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            com.bytedance.crash.util.C14061m.m25588a(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14056j.m25567a(java.io.File, java.util.Map):void");
    }

    /* renamed from: a */
    public static void m25565a(File file, File file2, int i, boolean z) {
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.m26663i(3863);
        if (file == null || file2 == null || !file.exists() || (file2.exists() && !z)) {
            MethodCollector.m26664o(3863);
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, z);
                try {
                    byte[] bArr = new byte[8192];
                    int i2 = 0;
                    do {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        i2 += read;
                    } while (i2 < i);
                    C14061m.m25588a(fileInputStream2);
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    C14061m.m25588a(fileInputStream);
                    C14061m.m25588a(fileOutputStream);
                    MethodCollector.m26664o(3863);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    C14061m.m25588a(fileInputStream);
                    C14061m.m25588a(fileOutputStream);
                    MethodCollector.m26664o(3863);
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                C14061m.m25588a(fileInputStream);
                C14061m.m25588a(fileOutputStream);
                MethodCollector.m26664o(3863);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                C14061m.m25588a(fileInputStream);
                C14061m.m25588a(fileOutputStream);
                MethodCollector.m26664o(3863);
                throw th;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
            C14061m.m25588a(fileInputStream);
            C14061m.m25588a(fileOutputStream);
            MethodCollector.m26664o(3863);
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            C14061m.m25588a(fileInputStream);
            C14061m.m25588a(fileOutputStream);
            MethodCollector.m26664o(3863);
            throw th;
        }
        C14061m.m25588a(fileOutputStream);
        MethodCollector.m26664o(3863);
    }

    /* renamed from: a */
    public static void m25570a(OutputStream outputStream, C14058b... bVarArr) {
        Throwable th;
        MethodCollector.m26663i(3883);
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (C14058b bVar : bVarArr) {
                    m25571a(zipOutputStream2, bVar);
                }
                C14061m.m25588a(zipOutputStream2);
                MethodCollector.m26664o(3883);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                C14061m.m25588a(zipOutputStream);
                MethodCollector.m26664o(3883);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C14061m.m25588a(zipOutputStream);
            MethodCollector.m26664o(3883);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m25571a(ZipOutputStream zipOutputStream, C14058b bVar) {
        if (bVar != null) {
            if (bVar.f34234a != null || bVar.f34235b == null) {
                m25573a(zipOutputStream, bVar.f34234a, bVar.f34236c);
                return;
            }
            for (File file : bVar.f34235b) {
                m25573a(zipOutputStream, file, bVar.f34236c);
            }
        }
    }

    /* renamed from: a */
    private static void m25573a(ZipOutputStream zipOutputStream, File file, boolean z) {
        File[] fileArr;
        if (file != null && file.exists()) {
            if (z || !file.isDirectory()) {
                if (file.isDirectory()) {
                    fileArr = file.listFiles();
                    if (fileArr == null) {
                        return;
                    }
                } else {
                    fileArr = new File[]{file};
                }
                for (File file2 : fileArr) {
                    m25572a(zipOutputStream, file2, file2.getName());
                }
                return;
            }
            m25572a(zipOutputStream, file, file.getName());
        }
    }

    /* renamed from: a */
    public static void m25572a(ZipOutputStream zipOutputStream, File file, String str) {
        Throwable th;
        MethodCollector.m26663i(4034);
        if (file == null || !file.exists()) {
            MethodCollector.m26664o(4034);
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                MethodCollector.m26664o(4034);
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String str2 = str.length() == 0 ? "" : str + "/";
            for (File file2 : listFiles) {
                m25572a(zipOutputStream, file2, str2 + file2.getName());
            }
            MethodCollector.m26664o(4034);
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (-1 != read) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        C14061m.m25588a(fileInputStream2);
                        MethodCollector.m26664o(4034);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C14061m.m25588a(fileInputStream);
                MethodCollector.m26664o(4034);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C14061m.m25588a(fileInputStream);
            MethodCollector.m26664o(4034);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m25564a(File file, File file2) {
        m25565a(file, file2, Integer.MAX_VALUE, false);
    }

    /* renamed from: com.bytedance.crash.util.j$a */
    public static class C14057a implements FilenameFilter {

        /* renamed from: a */
        private String f34233a;

        static {
            Covode.recordClassIndex(16124);
        }

        public C14057a(String str) {
            this.f34233a = str;
        }

        public final boolean accept(File file, String str) {
            if (!str.equals(this.f34233a)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.crash.util.j$b */
    public static class C14058b {

        /* renamed from: a */
        public File f34234a;

        /* renamed from: b */
        public File[] f34235b;

        /* renamed from: c */
        public boolean f34236c;

        static {
            Covode.recordClassIndex(16125);
        }

        public C14058b(File file) {
            this.f34234a = file;
            this.f34236c = true;
        }

        public C14058b(File[] fileArr, boolean z) {
            this.f34235b = fileArr;
            this.f34236c = z;
        }
    }

    /* renamed from: b */
    public static boolean m25579b(File file) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m25581d(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            return NativeTools.m25458a().mo22571d(file2.getAbsolutePath());
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
            return -1;
        }
    }

    /* renamed from: b */
    public static C13870g m25576b(String str) {
        try {
            String a = m25561a(str, "\n");
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            C13870g gVar = new C13870g();
            gVar.f33777a = jSONObject.optString("url");
            gVar.f33778b = jSONObject.optJSONObject("body");
            gVar.f33779c = jSONObject.optString("dump_file");
            gVar.f33780d = jSONObject.optBoolean("encrypt", false);
            return gVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m25582e(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int d = NativeTools.m25458a().mo22571d(file.getAbsolutePath());
            if (d <= 0) {
                return true;
            }
            NativeTools.m25458a().mo22564b(d);
            return false;
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
            return false;
        }
    }

    /* renamed from: f */
    public static void m25583f(File file) {
        try {
            file.createNewFile();
        } catch (Throwable unused) {
            C13933m.f33942g.isDebugMode();
            C14075v.m25650a("err create file " + file.getAbsolutePath());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.bytedance.crash.C13933m.f33942g.isDebugMode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        com.bytedance.crash.util.C14061m.m25588a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3526);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m25580c(java.io.File r8) {
        /*
            r7 = 3526(0xdc6, float:4.941E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r7)
            r6 = 0
            java.util.Properties r5 = new java.util.Properties     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r5.<init>()     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r4.<init>(r8)     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r5.load(r4)     // Catch:{ IOException -> 0x003e }
            java.util.Set r0 = r5.stringPropertyNames()     // Catch:{ IOException -> 0x003e }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x003e }
            r3.<init>()     // Catch:{ IOException -> 0x003e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x003e }
        L_0x0020:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x003e }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x003e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x003e }
            java.lang.String r0 = r5.getProperty(r1)     // Catch:{ IOException -> 0x003e }
            r3.put(r1, r0)     // Catch:{ IOException -> 0x003e }
            goto L_0x0020
        L_0x0034:
            com.bytedance.crash.util.C14061m.m25588a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
            return r3
        L_0x003b:
            r0 = move-exception
            goto L_0x004c
        L_0x003d:
            r4 = r6
        L_0x003e:
            com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.C13933m.f33942g     // Catch:{ all -> 0x004a }
            r0.isDebugMode()     // Catch:{ all -> 0x004a }
            com.bytedance.crash.util.C14061m.m25588a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
            return r6
        L_0x004a:
            r0 = move-exception
            r6 = r4
        L_0x004c:
            com.bytedance.crash.util.C14061m.m25588a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14056j.m25580c(java.io.File):java.util.Map");
    }

    /* renamed from: g */
    private static boolean m25584g(File file) {
        MethodCollector.m26663i(3220);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3220);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3220);
        return delete;
    }

    /* renamed from: a */
    public static String m25557a(File file, String str) {
        return m25558a(file, str, -1);
    }

    /* renamed from: a */
    public static String m25561a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m25557a(new File(str), str2);
    }

    /* renamed from: b */
    public static JSONArray m25577b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static int m25554a(C13864b bVar, File file) {
        int i = -1;
        for (int i2 = 0; i2 < 6; i2++) {
            File file2 = new File(file, file.getName() + ".".concat(String.valueOf(i2)));
            if (file2.exists()) {
                try {
                    bVar.mo22351c(new JSONObject(m25561a(file2.getAbsolutePath(), "\n")));
                    bVar.mo22346a("succ_step", Integer.valueOf(i2));
                    i = i2;
                } catch (Throwable unused) {
                }
            }
        }
        bVar.mo22340a("succ_step", String.valueOf(i));
        return i;
    }

    /* renamed from: b */
    public static void m25578b(File file, File file2) {
        if (file.exists()) {
            if (file.isFile()) {
                if (file2.exists()) {
                    if (!file2.isDirectory()) {
                        m25584g(file2);
                    } else {
                        return;
                    }
                }
                m25565a(file, file2, Integer.MAX_VALUE, false);
                return;
            }
            if (!file2.exists()) {
                file2.mkdirs();
            } else if (file2.isFile()) {
                m25584g(file2);
            } else if (!file2.getName().equals(file.getName())) {
                return;
            }
            String[] list = file.list();
            for (String str : list) {
                m25578b(new File(file, str), new File(file2, str));
            }
        }
    }

    /* renamed from: a */
    public static C13870g m25556a(File file, CrashType crashType) {
        String javaCrashUploadUrl;
        C13864b a = m25555a(new File(file, "logEventStack"), file.getName().contains("oom"));
        m25554a(a, file);
        JSONObject optJSONObject = a.f33757a.optJSONObject("header");
        C13864b a2 = Header.m25038a(a.f33757a.optString("process_name"), C13933m.f33936a, a.f33757a.optLong("app_start_time", 0), a.f33757a.optLong("crash_time", 0));
        if (optJSONObject == null) {
            a.mo22345a(a2.mo22335a().f33753a);
        } else {
            C14062n.m25594a(optJSONObject, a2.mo22335a().f33753a);
        }
        C14062n.m25594a(a.mo22349b(), a2.mo22349b());
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject2 = a.f33757a.optJSONObject("header");
        if (optJSONObject2.optString("unique_key", null) == null) {
            try {
                optJSONObject2.put("unique_key", "android_" + C13933m.m25226b().mo22549a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable unused) {
            }
        }
        C13870g gVar = new C13870g();
        if (crashType == CrashType.LAUNCH) {
            javaCrashUploadUrl = C13933m.f33942g.getLaunchCrashUploadUrl();
        } else {
            javaCrashUploadUrl = C13933m.f33942g.getJavaCrashUploadUrl();
        }
        gVar.f33777a = javaCrashUploadUrl;
        gVar.f33778b = a.f33757a;
        gVar.f33780d = true;
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0116, code lost:
        if (r16 != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        r3 = "InvalidStack.NoStackAvailable: Not OOM.\n";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r16 != false) goto L_0x0118;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.entity.C13864b m25555a(java.io.File r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C14056j.m25555a(java.io.File, boolean):com.bytedance.crash.entity.b");
    }

    /* renamed from: a */
    public static JSONArray m25562a(File file, long j) {
        Throwable th;
        MethodCollector.m26663i(3286);
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    C14061m.m25588a(bufferedReader);
                    MethodCollector.m26664o(3286);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    C14061m.m25588a(bufferedReader2);
                    MethodCollector.m26664o(3286);
                    return jSONArray;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            C14061m.m25588a(bufferedReader);
            MethodCollector.m26664o(3286);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m25558a(File file, String str, long j) {
        Throwable th;
        MethodCollector.m26663i(3235);
        if (file == null || !file.exists()) {
            MethodCollector.m26664o(3235);
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    C14061m.m25588a(bufferedReader);
                    MethodCollector.m26664o(3235);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    if (!(sb.length() == 0 || str == null)) {
                        sb.append(str);
                    }
                    sb.append(readLine);
                } else {
                    C14061m.m25588a(bufferedReader2);
                    String sb2 = sb.toString();
                    MethodCollector.m26664o(3235);
                    return sb2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            C14061m.m25588a(bufferedReader);
            MethodCollector.m26664o(3235);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m25559a(File file, String str, String str2, JSONObject jSONObject) {
        return m25560a(file, str, str2, jSONObject, true);
    }

    /* renamed from: a */
    private static String m25560a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", true);
            m25569a(file2, jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return file2.getAbsolutePath();
    }
}
