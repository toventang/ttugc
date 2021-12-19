package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import java.util.List;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90186m;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90184l;
import okhttp3.C90204w;
import okhttp3.Request;
import okhttp3.internal.C90084c;
import p4632k.C89433n;
import p4632k.C89436q;

/* renamed from: okhttp3.internal.c.a */
public final class C90087a implements AbstractC90202u {

    /* renamed from: a */
    private final AbstractC90186m f204467a;

    static {
        Covode.recordClassIndex(106259);
    }

    public C90087a(AbstractC90186m mVar) {
        this.f204467a = mVar;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        boolean z;
        Request a = aVar.mo144856a();
        Request.C90016a newBuilder = a.newBuilder();
        AbstractC90025ab body = a.body();
        if (body != null) {
            C90204w contentType = body.contentType();
            if (contentType != null) {
                newBuilder.mo144692a("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.mo144692a("Content-Length", Long.toString(contentLength));
                newBuilder.mo144699b("Transfer-Encoding");
            } else {
                newBuilder.mo144692a("Transfer-Encoding", "chunked");
                newBuilder.mo144699b("Content-Length");
            }
        }
        if (a.header("Host") == null) {
            newBuilder.mo144692a("Host", C90084c.m156408a(a.url(), false));
        }
        if (a.header("Connection") == null) {
            newBuilder.mo144692a("Connection", "Keep-Alive");
        }
        if (a.header("Accept-Encoding") == null && a.header("Range") == null) {
            newBuilder.mo144692a("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C90184l> loadForRequest = this.f204467a.loadForRequest(a.url());
        if (!loadForRequest.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = loadForRequest.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C90184l lVar = loadForRequest.get(i);
                sb.append(lVar.f204816a).append('=').append(lVar.f204817b);
            }
            newBuilder.mo144692a("Cookie", sb.toString());
        }
        if (a.header("User-Agent") == null) {
            newBuilder.mo144692a("User-Agent", "okhttp/3.12.13.1");
        }
        C90029ac a2 = aVar.mo144857a(newBuilder.mo144698a());
        C90093e.m156445a(this.f204467a, a.url(), a2.f204110f);
        C90029ac.C90030a b = a2.mo144722b();
        b.f204118a = a;
        if (z && "gzip".equalsIgnoreCase(a2.mo144721b("Content-Encoding")) && C90093e.m156446a(a2)) {
            C89433n nVar = new C89433n(a2.f204111g.source());
            b.mo144728a(a2.f204110f.mo145033c().mo145041b("Content-Encoding").mo145041b("Content-Length").mo145040a());
            b.f204124g = new C90096h(a2.mo144721b("Content-Type"), -1, C89436q.m155160a(nVar));
        }
        return b.mo144729a();
    }
}
