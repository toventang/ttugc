package com.bytedance.helios.sdk.p1097d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.api.p1090c.C15326b;
import com.bytedance.helios.sdk.p1094b.C15371a;
import com.bytedance.helios.sdk.utils.C15488i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.d.o */
public final class C15416o extends AbstractC15395b {

    /* renamed from: b */
    public static final C15416o f37637b;

    /* renamed from: c */
    private static int[] f37638c;

    private C15416o() {
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final int[] mo25138a() {
        if (f37638c == null) {
            int size = this.f37577a.size();
            f37638c = new int[size];
            for (int i = 0; i < size; i++) {
                int[] iArr = f37638c;
                if (iArr == null) {
                    C89219l.m154707a();
                }
                iArr[i] = this.f37577a.keyAt(i);
            }
        }
        int[] iArr2 = f37638c;
        if (iArr2 == null) {
            return new int[0];
        }
        return iArr2;
    }

    static {
        Covode.recordClassIndex(17668);
        C15416o oVar = new C15416o();
        f37637b = oVar;
        try {
            int size = C15488i.f37746b.size();
            for (int i = 0; i < size; i++) {
                C15371a valueAt = C15488i.f37746b.valueAt(i);
                if (valueAt.f37495k) {
                    super.mo25134a(valueAt.f37485a, new C15417p(valueAt.f37494j, valueAt.f37493i, valueAt.f37485a, valueAt.f37492h));
                }
            }
        } catch (Throwable th) {
            C15320o.m28230a(new C15326b(null, th, "label_custom_detector_init", null, 9));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final void mo25135a(C15397d dVar, Throwable th) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(th, "");
        C15320o.m28228a(dVar.mo25140a(th), false);
    }
}
