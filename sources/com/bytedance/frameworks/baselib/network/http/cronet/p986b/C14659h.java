package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.AbstractC14625c;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.C14617b;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.p983b.C14621d;
import com.bytedance.frameworks.baselib.network.http.p993e.C14743a;
import com.bytedance.frameworks.baselib.network.http.p993e.C14745c;
import com.bytedance.frameworks.baselib.network.http.p993e.C14746d;
import com.bytedance.frameworks.baselib.network.http.retrofit.ExecutorC14760a;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58010b;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UnknownFormatConversionException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.h */
public class C14659h implements AbstractC14625c, ICronetClient.ICronetBootFailureChecker {

    /* renamed from: a */
    public static final String f35582a = C14659h.class.getSimpleName();

    /* renamed from: b */
    public static Context f35583b;

    /* renamed from: c */
    public static ICronetClient f35584c;

    /* renamed from: d */
    public static volatile boolean f35585d = false;

    /* renamed from: e */
    public static volatile int f35586e = 0;

    /* renamed from: f */
    public static AbstractC14660a f35587f;

    /* renamed from: g */
    public static AbstractC14661b f35588g;

    /* renamed from: h */
    private static String f35589h = "";

    /* renamed from: i */
    private static volatile C14659h f35590i = null;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.h$a */
    public interface AbstractC14660a {
        static {
            Covode.recordClassIndex(16755);
        }

        /* renamed from: b */
        boolean mo23628b();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.h$b */
    public interface AbstractC14661b {
        static {
            Covode.recordClassIndex(16756);
        }

        /* renamed from: c */
        boolean mo23629c();
    }

    /* renamed from: a */
    private static boolean m26818a(int i) {
        return i >= 8192 && i <= 20971520;
    }

    /* renamed from: a */
    public static void m26811a(SharedPreferences sharedPreferences) {
        f35586e = sharedPreferences.getInt("cronet_inputstream_buff_size", 0);
    }

    /* renamed from: a */
    protected static boolean m26819a(C14612a aVar) {
        return (aVar == null || aVar.f35359b == null || !aVar.f35359b.f35407j) ? false : true;
    }

    /* renamed from: a */
    public final void mo23627a(boolean z, boolean z2, boolean z3) {
        m26823b();
        ICronetClient iCronetClient = f35584c;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(this);
            f35584c.setCronetEngine(f35583b, false, z, false, z2, C14731e.f35915d, new ExecutorC14760a(), z3);
        }
    }

