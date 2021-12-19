package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: h.f.b.ac */
public final class C89205ac {

    /* renamed from: a */
    public final ArrayList<Object> f202887a;

    static {
        Covode.recordClassIndex(105289);
    }

    /* renamed from: a */
    public final Object[] mo143595a(Object[] objArr) {
        return this.f202887a.toArray(objArr);
    }

    /* renamed from: b */
    public final void mo143596b(Object obj) {
        this.f202887a.add(obj);
    }

    public C89205ac(int i) {
        this.f202887a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public final void mo143594a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f202887a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f202887a, objArr);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }
}
