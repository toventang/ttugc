package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.util.C14061m;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.nativecrash.a */
public final class C13947a {

    /* renamed from: g */
    private static final Pattern f33981g = Pattern.compile("(?<===).*?(?===ERROR)");

    /* renamed from: h */
    private static final Pattern f33982h = Pattern.compile("(?<=AddressSanitizer:).*?(?=on)");

    /* renamed from: i */
    private static final Pattern f33983i = Pattern.compile("(?<=asan/).*?(?=/asan_report)");

    /* renamed from: j */
    private static final Pattern f33984j = Pattern.compile("__asan_handle_no_return");

    /* renamed from: k */
    private static final Pattern f33985k = Pattern.compile("(?<=\\().*?(?=\\+)");

    /* renamed from: a */
    public String f33986a;

    /* renamed from: b */
    public String f33987b;

    /* renamed from: c */
    public String f33988c;

    /* renamed from: d */
    public long f33989d;

    /* renamed from: e */
    public final Map<String, String> f33990e = new HashMap();

    /* renamed from: f */
    private final boolean f33991f = true;

    static {
        Covode.recordClassIndex(16010);
    }

    public C13947a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.m26663i(4633);
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            MethodCollector.m26664o(4633);
            return;
        }
        this.f33989d = new Date(file.lastModified()).getTime();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("    #")) {
                        Matcher matcher = f33985k.matcher(readLine);
                        if (matcher.find() && matcher.group(0) != null) {
                            String str2 = matcher.group(0) + "\n";
                            if (str2.startsWith("/data/")) {
                                String name = new File(str2.trim()).getName();
                                NativeTools.m25458a();
                                String g = NativeTools.m25461g(name);
                                if (g != null) {
                                    this.f33990e.put(name, g);
                                } else {
                                    NativeTools.m25458a();
                                    String g2 = NativeTools.m25461g(str2);
                                    if (g2 != null) {
                                        this.f33990e.put(name, g2);
                                    }
                                }
                            }
                        }
                    }
                    sb.append(readLine + "\n");
                }
                this.f33988c = sb.toString();
            } catch (Throwable th2) {
                th = th2;
                try {
                    C13849d.m25014a("NPTH_CATCH", th);
                    C14061m.m25588a(bufferedReader);
                    MethodCollector.m26664o(4633);
                } catch (Throwable th3) {
                    C14061m.m25588a(bufferedReader);
                    MethodCollector.m26664o(4633);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            C13849d.m25014a("NPTH_CATCH", th);
            C14061m.m25588a(bufferedReader);
            MethodCollector.m26664o(4633);
        }
        C14061m.m25588a(bufferedReader);
        MethodCollector.m26664o(4633);
    }
}
