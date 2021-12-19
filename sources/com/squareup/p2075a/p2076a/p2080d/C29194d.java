package com.squareup.p2075a.p2076a.p2080d;

import com.bytedance.covode.number.Covode;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: com.squareup.a.a.d.d */
public final class C29194d implements HostnameVerifier {

    /* renamed from: a */
    public static final C29194d f69151a = new C29194d();

    /* renamed from: b */
    private static final Pattern f69152b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C29194d() {
    }

    static {
        Covode.recordClassIndex(35543);
    }

    /* renamed from: a */
    public static List<String> m58391a(X509Certificate x509Certificate, int i) {
        Integer num;
        Object obj;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (!(list == null || list.size() < 2 || (num = (Integer) list.get(0)) == null || num.intValue() != i || (obj = list.get(1)) == null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private static boolean m58392a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (f69152b.matcher(str).matches()) {
                List<String> a = m58391a(x509Certificate, 7);
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    if (str.equalsIgnoreCase(a.get(i))) {
                        return true;
                    }
                }
                return false;
            }
            String lowerCase = str.toLowerCase(Locale.US);
            List<String> a2 = m58391a(x509Certificate, 2);
            int size2 = a2.size();
            int i2 = 0;
            boolean z = false;
            while (i2 < size2) {
                if (m58392a(lowerCase, a2.get(i2))) {
                    return true;
                }
                i2++;
                z = true;
            }
            if (!z) {
                C29193c cVar = new C29193c(x509Certificate.getSubjectX500Principal());
                cVar.f69146c = 0;
                cVar.f69147d = 0;
                cVar.f69148e = 0;
                cVar.f69149f = 0;
                cVar.f69150g = cVar.f69144a.toCharArray();
                String a3 = cVar.mo50917a();
                if (a3 != null) {
                    do {
                        String str2 = "";
                        if (cVar.f69146c != cVar.f69145b) {
                            char c = cVar.f69150g[cVar.f69146c];
                            if (c == '\"') {
                                cVar.f69146c++;
                                cVar.f69147d = cVar.f69146c;
                                cVar.f69148e = cVar.f69147d;
                                while (cVar.f69146c != cVar.f69145b) {
                                    if (cVar.f69150g[cVar.f69146c] == '\"') {
                                        cVar.f69146c++;
                                        while (cVar.f69146c < cVar.f69145b && cVar.f69150g[cVar.f69146c] == ' ') {
                                            cVar.f69146c++;
                                        }
                                        str2 = new String(cVar.f69150g, cVar.f69147d, cVar.f69148e - cVar.f69147d);
                                    } else {
                                        if (cVar.f69150g[cVar.f69146c] == '\\') {
                                            cVar.f69150g[cVar.f69148e] = cVar.mo50920d();
                                        } else {
                                            cVar.f69150g[cVar.f69148e] = cVar.f69150g[cVar.f69146c];
                                        }
                                        cVar.f69146c++;
                                        cVar.f69148e++;
                                    }
                                }
                                throw new IllegalStateException("Unexpected end of DN: " + cVar.f69144a);
                            } else if (c == '#') {
                                str2 = cVar.mo50918b();
                            } else if (!(c == '+' || c == ',' || c == ';')) {
                                str2 = cVar.mo50919c();
                            }
                            if ("cn".equalsIgnoreCase(a3)) {
                                if (str2 != null) {
                                    return m58392a(lowerCase, str2);
                                }
                            } else if (cVar.f69146c < cVar.f69145b) {
                                if (cVar.f69150g[cVar.f69146c] == ',' || cVar.f69150g[cVar.f69146c] == ';' || cVar.f69150g[cVar.f69146c] == '+') {
                                    cVar.f69146c++;
                                    a3 = cVar.mo50917a();
                                } else {
                                    throw new IllegalStateException("Malformed DN: " + cVar.f69144a);
                                }
                            }
                        }
                    } while (a3 != null);
                    throw new IllegalStateException("Malformed DN: " + cVar.f69144a);
                }
            }
            return false;
        } catch (SSLException unused) {
        }
    }
}
