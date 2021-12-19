package p4600h.p4602b;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.b.e */
final class C89094e implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final C89094e f202804a = new C89094e();

    private C89094e() {
    }

    /* Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C89095f.f202805a;
    }

    static {
        Covode.recordClassIndex(105178);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        C89219l.m154721d(comparable3, "");
        C89219l.m154721d(comparable2, "");
        return comparable3.compareTo(comparable2);
    }
}
