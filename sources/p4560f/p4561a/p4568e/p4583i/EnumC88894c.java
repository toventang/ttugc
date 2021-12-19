package p4560f.p4561a.p4568e.p4583i;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.p4568e.p4571c.AbstractC88473f;

/* renamed from: f.a.e.i.c */
public enum EnumC88894c implements AbstractC88473f<Object> {
    INSTANCE;

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final void clear() {
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

    public final String toString() {
        return "EmptySubscription";
    }

    static {
        Covode.recordClassIndex(104936);
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        EnumC88897f.validate(j);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(AbstractC90214c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, AbstractC90214c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
