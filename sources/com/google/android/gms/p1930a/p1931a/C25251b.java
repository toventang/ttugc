package com.google.android.gms.p1930a.p1931a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.a.a.b */
public final class C25251b extends Thread {

    /* renamed from: a */
    private final /* synthetic */ Map f59863a;

    static {
        Covode.recordClassIndex(30623);
    }

    C25251b(Map map) {
        this.f59863a = map;
    }

    public final void run() {
        String str;
        R r;
        HttpURLConnection httpURLConnection;
        URLConnection uRLConnection;
        Map map = this.f59863a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String uri = buildUpon.build().toString();
        try {
            URL url = new URL(uri);
            C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
            if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
                r = m.f139469b;
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new C61417b(r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new C61416a(r);
                    }
                    httpURLConnection = (HttpURLConnection) r;
                    int responseCode = httpURLConnection.getResponseCode();
                    String.valueOf(uri).length();
                }
            } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                r = url.openConnection();
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new C61417b((HttpsURLConnection) r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new C61416a((HttpURLConnection) r);
                    }
                    httpURLConnection = (HttpURLConnection) r;
                    int responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 < 200 || responseCode2 >= 300) {
                        String.valueOf(uri).length();
                    }
                }
            } else {
                throw m.f139472e;
            }
            r = uRLConnection;
            httpURLConnection = (HttpURLConnection) r;
            try {
                int responseCode22 = httpURLConnection.getResponseCode();
                String.valueOf(uri).length();
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e) {
            str = e.getMessage();
            String.valueOf(uri).length();
            String.valueOf(str).length();
        } catch (IOException | RuntimeException e2) {
            str = e2.getMessage();
            String.valueOf(uri).length();
            String.valueOf(str).length();
        }
    }
}
