package com.p2082ss.android.ugc.aweme.net.p3502l;

import android.os.Build;
import android.util.Pair;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.utils.C80399eo;
import com.p2082ss.android.ugc.aweme.utils.C80506gn;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.l.a */
public final class C61416a extends HttpURLConnection {

    /* renamed from: a */
    public final boolean f139446a;

    /* renamed from: b */
    public int f139447b = -1;

    /* renamed from: c */
    public String f139448c;

    /* renamed from: d */
    public final long f139449d = C80506gn.f180104a.incrementAndGet();

    /* renamed from: e */
    private final HttpURLConnection f139450e;

    static {
        Covode.recordClassIndex(72066);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f139450e.connect();
    }

    public final void disconnect() {
        this.f139450e.disconnect();
    }

    public final boolean getAllowUserInteraction() {
        return this.f139450e.getAllowUserInteraction();
    }

    public final int getConnectTimeout() {
        return this.f139450e.getConnectTimeout();
    }

    public final boolean getDefaultUseCaches() {
        return this.f139450e.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f139450e.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f139450e.getDoOutput();
    }

    public final long getIfModifiedSince() {
        return this.f139450e.getIfModifiedSince();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f139450e.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f139450e.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f139450e.getPermission();
    }

    public final int getReadTimeout() {
        return this.f139450e.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f139450e.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.f139450e.getRequestProperties();
    }

    public final URL getURL() {
        return this.f139450e.getURL();
    }

    public final boolean getUseCaches() {
        return this.f139450e.getUseCaches();
    }

    public final String toString() {
        return this.f139450e.toString();
    }

    public final boolean usingProxy() {
        return this.f139450e.usingProxy();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        if (this.f139447b != -1) {
            return this.f139448c;
        }
        return this.f139450e.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        if (this.f139447b != -1) {
            return new HashMap();
        }
        return this.f139450e.getHeaderFields();
    }