    /* renamed from: a */
    public static void m26810a() {
        if (f35584c == null) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        if (r3.f35563b == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        if (r3.f35563b.size() < 2) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e4, code lost:
        return new com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14648a(r10, r3.f35563b, r3.f35570i);
     */
    @Override // com.bytedance.retrofit2.client.AbstractC22025a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.AbstractC22029d mo11597a(com.bytedance.retrofit2.client.Request r10) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.mo11597a(com.bytedance.retrofit2.client.Request):com.bytedance.retrofit2.client.d");
    }

    /* renamed from: a */
    private static void m26813a(String str, C14612a aVar) {
        if (!C13627m.m24498a(str) && aVar != null) {
            try {
                Logger.debug();
                aVar.f35358a = str;
                if (aVar.f35359b != null) {
                    aVar.f35359b.f35398a = str;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    protected static void m26815a(HttpURLConnection httpURLConnection, C14612a aVar, C22096s sVar) {
        if (httpURLConnection != null && aVar != null) {
            try {
                if (f35584c != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    f35584c.getRequestMetrics(httpURLConnection, linkedHashMap);
                    if (!linkedHashMap.isEmpty()) {
                        aVar.f35358a = (String) m26804a(linkedHashMap.get("remote_ip"), String.class, "");
                        aVar.f35367j = ((Long) m26804a(linkedHashMap.get("dns_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f35368k = ((Long) m26804a(linkedHashMap.get("connect_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f35369l = ((Long) m26804a(linkedHashMap.get("ssl_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f35370m = ((Long) m26804a(linkedHashMap.get("send_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f35371n = ((Long) m26804a(linkedHashMap.get("push_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f35372o = ((Long) m26804a(linkedHashMap.get("receive_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f35373p = ((Boolean) m26804a(linkedHashMap.get("socket_reused"), Boolean.class, (Object) false)).booleanValue();
                        aVar.f35374q = ((Long) m26804a(linkedHashMap.get("ttfb"), Long.class, (Object) -1L)).longValue();
                        aVar.f35375r = ((Long) m26804a(linkedHashMap.get("total_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f35376s = ((Long) m26804a(linkedHashMap.get("send_byte_count"), Long.class, (Object) -1L)).longValue();
                        aVar.f35377t = ((Long) m26804a(linkedHashMap.get("received_byte_count"), Long.class, (Object) -1L)).longValue();
                        aVar.f35382y = (String) m26804a(linkedHashMap.get("request_log"), String.class, "");
                        aVar.f35378u = ((Long) m26804a(linkedHashMap.get("retry_attempts"), Long.class, (Object) -1L)).longValue();
                        aVar.f35348B = (String) m26804a(linkedHashMap.get("request_headers"), String.class, "");
                        aVar.f35349C = (String) m26804a(linkedHashMap.get("response_headers"), String.class, "");
                        aVar.f35351E = ((Long) m26804a(linkedHashMap.get("post_task_start"), Long.class, (Object) -1L)).longValue();
                        aVar.f35350D = ((Long) m26804a(linkedHashMap.get("request_start"), Long.class, (Object) -1L)).longValue();
                        aVar.f35352F = ((Long) m26804a(linkedHashMap.get("wait_ctx"), Long.class, (Object) -1L)).longValue();
                    }
                }
                if (sVar != null) {
                    sVar.f52174a = aVar.f35380w;
                    sVar.f52194u = SystemClock.uptimeMillis();
                    sVar.f52184k = System.currentTimeMillis();
                    sVar.f52171N = "4.0.71.7-tiktok";
                    sVar.f52170M.put("sentByteCount", Long.valueOf(aVar.f35376s));
                    sVar.f52170M.put("receivedByteCount", Long.valueOf(aVar.f35377t));
                    JSONObject jSONObject = aVar.f35383z;
                    if (aVar.f35353G) {
                        jSONObject.put("turing_callback", aVar.f35354H);
                    }
                    if (aVar.f35355I) {
                        jSONObject.put("turing_retry", "1");
                    }
                    jSONObject.put("retrofit", sVar.mo35895a());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01a2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static byte[] m26820a(java.lang.String r28, int r29, java.net.HttpURLConnection r30, long r31, com.bytedance.frameworks.baselib.network.http.C14612a r33, java.lang.String r34, int r35, com.bytedance.retrofit2.C22096s r36) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.m26820a(java.lang.String, int, java.net.HttpURLConnection, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, int, com.bytedance.retrofit2.s):byte[]");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    protected static void m26817a(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, String str, String str2, C22096s sVar) {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a = C14746d.m27024a(z, map, i, inputStream, iArr, sVar);
                C14746d.m27026b(inputStream);
                int i2 = iArr[0];
                byte[] bArr = new byte[i2];
                if (a != null && iArr[0] > 0) {
                    System.arraycopy(a, 0, bArr, 0, iArr[0]);
                }
                if (i2 > 0 && !C13627m.m24498a(str) && Logger.debug()) {
                    try {
                        C14743a aVar = new C14743a(str);
                        if ("text".equalsIgnoreCase(aVar.getPrimaryType()) || "application/json".equalsIgnoreCase(aVar.getBaseType())) {
                            String parameter = aVar.getParameter("charset");
                            if (C13627m.m24498a(parameter)) {
                                parameter = "utf-8";
                            }
                            String str3 = f35582a;
                            StringBuilder append = new StringBuilder(" response body = ").append(new String(bArr, parameter)).append(" for url = ");
                            if (str2 == null) {
                                str2 = "";
                            }
                            Logger.m24396d(str3, append.append(str2).toString());
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                C14746d.m27026b(inputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r13 == null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m26812a(java.lang.String r10, long r11, com.bytedance.frameworks.baselib.network.http.C14612a r13, java.lang.String r14, java.lang.Exception r15, java.net.HttpURLConnection r16, com.bytedance.retrofit2.C22096s r17) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.m26812a(java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, java.net.HttpURLConnection, com.bytedance.retrofit2.s):void");
    }

    /* renamed from: a */
    protected static void m26816a(boolean z, String str) {
        if (!f35585d && !z && f35583b != null && !m26828d()) {
            throw new C14621d("network not available");
        } else if (f35585d && !TextUtils.isEmpty(str) && str.contains("net::ERR_INTERNET_DISCONNECTED")) {
            throw new C14621d("network not available");
        }
    }

    /* renamed from: a */
    static List<C22027b> m26809a(HttpURLConnection httpURLConnection, boolean z) {
        if (httpURLConnection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key == null || !key.equalsIgnoreCase("bdturing-verify") || !z) {
                for (String str : entry.getValue()) {
                    arrayList.add(new C22027b(key, str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m26827c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureChecker
    public boolean isCronetBootFailureExpected() {
        AbstractC14660a aVar = f35587f;
        if (aVar == null) {
            return false;
        }
        return aVar.mo23628b();
    }

    static {
        Covode.recordClassIndex(16754);
    }

    /* renamed from: d */
    private static boolean m26828d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean c = m26827c();
        C58029j.f132253e = c;
        return c;
    }

    /* renamed from: b */
    private static void m26823b() {
        String str;
        if (f35584c == null) {
            if (!C13627m.m24498a(f35589h)) {
                str = f35589h;
            } else {
                str = "org.chromium.CronetClient";
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    f35584c = (ICronetClient) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    protected static void m26814a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private C14659h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        f35583b = applicationContext;
    }

    /* renamed from: a */
    private static String m26805a(Exception exc) {
        String[] split;
        if (exc == null) {
            return "";
        }
        try {
            String message = exc.getMessage();
            if (!(message == null || (split = message.split("\\|")) == null || split.length < 2)) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: b */
    public static String m26821b(String str) {
        try {
            if (!C13627m.m24498a(str)) {
                return new C14743a(str).getBaseType();
            }
            return "";
        } catch (C14745c e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    private static HttpURLConnection m26825c(String str) {
        boolean c;
        m26823b();
        ICronetClient iCronetClient = f35584c;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(f35590i);
            ICronetClient iCronetClient2 = f35584c;
            Context context = f35583b;
            AbstractC14661b bVar = f35588g;
            if (bVar == null) {
                c = false;
            } else {
                c = bVar.mo23629c();
            }
            HttpURLConnection openConnection = iCronetClient2.openConnection(context, str, c, C14731e.f35915d, new ExecutorC14760a());
            openConnection.setConnectTimeout(15000);
            openConnection.setReadTimeout(15000);
            return openConnection;
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    /* renamed from: a */
    public static C14659h m26802a(Context context) {
        MethodCollector.m26663i(1999);
        if (f35590i == null) {
            synchronized (C14659h.class) {
                try {
                    if (f35590i == null) {
                        f35590i = new C14659h(context);
                        m26823b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1999);
                    throw th;
                }
            }
        }
        C14659h hVar = f35590i;
        MethodCollector.m26664o(1999);
        return hVar;
    }

    /* renamed from: c */
    private static JSONObject m26826c(HttpURLConnection httpURLConnection) {
        JSONObject jSONObject = new JSONObject();
        if (httpURLConnection == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsCronetHttpClient");
            ICronetClient iCronetClient = f35584c;
            if (iCronetClient != null) {
                jSONObject.put("hcv", iCronetClient.getCronetVersion());
            }
            jSONObject.put("ua", httpURLConnection.getRequestProperty("User-Agent"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C14664k m26803a(String str) {
        ICronetClient iCronetClient = f35584c;
        if (iCronetClient != null) {
            String[] strArr = (String[]) Reflect.m24529on(iCronetClient).call("ttUrlDispatch", new Class[]{String.class}, str).get();
            if (strArr.length != 3 || TextUtils.isEmpty(strArr[0])) {
                throw new UnknownFormatConversionException("ttUrlDispatch returns wrong format");
            }
            try {
                new URL(strArr[0]).toURI();
                return new C14664k(str, strArr[0], strArr[1], strArr[2]);
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    /* renamed from: b */
    private static String m26822b(HttpURLConnection httpURLConnection) {
        List<String> value;
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                if (!headerFields.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            if (!C13627m.m24498a(key) && (value = entry.getValue()) != null && !value.isEmpty()) {
                                StringBuilder sb = new StringBuilder();
                                int i = 0;
                                for (String str : value) {
                                    if (!C13627m.m24498a(str)) {
                                        if (i == 0) {
                                            sb.append(str);
                                        } else {
                                            sb.append("; ").append(str);
                                        }
                                        i++;
                                    }
                                }
                                jSONObject.put(key, sb.toString());
                            }
                        }
                    }
                    return jSONObject.toString();
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    protected static int m26801a(Request request, HttpURLConnection httpURLConnection) {
        if (request == null || httpURLConnection == null) {
            return -1;
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            body.writeTo(httpURLConnection.getOutputStream());
        }
        if (C14731e.f35923l && !C14731e.m26991a(request.getExtraInfo())) {
            C14731e.m26992b();
        }
        return httpURLConnection.getResponseCode();
    }

    /* renamed from: a */
    protected static String m26807a(HttpURLConnection httpURLConnection, String str) {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> T m26804a(Object obj, Class<T> cls, T t) {
        if (obj == 0 || !obj.getClass().equals(cls)) {
            return t;
        }
        return obj;
    }

    /* renamed from: b */
    static boolean m26824b(HttpURLConnection httpURLConnection, C14612a aVar, int i) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || !headerFields.containsKey("bdturing-verify")) {
            return false;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(headerFields);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean a = C14731e.m26990a(i, treeMap);
        aVar.f35354H = SystemClock.uptimeMillis() - uptimeMillis;
        if (!treeMap.containsKey("bdturing-verify")) {
            aVar.f35353G = true;
        }
        return a;
    }

    /* renamed from: a */
    protected static String m26806a(HttpURLConnection httpURLConnection, C14612a aVar, int i) {
        if (httpURLConnection == null) {
            return null;
        }
        m26813a(m26807a(httpURLConnection, "x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f35359b == null)) {
            aVar.f35359b.f35399b = i;
        }
        return m26807a(httpURLConnection, "X-TT-LOGID");
    }

    /* renamed from: a */
    protected static HttpURLConnection m26808a(String str, Request request, C14612a aVar, long j) {
        long j2 = j;
        String url = request.getUrl();
        boolean z = false;
        if (!TextUtils.isEmpty(url) && url.contains("aweme/v2/feed") && !C58010b.f132212a.getAndSet(true)) {
            C58945a.C58947b.f134185a.mo96425a("feed_cookie_before_feed_duration", false);
        }
        try {
            if (!C14731e.f35923l && !C14731e.m26991a(request.getExtraInfo())) {
                C14731e.m26992b();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(url) && url.contains("aweme/v2/feed") && !C58010b.f132213b.getAndSet(true)) {
            C58945a.C58947b.f134185a.mo96429b("feed_cookie_before_feed_duration", false);
        }
        HttpURLConnection c = m26825c(str);
        if (m26818a(f35586e)) {
            try {
                Reflect.m24529on(c).call("setInputStreamBufferSize", new Class[]{Integer.TYPE}, Integer.valueOf(f35586e));
            } catch (Throwable unused2) {
            }
        }
        c.setInstanceFollowRedirects(true);
        if (aVar.f35359b instanceof C14617b) {
            T t = aVar.f35359b;
            if (t.f35400c > 0) {
                c.setConnectTimeout((int) t.f35400c);
            }
            if (t.f35401d > 0) {
                c.setReadTimeout((int) t.f35401d);
            }
            if (t.f35406i > 0) {
                try {
                    Reflect.m24529on(c).call("setRequestTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f35406i));
                    c.setConnectTimeout(0);
                    c.setReadTimeout(0);
                    if (t.f35403f > 0 || t.f35405h > 0 || t.f35404g > 0) {
                        Reflect.m24529on(c).call("setSocketConnectTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f35403f));
                        Reflect.m24529on(c).call("setSocketReadTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f35405h));
                        Reflect.m24529on(c).call("setSocketWriteTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f35404g));
                    }
                } catch (Throwable unused3) {
                }
            }
            if (!m26818a(f35586e) && m26818a(t.f35409l)) {
                try {
                    Reflect.m24529on(c).call("setInputStreamBufferSize", new Class[]{Integer.TYPE}, Integer.valueOf(t.f35409l));
                } catch (Throwable unused4) {
                }
            }
            if (t.f35410m > 0) {
                try {
                    Reflect.m24529on(c).call("setRequestFlag", new Class[]{Integer.TYPE}, Integer.valueOf(t.f35410m));
                } catch (Throwable unused5) {
                }
            }
            if (t.f35411n > 0 && j2 == 0) {
                j2 = t.f35411n;
            }
            if (!t.f35412o) {
                c.setInstanceFollowRedirects(false);
            }
        }
        try {
            Reflect.m24529on(c).call("setRequestPriority", new Class[]{Integer.TYPE}, Integer.valueOf(request.getRequestPriorityLevel()));
        } catch (Throwable unused6) {
        }
        if (j2 > 0) {
            try {
                Reflect.m24529on(c).call("setThrottleNetSpeed", new Class[]{Integer.TYPE}, Long.valueOf(j2));
            } catch (Throwable unused7) {
            }
        }
        c.setRequestMethod(request.getMethod());
        c.setDoInput(true);
        for (C22027b bVar : request.getHeaders()) {
            if (!C13627m.m24498a(bVar.f52037a) && !C13627m.m24498a(bVar.f52038b)) {
                if ("User-Agent".equalsIgnoreCase(bVar.f52037a)) {
                    z = true;
                }
                c.setRequestProperty(bVar.f52037a, bVar.f52038b);
            }
        }
        if (!z) {
            String str2 = C14731e.f35915d;
            if (!C13627m.m24498a(str2)) {
                if (f35584c != null) {
                    str2 = str2 + " cronet/" + f35584c.getCronetVersion();
                }
                c.setRequestProperty("User-Agent", str2);
            }
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            c.setDoOutput(true);
            c.setRequestProperty("Content-Type", body.mimeType());
            String md5Stub = body.md5Stub();
            if (md5Stub != null) {
                c.setRequestProperty("X-SS-STUB", md5Stub);
            }
            long length = body.length();
            if (length != -1) {
                c.setFixedLengthStreamingMode((int) length);
                c.setRequestProperty("Content-Length", String.valueOf(length));
            } else {
                c.setChunkedStreamingMode(4096);
            }
        }
        aVar.f35383z = m26826c(c);
        return c;
    }
}
