package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.g */
public final class C38505g extends AbstractC18142a {

    /* renamed from: d */
    private final String f90993d;

    /* renamed from: e */
    private final String f90994e;

    /* renamed from: f */
    private final String f90995f;

    /* renamed from: g */
    private final String f90996g;

    static {
        Covode.recordClassIndex(46031);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        C38497a aVar = C38497a.f90936a;
        String str = this.f90993d;
        C89219l.m154716b(str, "");
        return aVar.mo65628c(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        C38497a.f90936a.mo65620a(this.f43206b, this.f90996g, this.f90993d, this.f90994e, this.f90995f);
        return new C18148g(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38505g(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        this.f90993d = bundle.getString("open_url", "");
        this.f90994e = bundle.getString("log_extra", "");
        this.f90995f = bundle.getString("creative_id", "");
        this.f90996g = bundle.getString("aweme_id", "");
    }
}
