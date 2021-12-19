package p4519d.p4520a.p4534g;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89350l;

/* renamed from: d.a.g.e */
public final class C88071e {

    /* renamed from: a */
    public static final C88072a f199981a = new C88072a((byte) 0);

    static {
        Covode.recordClassIndex(104097);
    }

    /* renamed from: d.a.g.e$a */
    public static final class C88072a {
        static {
            Covode.recordClassIndex(104098);
        }

        private C88072a() {
        }

        public /* synthetic */ C88072a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int m153146a(String str, String str2) {
            Object next;
            if (str == null) {
                return -1;
            }
            AbstractC89306h findAll$default = C89350l.findAll$default(new C89350l(str2), str, 0, 2, null);
            if (!findAll$default.mo2926a().hasNext()) {
                return -1;
            }
            C89219l.m154721d(findAll$default, "");
            Iterator a = findAll$default.mo2926a();
            if (a.hasNext()) {
                do {
                    next = a.next();
                } while (a.hasNext());
                return ((AbstractC89345j) next).mo143719a().f202927a;
            }
            throw new NoSuchElementException("Sequence is empty.");
        }
    }
}
