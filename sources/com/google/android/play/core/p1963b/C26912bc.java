package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.android.play.core.b.bc */
final class C26912bc extends AbstractC26908az {

    /* renamed from: a */
    private final C26911bb f63799a = new C26911bb();

    static {
        Covode.recordClassIndex(32387);
    }

    C26912bc() {
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26908az
    /* renamed from: a */
    public final void mo44594a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f63799a.mo44602a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
