package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.m.w */
public class C89370w extends C89369v {
    static {
        Covode.recordClassIndex(105454);
    }

    /* renamed from: c */
    public static final Float m154861c(String str) {
        C89219l.m154721d(str, "");
        try {
            if (C89360o.f203035a.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static final Double m154862d(String str) {
        C89219l.m154721d(str, "");
        try {
            if (C89360o.f203035a.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
