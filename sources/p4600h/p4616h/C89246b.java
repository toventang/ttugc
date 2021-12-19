package p4600h.p4616h;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89286i;

/* access modifiers changed from: package-private */
/* renamed from: h.h.b */
public final class C89246b<T> implements AbstractC89249e<Object, T> {

    /* renamed from: a */
    private T f202910a;

    static {
        Covode.recordClassIndex(105330);
    }

    @Override // p4600h.p4616h.AbstractC89249e
    /* renamed from: a */
    public final void mo143655a(AbstractC89286i<?> iVar, T t) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(t, "");
        this.f202910a = t;
    }

    @Override // p4600h.p4616h.AbstractC89248d, p4600h.p4616h.AbstractC89249e
    /* renamed from: a */
    public final T mo23374a(Object obj, AbstractC89286i<?> iVar) {
        C89219l.m154721d(iVar, "");
        T t = this.f202910a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + iVar.getName() + " should be initialized before get.");
    }
}
