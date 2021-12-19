package com.toutiao.proxyserver.p4495g;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.C87383u;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.net.C87361d;
import com.toutiao.proxyserver.net.C87363e;
import com.toutiao.proxyserver.p4491c.C87299a;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4493e.C87312c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.toutiao.proxyserver.g.b */
public final class C87328b {

    /* renamed from: a */
    public static final Charset f197937a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Handler f197938b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final ExecutorService f197939c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static void m151555a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m151553a(java.io.RandomAccessFile r1) {
        /*
            if (r1 == 0) goto L_0x000c
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ all -> 0x0009 }
            r0.sync()     // Catch:{ all -> 0x0009 }
        L_0x0009:
            r1.close()     // Catch:{ all -> 0x000c }
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p4495g.C87328b.m151553a(java.io.RandomAccessFile):void");
    }

    /* renamed from: a */
    public static boolean m151558a(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r1 = com.toutiao.proxyserver.C87383u.f198087g;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m151551a(com.toutiao.proxyserver.net.C87363e r8, boolean r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p4495g.C87328b.m151551a(com.toutiao.proxyserver.net.e, boolean, boolean):void");
    }

    /* renamed from: a */
    private static JSONObject m151550a(C87363e eVar, C87361d dVar) {
        C87299a a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Range", dVar.mo141398a("Range"));
            jSONObject.put("Vpwp-Type", dVar.mo141398a("Vpwp-Type"));
            jSONObject.put("Vpwp-Mp-Range", dVar.mo141398a("Vpwp-Mp-Range"));
            jSONObject.put("Content-Range", eVar.mo141402a("Content-Range"));
            jSONObject.put("Content-Type", eVar.mo141402a("Content-Type"));
            jSONObject.put("Content-Length", eVar.mo141402a("Content-Length"));
            jSONObject.put("url", eVar.f198028a.f198016a);
            String a2 = dVar.mo141398a("Vpwp-Key");
            jSONObject.put("Vpwp-Key", a2);
            int i = 0;
            if (m151544a(dVar.mo141398a("Vpwp-Flag"), 0) == 1) {
                i = 1;
            }
            C87301c cVar = C87383u.f198084d;
            if (!(cVar == null || (a = cVar.mo141334a(a2, i)) == null)) {
                jSONObject.put("DB-Content-Type", a.f197881b);
                jSONObject.put("DB-Content-Length", a.f197882c);
                jSONObject.put("DB-extra", a.f197884e);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m151554a(Runnable runnable) {
        if (m151563b()) {
            f197939c.execute(runnable);
            C87312c.m151525c("TAG_PROXY_UTIL", "invoke in pool thread", null);
            return;
        }
        runnable.run();
        C87312c.m151525c("TAG_PROXY_UTIL", "invoke calling thread", null);
    }

    /* renamed from: a */
    public static void m151556a(List<C87360c> list) {
        if (list != null) {
            C87312c.m151524b("TAG_PROXY_PRE_FILTER", list.toString(), null);
            m151557a(list, "Host");
            m151557a(list, "Keep-Alive");
            List<C87360c> b = m151561b(list, "Connection");
            if (b != null && !b.isEmpty()) {
                for (C87360c cVar : b) {
                    List<String> f = m151567f(cVar.f198015b);
                    if (f != null) {
                        for (String str : f) {
                            m151557a(list, str);
                        }
                    }
                }
            }
            m151557a(list, "Connection");
            List<C87360c> b2 = m151561b(list, "Proxy-Connection");
            if (b2 != null && !b2.isEmpty()) {
                for (C87360c cVar2 : b2) {
                    List<String> f2 = m151567f(cVar2.f198015b);
                    if (f2 != null) {
                        for (String str2 : f2) {
                            m151557a(list, str2);
                        }
                    }
                }
            }
            m151557a(list, "Proxy-Connection");
            C87312c.m151524b("TAG_PROXY_PRE_FILTER", list.toString(), null);
        }
    }

    /* renamed from: a */
    private static void m151557a(List<C87360c> list, String str) {
        Iterator<C87360c> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f198014a.equalsIgnoreCase(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static int m151542a() {
        int i = Build.VERSION.SDK_INT;
        return Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }

    /* renamed from: b */
    private static boolean m151563b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103224);
    }

    /* renamed from: a */
    public static void m151552a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m151562b(Runnable runnable) {
        if (m151563b()) {
            runnable.run();
        } else {
            f197938b.post(runnable);
        }
    }

    /* renamed from: d */
    private static boolean m151565d(String str) {
        if (str == null || !str.startsWith("text/")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m151566e(String str) {
        if (str == null || !str.startsWith("audio/")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m151564c(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<String> m151549a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (m151558a(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m151559b(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = null;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt > 31 ? charAt < 127 : charAt == '\t') {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else if (sb == null) {
                sb = new StringBuilder(str.substring(0, i));
            }
        }
        if (sb == null) {
            return str;
        }
        return sb.toString();
    }

    /* renamed from: f */
    private static List<String> m151567f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim)) {
                    arrayList.add(trim);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m151543a(C87363e eVar) {
        int lastIndexOf;
        if (eVar == null) {
            return -1;
        }
        if (eVar.f198029b == 200) {
            return m151544a(eVar.mo141403a("Content-Length", null), -1);
        }
        if (eVar.f198029b == 206) {
            String a = eVar.mo141403a("Content-Range", null);
            if (!TextUtils.isEmpty(a) && (lastIndexOf = a.lastIndexOf("/")) >= 0 && lastIndexOf < a.length() - 1) {
                return m151544a(a.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static String m151560b(List<C87360c> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (C87360c cVar : list) {
            sb.append(cVar.f198014a).append(": ").append(cVar.f198015b).append("\r\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m151548a(InputStream inputStream) {
        MethodCollector.m26663i(10159);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                inputStream.close();
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                MethodCollector.m26664o(10159);
                throw th;
            }
        }
        inputStream.close();
        String sb2 = sb.toString();
        MethodCollector.m26664o(10159);
        return sb2;
    }

    /* renamed from: a */
    public static int m151544a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: b */
    private static List<C87360c> m151561b(List<C87360c> list, String str) {
        ArrayList arrayList = null;
        for (C87360c cVar : list) {
            if (cVar.f198014a.equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m151546a(C87299a aVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\n");
        sb.append("Content-Type: ").append(aVar.f197881b).append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ").append(aVar.f197882c).append("\r\n");
        } else {
            sb.append("Content-Range: bytes ").append(i).append("-").append(aVar.f197882c - 1).append("/").append(aVar.f197882c).append("\r\n");
            sb.append("Content-Length: ").append(aVar.f197882c - i).append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        C87312c.m151524b("TAG_PROXY_WRITE_TO_MP", sb2, null);
        return sb2;
    }

    /* renamed from: a */
    public static String m151547a(C87363e eVar, int i) {
        int a;
        if (eVar == null || !eVar.mo141404a()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.mo141405b().toUpperCase()).append(' ').append(eVar.f198029b).append(' ').append(eVar.mo141406c()).append("\r\n");
        C87312c.m151524b("TAG_PROXY_headers", eVar.mo141405b().toUpperCase() + " " + eVar.f198029b + " " + eVar.mo141406c(), null);
        List<C87360c> list = eVar.f198030c;
        m151556a(list);
        boolean z = true;
        for (C87360c cVar : list) {
            String str = cVar.f198014a;
            String str2 = cVar.f198015b;
            sb.append(str).append(": ").append(str2).append("\r\n");
            if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                z = false;
            }
        }
        if (z && (a = m151543a(eVar)) > 0) {
            sb.append("Content-Range: bytes ").append(Math.max(i, 0)).append("-").append(a - 1).append("/").append(a).append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        C87312c.m151524b("TAG_PROXY_WRITE_TO_MP", sb2, null);
        return sb2;
    }

    /* renamed from: a */
    public static C87299a m151545a(C87363e eVar, C87301c cVar, String str, int i) {
        String str2;
        C87299a a = cVar.mo141334a(str, i);
        if (a == null) {
            int a2 = m151543a(eVar);
            String a3 = eVar.mo141403a("Content-Type", null);
            if (a2 > 0 && !TextUtils.isEmpty(a3)) {
                String str3 = eVar.f198028a.f198016a;
                String b = m151560b(eVar.f198028a.f198018c);
                String b2 = m151560b(eVar.f198030c);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str3);
                    jSONObject.put("requestHeaders", b);
                    jSONObject.put("responseHeaders", b2);
                    str2 = jSONObject.toString();
                } catch (Throwable unused) {
                    str2 = "";
                }
                a = new C87299a(str, a3, a2, i, str2);
                Map<String, C87299a> map = cVar.f197886a.get(a.f197883d);
                if (map != null) {
                    map.put(a.f197880a, a);
                }
                cVar.f197888c.execute(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0065: INVOKE  
                      (wrap: java.util.concurrent.Executor : 0x005e: IGET  (r1v4 java.util.concurrent.Executor) = (r10v0 'cVar' com.toutiao.proxyserver.c.c) com.toutiao.proxyserver.c.c.c java.util.concurrent.Executor)
                      (wrap: com.toutiao.proxyserver.c.c$1 : 0x0062: CONSTRUCTOR  (r0v7 com.toutiao.proxyserver.c.c$1) = (r10v0 'cVar' com.toutiao.proxyserver.c.c), (r4v3 'a' com.toutiao.proxyserver.c.a) call: com.toutiao.proxyserver.c.c.1.<init>(com.toutiao.proxyserver.c.c, com.toutiao.proxyserver.c.a):void type: CONSTRUCTOR)
                     type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.toutiao.proxyserver.g.b.a(com.toutiao.proxyserver.net.e, com.toutiao.proxyserver.c.c, java.lang.String, int):com.toutiao.proxyserver.c.a, file: classes4.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r0v7 com.toutiao.proxyserver.c.c$1) = (r10v0 'cVar' com.toutiao.proxyserver.c.c), (r4v3 'a' com.toutiao.proxyserver.c.a) call: com.toutiao.proxyserver.c.c.1.<init>(com.toutiao.proxyserver.c.c, com.toutiao.proxyserver.c.a):void type: CONSTRUCTOR in method: com.toutiao.proxyserver.g.b.a(com.toutiao.proxyserver.net.e, com.toutiao.proxyserver.c.c, java.lang.String, int):com.toutiao.proxyserver.c.a, file: classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.toutiao.proxyserver.c.c, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                // Method dump skipped, instructions count: 105
                */
                throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p4495g.C87328b.m151545a(com.toutiao.proxyserver.net.e, com.toutiao.proxyserver.c.c, java.lang.String, int):com.toutiao.proxyserver.c.a");
            }
        }
