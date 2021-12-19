package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.AbstractC90202u;
import okhttp3.C90017a;
import okhttp3.C90029ac;
import okhttp3.C90052g;
import okhttp3.C90200t;
import okhttp3.C90208y;
import okhttp3.Request;
import okhttp3.internal.p4654b.C90082g;

/* renamed from: okhttp3.internal.c.j */
public final class C90098j implements AbstractC90202u {

    /* renamed from: a */
    public volatile C90082g f204490a;

    /* renamed from: b */
    public Object f204491b;

    /* renamed from: c */
    public volatile boolean f204492c;

    /* renamed from: d */
    private final C90208y f204493d;

    /* renamed from: e */
    private final boolean f204494e;

    static {
        Covode.recordClassIndex(106270);
    }

    /* renamed from: a */
    private static boolean m156461a(int i) {
        return i == 308 || i == 307;
    }

    /* renamed from: a */
    private C90017a m156460a(C90200t tVar) {
        HostnameVerifier hostnameVerifier;
        C90052g gVar;
        SSLSocketFactory sSLSocketFactory = null;
        if (tVar.mo145049c()) {
            sSLSocketFactory = this.f204493d.f204917o;
            hostnameVerifier = this.f204493d.f204919q;
            gVar = this.f204493d.f204920r;
        } else {
            hostnameVerifier = null;
            gVar = null;
        }
        return new C90017a(tVar.f204861d, tVar.f204862e, this.f204493d.f204924v, this.f204493d.f204916n, sSLSocketFactory, hostnameVerifier, gVar, this.f204493d.f204921s, this.f204493d.f204906d, this.f204493d.f204907e, this.f204493d.f204908f, this.f204493d.f204912j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0112 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7 A[Catch:{ IOException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8 A[Catch:{ IOException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5 A[Catch:{ IOException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016b  */
    @Override // okhttp3.AbstractC90202u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C90029ac intercept(okhttp3.AbstractC90202u.AbstractC90203a r20) {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4655c.C90098j.intercept(okhttp3.u$a):okhttp3.ac");
    }

    public C90098j(C90208y yVar, boolean z) {
        this.f204493d = yVar;
        this.f204494e = z;
    }

    /* renamed from: a */
    private static int m156459a(C90029ac acVar, int i) {
        String a = acVar.mo144718a("Retry-After", null);
        if (a == null) {
            return i;
        }
        if (a.matches("\\d+")) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    private static boolean m156462a(IOException iOException, Request request) {
        if ((request.body() instanceof AbstractC90100l) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m156464a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m156465a(C90029ac acVar, C90200t tVar) {
        C90200t url = acVar.f204105a.url();
        if (!url.f204861d.equals(tVar.f204861d) || url.f204862e != tVar.f204862e || !url.f204858a.equals(tVar.f204858a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m156463a(IOException iOException, C90082g gVar, boolean z, Request request) {
        gVar.mo144838a(iOException);
        if (!this.f204493d.f204927y) {
            return false;
        }
        if ((!z || !m156462a(iOException, request)) && m156464a(iOException, z) && gVar.mo144844e()) {
            return true;
        }
        return false;
    }
}
