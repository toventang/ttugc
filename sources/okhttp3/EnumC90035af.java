package okhttp3;

import com.bytedance.covode.number.Covode;

/* renamed from: okhttp3.af */
public enum EnumC90035af {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: a */
    final String f204141a;

    public final String javaName() {
        return this.f204141a;
    }

    static {
        Covode.recordClassIndex(106207);
    }

    public static EnumC90035af forJavaName(String str) {
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
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    return TLS_1_3;
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

    private EnumC90035af(String str) {
        this.f204141a = str;
    }
}
