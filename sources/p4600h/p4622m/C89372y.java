package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: h.m.y */
public class C89372y extends C89371x {
    static {
        Covode.recordClassIndex(105456);
    }

    /* renamed from: i */
    public static final String m154879i(String str) {
        C89219l.m154721d(str, "");
        String replace = str.replace('_', '.');
        C89219l.m154716b(replace, "");
        return replace;
    }

    /* renamed from: a */
    public static final boolean m154870a(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        if (charSequence.length() != 0) {
            Iterator it = C89361p.m154927e(charSequence).iterator();
            while (it.hasNext()) {
                if (!C89332a.m154830a(charSequence.charAt(((AbstractC89040af) it).mo143429a()))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static final int m154878e(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return str.compareToIgnoreCase(str2);
    }

    /* renamed from: a */
    public static final String m154867a(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        int i2 = 1;
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (i > 0) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: b */
    public static final boolean m154874b(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return C89361p.m154871a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: c */
    public static final boolean m154876c(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return C89361p.m154871a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: a */
    public static final boolean m154872a(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: b */
    public static final String m154873b(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = C89361p.m154888a(str, str2, 0, z, 2);
        if (a < 0) {
            return str;
        }
        return C89361p.m154893a(str, a, str2.length() + a, str3).toString();
    }

    /* renamed from: a */
    public static final String m154869a(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int i = 0;
        int a = C89361p.m154887a(str, str2, 0, z);
        if (a < 0) {
            return str;
        }
        int length = str2.length();
        int b = C89271h.m154769b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, a).append(str3);
                i = a + length;
                if (a >= str.length()) {
                    break;
                }
                a = C89361p.m154887a(str, str2, a + b, z);
            } while (a > 0);
            String sb2 = sb.append((CharSequence) str, i, str.length()).toString();
            C89219l.m154716b(sb2, "");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: a */
    public static final boolean m154871a(String str, int i, String str2, int i2, int i3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
