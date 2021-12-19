package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38518e;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.i */
public final class C38507i extends AbstractC18142a {

    /* renamed from: d */
    private final String f90999d;

    /* renamed from: e */
    private final String f91000e;

    /* renamed from: f */
    private final int f91001f;

    /* renamed from: g */
    private final String f91002g;

    /* renamed from: h */
    private final AwemeRawAd f91003h;

    static {
        Covode.recordClassIndex(46033);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        if (this.f90999d.length() == 0) {
            return false;
        }
        return C38518e.m78109a(this.f90999d);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        if (C38497a.f90936a.mo65617a(this.f43206b, this.f91003h, this.f90999d, this.f91000e, this.f91002g, this.f91001f)) {
            return new C18148g(true);
        }
        return new C18148g(false, "handle popup web failed");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38507i(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("real_web_url", "");
        C89219l.m154716b(string, "");
        this.f90999d = string;
        String string2 = bundle.getString("title", "");
        C89219l.m154716b(string2, "");
        this.f91000e = string2;
        this.f91001f = bundle.getInt("click_from");
        String string3 = bundle.getString("aweme_id", "");
        C89219l.m154716b(string3, "");
        this.f91002g = string3;
        C18141a b = cVar.mo28929b();
        this.f91003h = (AwemeRawAd) (!(b instanceof AwemeRawAd) ? null : b);
    }
}
