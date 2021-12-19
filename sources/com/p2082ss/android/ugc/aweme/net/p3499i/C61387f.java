package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.i.f */
public final class C61387f implements AbstractC18185b.AbstractC18189d {

    /* renamed from: a */
    public final int f139376a;

    static {
        Covode.recordClassIndex(72020);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    public C61387f(int i) {
        this.f139376a = i;
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18189d
    /* renamed from: a */
    public final boolean mo29042a(C18199f fVar, C18182a aVar, Throwable th, boolean z) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(th, "");
        if (z || this.f139376a > 0) {
            return true;
        }
        return false;
    }
}
