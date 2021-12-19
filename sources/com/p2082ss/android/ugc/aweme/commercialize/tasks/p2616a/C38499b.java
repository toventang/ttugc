package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.b */
public final class C38499b extends AbstractC18142a {

    /* renamed from: d */
    private final boolean f90975d;

    /* renamed from: e */
    private final String f90976e;

    /* renamed from: f */
    private final String f90977f;

    static {
        Covode.recordClassIndex(46025);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        C38497a aVar = C38497a.f90936a;
        Context context = this.f43206b;
        String str = this.f90976e;
        C89219l.m154716b(str, "");
        if (aVar.mo65618a(context, str)) {
            return new C18148g(true);
        }
        return new C18148g(false, "jump to google play failed");
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        C38497a aVar = C38497a.f90936a;
        boolean z = this.f90975d;
        String str = this.f90977f;
        C89219l.m154716b(str, "");
        String str2 = this.f90976e;
        C89219l.m154716b(str2, "");
        if (!aVar.mo65624a(z, str, str2)) {
            return true;
        }
        C38497a.f90936a.mo65613a(this.f43206b, R.string.o6, 0);
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38499b(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        this.f90975d = bundle.getBoolean("is_awesome_splash_ad");
        this.f90976e = bundle.getString("aweme_package_name", "");
        this.f90977f = bundle.getString("ad_type", "");
    }
}
