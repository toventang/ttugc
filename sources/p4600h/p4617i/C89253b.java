package p4600h.p4617i;

import com.bytedance.covode.number.Covode;
import java.util.Random;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.i.b */
public final class C89253b extends AbstractC89251a {

    /* renamed from: a */
    private final C89254a f202912a = new C89254a();

    static {
        Covode.recordClassIndex(105337);
    }

    /* renamed from: h.i.b$a */
    public static final class C89254a extends ThreadLocal<Random> {
        static {
            Covode.recordClassIndex(105338);
        }

        C89254a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Random initialValue() {
            return new Random();
        }
    }

    @Override // p4600h.p4617i.AbstractC89251a
    /* renamed from: a */
    public final Random mo143656a() {
        Object obj = this.f202912a.get();
        C89219l.m154716b(obj, "");
        return (Random) obj;
    }
}
