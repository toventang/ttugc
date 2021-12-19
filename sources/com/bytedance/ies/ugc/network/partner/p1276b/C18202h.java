package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import java.security.InvalidParameterException;
import java.util.Objects;
import okhttp3.C90200t;
import okhttp3.internal.C90084c;

/* renamed from: com.bytedance.ies.ugc.network.partner.b.h */
public final class C18202h {

    /* renamed from: a */
    public String f43366a;

    /* renamed from: b */
    public String f43367b = "";

    /* renamed from: c */
    public String f43368c = "";

    /* renamed from: d */
    public String f43369d;

    /* renamed from: e */
    public final C18197d f43370e = new C18197d();

    /* renamed from: f */
    public final C18198e f43371f = new C18198e();

    /* renamed from: g */
    public String f43372g;

    /* renamed from: h */
    private int f43373h = -1;

    /* renamed from: i */
    private String f43374i;

    static {
        Covode.recordClassIndex(20858);
    }

    public final String toString() {
        return mo29061a();
    }

    /* renamed from: d */
    private String m33871d() {
        if ("http".equals(this.f43366a)) {
            return "http";
        }
        return "https";
    }

    /* renamed from: e */
    private int m33872e() {
        int i = this.f43373h;
        if (i != -1) {
            return i;
        }
        return C90200t.m156790a(m33871d());
    }

    private C18202h() {
    }

    /* renamed from: b */
    private String m33868b() {
        if (this.f43367b.isEmpty()) {
            return "";
        }
        return C18194a.m33845a(this.f43367b, " \"':;<=>@[]^`{}|/\\?#", false, true);
    }

    /* renamed from: c */
    private String m33870c() {
        if (this.f43368c.isEmpty()) {
            return "";
        }
        return C18194a.m33845a(this.f43368c, " \"':;<=>@[]^`{}|/\\?#", false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.network.partner.b.h$a */
    public enum EnumC18203a {
        SUCCESS,
        MISSING_SCHEME,
        UNSUPPORTED_SCHEME,
        INVALID_PORT,
        INVALID_HOST;

        static {
            Covode.recordClassIndex(20859);
        }
    }

    /* renamed from: a */
    public final String mo29061a() {
        StringBuilder sb = new StringBuilder();
        sb.append(m33871d());
        sb.append("://");
        if (!this.f43367b.isEmpty() || !this.f43368c.isEmpty()) {
            sb.append(m33868b());
            String c = m33870c();
            if (!c.isEmpty()) {
                sb.append(':');
                sb.append(c);
            }
            sb.append('@');
        }
        if (this.f43369d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f43369d);
            sb.append(']');
        } else {
            sb.append(this.f43369d);
        }
        int e = m33872e();
        if (e != C90200t.m156790a(m33871d())) {
            sb.append(':');
            sb.append(e);
        }
        this.f43370e.mo29051a(sb);
        this.f43371f.mo29054a(sb);
        if (this.f43374i != null) {
            sb.append('#');
            sb.append(C18194a.m33845a(this.f43374i, "", false, false));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C18202h m33867a(String str) {
        Objects.requireNonNull(str, "URL must not be null.");
        C18202h hVar = new C18202h();
        EnumC18203a c = hVar.m33869c(str);
        if (EnumC18203a.SUCCESS.equals(c)) {
            return hVar;
        }
        throw new InvalidParameterException(c.name());
    }

    /* renamed from: b */
    public final C18202h mo29062b(String str) {
        Objects.requireNonNull(str, "host == null");
        String b = C18204b.m33876b(str, 0, str.length());
        if (b != null) {
            this.f43369d = b;
            return this;
        }
        throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    private EnumC18203a m33869c(String str) {
        char c;
        char c2;
        int a;
        char c3;
        char c4;
        char charAt;
        this.f43372g = str;
        int a2 = C90084c.m156401a(str, 0, str.length());
        int b = C90084c.m156423b(str, a2, str.length());
        if (str.regionMatches(true, a2, "https:", 0, 6)) {
            this.f43366a = "https";
            a2 += 6;
        } else if (str.regionMatches(true, a2, "http:", 0, 5)) {
            this.f43366a = "http";
            a2 += 5;
        } else {
            this.f43366a = m33871d();
        }
        int i = a2;
        int i2 = 0;
        while (true) {
            c = '/';
            c2 = '\\';
            if (i >= b || !((charAt = str.charAt(i)) == '\\' || charAt == '/')) {
                int i3 = a2 + i2;
                String str2 = "";
                String str3 = str2;
                boolean z = false;
                boolean z2 = false;
            } else {
                i2++;
                i++;
            }
        }
        int i32 = a2 + i2;
        String str22 = "";
        String str32 = str22;
        boolean z3 = false;
        boolean z22 = false;
        while (true) {
            a = C90084c.m156403a(str, i32, b, "@/\\?#");
            if (a != b) {
                c3 = str.charAt(a);
            } else {
                c3 = 65535;
            }
            if (c3 == 65535 || c3 == '#' || c3 == c || c3 == c2 || c3 == '?') {
                int c5 = C18204b.m33877c(str, i32, a);
                int i4 = c5 + 1;
            } else if (c3 == '@') {
                if (!z3) {
                    int a3 = C90084c.m156402a(str, i32, a, ':');
                    String a4 = C18194a.m33843a(str, i32, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                    if (z22) {
                        a4 = str32 + "%40" + a4;
                    }
                    if (a3 != a) {
                        str22 = C18194a.m33843a(str, a3 + 1, a, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                        z3 = true;
                    }
                    str32 = a4;
                    z22 = true;
                } else {
                    str22 = str22 + "%40" + C18194a.m33843a(str, i32, a, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                }
                i32 = a + 1;
                c = '/';
                c2 = '\\';
            }
        }
        int c52 = C18204b.m33877c(str, i32, a);
        int i42 = c52 + 1;
        if (i42 < a) {
            this.f43369d = C18204b.m33876b(str, i32, c52);
            int a5 = C18204b.m33875a(str, i42, a);
            this.f43373h = a5;
            if (a5 == -1) {
                return EnumC18203a.INVALID_PORT;
            }
        } else {
            this.f43369d = C18204b.m33876b(str, i32, c52);
            this.f43373h = C90200t.m156790a(m33871d());
        }
        if (this.f43369d == null) {
            return EnumC18203a.INVALID_HOST;
        }
        this.f43367b = C18194a.m33846a(str32, false);
        this.f43368c = C18194a.m33846a(str22, false);
        int a6 = C90084c.m156403a(str, a, b, "?#");
        this.f43370e.mo29050a(str, a, a6);
        if (a6 >= b || str.charAt(a6) != '?') {
            c4 = '#';
        } else {
            int a7 = C90084c.m156402a(str, a6, b, '#');
            c4 = '#';
            this.f43371f.mo29057c(C18194a.m33843a(str, a6 + 1, a7, " \"'<>#", true, true, true));
            a6 = a7;
        }
        if (a6 < b && str.charAt(a6) == c4) {
            this.f43374i = C18194a.m33846a(C18194a.m33843a(str, a6 + 1, b, "", true, false, false), false);
        }
        return EnumC18203a.SUCCESS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.network.partner.b.h$b */
    public static class C18204b {
        static {
            Covode.recordClassIndex(20860);
        }

        /* renamed from: b */
        public static String m33876b(String str, int i, int i2) {
            return C90084c.m156406a(C18194a.m33844a(str, i, i2, false));
        }

        /* renamed from: a */
        static int m33875a(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C18194a.m33843a(str, i, i2, "", false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: c */
        public static int m33877c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }
    }
}
