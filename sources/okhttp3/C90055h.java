package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: okhttp3.h */
public final class C90055h {

    /* renamed from: A */
    public static final C90055h f204208A = m156304b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");

    /* renamed from: B */
    public static final C90055h f204209B = m156304b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");

    /* renamed from: C */
    public static final C90055h f204210C = m156304b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");

    /* renamed from: D */
    public static final C90055h f204211D = m156304b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: E */
    public static final C90055h f204212E = m156304b("TLS_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: F */
    public static final C90055h f204213F = m156304b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");

    /* renamed from: G */
    public static final C90055h f204214G = m156304b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: H */
    public static final C90055h f204215H = m156304b("TLS_DH_anon_WITH_AES_128_CBC_SHA");

    /* renamed from: I */
    public static final C90055h f204216I = m156304b("TLS_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: J */
    public static final C90055h f204217J = m156304b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");

    /* renamed from: K */
    public static final C90055h f204218K = m156304b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: L */
    public static final C90055h f204219L = m156304b("TLS_DH_anon_WITH_AES_256_CBC_SHA");

    /* renamed from: M */
    public static final C90055h f204220M = m156304b("TLS_RSA_WITH_NULL_SHA256");

    /* renamed from: N */
    public static final C90055h f204221N = m156304b("TLS_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: O */
    public static final C90055h f204222O = m156304b("TLS_RSA_WITH_AES_256_CBC_SHA256");

    /* renamed from: P */
    public static final C90055h f204223P = m156304b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");

    /* renamed from: Q */
    public static final C90055h f204224Q = m156304b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: R */
    public static final C90055h f204225R = m156304b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: S */
    public static final C90055h f204226S = m156304b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: T */
    public static final C90055h f204227T = m156304b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: U */
    public static final C90055h f204228U = m156304b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");

    /* renamed from: V */
    public static final C90055h f204229V = m156304b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");

    /* renamed from: W */
    public static final C90055h f204230W = m156304b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");

    /* renamed from: X */
    public static final C90055h f204231X = m156304b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");

    /* renamed from: Y */
    public static final C90055h f204232Y = m156304b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");

    /* renamed from: Z */
    public static final C90055h f204233Z = m156304b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");

    /* renamed from: a */
    static final Comparator<String> f204234a = new Comparator<String>() {
        /* class okhttp3.C90055h.C900561 */

        static {
            Covode.recordClassIndex(106228);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            int min = Math.min(str3.length(), str4.length());
            for (int i = 4; i < min; i++) {
                char charAt = str3.charAt(i);
                char charAt2 = str4.charAt(i);
                if (charAt != charAt2) {
                    if (charAt < charAt2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: aA */
    public static final C90055h f204235aA = m156304b("TLS_ECDH_RSA_WITH_NULL_SHA");

    /* renamed from: aB */
    public static final C90055h f204236aB = m156304b("TLS_ECDH_RSA_WITH_RC4_128_SHA");

    /* renamed from: aC */
    public static final C90055h f204237aC = m156304b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: aD */
    public static final C90055h f204238aD = m156304b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: aE */
    public static final C90055h f204239aE = m156304b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: aF */
    public static final C90055h f204240aF = m156304b("TLS_ECDHE_RSA_WITH_NULL_SHA");

    /* renamed from: aG */
    public static final C90055h f204241aG = m156304b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");

    /* renamed from: aH */
    public static final C90055h f204242aH = m156304b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: aI */
    public static final C90055h f204243aI = m156304b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: aJ */
    public static final C90055h f204244aJ = m156304b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: aK */
    public static final C90055h f204245aK = m156304b("TLS_ECDH_anon_WITH_NULL_SHA");

    /* renamed from: aL */
    public static final C90055h f204246aL = m156304b("TLS_ECDH_anon_WITH_RC4_128_SHA");

    /* renamed from: aM */
    public static final C90055h f204247aM = m156304b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: aN */
    public static final C90055h f204248aN = m156304b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");

    /* renamed from: aO */
    public static final C90055h f204249aO = m156304b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");

    /* renamed from: aP */
    public static final C90055h f204250aP = m156304b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aQ */
    public static final C90055h f204251aQ = m156304b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aR */
    public static final C90055h f204252aR = m156304b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aS */
    public static final C90055h f204253aS = m156304b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aT */
    public static final C90055h f204254aT = m156304b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aU */
    public static final C90055h f204255aU = m156304b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aV */
    public static final C90055h f204256aV = m156304b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aW */
    public static final C90055h f204257aW = m156304b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aX */
    public static final C90055h f204258aX = m156304b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: aY */
    public static final C90055h f204259aY = m156304b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: aZ */
    public static final C90055h f204260aZ = m156304b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: aa */
    public static final C90055h f204261aa = m156304b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");

    /* renamed from: ab */
    public static final C90055h f204262ab = m156304b("TLS_PSK_WITH_RC4_128_SHA");

    /* renamed from: ac */
    public static final C90055h f204263ac = m156304b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: ad */
    public static final C90055h f204264ad = m156304b("TLS_PSK_WITH_AES_128_CBC_SHA");

    /* renamed from: ae */
    public static final C90055h f204265ae = m156304b("TLS_PSK_WITH_AES_256_CBC_SHA");

    /* renamed from: af */
    public static final C90055h f204266af = m156304b("TLS_RSA_WITH_SEED_CBC_SHA");

    /* renamed from: ag */
    public static final C90055h f204267ag = m156304b("TLS_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: ah */
    public static final C90055h f204268ah = m156304b("TLS_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: ai */
    public static final C90055h f204269ai = m156304b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: aj */
    public static final C90055h f204270aj = m156304b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: ak */
    public static final C90055h f204271ak = m156304b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");

    /* renamed from: al */
    public static final C90055h f204272al = m156304b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");

    /* renamed from: am */
    public static final C90055h f204273am = m156304b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");

    /* renamed from: an */
    public static final C90055h f204274an = m156304b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");

    /* renamed from: ao */
    public static final C90055h f204275ao = m156304b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");

    /* renamed from: ap */
    public static final C90055h f204276ap = m156304b("TLS_FALLBACK_SCSV");

    /* renamed from: aq */
    public static final C90055h f204277aq = m156304b("TLS_ECDH_ECDSA_WITH_NULL_SHA");

    /* renamed from: ar */
    public static final C90055h f204278ar = m156304b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");

    /* renamed from: as */
    public static final C90055h f204279as = m156304b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: at */
    public static final C90055h f204280at = m156304b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");

    /* renamed from: au */
    public static final C90055h f204281au = m156304b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");

    /* renamed from: av */
    public static final C90055h f204282av = m156304b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");

    /* renamed from: aw */
    public static final C90055h f204283aw = m156304b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");

    /* renamed from: ax */
    public static final C90055h f204284ax = m156304b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: ay */
    public static final C90055h f204285ay = m156304b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");

    /* renamed from: az */
    public static final C90055h f204286az = m156304b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");

    /* renamed from: b */
    public static final C90055h f204287b = m156304b("SSL_RSA_WITH_NULL_MD5");

    /* renamed from: ba */
    public static final C90055h f204288ba = m156304b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: bb */
    public static final C90055h f204289bb = m156304b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: bc */
    public static final C90055h f204290bc = m156304b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: bd */
    public static final C90055h f204291bd = m156304b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: be */
    public static final C90055h f204292be = m156304b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: bf */
    public static final C90055h f204293bf = m156304b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");

    /* renamed from: bg */
    public static final C90055h f204294bg = m156304b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");

    /* renamed from: bh */
    public static final C90055h f204295bh = m156304b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: bi */
    public static final C90055h f204296bi = m156304b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: bj */
    public static final C90055h f204297bj = m156304b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: bk */
    public static final C90055h f204298bk = m156304b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: bl */
    public static final C90055h f204299bl = m156304b("TLS_AES_128_GCM_SHA256");

    /* renamed from: bm */
    public static final C90055h f204300bm = m156304b("TLS_AES_256_GCM_SHA384");

    /* renamed from: bn */
    public static final C90055h f204301bn = m156304b("TLS_CHACHA20_POLY1305_SHA256");

    /* renamed from: bo */
    public static final C90055h f204302bo = m156304b("TLS_AES_128_CCM_SHA256");

    /* renamed from: bp */
    public static final C90055h f204303bp = m156304b("TLS_AES_256_CCM_8_SHA256");

    /* renamed from: br */
    private static final Map<String, C90055h> f204304br = new LinkedHashMap();

    /* renamed from: c */
    public static final C90055h f204305c = m156304b("SSL_RSA_WITH_NULL_SHA");

    /* renamed from: d */
    public static final C90055h f204306d = m156304b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: e */
    public static final C90055h f204307e = m156304b("SSL_RSA_WITH_RC4_128_MD5");

    /* renamed from: f */
    public static final C90055h f204308f = m156304b("SSL_RSA_WITH_RC4_128_SHA");

    /* renamed from: g */
    public static final C90055h f204309g = m156304b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: h */
    public static final C90055h f204310h = m156304b("SSL_RSA_WITH_DES_CBC_SHA");

    /* renamed from: i */
    public static final C90055h f204311i = m156304b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: j */
    public static final C90055h f204312j = m156304b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: k */
    public static final C90055h f204313k = m156304b("SSL_DHE_DSS_WITH_DES_CBC_SHA");

    /* renamed from: l */
    public static final C90055h f204314l = m156304b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: m */
    public static final C90055h f204315m = m156304b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: n */
    public static final C90055h f204316n = m156304b("SSL_DHE_RSA_WITH_DES_CBC_SHA");

    /* renamed from: o */
    public static final C90055h f204317o = m156304b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: p */
    public static final C90055h f204318p = m156304b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: q */
    public static final C90055h f204319q = m156304b("SSL_DH_anon_WITH_RC4_128_MD5");

    /* renamed from: r */
    public static final C90055h f204320r = m156304b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: s */
    public static final C90055h f204321s = m156304b("SSL_DH_anon_WITH_DES_CBC_SHA");

    /* renamed from: t */
    public static final C90055h f204322t = m156304b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: u */
    public static final C90055h f204323u = m156304b("TLS_KRB5_WITH_DES_CBC_SHA");

    /* renamed from: v */
    public static final C90055h f204324v = m156304b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: w */
    public static final C90055h f204325w = m156304b("TLS_KRB5_WITH_RC4_128_SHA");

    /* renamed from: x */
    public static final C90055h f204326x = m156304b("TLS_KRB5_WITH_DES_CBC_MD5");

    /* renamed from: y */
    public static final C90055h f204327y = m156304b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");

    /* renamed from: z */
    public static final C90055h f204328z = m156304b("TLS_KRB5_WITH_RC4_128_MD5");

    /* renamed from: bq */
    public final String f204329bq;

    public final String toString() {
        return this.f204329bq;
    }

    static {
        Covode.recordClassIndex(106227);
    }

    private C90055h(String str) {
        Objects.requireNonNull(str);
        this.f204329bq = str;
    }

    /* renamed from: b */
    private static C90055h m156304b(String str) {
        C90055h hVar = new C90055h(str);
        f204304br.put(str, hVar);
        return hVar;
    }

    /* renamed from: a */
    public static synchronized C90055h m156303a(String str) {
        C90055h hVar;
        String str2;
        synchronized (C90055h.class) {
            MethodCollector.m26663i(10755);
            Map<String, C90055h> map = f204304br;
            hVar = map.get(str);
            if (hVar == null) {
                if (str.startsWith("TLS_")) {
                    str2 = "SSL_" + str.substring(4);
                } else if (str.startsWith("SSL_")) {
                    str2 = "TLS_" + str.substring(4);
                } else {
                    str2 = str;
                }
                hVar = map.get(str2);
                if (hVar == null) {
                    hVar = new C90055h(str);
                }
                map.put(str, hVar);
            }
            MethodCollector.m26664o(10755);
        }
        return hVar;
    }
}
