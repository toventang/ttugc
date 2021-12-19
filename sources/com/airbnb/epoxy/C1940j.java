package com.airbnb.epoxy;

import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.epoxy.j */
public final class C1940j {

    /* renamed from: a */
    final AbstractC1956s<?> f5808a;

    /* renamed from: b */
    final C0489d<AbstractC1956s<?>> f5809b;

    static {
        Covode.recordClassIndex(2131);
    }

    public C1940j(AbstractC1956s<?> sVar) {
        this(Collections.singletonList(sVar));
    }

    private C1940j(List<? extends AbstractC1956s<?>> list) {
        if (!list.isEmpty()) {
            int size = list.size();
            if (size == 1) {
                this.f5808a = (AbstractC1956s) list.get(0);
                this.f5809b = null;
                return;
            }
            this.f5808a = null;
            this.f5809b = new C0489d<>(size);
            for (AbstractC1956s<?> sVar : list) {
                this.f5809b.mo2083b(sVar.f5838a, sVar);
            }
            return;
        }
        throw new IllegalStateException("Models must not be empty");
    }
}
