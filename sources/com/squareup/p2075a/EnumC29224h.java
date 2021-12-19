package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.a.h */
public enum EnumC29224h {
    TLS_RSA_WITH_NULL_MD5("SSL_RSA_WITH_NULL_MD5"),
    TLS_RSA_WITH_NULL_SHA("SSL_RSA_WITH_NULL_SHA"),
    TLS_RSA_EXPORT_WITH_RC4_40_MD5("SSL_RSA_EXPORT_WITH_RC4_40_MD5"),
    TLS_RSA_WITH_RC4_128_MD5("SSL_RSA_WITH_RC4_128_MD5"),
    TLS_RSA_WITH_RC4_128_SHA("SSL_RSA_WITH_RC4_128_SHA"),
    TLS_RSA_EXPORT_WITH_DES40_CBC_SHA("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"),
    TLS_RSA_WITH_DES_CBC_SHA("SSL_RSA_WITH_DES_CBC_SHA"),
    TLS_RSA_WITH_3DES_EDE_CBC_SHA("SSL_RSA_WITH_3DES_EDE_CBC_SHA"),
    TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"),
    TLS_DHE_DSS_WITH_DES_CBC_SHA("SSL_DHE_DSS_WITH_DES_CBC_SHA"),
    TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"),
    TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"),
    TLS_DHE_RSA_WITH_DES_CBC_SHA("SSL_DHE_RSA_WITH_DES_CBC_SHA"),
    TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"),
    TLS_DH_anon_EXPORT_WITH_RC4_40_MD5("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"),
    TLS_DH_anon_WITH_RC4_128_MD5("SSL_DH_anon_WITH_RC4_128_MD5"),
    TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"),
    TLS_DH_anon_WITH_DES_CBC_SHA("SSL_DH_anon_WITH_DES_CBC_SHA"),
    TLS_DH_anon_WITH_3DES_EDE_CBC_SHA("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"),
    TLS_KRB5_WITH_DES_CBC_SHA("TLS_KRB5_WITH_DES_CBC_SHA"),
    TLS_KRB5_WITH_3DES_EDE_CBC_SHA("TLS_KRB5_WITH_3DES_EDE_CBC_SHA"),
    TLS_KRB5_WITH_RC4_128_SHA("TLS_KRB5_WITH_RC4_128_SHA"),
    TLS_KRB5_WITH_DES_CBC_MD5("TLS_KRB5_WITH_DES_CBC_MD5"),
    TLS_KRB5_WITH_3DES_EDE_CBC_MD5("TLS_KRB5_WITH_3DES_EDE_CBC_MD5"),
    TLS_KRB5_WITH_RC4_128_MD5("TLS_KRB5_WITH_RC4_128_MD5"),
    TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"),
    TLS_KRB5_EXPORT_WITH_RC4_40_SHA("TLS_KRB5_EXPORT_WITH_RC4_40_SHA"),
    TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"),
    TLS_KRB5_EXPORT_WITH_RC4_40_MD5("TLS_KRB5_EXPORT_WITH_RC4_40_MD5"),
    TLS_RSA_WITH_AES_128_CBC_SHA("TLS_RSA_WITH_AES_128_CBC_SHA"),
    TLS_DHE_DSS_WITH_AES_128_CBC_SHA("TLS_DHE_DSS_WITH_AES_128_CBC_SHA"),
    TLS_DHE_RSA_WITH_AES_128_CBC_SHA("TLS_DHE_RSA_WITH_AES_128_CBC_SHA"),
    TLS_DH_anon_WITH_AES_128_CBC_SHA("TLS_DH_anon_WITH_AES_128_CBC_SHA"),
    TLS_RSA_WITH_AES_256_CBC_SHA("TLS_RSA_WITH_AES_256_CBC_SHA"),
    TLS_DHE_DSS_WITH_AES_256_CBC_SHA("TLS_DHE_DSS_WITH_AES_256_CBC_SHA"),
    TLS_DHE_RSA_WITH_AES_256_CBC_SHA("TLS_DHE_RSA_WITH_AES_256_CBC_SHA"),
    TLS_DH_anon_WITH_AES_256_CBC_SHA("TLS_DH_anon_WITH_AES_256_CBC_SHA"),
    TLS_RSA_WITH_NULL_SHA256("TLS_RSA_WITH_NULL_SHA256"),
    TLS_RSA_WITH_AES_128_CBC_SHA256("TLS_RSA_WITH_AES_128_CBC_SHA256"),
    TLS_RSA_WITH_AES_256_CBC_SHA256("TLS_RSA_WITH_AES_256_CBC_SHA256"),
    TLS_DHE_DSS_WITH_AES_128_CBC_SHA256("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"),
    TLS_DHE_RSA_WITH_AES_128_CBC_SHA256("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"),
    TLS_DHE_DSS_WITH_AES_256_CBC_SHA256("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"),
    TLS_DHE_RSA_WITH_AES_256_CBC_SHA256("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"),
    TLS_DH_anon_WITH_AES_128_CBC_SHA256("TLS_DH_anon_WITH_AES_128_CBC_SHA256"),
    TLS_DH_anon_WITH_AES_256_CBC_SHA256("TLS_DH_anon_WITH_AES_256_CBC_SHA256"),
    TLS_RSA_WITH_AES_128_GCM_SHA256("TLS_RSA_WITH_AES_128_GCM_SHA256"),
    TLS_RSA_WITH_AES_256_GCM_SHA384("TLS_RSA_WITH_AES_256_GCM_SHA384"),
    TLS_DHE_RSA_WITH_AES_128_GCM_SHA256("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"),
    TLS_DHE_RSA_WITH_AES_256_GCM_SHA384("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"),
    TLS_DHE_DSS_WITH_AES_128_GCM_SHA256("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"),
    TLS_DHE_DSS_WITH_AES_256_GCM_SHA384("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"),
    TLS_DH_anon_WITH_AES_128_GCM_SHA256("TLS_DH_anon_WITH_AES_128_GCM_SHA256"),
    TLS_DH_anon_WITH_AES_256_GCM_SHA384("TLS_DH_anon_WITH_AES_256_GCM_SHA384"),
    TLS_EMPTY_RENEGOTIATION_INFO_SCSV("TLS_EMPTY_RENEGOTIATION_INFO_SCSV"),
    TLS_ECDH_ECDSA_WITH_NULL_SHA("TLS_ECDH_ECDSA_WITH_NULL_SHA"),
    TLS_ECDH_ECDSA_WITH_RC4_128_SHA("TLS_ECDH_ECDSA_WITH_RC4_128_SHA"),
    TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"),
    TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"),
    TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"),
    TLS_ECDHE_ECDSA_WITH_NULL_SHA("TLS_ECDHE_ECDSA_WITH_NULL_SHA"),
    TLS_ECDHE_ECDSA_WITH_RC4_128_SHA("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"),
    TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"),
    TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"),
    TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"),
    TLS_ECDH_RSA_WITH_NULL_SHA("TLS_ECDH_RSA_WITH_NULL_SHA"),
    TLS_ECDH_RSA_WITH_RC4_128_SHA("TLS_ECDH_RSA_WITH_RC4_128_SHA"),
    TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"),
    TLS_ECDH_RSA_WITH_AES_128_CBC_SHA("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"),
    TLS_ECDH_RSA_WITH_AES_256_CBC_SHA("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"),
    TLS_ECDHE_RSA_WITH_NULL_SHA("TLS_ECDHE_RSA_WITH_NULL_SHA"),
    TLS_ECDHE_RSA_WITH_RC4_128_SHA("TLS_ECDHE_RSA_WITH_RC4_128_SHA"),
    TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"),
    TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"),
    TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"),
    TLS_ECDH_anon_WITH_NULL_SHA("TLS_ECDH_anon_WITH_NULL_SHA"),
    TLS_ECDH_anon_WITH_RC4_128_SHA("TLS_ECDH_anon_WITH_RC4_128_SHA"),
    TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"),
    TLS_ECDH_anon_WITH_AES_128_CBC_SHA("TLS_ECDH_anon_WITH_AES_128_CBC_SHA"),
    TLS_ECDH_anon_WITH_AES_256_CBC_SHA("TLS_ECDH_anon_WITH_AES_256_CBC_SHA"),
    TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"),
    TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"),
    TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"),
    TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"),
    TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"),
    TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"),
    TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"),
    TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"),
    TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"),
    TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"),
    TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"),
    TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"),
    TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"),
    TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"),
    TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"),
    TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    

    /* renamed from: a */
    final String f69249a;

    static {
        Covode.recordClassIndex(35573);
    }

    public static EnumC29224h forJavaName(String str) {
        if (str.startsWith("SSL_")) {
            return valueOf("TLS_" + str.substring(4));
        }
        return valueOf(str);
    }

    private EnumC29224h(String str) {
        this.f69249a = str;
    }
}
