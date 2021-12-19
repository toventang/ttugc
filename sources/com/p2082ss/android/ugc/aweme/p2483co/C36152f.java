package com.p2082ss.android.ugc.aweme.p2483co;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.co.f */
public final class C36152f extends AbstractC36147a {

    /* renamed from: a */
    public View f85408a;

    static {
        Covode.recordClassIndex(43405);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2483co.AbstractC36147a
    /* renamed from: c */
    public final void mo63275c() {
        View view = this.f85408a;
        if (view != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            C36157i.m73655a(view, a, C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics())));
        }
    }
}
