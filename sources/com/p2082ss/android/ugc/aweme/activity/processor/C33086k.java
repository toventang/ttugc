package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.tux.p1721g.C23147d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.k */
public final class C33086k extends AbstractC17350d {

    /* renamed from: d */
    private boolean f78649d;

    static {
        Covode.recordClassIndex(39898);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: b */
    public final void mo27657b(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27657b(aVar);
        C23147d.m43622b(aVar);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: f */
    public final void mo27665f(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27665f(aVar);
        this.f78649d = true;
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27654a(ActivityC17312a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        super.mo27654a(aVar, z);
        if (z && this.f78649d) {
            C23147d.m43620a(aVar);
            this.f78649d = false;
        }
    }
}
