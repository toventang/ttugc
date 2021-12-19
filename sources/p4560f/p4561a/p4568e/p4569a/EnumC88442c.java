package p4560f.p4561a.p4568e.p4569a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;

/* renamed from: f.a.e.a.c */
public enum EnumC88442c implements AbstractC88471d<Object> {
    INSTANCE,
    NEVER;

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final void clear() {
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean isEmpty() {
        return true;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final Object poll() {
        return null;
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
    public final int requestFusion(int i) {
        return i & 2;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104484);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(AbstractC88427d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    public static void complete(AbstractC88975p<?> pVar) {
        pVar.onSubscribe(INSTANCE);
        pVar.onComplete();
    }

    public static void complete(AbstractC88986z<?> zVar) {
        zVar.onSubscribe(INSTANCE);
        zVar.onComplete();
    }

    public static void error(Throwable th, AbstractC88406ae<?> aeVar) {
        aeVar.onSubscribe(INSTANCE);
        aeVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void error(Throwable th, AbstractC88427d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th);
    }

    public static void error(Throwable th, AbstractC88975p<?> pVar) {
        pVar.onSubscribe(INSTANCE);
        pVar.onError(th);
    }

    public static void error(Throwable th, AbstractC88986z<?> zVar) {
        zVar.onSubscribe(INSTANCE);
        zVar.onError(th);
    }
}
