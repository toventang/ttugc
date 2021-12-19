package com.facebook.fresco.animation.p1863b.p1865b;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1863b.AbstractC24280b;

/* renamed from: com.facebook.fresco.animation.b.b.d */
public class C24285d implements AbstractC24281a {

    /* renamed from: a */
    private static final Class<?> f57574a = C24285d.class;

    /* renamed from: b */
    private final int f57575b;

    public C24285d() {
        this(3);
    }

    static {
        Covode.recordClassIndex(28417);
    }

    public C24285d(int i) {
        this.f57575b = i;
    }

    @Override // com.facebook.fresco.animation.p1863b.p1865b.AbstractC24281a
    /* renamed from: a */
    public final void mo34219a(AbstractC24282b bVar, AbstractC24280b bVar2, AbstractC24270a aVar, int i) {
        for (int i2 = 1; i2 <= this.f57575b; i2++) {
            int e = (i + i2) % aVar.mo40050e();
            if (C24099a.m45645a(2)) {
                C24099a.m45636a(f57574a, "Preparing frame %d, last drawn: %d", Integer.valueOf(e), Integer.valueOf(i));
            }
            bVar.mo40061a(bVar2, aVar, e);
        }
    }
}
