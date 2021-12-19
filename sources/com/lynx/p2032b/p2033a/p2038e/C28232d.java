package com.lynx.p2032b.p2033a.p2038e;

import android.graphics.PointF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28221j;
import com.lynx.p2032b.p2033a.p2041h.animationInterpolatorC28243b;

/* renamed from: com.lynx.b.a.e.d */
public final class C28232d implements AbstractC28221j {

    /* renamed from: a */
    public PointF f66194a;

    /* renamed from: b */
    public AbstractC28221j f66195b;

    /* renamed from: c */
    public boolean f66196c = true;

    static {
        Covode.recordClassIndex(34178);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28221j
    /* renamed from: a */
    public final boolean mo48297a(View view) {
        AbstractC28221j jVar = this.f66195b;
        if (jVar != null) {
            return jVar.mo48297a(view);
        }
        return animationInterpolatorC28243b.m56419a(view, this.f66194a);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28221j
    /* renamed from: b */
    public final boolean mo48298b(View view) {
        AbstractC28221j jVar = this.f66195b;
        if (jVar != null) {
            return jVar.mo48298b(view);
        }
        return animationInterpolatorC28243b.m56420a(view, this.f66194a, this.f66196c);
    }
}