    /* renamed from: a */
    public final boolean mo98984a() {
        Object invoke;
        try {
            Reflect field = Reflect.m24529on(this.f139450e).field("httpEngine", new Class[0]);
            Method exactMethod = field.exactMethod("hasResponse", new Class[0], new Object[0]);
            Object obj = field.get();
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a = C15346a.m28238a(exactMethod, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_net_wrapper_HttpURLConnectionWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                invoke = a.second;
            } else {
                invoke = exactMethod.invoke(obj, objArr);
                C15346a.m28242a(invoke, exactMethod, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_net_wrapper_HttpURLConnectionWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            return ((Boolean) invoke).booleanValue();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return true;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final InputStream getErrorStream() {
        MethodCollector.m26663i(11998);
        if (this.f139447b != -1) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f139448c.getBytes());
            MethodCollector.m26664o(11998);
            return byteArrayInputStream;
        }
        C61425e<HttpURLConnection, InputStream> g = C61439n.f139485e.mo68803g(new C61425e<>(this, null, null, EnumC61424d.CONTINUE));
        if (g.f139473f == EnumC61424d.INTERCEPT && g.f139469b != null) {
            R r = g.f139469b;
            MethodCollector.m26664o(11998);
            return r;
        } else if (g.f139473f != EnumC61424d.EXCEPTION || g.f139472e == null) {
            g.f139469b = (R) this.f139450e.getErrorStream();
            C61425e<HttpURLConnection, InputStream> h = C61439n.f139485e.mo68804h(g);
            if (h.f139473f != EnumC61424d.EXCEPTION || h.f139472e == null) {
                R r2 = h.f139469b;
                MethodCollector.m26664o(11998);
                return r2;
            }
            RuntimeException runtimeException = h.f139472e;
            MethodCollector.m26664o(11998);
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = g.f139472e;
            MethodCollector.m26664o(11998);
            throw runtimeException2;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        MethodCollector.m26663i(9166);
        if (this.f139447b != -1) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f139448c.getBytes());
            MethodCollector.m26664o(9166);
            return byteArrayInputStream;
        }
        C61425e<HttpURLConnection, InputStream> e = C61439n.f139485e.mo68801e(new C61425e<>(this, null, null, EnumC61424d.CONTINUE));
        if (e.f139473f == EnumC61424d.INTERCEPT && e.f139469b != null) {
            R r = e.f139469b;
            MethodCollector.m26664o(9166);
            return r;
        } else if (e.f139473f != EnumC61424d.EXCEPTION || e.f139472e == null) {
            e.f139469b = (R) this.f139450e.getInputStream();
            C61425e<HttpURLConnection, InputStream> f = C61439n.f139485e.mo68802f(e);
            if (f.f139473f != EnumC61424d.EXCEPTION || f.f139472e == null) {
                R r2 = f.f139469b;
                MethodCollector.m26664o(9166);
                return r2;
            }
            RuntimeException runtimeException = f.f139472e;
            MethodCollector.m26664o(9166);
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = e.f139472e;
            MethodCollector.m26664o(9166);
            throw runtimeException2;
        }
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        int i = this.f139447b;
        if (i != -1) {
            return i;
        }
        C61425e<HttpURLConnection, Integer> i2 = C61439n.f139485e.mo68805i(new C61425e<>(this, null, null, EnumC61424d.CONTINUE));
        if (i2.f139473f == EnumC61424d.INTERCEPT && i2.f139469b != null) {
            return i2.f139469b.intValue();
        }
        if (i2.f139473f != EnumC61424d.EXCEPTION || i2.f139472e == null) {
            i2.f139469b = (R) Integer.valueOf(this.f139450e.getResponseCode());
            C61425e<HttpURLConnection, Integer> j = C61439n.f139485e.mo68806j(i2);
            if (j.f139473f != EnumC61424d.EXCEPTION || j.f139472e == null) {
                return j.f139469b.intValue();
            }
            throw j.f139472e;
        }
        throw i2.f139472e;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        return this.f139450e.getHeaderField(i);
    }

    public final String getHeaderFieldKey(int i) {
        return this.f139450e.getHeaderFieldKey(i);
    }

    public final String getRequestProperty(String str) {
        return this.f139450e.getRequestProperty(str);
    }

    public final void setAllowUserInteraction(boolean z) {
        this.f139450e.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.f139450e.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.f139450e.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.f139450e.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.f139450e.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.f139450e.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f139450e.setFixedLengthStreamingMode(i);
    }

    public final void setIfModifiedSince(long j) {
        this.f139450e.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f139450e.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.f139450e.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.f139450e.setRequestMethod(str);
    }

    public final void setUseCaches(boolean z) {
        this.f139450e.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        if (this.f139447b != -1) {
            return "";
        }
        return this.f139450e.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        int i = Build.VERSION.SDK_INT;
        this.f139450e.setFixedLengthStreamingMode(j);
    }

    public C61416a(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.f139446a = httpURLConnection.getClass().getName().contains("Cronet");
        this.f139450e = httpURLConnection;
    }

    public final int getHeaderFieldInt(String str, int i) {
        if (this.f139447b != -1) {
            return i;
        }
        return this.f139450e.getHeaderFieldInt(str, i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        if (this.f139447b == -1 && Build.VERSION.SDK_INT >= 24) {
            return this.f139450e.getHeaderFieldLong(str, j);
        }
        return j;
    }

    public final void addRequestProperty(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            jSONObject.put("value", str2);
            C61425e<HttpURLConnection, InputStream> l = C61439n.f139485e.mo68808l(new C61425e<>(this, null, jSONObject, EnumC61424d.CONTINUE));
            if (l.f139473f != EnumC61424d.DROP) {
                if (l.f139473f != EnumC61424d.EXCEPTION || l.f139472e == null) {
                    if (l.f139471d != null) {
                        str = l.f139471d.optString("key", str);
                        str2 = l.f139471d.optString("value", str2);
                    }
                    this.f139450e.addRequestProperty(str, str2);
                    return;
                }
                throw l.f139472e;
            }
        } catch (JSONException e) {
            C80399eo.m139373a(e, "HttpURLConnection.addRequestProperty");
        }
    }

    public final void setRequestProperty(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            jSONObject.put("value", str2);
            C61425e<HttpURLConnection, InputStream> k = C61439n.f139485e.mo68807k(new C61425e<>(this, null, jSONObject, EnumC61424d.CONTINUE));
            if (k.f139473f != EnumC61424d.DROP) {
                if (k.f139473f != EnumC61424d.EXCEPTION || k.f139472e == null) {
                    if (k.f139471d != null) {
                        str = k.f139471d.optString("key", str);
                        str2 = k.f139471d.optString("value", str2);
                    }
                    this.f139450e.setRequestProperty(str, str2);
                    return;
                }
                throw k.f139472e;
            }
        } catch (JSONException e) {
            C80399eo.m139373a(e, "HttpURLConnection.setRequestProperty");
        }
    }
}
