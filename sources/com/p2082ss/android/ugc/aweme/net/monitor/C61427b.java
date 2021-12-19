package com.p2082ss.android.ugc.aweme.net.monitor;

import com.bytedance.apm.C12290b;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61423c;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import okhttp3.Request;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.b */
public final class C61427b implements AbstractC61433h, AbstractC61434i, AbstractC61436k {
    static {
        Covode.recordClassIndex(72082);
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: a */
    public final boolean mo68797a() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: c */
    public final C61425e<Request, C90029ac> mo68799c(C61425e<Request, C90029ac> eVar) {
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: f */
    public final C61425e<HttpURLConnection, InputStream> mo68802f(C61425e<HttpURLConnection, InputStream> eVar) {
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: g */
    public final C61425e<HttpURLConnection, InputStream> mo68803g(C61425e<HttpURLConnection, InputStream> eVar) {
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: h */
    public final C61425e<HttpURLConnection, InputStream> mo68804h(C61425e<HttpURLConnection, InputStream> eVar) {
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: i */
    public final C61425e<HttpURLConnection, Integer> mo68805i(C61425e<HttpURLConnection, Integer> eVar) {
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: j */
    public final C61425e<HttpURLConnection, Integer> mo68806j(C61425e<HttpURLConnection, Integer> eVar) {
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: m */
    public final C61425e<URL, URLConnection> mo68809m(C61425e<URL, URLConnection> eVar) {
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: e */
    public final C61425e<HttpURLConnection, InputStream> mo68801e(C61425e<HttpURLConnection, InputStream> eVar) {
        Q q = eVar.f139468a;
        if (!C61439n.C61440a.m111267a((HttpURLConnection) q)) {
            m111210a(q.getURL(), null, q.getContentType());
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: d */
    public final C61425e<Request, C90029ac> mo68800d(C61425e<Request, C90029ac> eVar) {
        Request request;
        boolean z;
        R r = eVar.f139469b;
        if (!(r == null || (request = r.f204105a) == null)) {
            try {
                C90200t url = request.url();
                if (url != null) {
                    String str = url.f204861d;
                    String f = url.mo145055f();
                    boolean c = url.mo145049c();
                    if (request.header("cookie") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m111209a(str, f, z, c, r.mo144718a("content-type", null), "4");
                }
            } catch (Exception unused) {
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: k */
    public final C61425e<HttpURLConnection, InputStream> mo68807k(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        Q q = eVar.f139468a;
        JSONObject jSONObject = eVar.f139471d;
        if (jSONObject != null) {
            str = jSONObject.optString("key", "");
            jSONObject.optString("value", "");
        } else {
            str = "";
        }
        if (!C61439n.C61440a.m111267a((HttpURLConnection) q)) {
            m111210a(q.getURL(), str, "");
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: l */
    public final C61425e<HttpURLConnection, InputStream> mo68808l(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        Q q = eVar.f139468a;
        JSONObject jSONObject = eVar.f139471d;
        if (jSONObject != null) {
            str = jSONObject.optString("key", "");
            jSONObject.optString("value", "");
        } else {
            str = "";
        }
        if (!C61439n.C61440a.m111267a((HttpURLConnection) q)) {
            m111210a(q.getURL(), str, "");
        }
        return eVar;
    }

    /* renamed from: a */
    private static void m111210a(URL url, String str, String str2) {
        if (url != null) {
            try {
                m111209a(url.getHost(), url.getPath(), "cookie".equalsIgnoreCase(str), "https".equals(url.getProtocol()), str2, "3");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m111209a(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        C1731i.m5640b(new CallableC61428c(str3, str, str2, z2, str4, z), C40780g.m82246c());
    }

    /* renamed from: a */
    private static void m111208a(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("uri", str2);
            jSONObject.put("cookie", String.valueOf(z));
            jSONObject.put("item_type", str3);
            jSONObject.put("data_protocol", String.valueOf(z2));
            jSONObject.put("netClientType", str4);
            C12290b.m22064a(EnumC61423c.NATIVE_NETWORK_API_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m111207a(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        boolean z3;
        if (str.contains("video") || str.contains(DataType.AUDIO) || str.contains("image")) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str5 = str2 + str3;
        if (!z) {
            if (z3 && !z2) {
                return null;
            }
            m111208a(str2, str5, z2, str, false, str4);
            return null;
        } else if ((z3 || str3 == null || str3.contains("v1/play")) && (!z2 || !z3)) {
            return null;
        } else {
            m111208a(str2, str5, z2, str, z, str4);
            return null;
        }
    }
}
