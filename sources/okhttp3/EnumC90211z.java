package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: okhttp3.z */
public enum EnumC90211z {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: a */
    private final String f204958a;

    public final String toString() {
        return this.f204958a;
    }

    static {
        Covode.recordClassIndex(106385);
    }

    public static EnumC90211z get(String str) {
        EnumC90211z zVar = HTTP_1_0;
        if (str.equals(zVar.f204958a)) {
            return zVar;
        }
        EnumC90211z zVar2 = HTTP_1_1;
        if (str.equals(zVar2.f204958a)) {
            return zVar2;
        }
        EnumC90211z zVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(zVar3.f204958a)) {
            return zVar3;
        }
        EnumC90211z zVar4 = HTTP_2;
        if (str.equals(zVar4.f204958a)) {
            return zVar4;
        }
        EnumC90211z zVar5 = SPDY_3;
        if (str.equals(zVar5.f204958a)) {
            return zVar5;
        }
        EnumC90211z zVar6 = QUIC;
        if (str.equals(zVar6.f204958a)) {
            return zVar6;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    private EnumC90211z(String str) {
        this.f204958a = str;
    }
}
