package p4646ms.p4647bd.p4648o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: ms.bd.o.s1 */
public class C89933s1 {

    /* renamed from: a */
    private static final FileFilter f203814a = new C89934a();

    /* renamed from: ms.bd.o.s1$a */
    static class C89934a implements FileFilter {
        static {
            Covode.recordClassIndex(106031);
        }

        C89934a() {
        }

        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    static {
        Covode.recordClassIndex(106030);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|(4:9|10|11|12)|27|28|(2:25|26)(2:29|30)) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r1 != null) goto L_0x003a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[SYNTHETIC, Splitter:B:19:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m156046a(java.lang.String r6) {
        /*
            java.lang.String r5 = "0"
            r4 = 620(0x26c, float:8.69E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = 0
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x002b }
            r2.<init>(r6)     // Catch:{ all -> 0x002b }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0017
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r5
        L_0x0017:
            java.io.FileReader r1 = new java.io.FileReader
            r1.<init>(r2)
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0029 }
            r0.<init>(r1)     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = r0.readLine()     // Catch:{ all -> 0x002d }
            r0.close()     // Catch:{ all -> 0x003a }
            goto L_0x003a
        L_0x0029:
            r0 = r3
            goto L_0x002d
        L_0x002b:
            r1 = r3
            r0 = r1
        L_0x002d:
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            if (r1 != 0) goto L_0x003a
        L_0x0034:
            if (r3 != 0) goto L_0x003e
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r5
        L_0x003a:
            r1.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0034
        L_0x003e:
            java.lang.String r0 = r3.trim()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89933s1.m156046a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m156047a(HashMap<String, String> hashMap, String str) {
        String str2;
        try {
            str2 = hashMap.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r4 != null) goto L_0x0052;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A[SYNTHETIC, Splitter:B:22:0x0049] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.String> m156048b() {
        /*
            r6 = 640(0x280, float:8.97E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r1 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "/proc/cpuinfo"
            r4.<init>(r0)     // Catch:{ all -> 0x0046 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0047 }
            r3.<init>(r4)     // Catch:{ all -> 0x0047 }
        L_0x0017:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x001e
            goto L_0x0040
        L_0x001e:
            java.lang.String r0 = ":"
            r2 = 2
            java.lang.String[] r1 = r1.split(r0, r2)     // Catch:{ all -> 0x0044 }
            int r0 = r1.length     // Catch:{ all -> 0x0044 }
            if (r0 < r2) goto L_0x0017
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r0.trim()     // Catch:{ all -> 0x0044 }
            r0 = 1
            r0 = r1[r0]     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r0.trim()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0017
            r5.put(r2, r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0017
        L_0x0040:
            r3.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0052
        L_0x0044:
            r1 = r3
            goto L_0x0047
        L_0x0046:
            r4 = r1
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            if (r4 != 0) goto L_0x0052
        L_0x004e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        L_0x0052:
            r4.close()     // Catch:{ all -> 0x004e }
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89933s1.m156048b():java.util.HashMap");
    }

    /* renamed from: a */
    public static String m156045a() {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> b = m156048b();
            try {
                i = new File("/sys/devices/system/cpu/").listFiles(f203814a).length;
            } catch (Throwable unused) {
                i = -1;
            }
            jSONObject.put("core", i);
            jSONObject.put("pc", m156047a(b, "Processor"));
            jSONObject.put("hw", m156047a(b, "Hardware"));
            jSONObject.put("max", m156046a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", m156046a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", m156047a(b, "Features"));
        } catch (Throwable unused2) {
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2)) {
            return "{}";
        }
        return jSONObject2.trim();
    }
}
