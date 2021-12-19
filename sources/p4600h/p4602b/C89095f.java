package p4600h.p4602b;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.b.f */
public final class C89095f implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final C89095f f202805a = new C89095f();

    private C89095f() {
    }

    /* Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C89094e.f202804a;
    }

    static {
        Covode.recordClassIndex(105179);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable2;
        C89219l.m154721d(comparable, "");
        C89219l.m154721d(comparable3, "");
        return comparable3.compareTo(comparable);
    }
}
