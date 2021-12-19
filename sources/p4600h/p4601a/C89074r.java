package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Enumeration;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.r */
public class C89074r extends C89073q {
    static {
        Covode.recordClassIndex(105158);
    }

    /* renamed from: h.a.r$a */
    public static final class C89075a implements AbstractC89196a, Iterator<T> {

        /* renamed from: a */
        final /* synthetic */ Enumeration f202795a;

        static {
            Covode.recordClassIndex(105159);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f202795a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.f202795a.nextElement();
        }

        C89075a(Enumeration<T> enumeration) {
            this.f202795a = enumeration;
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m154529a(Enumeration<T> enumeration) {
        C89219l.m154721d(enumeration, "");
        return new C89075a(enumeration);
    }
}
