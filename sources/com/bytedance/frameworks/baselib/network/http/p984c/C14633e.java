package com.bytedance.frameworks.baselib.network.http.p984c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.e */
public class C14633e implements Cloneable {

    /* renamed from: m */
    private static final Set<String> f35422m;

    /* renamed from: n */
    private static Pattern f35423n;

    /* renamed from: o */
    private static Pattern f35424o;

    /* renamed from: p */
    private static final ThreadLocal<DateFormat> f35425p = new ThreadLocal<DateFormat>() {
        /* class com.bytedance.frameworks.baselib.network.http.p984c.C14633e.C146341 */

        static {
            Covode.recordClassIndex(16725);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };

    /* renamed from: q */
    private static final String[] f35426q = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: a */
    public String f35427a;

    /* renamed from: b */
    public String f35428b;

    /* renamed from: c */
    public boolean f35429c;

    /* renamed from: d */
    public String f35430d;

    /* renamed from: e */
    public long f35431e = -1;

    /* renamed from: f */
    public final String f35432f;

    /* renamed from: g */
    public String f35433g;

    /* renamed from: h */
    public String f35434h;

    /* renamed from: i */
    public boolean f35435i;

    /* renamed from: j */
    public boolean f35436j;

    /* renamed from: k */
    public String f35437k;

    /* renamed from: l */
    public int f35438l = 1;

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.c.e$a */
    static class C14635a {

        /* renamed from: a */
        boolean f35439a;

        /* renamed from: b */
        boolean f35440b;

        /* renamed from: c */
        boolean f35441c;

        /* renamed from: d */
        private final String f35442d;

        /* renamed from: e */
        private final String f35443e;

        /* renamed from: f */
        private int f35444f;

        static {
            Covode.recordClassIndex(16726);
        }

        /* renamed from: c */
        private void m26752c() {
            while (this.f35444f < this.f35442d.length() && " \t".indexOf(this.f35442d.charAt(this.f35444f)) != -1) {
                this.f35444f++;
            }
        }

        /* renamed from: b */
        private boolean m26751b() {
            m26752c();
            if (this.f35444f >= this.f35442d.length() || this.f35442d.charAt(this.f35444f) != '=') {
                return false;
            }
            this.f35444f++;
            return true;
        }

        /* renamed from: a */
        public final List<C14633e> mo23514a() {
            int i;
            String str;
            String str2;
            ArrayList arrayList = new ArrayList(2);
            if (this.f35443e.startsWith("set-cookie2:")) {
                this.f35444f += 12;
                this.f35441c = true;
                i = 0;
            } else {
                if (this.f35443e.startsWith("set-cookie:")) {
                    this.f35444f += 11;
                }
                i = 1;
            }
            while (true) {
                String a = m26749a(false);
                if (a == null) {
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    throw new IllegalArgumentException("No cookies in " + this.f35442d);
                } else if (m26751b()) {
                    if (i != 0) {
                        str = ";";
                    } else {
                        str = ",;";
                    }
                    C14633e eVar = new C14633e(a, m26748a(str));
                    eVar.f35438l = i ^ 1;
                    arrayList.add(eVar);
                    while (true) {
                        m26752c();
                        if (this.f35444f == this.f35442d.length()) {
                            break;
                        } else if (this.f35442d.charAt(this.f35444f) == ',') {
                            this.f35444f++;
                            break;
                        } else {
                            if (this.f35442d.charAt(this.f35444f) == ';') {
                                this.f35444f++;
                            }
                            String a2 = m26749a(true);
                            if (a2 != null) {
                                if (i != 0 || "expires".equals(a2) || "port".equals(a2)) {
                                    str2 = ";";
                                } else {
                                    str2 = ";,";
                                }
                                String str3 = null;
                                if (m26751b()) {
                                    str3 = m26748a(str2);
                                }
                                if (a2.equals(UGCMonitor.EVENT_COMMENT) && eVar.f35427a == null) {
                                    eVar.f35427a = str3;
                                } else if (a2.equals("commenturl") && eVar.f35428b == null) {
                                    eVar.f35428b = str3;
                                } else if (a2.equals("discard")) {
                                    eVar.f35429c = true;
                                } else if (a2.equals("domain") && eVar.f35430d == null) {
                                    eVar.f35430d = str3;
                                } else if (a2.equals("expires")) {
                                    this.f35439a = true;
                                    if (eVar.f35431e == -1) {
                                        Date b = C14633e.m26741b(str3);
                                        if (b != null) {
                                            eVar.f35431e = (b.getTime() - System.currentTimeMillis()) / 1000;
                                        } else {
                                            eVar.f35431e = 0;
                                        }
                                    }
                                } else if (a2.equals("max-age") && eVar.f35431e == -1) {
                                    try {
                                        long parseLong = Long.parseLong(str3);
                                        this.f35440b = true;
                                        eVar.f35431e = parseLong;
                                    } catch (NumberFormatException unused) {
                                        throw new IllegalArgumentException("Invalid max-age: ".concat(String.valueOf(str3)));
                                    }
                                } else if (a2.equals("path") && eVar.f35433g == null) {
                                    eVar.f35433g = str3;
                                } else if (a2.equals("port") && eVar.f35434h == null) {
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    eVar.f35434h = str3;
                                } else if (a2.equals("secure")) {
                                    eVar.f35435i = true;
                                } else if (a2.equals("httponly")) {
                                    eVar.f35436j = true;
                                } else if (a2.equals("version") && !this.f35441c) {
                                    eVar.f35438l = Integer.parseInt(str3);
                                }
                            }
                        }
                    }
                    if (this.f35439a) {
                        eVar.f35438l = 0;
                    } else if (this.f35440b) {
                        eVar.f35438l = 1;
                    }
                } else {
                    throw new IllegalArgumentException("Expected '=' after " + a + " in " + this.f35442d);
                }
            }
        }

        C14635a(String str) {
            this.f35442d = str;
            this.f35443e = str.toLowerCase(Locale.US);
        }

        /* renamed from: a */
        private String m26748a(String str) {
            m26752c();
            int b = m26750b(str);
            String substring = this.f35442d.substring(this.f35444f, b);
            this.f35444f = b;
            return substring;
        }

        /* renamed from: a */
        private String m26749a(boolean z) {
            String str;
            String str2;
            m26752c();
            int b = m26750b(",;= \t");
            if (z) {
                str = this.f35443e;
            } else {
                str = this.f35442d;
            }
            int i = this.f35444f;
            if (i < b) {
                str2 = str.substring(i, b);
            } else {
                str2 = null;
            }
            this.f35444f = b;
            return str2;
        }

        /* renamed from: b */
        private int m26750b(String str) {
            for (int i = this.f35444f; i < this.f35442d.length(); i++) {
                if (str.indexOf(this.f35442d.charAt(i)) != -1) {
                    return i;
                }
            }
            return this.f35442d.length();
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f35432f.toLowerCase(Locale.US).hashCode();
        String str = this.f35430d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.toLowerCase(Locale.US).hashCode();
        }
        int i2 = hashCode2 + hashCode;
        String str2 = this.f35433g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        if (this.f35438l == 0) {
            return this.f35432f + "=" + this.f35437k;
        }
        StringBuilder append = new StringBuilder().append(this.f35432f).append("=\"").append(this.f35437k).append("\"");
        m26737a(append, "Path", this.f35433g);
        m26737a(append, "Domain", this.f35430d);
        m26737a(append, "Port", this.f35434h);
        return append.toString();
    }

    static {
        Covode.recordClassIndex(16724);
        HashSet hashSet = new HashSet();
        f35422m = hashSet;
        hashSet.add(UGCMonitor.EVENT_COMMENT);
        hashSet.add("commenturl");
        hashSet.add("discard");
        hashSet.add("domain");
        hashSet.add("expires");
        hashSet.add("httponly");
        hashSet.add("max-age");
        hashSet.add("path");
        hashSet.add("port");
        hashSet.add("secure");
        hashSet.add("version");
        f35423n = null;
        f35424o = null;
        try {
            f35423n = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            f35424o = Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo23508a() {
        long j = this.f35431e;
        if (j != -1 && j <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23507a(String str) {
        String lowerCase;
        if (str == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase(Locale.US);
        }
        this.f35430d = lowerCase;
    }

    /* renamed from: c */
    private static String m26743c(String str) {
        if (str == null) {
            return "/";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    /* renamed from: e */
    private static boolean m26745e(String str) {
        try {
            if (!f35423n.matcher(str).matches() && !f35424o.matcher(str).matches()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static Date m26741b(String str) {
        try {
            return f35425p.get().parse(str);
        } catch (ParseException unused) {
            for (String str2 : f35426q) {
                try {
                    return new SimpleDateFormat(str2, Locale.US).parse(str);
                } catch (ParseException unused2) {
                }
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14633e) {
            C14633e eVar = (C14633e) obj;
            if (this.f35432f.equalsIgnoreCase(eVar.f35432f) && ((str = this.f35430d) == null ? eVar.f35430d == null : str.equalsIgnoreCase(eVar.f35430d))) {
                String str2 = this.f35433g;
                String str3 = eVar.f35433g;
                if (str2 != null ? !str2.equals(str3) : str3 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m26744d(String str) {
        boolean z;
        if (str.length() == 0 || str.startsWith("$") || f35422m.contains(str.toLowerCase(Locale.US))) {
            z = false;
        } else {
            z = true;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt < 0 || charAt >= 127 || charAt == ';' || charAt == ',') {
                    return false;
                }
                if (Character.isWhitespace(charAt) && charAt != ' ') {
                    return false;
                }
            }
        }
        return z;
    }

    public C14633e(String str, String str2) {
        String trim = str.trim();
        if (m26744d(trim)) {
            this.f35432f = trim;
            this.f35437k = str2;
            return;
        }
        throw new IllegalArgumentException("Invalid name: ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public static boolean m26738a(C14633e eVar, URI uri) {
        return m26743c(uri.getPath()).startsWith(m26743c(eVar.f35433g));
    }

    /* renamed from: a */
    private static boolean m26739a(String str, int i) {
        int indexOf = str.indexOf(46, i + 1);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m26742b(C14633e eVar, URI uri) {
        String str = eVar.f35434h;
        if (str == null) {
            return true;
        }
        return Arrays.asList(str.split(",")).contains(Integer.toString(C14641h.getEffectivePort(uri.getScheme(), uri.getPort())));
    }

    /* renamed from: a */
    public static boolean m26740a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            String lowerCase = str2.toLowerCase(Locale.US);
            String lowerCase2 = str.toLowerCase(Locale.US);
            if (lowerCase.equals(lowerCase2) && (m26739a(lowerCase, 0) || m26745e(lowerCase))) {
                return true;
            }
            if (!m26739a(lowerCase, 0)) {
                return lowerCase2.equals(".local");
            }
            if (lowerCase2.length() == lowerCase.length() + 1 && lowerCase2.startsWith(".") && lowerCase2.endsWith(lowerCase) && m26739a(lowerCase2, 1)) {
                return true;
            }
            if (lowerCase.length() <= lowerCase2.length() || !lowerCase.endsWith(lowerCase2) || ((!lowerCase2.startsWith(".") || !m26739a(lowerCase2, 1)) && !lowerCase2.equals(".local"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m26737a(StringBuilder sb, String str, String str2) {
        if (str2 != null && sb != null) {
            sb.append(";$");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
    }
}
