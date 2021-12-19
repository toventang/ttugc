package com.p2082ss.android.ugc.aweme.qrcode.p3656e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15418q;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.ss.android.ugc.aweme.qrcode.e.b */
public final class C66400b {

    /* renamed from: a */
    public static boolean f149302a;

    static {
        Covode.recordClassIndex(77932);
    }

    /* renamed from: a */
    public static String m118092a(String str) {
        R r;
        URLConnection uRLConnection;
        C29844g gVar = new C29844g(str);
        String curSecUserId = C31575b.m65865g().getCurSecUserId();
        if (!TextUtils.isEmpty(curSecUserId)) {
            gVar.mo52130a("sec_uid", curSecUserId);
        }
        try {
            URL url = new URL(gVar.mo52126a());
            C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
            if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
                r = m.f139469b;
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new C61417b(r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new C61416a(r);
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) r;
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.setRequestProperty("accept", "*/*");
                    httpURLConnection.setRequestProperty("connection", "Keep-Alive");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    return httpURLConnection.getHeaderField(C15418q.f37640b);
                }
            } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                r = url.openConnection();
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new C61417b((HttpsURLConnection) r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new C61416a((HttpURLConnection) r);
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) r;
                    httpURLConnection2.setRequestMethod("HEAD");
                    httpURLConnection2.setRequestProperty("accept", "*/*");
                    httpURLConnection2.setRequestProperty("connection", "Keep-Alive");
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    return httpURLConnection2.getHeaderField(C15418q.f37640b);
                }
            } else {
                throw m.f139472e;
            }
            r = uRLConnection;
            HttpURLConnection httpURLConnection22 = (HttpURLConnection) r;
            httpURLConnection22.setRequestMethod("HEAD");
            httpURLConnection22.setRequestProperty("accept", "*/*");
            httpURLConnection22.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection22.setInstanceFollowRedirects(false);
            return httpURLConnection22.getHeaderField(C15418q.f37640b);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m118093b(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("microapp") || str.contains("microgame")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("android_scheme");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = parse.getQueryParameter("ios_scheme");
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return str;
        }
        try {
            parse = Uri.parse(URLDecoder.decode(str, "UTF8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return queryParameter + "&app_id=" + parse.getQueryParameter("app_id") + "&token=" + parse.getQueryParameter("token") + "&channel=" + parse.getQueryParameter("channel") + "&iid=" + parse.getQueryParameter("iid");
    }
}
