package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import java.net.ProtocolException;
import okhttp3.EnumC90211z;

/* renamed from: okhttp3.internal.c.k */
public final class C90099k {

    /* renamed from: a */
    public final EnumC90211z f204495a;

    /* renamed from: b */
    public final int f204496b;

    /* renamed from: c */
    public final String f204497c;

    static {
        Covode.recordClassIndex(106271);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f204495a == EnumC90211z.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ').append(this.f204496b);
        if (this.f204497c != null) {
            sb.append(' ').append(this.f204497c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C90099k m156466a(String str) {
        EnumC90211z zVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                zVar = EnumC90211z.HTTP_1_0;
            } else if (charAt == 1) {
                zVar = EnumC90211z.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            zVar = EnumC90211z.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                return new C90099k(zVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public C90099k(EnumC90211z zVar, int i, String str) {
        this.f204495a = zVar;
        this.f204496b = i;
        this.f204497c = str;
    }
}
