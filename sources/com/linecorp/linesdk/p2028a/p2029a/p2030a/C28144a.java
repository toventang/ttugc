package com.linecorp.linesdk.p2028a.p2029a.p2030a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.linecorp.linesdk.C28141a;
import com.linecorp.linesdk.EnumC28179b;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.p2025a.p2026a.C28131a;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.linecorp.linesdk.a.a.a.a */
public final class C28144a {

    /* renamed from: a */
    private static final byte[] f65864a = new byte[0];

    /* renamed from: b */
    private final C28148e f65865b;

    /* renamed from: c */
    private final C28147d f65866c;

    /* renamed from: d */
    private int f65867d;

    /* renamed from: e */
    private int f65868e;

    static {
        Covode.recordClassIndex(34085);
    }

    private C28144a(C28148e eVar) {
        this.f65865b = eVar;
        this.f65866c = new C28147d("UTF-8");
        this.f65867d = 90000;
        this.f65868e = 90000;
    }

    /* renamed from: a */
    private static HttpURLConnection m56250a(Uri uri) {
        URLConnection a = m56251a(new URL(uri.toString()));
        if (!(a instanceof HttpsURLConnection)) {
            throw new IllegalArgumentException("The scheme of the server url must be https.".concat(String.valueOf(uri)));
        } else if (Build.VERSION.SDK_INT >= 24) {
            return (HttpURLConnection) a;
        } else {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            httpsURLConnection.setSSLSocketFactory(new C28131a(httpsURLConnection.getSSLSocketFactory()));
            return httpsURLConnection;
        }
    }

    /* renamed from: a */
    private static URLConnection m56251a(URL url) {
        URLConnection aVar;
        URLConnection aVar2;
        C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
        if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
            R r = m.f139469b;
            if (r instanceof HttpsURLConnection) {
                aVar2 = new C61417b(r);
            } else if (!(r instanceof HttpURLConnection)) {
                return r;
            } else {
                aVar2 = new C61416a(r);
            }
            return aVar2;
        } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new C61417b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new C61416a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m.f139472e;
        }
    }

    /* renamed from: a */
    private static byte[] m56253a(Map<String, String> map) {
        if (map.isEmpty()) {
            return f65864a;
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        try {
            return builder.build().getEncodedQuery().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public C28144a(Context context, String str) {
        this(new C28148e(context, str));
    }

    /* renamed from: a */
    private static void m56252a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    private static <T> C28141a<T> m56249a(HttpURLConnection httpURLConnection, AbstractC28146c<T> cVar, AbstractC28146c<String> cVar2) {
        GZIPInputStream errorStream;
        MethodCollector.m26663i(3049);
        if (httpURLConnection.getResponseCode() < 400) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (list.get(i).equalsIgnoreCase("gzip")) {
                    errorStream = new GZIPInputStream(errorStream);
                    break;
                } else {
                    i++;
                }
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            try {
                C28141a<T> a = C28141a.m56242a(EnumC28179b.SERVER_ERROR, new LineApiError(responseCode, cVar2.mo48131a(errorStream)));
                MethodCollector.m26664o(3049);
                return a;
            } catch (IOException e) {
                C28141a<T> a2 = C28141a.m56242a(EnumC28179b.INTERNAL_ERROR, new LineApiError(responseCode, e));
                MethodCollector.m26664o(3049);
                return a2;
            }
        } else {
            T a3 = cVar.mo48131a(errorStream);
            if (a3 == null) {
                C28141a<T> aVar = (C28141a<T>) C28141a.f65856a;
                MethodCollector.m26664o(3049);
                return aVar;
            }
            C28141a<T> aVar2 = new C28141a<>(EnumC28179b.SUCCESS, a3, LineApiError.f65847a);
            MethodCollector.m26664o(3049);
            return aVar2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r4 == null) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.C28141a<T> mo48134b(android.net.Uri r6, java.util.Map<java.lang.String, java.lang.String> r7, java.util.Map<java.lang.String, java.lang.String> r8, com.linecorp.linesdk.p2028a.p2029a.p2030a.AbstractC28146c<T> r9) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.p2028a.p2029a.p2030a.C28144a.mo48134b(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.c):com.linecorp.linesdk.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r6 == null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.C28141a<T> mo48133a(android.net.Uri r9, java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.String> r11, com.linecorp.linesdk.p2028a.p2029a.p2030a.AbstractC28146c<T> r12) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.p2028a.p2029a.p2030a.C28144a.mo48133a(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.c):com.linecorp.linesdk.a");
    }
}
