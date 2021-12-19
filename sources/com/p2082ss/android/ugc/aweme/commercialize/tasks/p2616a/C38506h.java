package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.h */
public final class C38506h extends AbstractC18142a {

    /* renamed from: d */
    private final String f90997d;

    /* renamed from: e */
    private final AwemeRawAd f90998e;

    static {
        Covode.recordClassIndex(46032);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        if (C38497a.f90936a.mo65623a(this.f90997d, this.f43206b, this.f90998e)) {
            return new C18148g(true);
        }
        return new C18148g(false, "handle vast app failed");
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        if (this.f90998e == null || !C38497a.f90936a.mo65622a(this.f90998e)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38506h(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("real_web_url", "");
        C89219l.m154716b(string, "");
        this.f90997d = string;
        C18141a b = cVar.mo28929b();
        this.f90998e = (AwemeRawAd) (!(b instanceof AwemeRawAd) ? null : b);
    }
}
