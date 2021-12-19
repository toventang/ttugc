package com.google.p1971b.p1972a.p1983d;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.b.a.d.e */
public final class C27145e {

    /* renamed from: c */
    private static final Pattern f64280c = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: d */
    private static final Pattern f64281d = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: e */
    private static final Pattern f64282e = Pattern.compile(new StringBuilder((("[^\\s/=;\"]+".length() + 14) + "[^\\s/=;\"]+".length()) + ";.*".length()).append("\\s*(").append("[^\\s/=;\"]+").append(")/(").append("[^\\s/=;\"]+").append(")\\s*(").append(";.*").append(")?").toString(), 32);

    /* renamed from: f */
    private static final Pattern f64283f;

    /* renamed from: a */
    public String f64284a = "application";

    /* renamed from: b */
    public String f64285b = "octet-stream";

    /* renamed from: g */
    private final SortedMap<String, String> f64286g = new TreeMap();

    /* renamed from: h */
    private String f64287h;

    public final String toString() {
        return mo45190a();
    }

    public final int hashCode() {
        return mo45190a().hashCode();
    }

    static {
        Covode.recordClassIndex(32725);
        String valueOf = String.valueOf(String.valueOf(new StringBuilder("\"([^\"]*)\"".length() + 1 + "[^\\s;\"]*".length()).append("\"([^\"]*)\"").append("|").append("[^\\s;\"]*").toString()));
        f64283f = Pattern.compile(new StringBuilder("[^\\s/=;\"]+".length() + 12 + valueOf.length()).append("\\s*;\\s*(").append("[^\\s/=;\"]+").append(")=(").append(valueOf).append(")").toString());
    }

    /* renamed from: a */
    public final String mo45190a() {
        String str = this.f64287h;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f64284a);
        sb.append('/');
        sb.append(this.f64285b);
        SortedMap<String, String> sortedMap = this.f64286g;
        if (sortedMap != null) {
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                String value = entry.getValue();
                sb.append("; ");
                sb.append(entry.getKey());
                sb.append("=");
                if (!f64281d.matcher(value).matches()) {
                    String valueOf = String.valueOf(String.valueOf(value.replace("\\", "\\\\").replace("\"", "\\\"")));
                    value = new StringBuilder(valueOf.length() + 2).append("\"").append(valueOf).append("\"").toString();
                }
                sb.append(value);
            }
        }
        String sb2 = sb.toString();
        this.f64287h = sb2;
        return sb2;
    }

    /* renamed from: b */
    private C27145e m53935b(String str) {
        this.f64287h = null;
        this.f64286g.remove(str.toLowerCase());
        return this;
    }

    public C27145e(String str) {
        m53934a(str);
    }

    public final boolean equals(Object obj) {
        C27145e eVar;
        if ((obj instanceof C27145e) && (eVar = (C27145e) obj) != null && this.f64284a.equalsIgnoreCase(eVar.f64284a) && this.f64285b.equalsIgnoreCase(eVar.f64285b) && this.f64286g.equals(eVar.f64286g)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C27145e m53934a(String str) {
        Matcher matcher = f64282e.matcher(str);
        C27159b.m53984a(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = f64280c;
        C27159b.m53984a(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.f64284a = group;
        this.f64287h = null;
        String group2 = matcher.group(2);
        C27159b.m53984a(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.f64285b = group2;
        this.f64287h = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = f64283f.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                mo45189a(group4, group5);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C27145e mo45189a(String str, String str2) {
        if (str2 == null) {
            m53935b(str);
            return this;
        }
        C27159b.m53984a(f64281d.matcher(str).matches(), "Name contains reserved characters");
        this.f64287h = null;
        this.f64286g.put(str.toLowerCase(), str2);
        return this;
    }
}
