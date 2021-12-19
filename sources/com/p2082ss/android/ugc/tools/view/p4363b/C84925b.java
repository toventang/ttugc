package com.p2082ss.android.ugc.tools.view.p4363b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.tools.view.b.b */
public final /* synthetic */ class C84925b implements AbstractC89171a {

    /* renamed from: a */
    private final AbstractC84923a f189757a;

    /* renamed from: b */
    private final List f189758b;

    static {
        Covode.recordClassIndex(98919);
    }

    C84925b(AbstractC84923a aVar, List list) {
        this.f189757a = aVar;
        this.f189758b = list;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        AbstractC84923a aVar = this.f189757a;
        aVar.f189754f = this.f189758b;
        aVar.notifyDataSetChanged();
        return C89391z.f203057a;
    }
}
