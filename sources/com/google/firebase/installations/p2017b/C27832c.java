package com.google.firebase.installations.p2017b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.C25595a;
import com.google.android.gms.common.util.C25607i;
import com.google.firebase.installations.p2017b.AbstractC27833d;
import com.google.firebase.installations.p2017b.AbstractC27836e;
import com.google.firebase.installations.p2017b.C27828a;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.b.c */
public final class C27832c {

    /* renamed from: a */
    private static final Pattern f65390a = Pattern.compile("[0-9]+s");

    /* renamed from: b */
    private static final Charset f65391b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final Context f65392c;

    /* renamed from: d */
    private final AbstractC27749h f65393d;

    /* renamed from: e */
    private final AbstractC27706c f65394e;

    /* renamed from: a */
    public final AbstractC27833d mo46537a(String str, String str2, String str3, String str4, String str5) {
        int i = 0;
        URL url = new URL(C1764a.m5928a("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", C1764a.m5928a("projects/%s/installations", new Object[]{str3})}));
        do {
            HttpURLConnection a = m55694a(url, str);
            try {
                a.setRequestMethod("POST");
                a.setDoOutput(true);
                if (str5 != null) {
                    a.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                m55699a(a, m55700a(m55697a(str2, str4)));
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    AbstractC27833d a2 = m55692a(a);
                    a.disconnect();
                    return a2;
                }
                m55698a(a, str4, str, str3);
                if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i++;
                } else {
                    AbstractC27833d a3 = new C27828a.C27829a().mo46521a(AbstractC27833d.EnumC27835b.BAD_CONFIG).mo46524a();
                    a.disconnect();
                    return a3;
                }
            } finally {
                a.disconnect();
            }
        } while (i <= 1);
        throw new IOException();
    }

    /* renamed from: a */
    private static byte[] m55700a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: a */
    private static void m55699a(URLConnection uRLConnection, byte[] bArr) {
        MethodCollector.m26663i(5347);
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                } catch (IOException unused) {
                    MethodCollector.m26664o(5347);
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
                MethodCollector.m26664o(5347);
            }
        } else {
            IOException iOException = new IOException("Cannot send request to FIS servers. No OutputStream available.");
            MethodCollector.m26664o(5347);
            throw iOException;
        }
    }

    /* renamed from: a */
    public final AbstractC27836e mo46538a(String str, String str2, String str3, String str4) {
        int i = 0;
        URL url = new URL(C1764a.m5928a("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", C1764a.m5928a("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2})}));
        do {
            HttpURLConnection a = m55694a(url, str);
            try {
                a.setRequestMethod("POST");
                a.addRequestProperty("Authorization", "FIS_v2 ".concat(String.valueOf(str4)));
                m55699a(a, m55700a(m55696a()));
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    AbstractC27836e b = m55701b(a);
                    a.disconnect();
                    return b;
                }
                m55698a(a, (String) null, str, str3);
                if (responseCode != 401) {
                    if (responseCode != 404) {
                        if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                            i++;
                        } else {
                            AbstractC27836e a2 = AbstractC27836e.m55717d().mo46534a(AbstractC27836e.EnumC27838b.BAD_CONFIG).mo46536a();
                            a.disconnect();
                            return a2;
                        }
                    }
                }
                AbstractC27836e a3 = AbstractC27836e.m55717d().mo46534a(AbstractC27836e.EnumC27838b.AUTH_ERROR).mo46536a();
                a.disconnect();
                return a3;
            } finally {
                a.disconnect();
            }
        } while (i <= 1);
        throw new IOException();
    }

    static {
        Covode.recordClassIndex(33421);
    }

    /* renamed from: a */
    private static JSONObject m55696a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private String m55702b() {
        try {
            Context context = this.f65392c;
            byte[] a = C25595a.m49402a(context, context.getPackageName());
            if (a != null) {
                return C25607i.m49417a(a);
            }
            this.f65392c.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f65392c.getPackageName();
            return null;
        }
    }

    /* renamed from: a */
    private static long m55691a(String str) {
        C25565r.m49325b(f65390a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: b */
    private static AbstractC27836e m55701b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f65391b));
        AbstractC27836e.AbstractC27837a d = AbstractC27836e.m55717d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                d.mo46535a(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                d.mo46533a(m55691a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return d.mo46534a(AbstractC27836e.EnumC27838b.OK).mo46536a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005e */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m55703c(java.net.HttpURLConnection r8) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p2017b.C27832c.m55703c(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: a */
    private static AbstractC27833d m55692a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f65391b));
        AbstractC27836e.AbstractC27837a d = AbstractC27836e.m55717d();
        C27828a.C27829a aVar = new C27828a.C27829a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(StringSet.name)) {
                aVar.mo46523a(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                aVar.mo46525b(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                aVar.mo46526c(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        d.mo46535a(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        d.mo46533a(m55691a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVar.mo46522a(d.mo46536a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVar.mo46521a(AbstractC27833d.EnumC27835b.OK).mo46524a();
    }

    /* renamed from: a */
    private static URLConnection m55695a(URL url) {
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
    private HttpURLConnection m55694a(URL url, String str) {
        AbstractC27706c.EnumC27707a a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) m55695a(url);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.addRequestProperty("X-Android-Package", this.f65392c.getPackageName());
        AbstractC27706c cVar = this.f65394e;
        if (!(cVar == null || this.f65393d == null || (a = cVar.mo46342a("fire-installations-id")) == AbstractC27706c.EnumC27707a.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f65393d.mo46381a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.getCode()));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", m55702b());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static JSONObject m55697a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.2");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public C27832c(Context context, AbstractC27749h hVar, AbstractC27706c cVar) {
        this.f65392c = context;
        this.f65393d = hVar;
        this.f65394e = cVar;
    }

    /* renamed from: a */
    private static String m55693a(String str, String str2, String str3) {
        String concat;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            concat = "";
        } else {
            concat = ", ".concat(String.valueOf(str));
        }
        objArr[2] = concat;
        return C1764a.m5928a("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: a */
    private static void m55698a(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(m55703c(httpURLConnection))) {
            m55693a(str, str2, str3);
        }
    }
}
