package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.a.aa */
public enum EnumC29208aa {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: a */
    final String f69182a;

    public final String javaName() {
        return this.f69182a;
    }

    static {
        Covode.recordClassIndex(35557);
    }

    public static EnumC29208aa forJavaName(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    return TLS_1_1;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    return TLS_1_2;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    return SSL_3_0;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    return TLS_1_0;
                }
                break;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str)));
    }

    private EnumC29208aa(String str) {
        this.f69182a = str;
    }
}
