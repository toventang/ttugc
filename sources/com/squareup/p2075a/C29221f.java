package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.p2076a.C29206j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p4632k.C89427i;

/* renamed from: com.squareup.a.f */
public final class C29221f {

    /* renamed from: a */
    public static final C29221f f69243a = new C29221f(new C29222a(), (byte) 0);

    /* renamed from: b */
    private final Map<String, Set<C89427i>> f69244b;

    /* renamed from: com.squareup.a.f$a */
    public static final class C29222a {

        /* renamed from: a */
        public final Map<String, Set<C89427i>> f69245a = new LinkedHashMap();

        static {
            Covode.recordClassIndex(35571);
        }
    }

    static {
        Covode.recordClassIndex(35570);
    }

    private C29221f(C29222a aVar) {
        this.f69244b = Collections.unmodifiableMap(new LinkedHashMap(aVar.f69245a));
    }

    /* renamed from: a */
    private static C89427i m58479a(X509Certificate x509Certificate) {
        return C29206j.m58436a(C89427i.m155136of(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: a */
    public static String m58478a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + m58479a((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private /* synthetic */ C29221f(C29222a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public final void mo50956a(String str, List<Certificate> list) {
        Set<C89427i> set = this.f69244b.get(str);
        int indexOf = str.indexOf(46);
        Set<C89427i> set2 = null;
        if (indexOf != str.lastIndexOf(46)) {
            set2 = this.f69244b.get("*." + str.substring(indexOf + 1));
        }
        if (set == null) {
            if (set2 == null || (set = set2) == null) {
                return;
            }
        } else if (set2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set);
            linkedHashSet.addAll(set2);
            set = linkedHashSet;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (set.contains(m58479a((X509Certificate) list.get(i)))) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sb.append("\n    ").append(m58478a((Certificate) x509Certificate)).append(": ").append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ").append(str).append(":");
        for (C89427i iVar : set) {
            sb.append("\n    sha1/").append(iVar.base64());
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
