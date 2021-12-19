package net.openid.appauth.p4650b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import net.openid.appauth.C90009p;

/* renamed from: net.openid.appauth.b.b */
public final class C89975b implements AbstractC89974a {

    /* renamed from: a */
    public static final C89975b f203874a = new C89975b();

    /* renamed from: b */
    private static final int f203875b = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: c */
    private static final int f203876c = ((int) TimeUnit.SECONDS.toMillis(10));

    private C89975b() {
    }

    static {
        Covode.recordClassIndex(106146);
    }

    @Override // net.openid.appauth.p4650b.AbstractC89974a
    /* renamed from: a */
    public final HttpURLConnection mo144632a(Uri uri) {
        R openConnection;
        URLConnection aVar;
        C90009p.m156198a(uri, "url must not be null");
        C90009p.m156200a("https".equals(uri.getScheme()), "only https connections are permitted");
        URL url = new URL(uri.toString());
        C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
        if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
            openConnection = m.f139469b;
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new C61417b(openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new C61416a(openConnection);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(f203875b);
                httpURLConnection.setReadTimeout(f203876c);
                httpURLConnection.setInstanceFollowRedirects(false);
                return httpURLConnection;
            }
        } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
            openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new C61417b((HttpsURLConnection) openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new C61416a((HttpURLConnection) openConnection);
                }
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                httpURLConnection2.setConnectTimeout(f203875b);
                httpURLConnection2.setReadTimeout(f203876c);
                httpURLConnection2.setInstanceFollowRedirects(false);
                return httpURLConnection2;
            }
        } else {
            throw m.f139472e;
        }
        openConnection = aVar;
        HttpURLConnection httpURLConnection22 = (HttpURLConnection) openConnection;
        httpURLConnection22.setConnectTimeout(f203875b);
        httpURLConnection22.setReadTimeout(f203876c);
        httpURLConnection22.setInstanceFollowRedirects(false);
        return httpURLConnection22;
    }
}
