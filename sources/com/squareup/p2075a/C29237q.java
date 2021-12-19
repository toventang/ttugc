package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4632k.C89420f;

/* renamed from: com.squareup.a.q */
public final class C29237q {

    /* renamed from: i */
    private static final char[] f69282i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f69283a;

    /* renamed from: b */
    public final String f69284b;

    /* renamed from: c */
    public final String f69285c;

    /* renamed from: d */
    public final String f69286d;

    /* renamed from: e */
    public final int f69287e;

    /* renamed from: f */
    public final List<String> f69288f;

    /* renamed from: g */
    final List<String> f69289g;

    /* renamed from: h */
    public final String f69290h;

    /* renamed from: j */
    private final String f69291j;

    /* renamed from: a */
    static int m58510a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public final String toString() {
        return this.f69291j;
    }

    /* renamed from: a */
    public final URL mo50988a() {
        try {
            return new URL(this.f69291j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static void m58518a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: a */
    private static void m58519a(C89420f fVar, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = m58510a(str.charAt(i + 1));
                    int a2 = m58510a(str.charAt(i3));
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

    public final int hashCode() {
        return this.f69291j.hashCode();
    }

    /* renamed from: com.squareup.a.q$a */
    public static final class C29238a {

        /* renamed from: a */
        String f69292a;

        /* renamed from: b */
        String f69293b = "";

        /* renamed from: c */
        String f69294c = "";

        /* renamed from: d */
        String f69295d;

        /* renamed from: e */
        int f69296e = -1;

        /* renamed from: f */
        final List<String> f69297f;

        /* renamed from: g */
        List<String> f69298g;

        /* renamed from: h */
        String f69299h;

        static {
            Covode.recordClassIndex(35587);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo50999a() {
            int i = this.f69296e;
            if (i != -1) {
                return i;
            }
            return C29237q.m58511a(this.f69292a);
        }

        public C29238a() {
            ArrayList arrayList = new ArrayList();
            this.f69297f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        public final C29237q mo51002b() {
            if (this.f69292a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f69295d != null) {
                return new C29237q(this, (byte) 0);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.squareup.a.q$a$a */
        public enum EnumC29239a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST;

            static {
                Covode.recordClassIndex(35588);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f69292a);
            sb.append("://");
            if (!this.f69293b.isEmpty() || !this.f69294c.isEmpty()) {
                sb.append(this.f69293b);
                if (!this.f69294c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f69294c);
                }
                sb.append('@');
            }
            if (this.f69295d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f69295d);
                sb.append(']');
            } else {
                sb.append(this.f69295d);
            }
            int a = mo50999a();
            if (a != C29237q.m58511a(this.f69292a)) {
                sb.append(':');
                sb.append(a);
            }
            C29237q.m58518a(sb, this.f69297f);
            if (this.f69298g != null) {
                sb.append('?');
                C29237q.m58521b(sb, this.f69298g);
            }
            if (this.f69299h != null) {
                sb.append('#');
                sb.append(this.f69299h);
            }
            return sb.toString();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
            r3 = true;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String m58534b(java.lang.String r6) {
            /*
                r5 = 0
                java.lang.String r1 = java.net.IDN.toASCII(r6)     // Catch:{ IllegalArgumentException -> 0x0039 }
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0039 }
                java.lang.String r4 = r1.toLowerCase(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
                boolean r0 = r4.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0039 }
                if (r0 == 0) goto L_0x0012
                return r5
            L_0x0012:
                r3 = 0
                r2 = 0
            L_0x0014:
                int r1 = r4.length()     // Catch:{ IllegalArgumentException -> 0x0039 }
                r0 = 1
                if (r2 >= r1) goto L_0x0028
                char r1 = r4.charAt(r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
                r0 = 31
                if (r1 <= r0) goto L_0x0027
                r0 = 127(0x7f, float:1.78E-43)
                if (r1 < r0) goto L_0x002b
            L_0x0027:
                r3 = 1
            L_0x0028:
                if (r3 == 0) goto L_0x0038
                return r5
            L_0x002b:
                java.lang.String r0 = " #%/:?@[\\]"
                int r1 = r0.indexOf(r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
                r0 = -1
                if (r1 == r0) goto L_0x0035
                goto L_0x0027
            L_0x0035:
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0038:
                return r4
            L_0x0039:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29237q.C29238a.m58534b(java.lang.String):java.lang.String");
        }

        /* renamed from: a */
        private static String m58533a(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            C89420f fVar = new C89420f();
            while (i < bArr.length) {
                if (i == i2) {
                    fVar.mo68847a(58);
                    i += i4;
                    if (i == 16) {
                        fVar.mo68847a(58);
                    }
                } else {
                    if (i > 0) {
                        fVar.mo68847a(58);
                    }
                    fVar.mo68858c((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return fVar.mo143848r();
        }

        /* renamed from: a */
        public final C29238a mo51001a(String str) {
            List<String> list;
            if (str != null) {
                list = C29237q.m58520b(C29237q.m58515a(str, " \"'<>#", true, true));
            } else {
                list = null;
            }
            this.f69298g = list;
            return this;
        }

        /* renamed from: a */
        private static int m58531a(String str, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                char charAt = str.charAt(i2);
                if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                    return i2;
                }
            }
            return i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ae, code lost:
            if ((r10 - r1) != 0) goto L_0x00b1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.net.InetAddress m58535b(java.lang.String r14, int r15) {
            /*
            // Method dump skipped, instructions count: 231
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29237q.C29238a.m58535b(java.lang.String, int):java.net.InetAddress");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final EnumC29239a mo51000a(C29237q qVar, String str) {
            int a;
            char charAt;
            int a2 = m58531a(str, str.length());
            int c = m58537c(str, a2, str.length());
            if (m58538d(str, a2, c) != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.f69292a = "https";
                    a2 += 6;
                } else if (!str.regionMatches(true, a2, "http:", 0, 5)) {
                    return EnumC29239a.UNSUPPORTED_SCHEME;
                } else {
                    this.f69292a = "http";
                    a2 += 5;
                }
            } else if (qVar == null) {
                return EnumC29239a.MISSING_SCHEME;
            } else {
                this.f69292a = qVar.f69283a;
            }
            int e = m58539e(str, a2, c);
            char c2 = '?';
            char c3 = '#';
            if (e >= 2 || qVar == null || !qVar.f69283a.equals(this.f69292a)) {
                int i = a2 + e;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C29237q.m58512a(str, i, c, "@/\\?#");
                    if (a == c || (charAt = str.charAt(a)) == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int f = m58540f(str, i, a);
                        int i2 = f + 1;
                    } else if (charAt == '@') {
                        if (!z) {
                            int a3 = C29237q.m58512a(str, i, a, ":");
                            String a4 = C29237q.m58513a(str, i, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            if (z2) {
                                a4 = this.f69293b + "%40" + a4;
                            }
                            this.f69293b = a4;
                            if (a3 != a) {
                                this.f69294c = C29237q.m58513a(str, a3 + 1, a, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            this.f69294c += "%40" + C29237q.m58513a(str, i, a, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                        }
                        i = a + 1;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int f2 = m58540f(str, i, a);
                int i22 = f2 + 1;
                if (i22 < a) {
                    this.f69295d = m58532a(str, i, f2);
                    int g = m58541g(str, i22, a);
                    this.f69296e = g;
                    if (g == -1) {
                        return EnumC29239a.INVALID_PORT;
                    }
                } else {
                    this.f69295d = m58532a(str, i, f2);
                    this.f69296e = C29237q.m58511a(this.f69292a);
                }
                if (this.f69295d == null) {
                    return EnumC29239a.INVALID_HOST;
                }
                a2 = a;
            } else {
                this.f69293b = qVar.mo50991d();
                this.f69294c = qVar.mo50992e();
                this.f69295d = qVar.f69286d;
                this.f69296e = qVar.f69287e;
                this.f69297f.clear();
                this.f69297f.addAll(qVar.mo50995g());
                if (a2 == c || str.charAt(a2) == '#') {
                    mo51001a(qVar.mo50996h());
                }
            }
            int a5 = C29237q.m58512a(str, a2, c, "?#");
            m58536b(str, a2, a5);
            if (a5 < c && str.charAt(a5) == '?') {
                int a6 = C29237q.m58512a(str, a5, c, "#");
                this.f69298g = C29237q.m58520b(C29237q.m58513a(str, a5 + 1, a6, " \"'<>#", true, true, true));
                a5 = a6;
            }
            if (a5 < c && str.charAt(a5) == '#') {
                this.f69299h = C29237q.m58513a(str, 1 + a5, c, "", true, false, false);
            }
            return EnumC29239a.SUCCESS;
        }

        /* renamed from: e */
        private static int m58539e(String str, int i, int i2) {
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

        /* renamed from: f */
        private static int m58540f(String str, int i, int i2) {
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

        /* renamed from: g */
        private static int m58541g(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C29237q.m58513a(str, i, i2, "", false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: a */
        static String m58532a(String str, int i, int i2) {
            String a = C29237q.m58514a(str, i, i2, false);
            if (!a.startsWith("[") || !a.endsWith("]")) {
                return m58534b(a);
            }
            InetAddress b = m58535b(a, a.length() - 1);
            if (b == null) {
                return null;
            }
            byte[] address = b.getAddress();
            if (address.length == 16) {
                return m58533a(address);
            }
            throw new AssertionError();
        }

        /* renamed from: c */
        private static int m58537c(String str, int i, int i2) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                char charAt = str.charAt(i3);
                if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                    return i3 + 1;
                }
            }
            return i;
        }

        /* renamed from: d */
        private static int m58538d(String str, int i, int i2) {
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
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3 A[SYNTHETIC] */
        /* renamed from: b */
        private void m58536b(java.lang.String r15, int r16, int r17) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29237q.C29238a.m58536b(java.lang.String, int, int):void");
        }
    }

    /* renamed from: c */
    public final boolean mo50990c() {
        return this.f69283a.equals("https");
    }

    static {
        Covode.recordClassIndex(35586);
    }

    /* renamed from: d */
    public final String mo50991d() {
        if (this.f69284b.isEmpty()) {
            return "";
        }
        int length = this.f69283a.length() + 3;
        String str = this.f69291j;
        return this.f69291j.substring(length, m58512a(str, length, str.length(), ":@"));
    }

    /* renamed from: e */
    public final String mo50992e() {
        if (this.f69285c.isEmpty()) {
            return "";
        }
        return this.f69291j.substring(this.f69291j.indexOf(58, this.f69283a.length() + 3) + 1, this.f69291j.indexOf(64));
    }

    /* renamed from: f */
    public final String mo50994f() {
        int indexOf = this.f69291j.indexOf(47, this.f69283a.length() + 3);
        String str = this.f69291j;
        return this.f69291j.substring(indexOf, m58512a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: g */
    public final List<String> mo50995g() {
        int indexOf = this.f69291j.indexOf(47, this.f69283a.length() + 3);
        String str = this.f69291j;
        int a = m58512a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            indexOf = m58512a(this.f69291j, i, a, "/");
            arrayList.add(this.f69291j.substring(i, indexOf));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final String mo50996h() {
        if (this.f69289g == null) {
            return null;
        }
        int indexOf = this.f69291j.indexOf(63) + 1;
        String str = this.f69291j;
        return this.f69291j.substring(indexOf, m58512a(str, indexOf + 1, str.length(), "#"));
    }

    /* renamed from: b */
    public final URI mo50989b() {
        int i;
        String str;
        try {
            C29238a aVar = new C29238a();
            aVar.f69292a = this.f69283a;
            aVar.f69293b = mo50991d();
            aVar.f69294c = mo50992e();
            aVar.f69295d = this.f69286d;
            if (this.f69287e != m58511a(this.f69283a)) {
                i = this.f69287e;
            } else {
                i = -1;
            }
            aVar.f69296e = i;
            aVar.f69297f.clear();
            aVar.f69297f.addAll(mo50995g());
            aVar.mo51001a(mo50996h());
            if (this.f69290h == null) {
                str = null;
            } else {
                str = this.f69291j.substring(this.f69291j.indexOf(35) + 1);
            }
            aVar.f69299h = str;
            int size = aVar.f69297f.size();
            for (int i2 = 0; i2 < size; i2++) {
                aVar.f69297f.set(i2, m58515a(aVar.f69297f.get(i2), "[]", false, true));
            }
            if (aVar.f69298g != null) {
                int size2 = aVar.f69298g.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = aVar.f69298g.get(i3);
                    if (str2 != null) {
                        aVar.f69298g.set(i3, m58515a(str2, "\\^`{|}", true, true));
                    }
                }
            }
            if (aVar.f69299h != null) {
                aVar.f69299h = m58515a(aVar.f69299h, " \"#<>\\^`{|}", false, false);
            }
            return new URI(aVar.toString());
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.f69291j);
        }
    }

    /* renamed from: a */
    public static int m58511a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* renamed from: c */
    public static C29237q m58522c(String str) {
        C29238a aVar = new C29238a();
        if (aVar.mo51000a((C29237q) null, str) == C29238a.EnumC29239a.SUCCESS) {
            return aVar.mo51002b();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29237q) || !((C29237q) obj).f69291j.equals(this.f69291j)) {
            return false;
        }
        return true;
    }

    private C29237q(C29238a aVar) {
        List<String> list;
        this.f69283a = aVar.f69292a;
        this.f69284b = m58516a(aVar.f69293b, false);
        this.f69285c = m58516a(aVar.f69294c, false);
        this.f69286d = aVar.f69295d;
        this.f69287e = aVar.mo50999a();
        this.f69288f = m58517a(aVar.f69297f, false);
        String str = null;
        if (aVar.f69298g != null) {
            list = m58517a(aVar.f69298g, true);
        } else {
            list = null;
        }
        this.f69289g = list;
        this.f69290h = aVar.f69299h != null ? m58516a(aVar.f69299h, false) : str;
        this.f69291j = aVar.toString();
    }

    /* renamed from: b */
    static List<String> m58520b(String str) {
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

    /* synthetic */ C29237q(C29238a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: b */
    static void m58521b(StringBuilder sb, List<String> list) {
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
    private static String m58516a(String str, boolean z) {
        return m58514a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private static List<String> m58517a(List<String> list, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str2 : list) {
            if (str2 != null) {
                str = m58516a(str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m58515a(String str, String str2, boolean z, boolean z2) {
        return m58513a(str, 0, str.length(), str2, true, z, z2);
    }

    /* renamed from: a */
    public static int m58512a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    static String m58514a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C89420f fVar = new C89420f();
                fVar.mo143801a(str, i, i3);
                m58519a(fVar, str, i3, i2, z);
                return fVar.mo143848r();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        if (r21 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b A[LOOP:2: B:45:0x0085->B:47:0x008b, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m58513a(java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29237q.m58513a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean):java.lang.String");
    }
}
