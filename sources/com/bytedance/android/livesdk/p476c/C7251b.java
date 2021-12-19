package com.bytedance.android.livesdk.p476c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.c.b */
public final class C7251b extends animationInterpolatorC7253d {
    static {
        Covode.recordClassIndex(7999);
    }

    public C7251b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7256g(0.0f, 0.0f));
        arrayList.add(new C7256g(0.32f, 0.94f));
        arrayList.add(new C7256g(0.6f, 1.0f));
        arrayList.add(new C7256g(1.0f, 1.0f));
        this.f18052a = new C7250a(arrayList);
        this.f18053b = new C7255f();
        if (this.f18052a != null) {
            if (this.f18053b == null) {
                this.f18053b = new C7255f();
            }
            this.f18053b.mo13457a(this.f18052a);
            return;
        }
        throw new RuntimeException("Can not build curve sampler without curve,please create curve first");
    }
}
