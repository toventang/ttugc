package com.bytedance.apm.net;

import com.bytedance.apm.p789q.C12580d;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.services.apm.api.IHttpService;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class DefaultHttpServiceImpl implements IHttpService {
    private static String METHOD_GET = "GET";
    private static String METHOD_POST = "POST";

    static {
        Covode.recordClassIndex(14373);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: com_bytedance_apm_net_DefaultHttpServiceImpl_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection */
    public static URLConnection m22591x47bdf6ec(URL url) {
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

    @Override // com.bytedance.services.apm.api.IHttpService
    public C22710c doGet(String str, Map<String, String> map) {
        return doRequest(str, null, METHOD_GET, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C22710c doPost(String str, byte[] bArr, Map<String, String> map) {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C22710c uploadFiles(String str, List<File> list, Map<String, String> map) {
        return C12580d.m22657a(str, list, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:27|28|(1:41)(1:32)|33|(4:36|(2:40|91)|87|34)|88|42|(2:44|45)|46|47|48) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb A[SYNTHETIC, Splitter:B:63:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0100 A[SYNTHETIC, Splitter:B:67:0x0100] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.services.apm.api.C22710c doRequest(java.lang.String r13, byte[] r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.net.DefaultHttpServiceImpl.doRequest(java.lang.String, byte[], java.lang.String, java.util.Map):com.bytedance.services.apm.api.c");
    }
}
