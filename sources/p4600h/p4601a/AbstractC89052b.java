package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.b */
public abstract class AbstractC89052b<T> implements AbstractC89196a, Iterator<T> {

    /* renamed from: a */
    private EnumC89051aq f202777a = EnumC89051aq.NotReady;

    /* renamed from: b */
    private T f202778b;

    static {
        Covode.recordClassIndex(105136);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo143438a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo143440b() {
        this.f202777a = EnumC89051aq.Done;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f202777a = EnumC89051aq.NotReady;
            return this.f202778b;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        if (this.f202777a != EnumC89051aq.Failed) {
            int i = C89053c.f202779a[this.f202777a.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.f202777a = EnumC89051aq.Failed;
            mo143438a();
            if (this.f202777a == EnumC89051aq.Ready) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo143439a(T t) {
        this.f202778b = t;
        this.f202777a = EnumC89051aq.Ready;
    }
}
