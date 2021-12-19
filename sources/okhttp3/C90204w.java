package okhttp3;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: okhttp3.w */
public final class C90204w {

    /* renamed from: c */
    private static final Pattern f204875c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    private static final Pattern f204876d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f204877a;

    /* renamed from: b */
    public final String f204878b;

    /* renamed from: e */
    private final String f204879e;

    /* renamed from: f */
    private final String f204880f;

    public final String toString() {
        return this.f204879e;
    }

    public final int hashCode() {
        return this.f204879e.hashCode();
    }

    static {
        Covode.recordClassIndex(106378);
    }

    /* renamed from: b */
    public static C90204w m156843b(String str) {
        try {
            return m156842a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Charset mo145074a(Charset charset) {
        try {
            String str = this.f204880f;
            if (str != null) {
                return Charset.forName(str);
            }
            return charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90204w) || !((C90204w) obj).f204879e.equals(this.f204879e)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C90204w m156842a(String str) {
        Matcher matcher = f204875c.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f204876d.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 == null) {
                            group2 = matcher2.group(3);
                        } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C90204w(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    private C90204w(String str, String str2, String str3, String str4) {
        this.f204879e = str;
        this.f204877a = str2;
        this.f204878b = str3;
        this.f204880f = str4;
    }
}
