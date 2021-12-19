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
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.l.b */
public final class C61417b extends HttpsURLConnection {

    /* renamed from: a */
    public final boolean f139451a;

    /* renamed from: b */
    public int f139452b = -1;

    /* renamed from: c */
    public String f139453c;

    /* renamed from: d */
    public final long f139454d = C80506gn.f180104a.incrementAndGet();

    /* renamed from: e */
    private final HttpsURLConnection f139455e;

    static {
        Covode.recordClassIndex(72067);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f139455e.connect();
    }

    public final void disconnect() {
        this.f139455e.disconnect();
    }

    public final boolean getAllowUserInteraction() {
        return this.f139455e.getAllowUserInteraction();
    }

    public final String getCipherSuite() {
        return this.f139455e.getCipherSuite();
    }

    public final int getConnectTimeout() {
        return this.f139455e.getConnectTimeout();
    }

    public final boolean getDefaultUseCaches() {
        return this.f139455e.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f139455e.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f139455e.getDoOutput();
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.f139455e.getHostnameVerifier();
    }

    public final long getIfModifiedSince() {
        return this.f139455e.getIfModifiedSince();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f139455e.getInstanceFollowRedirects();
    }

    public final Certificate[] getLocalCertificates() {
        return this.f139455e.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.f139455e.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f139455e.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f139455e.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f139455e.getPermission();
    }

    public final int getReadTimeout() {
        return this.f139455e.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f139455e.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.f139455e.getRequestProperties();
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f139455e.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f139455e.getServerCertificates();
    }

    public final URL getURL() {
        return this.f139455e.getURL();
    }

    public final boolean getUseCaches() {
        return this.f139455e.getUseCaches();
    }

    public final String toString() {
        return this.f139455e.toString();
    }

    public final boolean usingProxy() {
        return this.f139455e.usingProxy();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        if (this.f139452b != -1) {
            return this.f139453c;
        }
        return this.f139455e.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        if (this.f139452b != -1) {
            return new HashMap();
        }
        return this.f139455e.getHeaderFields();
    }

    /* renamed from: a */
    public final boolean mo99029a() {
        Object invoke;
        try {
            Reflect field = Reflect.m24529on(this.f139455e).field("delegate", new Class[0]).field("httpEngine", new Class[0]);
            Method exactMethod = field.exactMethod("hasResponse", new Class[0], new Object[0]);
            Object obj = field.get();
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a = C15346a.m28238a(exactMethod, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_net_wrapper_HttpsURLConnectionWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                invoke = a.second;
            } else {
                invoke = exactMethod.invoke(obj, objArr);
                C15346a.m28242a(invoke, exactMethod, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_net_wrapper_HttpsURLConnectionWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
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
        MethodCollector.m26663i(12141);
        if (this.f139452b != -1) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f139453c.getBytes());
            MethodCollector.m26664o(12141);
            return byteArrayInputStream;
        }
        C61425e<HttpURLConnection, InputStream> g = C61439n.f139485e.mo68803g(new C61425e<>(this, null, null, EnumC61424d.CONTINUE));
        if (g.f139473f == EnumC61424d.INTERCEPT && g.f139469b != null) {
            R r = g.f139469b;
            MethodCollector.m26664o(12141);
            return r;
        } else if (g.f139473f != EnumC61424d.EXCEPTION || g.f139472e == null) {
            g.f139469b = (R) this.f139455e.getErrorStream();
            C61425e<HttpURLConnection, InputStream> h = C61439n.f139485e.mo68804h(g);
            if (h.f139473f != EnumC61424d.EXCEPTION || h.f139472e == null) {
                R r2 = h.f139469b;
                MethodCollector.m26664o(12141);
                return r2;
            }
            RuntimeException runtimeException = h.f139472e;
            MethodCollector.m26664o(12141);
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = g.f139472e;
            MethodCollector.m26664o(12141);
            throw runtimeException2;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        MethodCollector.m26663i(9174);
        if (this.f139452b != -1) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f139453c.getBytes());
            MethodCollector.m26664o(9174);
            return byteArrayInputStream;
        }
        C61425e<HttpURLConnection, InputStream> e = C61439n.f139485e.mo68801e(new C61425e<>(this, null, null, EnumC61424d.CONTINUE));
        if (e.f139473f == EnumC61424d.INTERCEPT && e.f139469b != null) {
            R r = e.f139469b;
            MethodCollector.m26664o(9174);
            return r;
        } else if (e.f139473f != EnumC61424d.EXCEPTION || e.f139472e == null) {
            e.f139469b = (R) this.f139455e.getInputStream();
            C61425e<HttpURLConnection, InputStream> f = C61439n.f139485e.mo68802f(e);
            if (f.f139473f != EnumC61424d.EXCEPTION || f.f139472e == null) {
                R r2 = f.f139469b;
                MethodCollector.m26664o(9174);
                return r2;
            }
            RuntimeException runtimeException = f.f139472e;
            MethodCollector.m26664o(9174);
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = e.f139472e;
            MethodCollector.m26664o(9174);
            throw runtimeException2;
        }
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        int i = this.f139452b;
        if (i != -1) {
            return i;
        }
        C61425e<HttpURLConnection, Integer> i2 = C61439n.f139485e.mo68805i(new C61425e<>(this, null, null, EnumC61424d.CONTINUE));
        if (i2.f139473f == EnumC61424d.INTERCEPT && i2.f139469b != null) {
            return i2.f139469b.intValue();
        }
        if (i2.f139473f != EnumC61424d.EXCEPTION || i2.f139472e == null) {
            i2.f139469b = (R) Integer.valueOf(this.f139455e.getResponseCode());
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
        return this.f139455e.getHeaderField(i);
    }

    public final String getHeaderFieldKey(int i) {
        return this.f139455e.getHeaderFieldKey(i);
    }

    public final String getRequestProperty(String str) {
        return this.f139455e.getRequestProperty(str);
    }

    public final void setAllowUserInteraction(boolean z) {
        this.f139455e.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.f139455e.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.f139455e.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.f139455e.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.f139455e.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.f139455e.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f139455e.setFixedLengthStreamingMode(i);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f139455e.setHostnameVerifier(hostnameVerifier);
    }

    public final void setIfModifiedSince(long j) {
        this.f139455e.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f139455e.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.f139455e.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.f139455e.setRequestMethod(str);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f139455e.setSSLSocketFactory(sSLSocketFactory);
    }

    public final void setUseCaches(boolean z) {
        this.f139455e.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        if (this.f139452b != -1) {
            return "";
        }
        return this.f139455e.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        int i = Build.VERSION.SDK_INT;
        this.f139455e.setFixedLengthStreamingMode(j);
    }

    public C61417b(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection.getURL());
        this.f139451a = httpsURLConnection.getClass().getName().contains("Cronet");
        this.f139455e = httpsURLConnection;
    }

    public final int getHeaderFieldInt(String str, int i) {
        if (this.f139452b != -1) {
            return i;
        }
        return this.f139455e.getHeaderFieldInt(str, i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        if (this.f139452b == -1 && Build.VERSION.SDK_INT >= 24) {
            return this.f139455e.getHeaderFieldLong(str, j);
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
                    this.f139455e.addRequestProperty(str, str2);
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
                    this.f139455e.setRequestProperty(str, str2);
                    return;
                }
                throw k.f139472e;
            }
        } catch (JSONException e) {
            C80399eo.m139373a(e, "HttpURLConnection.setRequestProperty");
        }
    }
}
