package okhttp3;

import com.bytedance.covode.number.Covode;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4661i.AbstractC90164c;
import p4632k.C89427i;

/* renamed from: okhttp3.g */
public final class C90052g {

    /* renamed from: a */
    public static final C90052g f204200a = new C90053a().mo144772a();

    /* renamed from: b */
    final Set<C90054b> f204201b;

    /* renamed from: c */
    final AbstractC90164c f204202c;

    /* renamed from: okhttp3.g$a */
    public static final class C90053a {

        /* renamed from: a */
        private final List<C90054b> f204203a = new ArrayList();

        static {
            Covode.recordClassIndex(106225);
        }

        /* renamed from: a */
        public final C90052g mo144772a() {
            return new C90052g(new LinkedHashSet(this.f204203a), null);
        }

        /* renamed from: a */
        public final C90053a mo144771a(String str, String... strArr) {
            Objects.requireNonNull(str, "pattern == null");
            int i = 0;
            do {
                this.f204203a.add(new C90054b(str, strArr[0]));
                i++;
            } while (i <= 0);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.g$b */
    public static final class C90054b {

        /* renamed from: a */
        final String f204204a;

        /* renamed from: b */
        final String f204205b;

        /* renamed from: c */
        final String f204206c;

        /* renamed from: d */
        final C89427i f204207d;

        static {
            Covode.recordClassIndex(106226);
        }

        public final int hashCode() {
            return ((((this.f204204a.hashCode() + 527) * 31) + this.f204206c.hashCode()) * 31) + this.f204207d.hashCode();
        }

        public final String toString() {
            return this.f204206c + this.f204207d.base64();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C90054b)) {
                return false;
            }
            C90054b bVar = (C90054b) obj;
            if (!this.f204204a.equals(bVar.f204204a) || !this.f204206c.equals(bVar.f204206c) || !this.f204207d.equals(bVar.f204207d)) {
                return false;
            }
            return true;
        }

        C90054b(String str, String str2) {
            String str3;
            this.f204204a = str;
            if (str.startsWith("*.")) {
                str3 = C90200t.m156803g("http://" + str.substring(2)).f204861d;
            } else {
                str3 = C90200t.m156803g("http://".concat(String.valueOf(str))).f204861d;
            }
            this.f204205b = str3;
            if (str2.startsWith("sha1/")) {
                this.f204206c = "sha1/";
                this.f204207d = C89427i.decodeBase64(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.f204206c = "sha256/";
                this.f204207d = C89427i.decodeBase64(str2.substring(7));
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(String.valueOf(str2)));
            }
            if (this.f204207d == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(String.valueOf(str2)));
            }
        }
    }

    static {
        Covode.recordClassIndex(106224);
    }

    public final int hashCode() {
        int i;
        AbstractC90164c cVar = this.f204202c;
        if (cVar != null) {
            i = cVar.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f204201b.hashCode();
    }

    /* renamed from: a */
    private static C89427i m156299a(X509Certificate x509Certificate) {
        return C89427i.m155136of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* renamed from: a */
    public static String m156298a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m156299a((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C90052g)) {
            return false;
        }
        C90052g gVar = (C90052g) obj;
        if (!C90084c.m156418a(this.f204202c, gVar.f204202c) || !this.f204201b.equals(gVar.f204201b)) {
            return false;
        }
        return true;
    }

    C90052g(Set<C90054b> set, AbstractC90164c cVar) {
        this.f204201b = set;
        this.f204202c = cVar;
    }

    /* renamed from: a */
    public final void mo144768a(String str, List<Certificate> list) {
        int i;
        List<Certificate> list2 = list;
        List emptyList = Collections.emptyList();
        Iterator<C90054b> it = this.f204201b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C90054b next = it.next();
            if (next.f204204a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == next.f204205b.length()) {
                    if (!str.regionMatches(false, indexOf + 1, next.f204205b, 0, next.f204205b.length())) {
                    }
                }
            } else if (!str.equals(next.f204205b)) {
            }
            if (emptyList.isEmpty()) {
                emptyList = new ArrayList();
            }
            emptyList.add(next);
        }
        if (!emptyList.isEmpty()) {
            AbstractC90164c cVar = this.f204202c;
            if (cVar != null) {
                list2 = cVar.mo144953a(list2, str);
            }
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list2.get(i2);
                int size2 = emptyList.size();
                C89427i iVar = null;
                C89427i iVar2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    C90054b bVar = (C90054b) emptyList.get(i3);
                    if (bVar.f204206c.equals("sha256/")) {
                        if (iVar == null) {
                            iVar = m156299a(x509Certificate);
                        }
                        if (bVar.f204207d.equals(iVar)) {
                            return;
                        }
                    } else if (bVar.f204206c.equals("sha1/")) {
                        if (iVar2 == null) {
                            iVar2 = C89427i.m155136of(x509Certificate.getPublicKey().getEncoded()).sha1();
                        }
                        if (bVar.f204207d.equals(iVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f204206c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) list2.get(i4);
                sb.append("\n    ").append(m156298a((Certificate) x509Certificate2)).append(": ").append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ").append(str).append(":");
            int size4 = emptyList.size();
            for (i = 0; i < size4; i++) {
                sb.append("\n    ").append(emptyList.get(i));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }
}
