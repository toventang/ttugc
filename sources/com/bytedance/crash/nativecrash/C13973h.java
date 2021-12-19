package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.util.C14061m;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14075v;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.nativecrash.h */
public final class C13973h {

    /* renamed from: k */
    private static final Pattern f34043k = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: l */
    private static final Pattern f34044l = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: m */
    private static final Pattern f34045m = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: n */
    private static final Pattern f34046n = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: o */
    private static final Pattern f34047o = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a */
    public String f34048a;

    /* renamed from: b */
    public String f34049b;

    /* renamed from: c */
    public String f34050c;

    /* renamed from: d */
    public String f34051d;

    /* renamed from: e */
    public String f34052e;

    /* renamed from: f */
    public String f34053f;

    /* renamed from: g */
    public String f34054g;

    /* renamed from: h */
    public boolean f34055h;

    /* renamed from: i */
    public final Map<String, String> f34056i = new HashMap();

    /* renamed from: j */
    private final Set<String> f34057j = new HashSet();

    /* renamed from: a */
    public final String mo22440a() {
        StringBuilder sb = new StringBuilder();
        String str = this.f34052e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f34053f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f34054g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    static {
        Covode.recordClassIndex(16036);
    }

    /* renamed from: b */
    private void m25297b() {
        for (String str : this.f34057j) {
            if (!this.f34056i.containsKey(str)) {
                Map<String, String> map = this.f34056i;
                NativeTools.m25458a();
                map.put(str, NativeTools.m25461g(str));
                C14075v.m25650a("getBuildId nextStart: " + str + " : " + this.f34056i.get(str));
            }
        }
    }

    /* renamed from: a */
    public final void mo22441a(File file) {
        mo22442b(C14069r.m25621a(file));
    }

    public C13973h(File file) {
        mo22442b(C14069r.m25621a(file));
    }

    /* renamed from: a */
    public static String m25296a(String str) {
        int lastIndexOf;
        String[] split = str.split("\\s+");
        if (split.length < 4) {
            return null;
        }
        String str2 = split[3];
        if (!str2.endsWith(".so") || str2.contains("/system/lib") || (lastIndexOf = str2.lastIndexOf(47)) == -1) {
            return null;
        }
        return str2.substring(lastIndexOf + 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22442b(File file) {
        Throwable th;
        MethodCollector.m26663i(2718);
        if (!file.exists() || file.length() == 0) {
            MethodCollector.m26664o(2718);
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null || i2 >= 64) {
                        break;
                    }
                    if (this.f34048a == null && readLine.startsWith("pid: ")) {
                        Matcher matcher = f34043k.matcher(readLine);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f34048a = matcher.group(1);
                            this.f34049b = matcher.group(2);
                            this.f34051d = matcher.group(3);
                            this.f34050c = matcher.group(4);
                        }
                    } else if (this.f34052e == null && readLine.startsWith("signal ")) {
                        Matcher matcher2 = f34044l.matcher(readLine);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String replace = matcher2.group(1).replace(" ", "");
                            String replace2 = matcher2.group(2).replace(" ", "");
                            int indexOf = replace2.indexOf("frompid");
                            if (indexOf > 0) {
                                replace2 = replace2.substring(0, indexOf) + ")";
                            }
                            this.f34052e = "Signal " + replace + ", Code " + replace2 + "\n";
                        }
                    } else if (this.f34053f == null && readLine.startsWith("Abort ")) {
                        Matcher matcher3 = f34045m.matcher(readLine);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            this.f34053f = "abort message: " + matcher3.group(1) + "\n";
                        }
                    } else if (this.f34053f == null && readLine.startsWith("Crash ")) {
                        Matcher matcher4 = f34046n.matcher(readLine);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            this.f34053f = "crash message: " + matcher4.group(1) + "\n";
                        }
                    } else if (this.f34054g == null && readLine.startsWith("backtrace:")) {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null || !readLine2.startsWith("    #")) {
                                i2++;
                                this.f34054g = sb.toString();
                            } else {
                                String substring = readLine2.substring(4);
                                sb.append(substring).append('\n');
                                String a = m25296a(substring);
                                if (a != null) {
                                    this.f34057j.add(a);
                                }
                            }
                        }
                        i2++;
                        this.f34054g = sb.toString();
                    } else if (this.f34056i.isEmpty() && readLine.startsWith("build id:")) {
                        while (true) {
                            String readLine3 = bufferedReader2.readLine();
                            if (readLine3 == null) {
                                break;
                            } else if (!readLine3.contains("BuildId:")) {
                                while (true) {
                                    if (!readLine3.startsWith("stack:")) {
                                        readLine3 = bufferedReader2.readLine();
                                        i++;
                                        if (i < 10) {
                                            if (readLine3 == null) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        this.f34055h = true;
                                        break;
                                    }
                                }
                            } else {
                                Matcher matcher5 = f34047o.matcher(readLine3);
                                if (matcher5.find()) {
                                    this.f34056i.put(matcher5.group(2), matcher5.group(3));
                                }
                            }
                        }
                        C14075v.m25650a("check complete end buildIds");
                    }
                    i2++;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        C13849d.m25014a("NPTH_CATCH", th);
                        C14061m.m25588a(bufferedReader);
                        MethodCollector.m26664o(2718);
                    } catch (Throwable th3) {
                        C14061m.m25588a(bufferedReader);
                        MethodCollector.m26664o(2718);
                        throw th3;
                    }
                }
            }
            C14075v.m25650a("check complete end");
            m25297b();
            C14061m.m25588a(bufferedReader2);
        } catch (Throwable th4) {
            th = th4;
            C13849d.m25014a("NPTH_CATCH", th);
            C14061m.m25588a(bufferedReader);
            MethodCollector.m26664o(2718);
        }
        MethodCollector.m26664o(2718);
    }
}
