package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* access modifiers changed from: package-private */
/* renamed from: h.f.b.a */
public final class C89195a<T> implements AbstractC89196a, Iterator<T> {

    /* renamed from: a */
    public final T[] f202883a;

    /* renamed from: b */
    private int f202884b;

    static {
        Covode.recordClassIndex(105279);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.f202884b < this.f202883a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f202883a;
            int i = this.f202884b;
            this.f202884b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f202884b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C89195a(T[] tArr) {
        C89219l.m154721d(tArr, "");
        this.f202883a = tArr;
    }
}
