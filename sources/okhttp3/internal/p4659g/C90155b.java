package okhttp3.internal.p4659g;

import com.bytedance.covode.number.Covode;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC90211z;
import org.conscrypt.Conscrypt;

/* renamed from: okhttp3.internal.g.b */
public final class C90155b extends C90160f {
    static {
        Covode.recordClassIndex(106327);
    }

    private C90155b() {
    }

    /* renamed from: d */
    private static Provider m156651d() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: a */
    public static C90155b m156650a() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C90155b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: b */
    public final SSLContext mo144950b() {
        try {
            return SSLContext.getInstance("TLSv1.3", m156651d());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m156651d());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final String mo144943a(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo144943a(sSLSocket);
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: b */
    public final void mo144961b(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final X509TrustManager mo144944a(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.mo144944a(sSLSocketFactory);
        }
        try {
            Object a = m156675a(sSLSocketFactory, Object.class, "sslParameters");
            if (a != null) {
                return (X509TrustManager) m156675a(a, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final void mo144949a(SSLSocket sSLSocket, String str, List<EnumC90211z> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C90160f.m156676a(list).toArray(new String[0]));
            return;
        }
        super.mo144949a(sSLSocket, str, list);
    }
}
