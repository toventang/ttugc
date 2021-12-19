package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: h.m.ab */
public class C89334ab extends C89333aa {
    static {
        Covode.recordClassIndex(105418);
    }

    /* renamed from: i */
    public static final char m154825i(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: j */
    public static final Character m154826j(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    /* renamed from: k */
    public static final CharSequence m154827k(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        return C89361p.m154822b(charSequence, C89271h.m154769b(charSequence.length() - 1, 0));
    }

    /* renamed from: k */
    public static final String m154828k(String str) {
        C89219l.m154721d(str, "");
        int length = str.length();
        String substring = str.substring(length - C89271h.m154772c(2, length));
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final String m154821a(String str, int i) {
        C89219l.m154721d(str, "");
        if (i >= 0) {
            String substring = str.substring(C89271h.m154772c(i, str.length()));
            C89219l.m154716b(substring, "");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: b */
    public static final CharSequence m154822b(CharSequence charSequence, int i) {
        C89219l.m154721d(charSequence, "");
        if (i >= 0) {
            return charSequence.subSequence(0, C89271h.m154772c(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: c */
    public static final String m154824c(String str, int i) {
        C89219l.m154721d(str, "");
        if (i >= 0) {
            String substring = str.substring(0, C89271h.m154772c(i, str.length()));
            C89219l.m154716b(substring, "");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: b */
    public static final String m154823b(String str, int i) {
        C89219l.m154721d(str, "");
        if (i >= 0) {
            return C89361p.m154824c(str, C89271h.m154769b(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
