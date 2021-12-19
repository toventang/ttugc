package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.l */
public class C89067l extends C89066k {
    static {
        Covode.recordClassIndex(105151);
    }

    /* renamed from: a */
    public static final <T> List<T> m154463a(T[] tArr) {
        C89219l.m154721d(tArr, "");
        List<T> asList = Arrays.asList(tArr);
        C89219l.m154716b(asList, "");
        return asList;
    }

    /* renamed from: b */
    public static final <T> void m154472b(T[] tArr) {
        C89219l.m154721d(tArr, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: a */
    public static final <T> void m154467a(T[] tArr, Comparator<? super T> comparator) {
        C89219l.m154721d(tArr, "");
        C89219l.m154721d(comparator, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: a */
    public static final <T> T[] m154469a(T[] tArr, int i) {
        C89219l.m154721d(tArr, "");
        C89064i.m154462a(i, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, 1, i);
        C89219l.m154716b(tArr2, "");
        return tArr2;
    }

    /* renamed from: a */
    public static final void m154465a(float[] fArr, float f, int i) {
        C89219l.m154721d(fArr, "");
        Arrays.fill(fArr, 0, i, f);
    }

    /* renamed from: a */
    public static final <T> void m154466a(T[] tArr, int i, int i2) {
        C89219l.m154721d(tArr, "");
        Arrays.fill(tArr, i, i2, (Object) null);
    }

    /* renamed from: a */
    public static final byte[] m154468a(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C89219l.m154721d(bArr, "");
        C89219l.m154721d(bArr2, "");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: a */
    public static final <T> T[] m154470a(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C89219l.m154721d(tArr, "");
        C89219l.m154721d(tArr2, "");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: a */
    public static /* synthetic */ Object[] m154471a(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return C89064i.m154470a(objArr, objArr2, i, i2, i3);
    }
}
