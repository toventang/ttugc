package com.bytedance.ies.bullet.kit.web;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1134b.AbstractC16199b;
import com.bytedance.ies.bullet.p1129c.p1132c.p1134b.AbstractC16200c;
import com.bytedance.ies.bullet.p1129c.p1132c.p1134b.C16201d;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.bytedance.ies.bullet.kit.web.a */
public final class C16476a extends AbstractC16200c<C16476a> {

    /* renamed from: a */
    public final AbstractC16199b<Boolean> f39532a;

    /* renamed from: b */
    public final AbstractC16199b<Boolean> f39533b;

    static {
        Covode.recordClassIndex(18907);
    }

    public C16476a() {
        this(null, 3);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1134b.AbstractC16198a
    /* renamed from: a */
    public final Map<String, AbstractC16199b<?>> mo25754a() {
        return C89041ag.m154421a(C89387v.m154943a("hardwareAcceleration", this.f39532a), C89387v.m154943a("longClickable", this.f39533b));
    }

    private C16476a(Boolean bool) {
        this.f39532a = new C16201d(bool, false, 2);
        this.f39533b = new C16201d(null, false, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16476a(Boolean bool, int i) {
        this((i & 1) != 0 ? null : bool);
    }
}
