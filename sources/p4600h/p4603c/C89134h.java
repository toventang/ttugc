package p4600h.p4603c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4600h.C89379q;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.c.h */
public final class C89134h<T> implements AbstractC89111e, AbstractC89124d<T> {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater<C89134h<?>, Object> f202843b = AtomicReferenceFieldUpdater.newUpdater(C89134h.class, Object.class, "result");

    /* renamed from: c */
    private static final C89135a f202844c = new C89135a((byte) 0);

    /* renamed from: a */
    private final AbstractC89124d<T> f202845a;
    private volatile Object result;

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h.c.h$a */
    static final class C89135a {
        static {
            Covode.recordClassIndex(105219);
        }

        private C89135a() {
        }

        public /* synthetic */ C89135a(byte b) {
            this();
        }
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final AbstractC89127f getContext() {
        return this.f202845a.getContext();
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public final AbstractC89111e getCallerFrame() {
        AbstractC89124d<T> dVar = this.f202845a;
        if (!(dVar instanceof AbstractC89111e)) {
            dVar = null;
        }
        return (AbstractC89111e) dVar;
    }

    static {
        Covode.recordClassIndex(105218);
    }

    public final String toString() {
        return "SafeContinuation for " + this.f202845a;
    }

    /* renamed from: a */
    public final Object mo143576a() {
        Object obj = this.result;
        if (obj == EnumC89098a.UNDECIDED) {
            if (f202843b.compareAndSet(this, EnumC89098a.UNDECIDED, EnumC89098a.COROUTINE_SUSPENDED)) {
                return EnumC89098a.COROUTINE_SUSPENDED;
            }
            obj = this.result;
        }
        if (obj == EnumC89098a.RESUMED) {
            return EnumC89098a.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof C89379q.C89381b)) {
            return obj;
        }
        throw ((C89379q.C89381b) obj).exception;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C89134h(AbstractC89124d<? super T> dVar) {
        this(dVar, EnumC89098a.UNDECIDED);
        C89219l.m154721d(dVar, "");
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            if (obj2 == EnumC89098a.UNDECIDED) {
                if (f202843b.compareAndSet(this, EnumC89098a.UNDECIDED, obj)) {
                    return;
                }
            } else if (obj2 != EnumC89098a.COROUTINE_SUSPENDED) {
                throw new IllegalStateException("Already resumed");
            } else if (f202843b.compareAndSet(this, EnumC89098a.COROUTINE_SUSPENDED, EnumC89098a.RESUMED)) {
                this.f202845a.resumeWith(obj);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    private C89134h(AbstractC89124d<? super T> dVar, Object obj) {
        C89219l.m154721d(dVar, "");
        this.f202845a = dVar;
        this.result = obj;
    }
}
