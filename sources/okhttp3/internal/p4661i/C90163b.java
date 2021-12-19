package okhttp3.internal.p4661i;

import com.bytedance.covode.number.Covode;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.internal.i.b */
public final class C90163b implements AbstractC90166e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f204722a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(106335);
    }

    public final int hashCode() {
        return this.f204722a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C90163b) || !((C90163b) obj).f204722a.equals(this.f204722a)) {
            return false;
        }
        return true;
    }

    public C90163b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f204722a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f204722a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // okhttp3.internal.p4661i.AbstractC90166e
    /* renamed from: a */
    public final X509Certificate mo144956a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f204722a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
