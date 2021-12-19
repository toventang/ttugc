package p4600h.p4621l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.l.i */
final class C89307i<T> extends AbstractC89308j<T> implements AbstractC89124d<C89391z>, AbstractC89196a, Iterator<T> {

    /* renamed from: a */
    public AbstractC89124d<? super C89391z> f202961a;

    /* renamed from: b */
    private int f202962b;

    /* renamed from: c */
    private T f202963c;

    /* renamed from: d */
    private Iterator<? extends T> f202964d;

    static {
        Covode.recordClassIndex(105391);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final AbstractC89127f getContext() {
        return C89133g.INSTANCE;
    }

    /* renamed from: a */
    private final Throwable m154788a() {
        int i = this.f202962b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i != 5) {
            return new IllegalStateException("Unexpected state of the iterator: " + this.f202962b);
        }
        return new IllegalStateException("Iterator has failed.");
    }

    @Override // java.util.Iterator
    public final T next() {
        do {
            int i = this.f202962b;
            if (i != 0 && i != 1) {
                if (i == 2) {
                    this.f202962b = 1;
                    Iterator<? extends T> it = this.f202964d;
                    if (it == null) {
                        C89219l.m154715b();
                    }
                    return (T) it.next();
                } else if (i == 3) {
                    this.f202962b = 0;
                    T t = this.f202963c;
                    this.f202963c = null;
                    return t;
                } else {
                    throw m154788a();
                }
            }
        } while (hasNext());
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.f202962b;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f202964d;
                    if (it == null) {
                        C89219l.m154715b();
                    }
                    if (it.hasNext()) {
                        this.f202962b = 2;
                        return true;
                    }
                    this.f202964d = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m154788a();
                }
            }
            this.f202962b = 5;
            AbstractC89124d<? super C89391z> dVar = this.f202961a;
            if (dVar == null) {
                C89219l.m154715b();
            }
            this.f202961a = null;
            dVar.resumeWith(C89379q.m157068constructorimpl(C89391z.f203057a));
        }
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final void resumeWith(Object obj) {
        C89382r.m154942a(obj);
        this.f202962b = 4;
    }

    @Override // p4600h.p4621l.AbstractC89308j
    /* renamed from: a */
    public final Object mo143699a(T t, AbstractC89124d<? super C89391z> dVar) {
        this.f202963c = t;
        this.f202962b = 3;
        this.f202961a = dVar;
        EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
        if (aVar == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        if (aVar == EnumC89098a.COROUTINE_SUSPENDED) {
            return aVar;
        }
        return C89391z.f203057a;
    }
}
