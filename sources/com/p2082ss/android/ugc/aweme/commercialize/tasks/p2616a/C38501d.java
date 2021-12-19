package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.d */
public final class C38501d extends AbstractC18142a {

    /* renamed from: d */
    private final int f90978d;

    /* renamed from: e */
    private final String f90979e;

    /* renamed from: f */
    private final int f90980f;

    static {
        Covode.recordClassIndex(46027);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        if (TextUtils.isEmpty(this.f90979e) || this.f90978d != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        if (C38497a.f90936a.mo65616a(this.f43206b, this.f90980f)) {
            return new C18148g(true);
        }
        return new C18148g(false, "handle light web failed");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38501d(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        this.f90978d = bundle.getInt("webview_type");
        this.f90979e = bundle.getString("light_page_web_url");
        this.f90980f = bundle.getInt("click_from");
    }
}
