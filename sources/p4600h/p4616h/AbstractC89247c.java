package p4600h.p4616h;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: h.h.c */
public abstract class AbstractC89247c<V> implements AbstractC89249e<Object, V> {

    /* renamed from: a */
    private V f202911a;

    static {
        Covode.recordClassIndex(105331);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10399a(AbstractC89286i<?> iVar, V v, V v2) {
        C89219l.m154721d(iVar, "");
    }

    public AbstractC89247c(V v) {
        this.f202911a = v;
    }

    @Override // p4600h.p4616h.AbstractC89248d, p4600h.p4616h.AbstractC89249e
    /* renamed from: a */
    public final V mo23374a(Object obj, AbstractC89286i<?> iVar) {
        C89219l.m154721d(iVar, "");
        return this.f202911a;
    }

    @Override // p4600h.p4616h.AbstractC89249e
    /* renamed from: a */
    public final void mo143655a(AbstractC89286i<?> iVar, V v) {
        C89219l.m154721d(iVar, "");
        V v2 = this.f202911a;
        C89219l.m154721d(iVar, "");
        this.f202911a = v;
        mo10399a(iVar, v2, v);
    }
}
