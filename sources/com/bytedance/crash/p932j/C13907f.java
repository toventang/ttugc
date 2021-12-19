package com.bytedance.crash.p932j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14061m;
import com.bytedance.crash.util.C14075v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.f */
public final class C13907f {

    /* renamed from: a */
    public static boolean f33882a;

    /* renamed from: b */
    public static AbstractC13921j f33883b;

    static {
        Covode.recordClassIndex(15967);
    }

    /* renamed from: com.bytedance.crash.j.f$b */
    public enum EnumC13909b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: a */
        final int f33887a;

        public final int getValue() {
            return this.f33887a;
        }

        static {
            Covode.recordClassIndex(15969);
        }

        private EnumC13909b(int i) {
            this.f33887a = i;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r1.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3399);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        com.bytedance.crash.C13933m.f33942g.isDebugMode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        r1.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3399);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m25175a(byte[] r4) {
        /*
            r3 = 3399(0xd47, float:4.763E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0)
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r2)
            r1.write(r4)     // Catch:{ all -> 0x001f }
            r1.close()
            byte[] r0 = r2.toByteArray()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r0
        L_0x001f:
            com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.C13933m.f33942g     // Catch:{ all -> 0x002c }
            r0.isDebugMode()     // Catch:{ all -> 0x002c }
            r1.close()
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r0
        L_0x002c:
            r0 = move-exception
            r1.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p932j.C13907f.m25175a(byte[]):byte[]");
    }

    /* renamed from: a */
    public static byte[] m25174a(String str, Map<String, String> map) {
        return m25166a(m25177b(str, map), "application/json; charset=utf-8", "gzip", "GET").f33930d;
    }

    /* renamed from: a */
    private static byte[] m25173a(InputStream inputStream) {
        MethodCollector.m26663i(22);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    C14061m.m25588a(byteArrayOutputStream);
                    MethodCollector.m26664o(22);
                }
            }
        }
    }

    /* renamed from: com.bytedance.crash.j.f$a */
    public enum EnumC13908a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f33885a;

        static {
            Covode.recordClassIndex(15968);
        }

        private EnumC13908a(int i) {
            this.f33885a = i;
        }
    }

    /* renamed from: c */
    private static String m25178c(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static boolean m25170a(File file, String str) {
        try {
            return m25171a(C13933m.f33942g.getCoreDumpUrl(), Header.m25041b(C13933m.f33936a).f33753a.toString(), new JSONObject().put("event_type", "raphael_file").put("timestamp", System.currentTimeMillis()).put("uuid", str).toString(), file);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static String m25176b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: b */
    private static String m25177b(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(m25178c(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(m25178c(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static C13926n m25165a(String str, String str2) {
        String str3 = str;
        MethodCollector.m26663i(10);
        try {
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                C13926n nVar = new C13926n(201);
                MethodCollector.m26664o(10);
                return nVar;
            }
            byte[] bytes = str2.getBytes();
            EnumC13908a aVar = EnumC13908a.GZIP;
            String str4 = "application/json; charset=utf-8";
            if (C13934n.f33962h) {
                C13926n nVar2 = new C13926n(201);
                MethodCollector.m26664o(10);
                return nVar2;
            } else if (str3 == null) {
                C13926n nVar3 = new C13926n(201);
                MethodCollector.m26664o(10);
                return nVar3;
            } else {
                if (bytes == null) {
                    bytes = new byte[0];
                }
                int length = bytes.length;
                String str5 = null;
                if (EnumC13908a.GZIP == aVar && length > 128) {
                    bytes = m25175a(bytes);
                    str5 = "gzip";
                } else if (EnumC13908a.DEFLATER == aVar && length > 128) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                    Deflater deflater = new Deflater();
                    deflater.setInput(bytes);
                    deflater.finish();
                    byte[] bArr = new byte[8192];
                    while (!deflater.finished()) {
                        byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
                    }
                    deflater.end();
                    bytes = byteArrayOutputStream.toByteArray();
                    str5 = "deflate";
                }
                if (bytes == null) {
                    C13926n nVar4 = new C13926n(202);
                    MethodCollector.m26664o(10);
                    return nVar4;
                }
                byte[] a = C13933m.f33942g.getEncryptImpl().mo22303a(bytes);
                if (a != null) {
                    if (TextUtils.isEmpty(new URL(str3).getQuery())) {
                        if (!str3.endsWith("?")) {
                            str3 = str3 + "?";
                        }
                    } else if (!str3.endsWith("&")) {
                        str3 = str3 + "&";
                    }
                    str3 = str3 + "tt_data=a";
                    str4 = "application/octet-stream;tt-data=a";
                } else {
                    a = bytes;
                }
                C13926n a2 = m25169a(str3, a, str4, str5, "POST", true);
                MethodCollector.m26664o(10);
                return a2;
            }
        } catch (Throwable th) {
            C13933m.f33942g.isDebugMode();
            C13926n nVar5 = new C13926n(207, th);
            MethodCollector.m26664o(10);
            return nVar5;
        }
    }

    /* renamed from: a */
    public static C13926n m25168a(String str, String str2, File... fileArr) {
        return m25167a(str, str2, new C14056j.C14058b(fileArr, true));
    }

    /* renamed from: a */
    public static C13926n m25167a(String str, String str2, C14056j.C14058b... bVarArr) {
        if (C13934n.f33962h) {
            return new C13926n(201);
        }
        try {
            C13923l lVar = new C13923l(m25176b(str, "have_dump=true&encrypt=true"), "UTF-8", true);
            lVar.mo22406a("json", str2, true);
            lVar.mo22407a("file", null);
            if (lVar.f33916a) {
                C14056j.m25570a(lVar.f33918c, bVarArr);
            } else {
                C14056j.m25570a(lVar.f33917b, bVarArr);
            }
            lVar.mo22408a("\r\n".getBytes());
            try {
                JSONObject jSONObject = new JSONObject(lVar.mo22404a());
                C14075v.m25650a("success upload crash log");
                return new C13926n(jSONObject);
            } catch (JSONException e) {
                C14075v.m25650a("err upload crash log");
                return new C13926n(0, e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            C13933m.f33942g.isDebugMode();
            return new C13926n(207);
        }
    }

    /* renamed from: a */
    private static C13926n m25166a(String str, String str2, String str3, String str4) {
        return m25169a(str, null, str2, str3, str4, false);
    }

    /* renamed from: a */
    private static boolean m25171a(String str, String str2, String str3, File file) {
        try {
            C13923l lVar = new C13923l(str, "UTF-8", false);
            lVar.mo22406a("data", str3, false);
            lVar.mo22406a("header", str2, false);
            lVar.mo22407a("file", null);
            lVar.mo22405a(file);
            lVar.mo22408a("\r\n".getBytes());
            lVar.mo22404a();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m25172a(String str, String str2, String str3, String str4, List<String> list) {
        if (C13934n.f33962h) {
            return false;
        }
        try {
            C13923l lVar = new C13923l(str, "UTF-8", false);
            lVar.mo22406a("aid", str2, false);
            lVar.mo22406a("device_id", str3, false);
            lVar.mo22406a("os", "Android", false);
            lVar.mo22406a("process_name", str4, false);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "crash");
                    lVar.mo22407a(file.getName(), hashMap);
                    lVar.mo22405a(file);
                    lVar.mo22408a("\r\n".getBytes());
                }
            }
            try {
                if (new JSONObject(lVar.mo22404a()).optInt("errno", -1) == 200) {
                    return true;
                }
                return false;
            } catch (JSONException unused) {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONObject, java.io.Closeable, android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138 A[SYNTHETIC, Splitter:B:96:0x0138] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.p932j.C13926n m25169a(java.lang.String r8, byte[] r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p932j.C13907f.m25169a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean):com.bytedance.crash.j.n");
    }
}
