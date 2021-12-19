package com.bytedance.ies.bullet.service.p1172f.p1173a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16729h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16737m;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16739o;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c.C16779a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c.C16793c;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c.C16794d;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.f */
public final class C16854f extends C16721b {

    /* renamed from: Q */
    public final AbstractC16725d<String> f40056Q = new C16779a((byte) 0);

    /* renamed from: R */
    public final AbstractC16725d<String> f40057R = new C16793c((byte) 0);

    /* renamed from: S */
    public AbstractC16725d<String> f40058S = new C16794d((byte) 0);

    /* renamed from: T */
    public final AbstractC16725d<Boolean> f40059T = new C16722a("force_h5");

    /* renamed from: U */
    public final AbstractC16725d<Boolean> f40060U = new C16722a("dev");

    /* renamed from: V */
    public final AbstractC16725d<String> f40061V = new C16737m("rn_bundle_url", C16739o.f39979f);

    /* renamed from: W */
    public final C16729h f40062W = new C16729h("dynamic", 0);

    /* renamed from: X */
    public final AbstractC16725d<String> f40063X = new C16737m("a_surl", C16739o.f39979f);

    static {
        Covode.recordClassIndex(19294);
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q, com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b, com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c
    /* renamed from: a */
    public final List<AbstractC16725d<?>> mo26542a() {
        return C89070n.m154572d((Collection) super.mo26542a(), (Iterable) C89070n.m154522b(this.f40056Q, this.f40058S, this.f40057R, this.f40059T, this.f40060U, this.f40061V, this.f40062W, this.f40063X));
    }

    /* renamed from: b */
    public final boolean mo26659b() {
        String b;
        if (!C89219l.m154714a((Object) this.f40060U.mo26550b(), (Object) true) || (b = this.f40061V.mo26550b()) == null || C89361p.m154870a((CharSequence) b)) {
            return false;
        }
        return true;
    }
}
