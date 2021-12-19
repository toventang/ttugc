package androidx.core.content.p032a;

import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: androidx.core.content.a.g */
public final class C0641g {
    static {
        Covode.recordClassIndex(720);
    }

    /* renamed from: b */
    public static final int m2356b(TypedArray typedArray) {
        C89219l.m154719c(typedArray, "");
        m2354a(typedArray, 2);
        return typedArray.getInt(2, 0);
    }

    /* renamed from: a */
    public static final boolean m2355a(TypedArray typedArray) {
        C89219l.m154719c(typedArray, "");
        m2354a(typedArray, 0);
        return typedArray.getBoolean(0, false);
    }

    /* renamed from: a */
    public static final void m2354a(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    /* renamed from: b */
    public static final int m2357b(TypedArray typedArray, int i) {
        C89219l.m154719c(typedArray, "");
        m2354a(typedArray, i);
        return typedArray.getColor(i, 0);
    }
}
