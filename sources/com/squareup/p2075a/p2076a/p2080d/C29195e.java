package com.squareup.p2075a.p2076a.p2080d;

import com.bytedance.covode.number.Covode;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.squareup.a.a.d.e */
public final class C29195e implements AbstractC29196f {

    /* renamed from: a */
    private final Map<X500Principal, List<X509Certificate>> f69153a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(35544);
    }

    public C29195e(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            List<X509Certificate> list = this.f69153a.get(subjectX500Principal);
            if (list == null) {
                list = new ArrayList<>(1);
                this.f69153a.put(subjectX500Principal, list);
            }
            list.add(x509Certificate);
        }
    }

    @Override // com.squareup.p2075a.p2076a.p2080d.AbstractC29196f
    /* renamed from: a */
    public final X509Certificate mo50915a(X509Certificate x509Certificate) {
        List<X509Certificate> list = this.f69153a.get(x509Certificate.getIssuerX500Principal());
        if (list == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : list) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
