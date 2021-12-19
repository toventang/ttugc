package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.EnumC29245u;
import java.net.ProtocolException;

/* renamed from: com.squareup.a.a.b.r */
public final class C29184r {

    /* renamed from: a */
    public final EnumC29245u f69113a;

    /* renamed from: b */
    public final int f69114b;

    /* renamed from: c */
    public final String f69115c;

    static {
        Covode.recordClassIndex(35533);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f69113a == EnumC29245u.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ').append(this.f69114b);
        if (this.f69115c != null) {
            sb.append(' ').append(this.f69115c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C29184r m58339a(String str) {
        EnumC29245u uVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                uVar = EnumC29245u.HTTP_1_0;
            } else if (charAt == 1) {
                uVar = EnumC29245u.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            uVar = EnumC29245u.HTTP_1_0;
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
                return new C29184r(uVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public C29184r(EnumC29245u uVar, int i, String str) {
        this.f69113a = uVar;
        this.f69114b = i;
        this.f69115c = str;
    }
}
