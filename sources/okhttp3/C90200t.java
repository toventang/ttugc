package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.C90084c;
import p4632k.C89420f;

/* renamed from: okhttp3.t */
public final class C90200t {

    /* renamed from: i */
    private static final char[] f204857i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f204858a;

    /* renamed from: b */
    public final String f204859b;

    /* renamed from: c */
    public final String f204860c;

    /* renamed from: d */
    public final String f204861d;

    /* renamed from: e */
    public final int f204862e;

    /* renamed from: f */
    public final List<String> f204863f;

    /* renamed from: g */
    public final List<String> f204864g;

    /* renamed from: h */
    public final String f204865h;

    /* renamed from: j */
    private final String f204866j;

    public final String toString() {
        return this.f204866j;
    }

    /* renamed from: a */
    public final URL mo145046a() {
        try {
            return new URL(this.f204866j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m156798a(C89420f fVar, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = C90084c.m156400a(str.charAt(i + 1));
                    int a2 = C90084c.m156400a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        fVar.mo68847a((a << 4) + a2);
                        i = i3;
                    }
                }
                fVar.mo143814e(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    fVar.mo68847a(32);
                }
                fVar.mo143814e(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    private static boolean m156799a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C90084c.m156400a(str.charAt(i + 1)) == -1 || C90084c.m156400a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f204866j.hashCode();
    }

    /* renamed from: okhttp3.t$a */
    public static final class C90201a {

        /* renamed from: a */
        String f204867a;

        /* renamed from: b */
        String f204868b = "";

        /* renamed from: c */
        String f204869c = "";

        /* renamed from: d */
        String f204870d;

        /* renamed from: e */
        int f204871e = -1;

        /* renamed from: f */
        final List<String> f204872f;

        /* renamed from: g */
        public List<String> f204873g;

        /* renamed from: h */
        String f204874h;

        static {
            Covode.recordClassIndex(106374);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo145062a() {
            int i = this.f204871e;
            if (i != -1) {
                return i;
            }
            return C90200t.m156790a(this.f204867a);
        }

        public C90201a() {
            ArrayList arrayList = new ArrayList();
            this.f204872f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        public final C90200t mo145068b() {
            if (this.f204867a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f204870d != null) {
                return new C90200t(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f204867a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f204868b.isEmpty() || !this.f204869c.isEmpty()) {
                sb.append(this.f204868b);
                if (!this.f204869c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f204869c);
                }
                sb.append('@');
            }
            String str2 = this.f204870d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f204870d);
                    sb.append(']');
                } else {
                    sb.append(this.f204870d);
                }
            }
            if (!(this.f204871e == -1 && this.f204867a == null)) {
                int a = mo145062a();
                String str3 = this.f204867a;
                if (str3 == null || a != C90200t.m156790a(str3)) {
                    sb.append(':');
                    sb.append(a);
                }
            }
            C90200t.m156797a(sb, this.f204872f);
            if (this.f204873g != null) {
                sb.append('?');
                C90200t.m156801b(sb, this.f204873g);
            }
            if (this.f204874h != null) {
                sb.append('#');
                sb.append(this.f204874h);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public final C90201a mo145066b(String str) {
            this.f204869c = C90200t.m156794a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: a */
        public final C90201a mo145063a(String str) {
            this.f204868b = C90200t.m156794a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: e */
        public final C90201a mo145072e(String str) {
            Objects.requireNonNull(str, "name == null");
            if (this.f204873g == null) {
                return this;
            }
            m156824f(C90200t.m156794a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        /* renamed from: f */
        private void m156824f(String str) {
            for (int size = this.f204873g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f204873g.get(size))) {
                    this.f204873g.remove(size + 1);
                    this.f204873g.remove(size);
                    if (this.f204873g.isEmpty()) {
                        this.f204873g = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public final C90201a mo145069c(String str) {
            Objects.requireNonNull(str, "host == null");
            String e = m156822e(str, 0, str.length());
            if (e != null) {
                this.f204870d = e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }

        /* renamed from: d */
        public final C90201a mo145071d(String str) {
            List<String> list;
            if (str != null) {
                list = C90200t.m156800b(C90200t.m156794a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f204873g = list;
            return this;
        }

        /* renamed from: c */
        public final C90201a mo145070c(String str, String str2) {
            mo145072e(str);
            mo145064a(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C90201a mo145064a(String str, String str2) {
            String str3;
            Objects.requireNonNull(str, "name == null");
            if (this.f204873g == null) {
                this.f204873g = new ArrayList();
            }
            this.f204873g.add(C90200t.m156794a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            List<String> list = this.f204873g;
            if (str2 != null) {
                str3 = C90200t.m156794a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            } else {
                str3 = null;
            }
            list.add(str3);
            return this;
        }

        /* renamed from: b */
        public final C90201a mo145067b(String str, String str2) {
            String str3;
            Objects.requireNonNull(str, "encodedName == null");
            if (this.f204873g == null) {
                this.f204873g = new ArrayList();
            }
            this.f204873g.add(C90200t.m156794a(str, " \"'<>#&=", true, false, true, true));
            List<String> list = this.f204873g;
            if (str2 != null) {
                str3 = C90200t.m156794a(str2, " \"'<>#&=", true, false, true, true);
            } else {
                str3 = null;
            }
            list.add(str3);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C90201a mo145065a(C90200t tVar, String str) {
            int a;
            char charAt;
            int a2 = C90084c.m156401a(str, 0, str.length());
            int b = C90084c.m156423b(str, a2, str.length());
            int b2 = m156819b(str, a2, b);
            if (b2 != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.f204867a = "https";
                    a2 += 6;
                } else if (str.regionMatches(true, a2, "http:", 0, 5)) {
                    this.f204867a = "http";
                    a2 += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, b2) + "'");
                }
            } else if (tVar != null) {
                this.f204867a = tVar.f204858a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int c = m156820c(str, a2, b);
            char c2 = '?';
            char c3 = '#';
            if (c >= 2 || tVar == null || !tVar.f204858a.equals(this.f204867a)) {
                int i = a2 + c;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C90084c.m156403a(str, i, b, "@/\\?#");
                    if (a == b || (charAt = str.charAt(a)) == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int d = m156821d(str, i, a);
                        int i2 = d + 1;
                    } else if (charAt == '@') {
                        if (!z) {
                            int a3 = C90084c.m156402a(str, i, a, ':');
                            String a4 = C90200t.m156791a(str, i, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                a4 = this.f204868b + "%40" + a4;
                            }
                            this.f204868b = a4;
                            if (a3 != a) {
                                this.f204869c = C90200t.m156791a(str, a3 + 1, a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            this.f204869c += "%40" + C90200t.m156791a(str, i, a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i = a + 1;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int d2 = m156821d(str, i, a);
                int i22 = d2 + 1;
                if (i22 < a) {
                    this.f204870d = m156822e(str, i, d2);
                    int f = m156823f(str, i22, a);
                    this.f204871e = f;
                    if (f == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i22, a) + '\"');
                    }
                } else {
                    this.f204870d = m156822e(str, i, d2);
                    this.f204871e = C90200t.m156790a(this.f204867a);
                }
                if (this.f204870d != null) {
                    a2 = a;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i, d2) + '\"');
                }
            } else {
                this.f204868b = tVar.mo145050d();
                this.f204869c = tVar.mo145052e();
                this.f204870d = tVar.f204861d;
                this.f204871e = tVar.f204862e;
                this.f204872f.clear();
                this.f204872f.addAll(tVar.mo145056g());
                if (a2 == b || str.charAt(a2) == '#') {
                    mo145071d(tVar.mo145057h());
                }
            }
            int a5 = C90084c.m156403a(str, a2, b, "?#");
            m156818a(str, a2, a5);
            if (a5 < b && str.charAt(a5) == '?') {
                int a6 = C90084c.m156402a(str, a5, b, '#');
                this.f204873g = C90200t.m156800b(C90200t.m156791a(str, a5 + 1, a6, " \"'<>#", true, false, true, true, null));
                a5 = a6;
            }
            if (a5 < b && str.charAt(a5) == '#') {
                this.f204874h = C90200t.m156791a(str, 1 + a5, b, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: e */
        private static String m156822e(String str, int i, int i2) {
            return C90084c.m156406a(C90200t.m156792a(str, i, i2, false));
        }

        /* renamed from: c */
        private static int m156820c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: d */
        private static int m156821d(String str, int i, int i2) {
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

        /* renamed from: f */
        private static int m156823f(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C90200t.m156791a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: b */
        private static int m156819b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9 A[SYNTHETIC] */
        /* renamed from: a */
        private void m156818a(java.lang.String r18, int r19, int r20) {
            /*
            // Method dump skipped, instructions count: 218
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C90200t.C90201a.m156818a(java.lang.String, int, int):void");
        }
    }

    /* renamed from: c */
    public final boolean mo145049c() {
        return this.f204858a.equals("https");
    }

    /* renamed from: k */
    private String m156804k() {
        if (this.f204865h == null) {
            return null;
        }
        return this.f204866j.substring(this.f204866j.indexOf(35) + 1);
    }

    /* renamed from: i */
    public final String mo145059i() {
        return mo145053e("/...").mo145063a("").mo145066b("").mo145068b().toString();
    }

    static {
        Covode.recordClassIndex(106373);
    }

    /* renamed from: d */
    public final String mo145050d() {
        if (this.f204859b.isEmpty()) {
            return "";
        }
        int length = this.f204858a.length() + 3;
        String str = this.f204866j;
        return this.f204866j.substring(length, C90084c.m156403a(str, length, str.length(), ":@"));
    }

    /* renamed from: e */
    public final String mo145052e() {
        if (this.f204860c.isEmpty()) {
            return "";
        }
        return this.f204866j.substring(this.f204866j.indexOf(58, this.f204858a.length() + 3) + 1, this.f204866j.indexOf(64));
    }

    /* renamed from: f */
    public final String mo145055f() {
        int indexOf = this.f204866j.indexOf(47, this.f204858a.length() + 3);
        String str = this.f204866j;
        return this.f204866j.substring(indexOf, C90084c.m156403a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: g */
    public final List<String> mo145056g() {
        int indexOf = this.f204866j.indexOf(47, this.f204858a.length() + 3);
        String str = this.f204866j;
        int a = C90084c.m156403a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            indexOf = C90084c.m156402a(this.f204866j, i, a, '/');
            arrayList.add(this.f204866j.substring(i, indexOf));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final String mo145057h() {
        if (this.f204864g == null) {
            return null;
        }
        int indexOf = this.f204866j.indexOf(63) + 1;
        String str = this.f204866j;
        return this.f204866j.substring(indexOf, C90084c.m156402a(str, indexOf, str.length(), '#'));
    }

    /* renamed from: j */
    public final C90201a mo145060j() {
        int i;
        C90201a aVar = new C90201a();
        aVar.f204867a = this.f204858a;
        aVar.f204868b = mo145050d();
        aVar.f204869c = mo145052e();
        aVar.f204870d = this.f204861d;
        if (this.f204862e != m156790a(this.f204858a)) {
            i = this.f204862e;
        } else {
            i = -1;
        }
        aVar.f204871e = i;
        aVar.f204872f.clear();
        aVar.f204872f.addAll(mo145056g());
        aVar.mo145071d(mo145057h());
        aVar.f204874h = m156804k();
        return aVar;
    }

    /* renamed from: b */
    public final URI mo145047b() {
        C90201a j = mo145060j();
        int size = j.f204872f.size();
        for (int i = 0; i < size; i++) {
            j.f204872f.set(i, m156794a(j.f204872f.get(i), "[]", true, true, false, true));
        }
        if (j.f204873g != null) {
            int size2 = j.f204873g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = j.f204873g.get(i2);
                if (str != null) {
                    j.f204873g.set(i2, m156794a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (j.f204874h != null) {
            j.f204874h = m156794a(j.f204874h, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar = j.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: f */
    public static C90200t m156802f(String str) {
        try {
            return m156803g(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static C90200t m156803g(String str) {
        return new C90201a().mo145065a((C90200t) null, str).mo145068b();
    }

    /* renamed from: d */
    public final C90200t mo145051d(String str) {
        C90201a e = mo145053e(str);
        if (e != null) {
            return e.mo145068b();
        }
        return null;
    }

    /* renamed from: e */
    public final C90201a mo145053e(String str) {
        try {
            return new C90201a().mo145065a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m156790a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90200t) || !((C90200t) obj).f204866j.equals(this.f204866j)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo145048c(String str) {
        List<String> list = this.f204864g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f204864g.get(i))) {
                return this.f204864g.get(i + 1);
            }
        }
        return null;
    }

    C90200t(C90201a aVar) {
        List<String> list;
        this.f204858a = aVar.f204867a;
        this.f204859b = m156795a(aVar.f204868b, false);
        this.f204860c = m156795a(aVar.f204869c, false);
        this.f204861d = aVar.f204870d;
        this.f204862e = aVar.mo145062a();
        this.f204863f = m156796a(aVar.f204872f, false);
        String str = null;
        if (aVar.f204873g != null) {
            list = m156796a(aVar.f204873g, true);
        } else {
            list = null;
        }
        this.f204864g = list;
        this.f204865h = aVar.f204874h != null ? m156795a(aVar.f204874h, false) : str;
        this.f204866j = aVar.toString();
    }

    /* renamed from: b */
    static List<String> m156800b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m156795a(String str, boolean z) {
        return m156792a(str, 0, str.length(), z);
    }

    /* renamed from: b */
    public static void m156801b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: a */
    private static List<String> m156796a(List<String> list, boolean z) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str2 = list.get(i);
            if (str2 != null) {
                str = m156795a(str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static void m156797a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: a */
    static String m156792a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C89420f fVar = new C89420f();
                fVar.mo143801a(str, i, i3);
                m156798a(fVar, str, i3, i2, z);
                return fVar.mo143848r();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m156793a(String str, String str2, boolean z, Charset charset) {
        return m156791a(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    /* renamed from: a */
    static String m156794a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m156791a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        if (r19 == false) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3 A[LOOP:2: B:54:0x009d->B:56:0x00a3, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m156791a(java.lang.String r12, int r13, int r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19, java.nio.charset.Charset r20) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C90200t.m156791a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
    }
}
