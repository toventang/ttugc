package com.facebook;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24783w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.r */
public class C24915r {

    /* renamed from: g */
    private static final String f59151g = C24915r.class.getSimpleName();

    /* renamed from: a */
    public final HttpURLConnection f59152a;

    /* renamed from: b */
    public final JSONObject f59153b;

    /* renamed from: c */
    public final JSONArray f59154c;

    /* renamed from: d */
    public final FacebookRequestError f59155d;

    /* renamed from: e */
    public final String f59156e;

    /* renamed from: f */
    public final GraphRequest f59157f;

    static {
        Covode.recordClassIndex(29108);
    }

    public String toString() {
        String str;
        int i;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f59152a;
            if (httpURLConnection != null) {
                i = httpURLConnection.getResponseCode();
            } else {
                i = 200;
            }
            objArr[0] = Integer.valueOf(i);
            str = C1764a.m5929a(locale, "%d", objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.f59153b + ", error: " + this.f59155d + "}";
    }

    /* renamed from: a */
    static List<C24915r> m47750a(HttpURLConnection httpURLConnection, C24912q qVar) {
        InputStream inputStream;
        Closeable closeable = null;
        try {
            if (C24872m.m47688b()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                String a = C24693ad.m47235a(closeable);
                C24783w.m47441a(EnumC25029u.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a.length()), a);
                List<C24915r> a2 = m47751a(httpURLConnection, qVar, new JSONTokener(a).nextValue());
                C24783w.m47441a(EnumC25029u.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", qVar.f59148d, Integer.valueOf(a.length()), a2);
                return a2;
            }
            throw new C24798j("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        } catch (C24798j e) {
            C24783w.m47441a(EnumC25029u.REQUESTS, "Response", "Response <Error>: %s", e);
            return m47752a(qVar, httpURLConnection, e);
        } catch (Exception e2) {
            C24783w.m47441a(EnumC25029u.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m47752a(qVar, httpURLConnection, new C24798j(e2));
        } finally {
            C24693ad.m47251a(closeable);
        }
    }

    private C24915r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    /* renamed from: a */
    static List<C24915r> m47752a(List<GraphRequest> list, HttpURLConnection httpURLConnection, C24798j jVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C24915r(list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, jVar)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C24915r> m47751a(java.net.HttpURLConnection r24, java.util.List<com.facebook.GraphRequest> r25, java.lang.Object r26) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C24915r.m47751a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    private C24915r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    private C24915r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    private C24915r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f59157f = graphRequest;
        this.f59152a = httpURLConnection;
        this.f59156e = str;
        this.f59153b = jSONObject;
        this.f59154c = jSONArray;
        this.f59155d = facebookRequestError;
    }
}
