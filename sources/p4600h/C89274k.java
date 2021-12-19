package p4600h;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.k */
public class C89274k {
    static {
        Covode.recordClassIndex(105358);
    }

    /* renamed from: a */
    public static final <T> AbstractC89244h<T> m154773a(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        return new C89385t(aVar, (byte) 0);
    }

    /* renamed from: a */
    public static final <T> AbstractC89244h<T> m154774a(EnumC89331m mVar, AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        int i = C89261j.f202921a[mVar.ordinal()];
        if (i == 1) {
            return new C89385t(aVar, (byte) 0);
        }
        if (i == 2) {
            return new C89383s(aVar);
        }
        if (i == 3) {
            return new C89087aa(aVar);
        }
        throw new C89376n();
    }
}
