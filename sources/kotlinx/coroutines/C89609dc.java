package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89657t;
import kotlinx.coroutines.internal.C89663z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.dc */
public final class C89609dc<T> extends C89657t<T> {
    static {
        Covode.recordClassIndex(105700);
    }

    @Override // kotlinx.coroutines.internal.C89657t, kotlinx.coroutines.AbstractC89458a
    /* renamed from: b */
    public final void mo144034b(Object obj) {
        Object a = C89500aa.m155438a(obj, this.f203406e);
        AbstractC89127f context = this.f203406e.getContext();
        Object a2 = C89663z.m155642a(context, null);
        try {
            this.f203406e.resumeWith(a);
        } finally {
            C89663z.m155643b(context, a2);
        }
    }

    public C89609dc(AbstractC89127f fVar, AbstractC89124d<? super T> dVar) {
        super(fVar, dVar);
    }
}
