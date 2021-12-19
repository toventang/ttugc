package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C89527ar;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C89643i<E> {

    /* renamed from: a */
    private final Object f203381a;

    static {
        Covode.recordClassIndex(105736);
    }

    public final int hashCode() {
        Object obj = this.f203381a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "InlineList(holder=" + this.f203381a + ")";
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f203381a;
        if (!(obj instanceof C89643i) || !C89219l.m154714a(obj2, ((C89643i) obj).f203381a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final Object m155582a(Object obj, E e) {
        if (C89527ar.f203243a && !(!(e instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            return e;
        } else {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e);
                return obj;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e);
            return arrayList;
        }
    }
}
