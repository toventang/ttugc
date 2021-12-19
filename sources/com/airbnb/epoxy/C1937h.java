package com.airbnb.epoxy;

import com.airbnb.epoxy.C1908ac;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.epoxy.h */
public class C1937h extends C1908ac {

    /* renamed from: a */
    static final C1908ac.AbstractC1911c f5804a = new C1908ac.AbstractC1911c() {
        /* class com.airbnb.epoxy.C1937h.C19381 */

        static {
            Covode.recordClassIndex(2129);
        }

        @Override // com.airbnb.epoxy.C1908ac.AbstractC1911c
        /* renamed from: a */
        public final void mo5678a() {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        @Override // com.airbnb.epoxy.C1908ac.AbstractC1911c
        /* renamed from: b */
        public final void mo5679b() {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    };

    static {
        Covode.recordClassIndex(2128);
    }

    C1937h(int i) {
        super(i);
        if (!this.f5755b) {
            this.f5755b = true;
            return;
        }
        throw new IllegalStateException("Notifications already paused");
    }
}
